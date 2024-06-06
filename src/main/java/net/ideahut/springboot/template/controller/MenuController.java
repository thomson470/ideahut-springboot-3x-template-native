package net.ideahut.springboot.template.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import net.ideahut.springboot.grid.GridHandler;
import net.ideahut.springboot.grid.GridParent;
import net.ideahut.springboot.grid.GridSource;
import net.ideahut.springboot.mapper.DataMapper;
import net.ideahut.springboot.object.Result;
import net.ideahut.springboot.template.entity.app.Menu;
import net.ideahut.springboot.template.entity.app.MenuId;

@ComponentScan
@RestController
@RequestMapping("/menu")
class MenuController {

	@Autowired
	private DataMapper dataMapper;
	@Autowired
	private GridHandler gridHandler;
	
	@GetMapping("list")
	protected Result list() {
		List<Menu> menus = new ArrayList<>();
		menus.add(cache());
		Menu grid = grid();
		if (grid != null) {
			menus.add(grid);
		}
		return Result.success(menus);
	}
	
	private Menu cache() {
		Menu menu = new Menu();
		menu.setId(new MenuId("cache", ""));
		menu.setTitle("Cache");
		menu.setIcon("memory_alt");
		menu.setLink("/cache");
		return menu;
	}
	
	private Menu grid() {
		List<GridParent> parents = gridHandler.getTree();
		if (parents == null || parents.isEmpty()) {
			return null;
		}
		Menu root = new Menu();
		root.setId(new MenuId("grid", ""));
		root.setTitle("Grid");
		root.setIcon("apps");
		root.setChildren(new ArrayList<>());
		if (parents.size() == 1) {
			GridParent parent = parents.get(0);
			if (parent.getTitle() != null && !parent.getTitle().trim().isEmpty()) {
				root.setTitle(parent.getTitle());
			}
			Menu proot = dataMapper.copy(root, Menu.class);
			for (GridSource source : parent.getSources()) {
				Menu menu = new Menu();
				menu.setId(new MenuId("grid_" + source.getName(), ""));
				menu.setTitle(source.getTitle());
				menu.setIcon("table_view");
				menu.setLink("/grid?name=" + source.getName() + "&parent=" + parent.getName());
				menu.setParent(proot);
				root.getChildren().add(menu);
			}
		} else {
			Menu proot = dataMapper.copy(root, Menu.class);
			for (GridParent parent : parents) {
				Menu menu = new Menu();
				menu.setId(new MenuId("grid_" + parent.getName(), ""));
				menu.setTitle(parent.getTitle());
				menu.setIcon("table_view");
				menu.setParent(proot);
				Menu pmenu = dataMapper.copy(menu, Menu.class);
				root.getChildren().add(menu);
				for (GridSource source : parent.getSources()) {
					Menu child = new Menu();
					child.setId(new MenuId("grid_" + parent.getName() + "_" + source.getName(), ""));
					child.setTitle(source.getTitle());
					child.setIcon("table_view");
					child.setLink("/grid?name=" + source.getName() + "&parent=" + parent.getName());
					child.setParent(pmenu);
					menu.getChildren().add(child);
				}
			}
		}
		return root;
	}
	
}
