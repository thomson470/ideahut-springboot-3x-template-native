package net.ideahut.springboot.template.controller;

import org.springframework.aot.generate.Generated;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.InstanceSupplier;
import org.springframework.beans.factory.support.RootBeanDefinition;

/**
 * Bean definitions for {@link CrudController}.
 */
@Generated
public class CrudController__BeanDefinitions {
  /**
   * Get the bean definition for 'crudController'.
   */
  public static BeanDefinition getCrudControllerBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(CrudController.class);
    InstanceSupplier<CrudController> instanceSupplier = InstanceSupplier.using(CrudController::new);
    instanceSupplier = instanceSupplier.andThen(CrudController__Autowiring::apply);
    beanDefinition.setInstanceSupplier(instanceSupplier);
    return beanDefinition;
  }
}
