package net.ideahut.springboot.template.controller;

import org.springframework.aot.generate.Generated;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.InstanceSupplier;
import org.springframework.beans.factory.support.RootBeanDefinition;

/**
 * Bean definitions for {@link MenuController}.
 */
@Generated
public class MenuController__BeanDefinitions {
  /**
   * Get the bean definition for 'menuController'.
   */
  public static BeanDefinition getMenuControllerBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(MenuController.class);
    InstanceSupplier<MenuController> instanceSupplier = InstanceSupplier.using(MenuController::new);
    instanceSupplier = instanceSupplier.andThen(MenuController__Autowiring::apply);
    beanDefinition.setInstanceSupplier(instanceSupplier);
    return beanDefinition;
  }
}
