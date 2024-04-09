package net.ideahut.springboot.template.controller;

import org.springframework.aot.generate.Generated;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.InstanceSupplier;
import org.springframework.beans.factory.support.RootBeanDefinition;

/**
 * Bean definitions for {@link GridController}.
 */
@Generated
public class GridController__BeanDefinitions {
  /**
   * Get the bean definition for 'gridController'.
   */
  public static BeanDefinition getGridControllerBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(GridController.class);
    InstanceSupplier<GridController> instanceSupplier = InstanceSupplier.using(GridController::new);
    instanceSupplier = instanceSupplier.andThen(GridController__Autowiring::apply);
    beanDefinition.setInstanceSupplier(instanceSupplier);
    return beanDefinition;
  }
}
