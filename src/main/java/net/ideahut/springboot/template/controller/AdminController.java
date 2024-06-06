package net.ideahut.springboot.template.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import net.ideahut.springboot.admin.AdminHandler;
import net.ideahut.springboot.admin.WebMvcAdminController;
import net.ideahut.springboot.annotation.ApiExclude;
import net.ideahut.springboot.mapper.DataMapper;

@ApiExclude
@ComponentScan
@RestController
@RequestMapping("/admin")
class AdminController extends WebMvcAdminController {
	
	@Autowired
	private DataMapper dataMapper;
	@Autowired
	private AdminHandler adminHandler;
	
	@Override
	protected AdminHandler adminHandler() {
		return adminHandler;
	}

	@Override
	protected DataMapper dataMapper() {
		return dataMapper;
	}

}
