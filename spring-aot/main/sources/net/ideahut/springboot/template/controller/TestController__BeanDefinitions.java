package net.ideahut.springboot.template.controller;

import org.springframework.aot.generate.Generated;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.InstanceSupplier;
import org.springframework.beans.factory.support.RootBeanDefinition;

/**
 * Bean definitions for {@link TestController}.
 */
@Generated
public class TestController__BeanDefinitions {
  /**
   * Get the bean definition for 'testController'.
   */
  public static BeanDefinition getTestControllerBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(TestController.class);
    InstanceSupplier<TestController> instanceSupplier = InstanceSupplier.using(TestController::new);
    instanceSupplier = instanceSupplier.andThen(TestController__Autowiring::apply);
    beanDefinition.setInstanceSupplier(instanceSupplier);
    return beanDefinition;
  }
}
