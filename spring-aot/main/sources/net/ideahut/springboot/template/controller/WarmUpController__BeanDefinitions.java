package net.ideahut.springboot.template.controller;

import org.springframework.aot.generate.Generated;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.RootBeanDefinition;

/**
 * Bean definitions for {@link WarmUpController}.
 */
@Generated
public class WarmUpController__BeanDefinitions {
  /**
   * Get the bean definition for 'warmUpController'.
   */
  public static BeanDefinition getWarmUpControllerBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(WarmUpController.class);
    beanDefinition.setInstanceSupplier(WarmUpController::new);
    return beanDefinition;
  }
}
