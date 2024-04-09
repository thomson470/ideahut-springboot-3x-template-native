package net.ideahut.springboot.template.controller;

import org.springframework.aot.generate.Generated;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.InstanceSupplier;
import org.springframework.beans.factory.support.RootBeanDefinition;

/**
 * Bean definitions for {@link CacheController}.
 */
@Generated
public class CacheController__BeanDefinitions {
  /**
   * Get the bean definition for 'cacheController'.
   */
  public static BeanDefinition getCacheControllerBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(CacheController.class);
    InstanceSupplier<CacheController> instanceSupplier = InstanceSupplier.using(CacheController::new);
    instanceSupplier = instanceSupplier.andThen(CacheController__Autowiring::apply);
    beanDefinition.setInstanceSupplier(instanceSupplier);
    return beanDefinition;
  }
}
