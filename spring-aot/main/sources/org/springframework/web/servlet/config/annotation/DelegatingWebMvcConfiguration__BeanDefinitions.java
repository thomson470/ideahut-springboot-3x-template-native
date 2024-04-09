package org.springframework.web.servlet.config.annotation;

import org.springframework.aot.generate.Generated;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.InstanceSupplier;
import org.springframework.beans.factory.support.RootBeanDefinition;

/**
 * Bean definitions for {@link DelegatingWebMvcConfiguration}.
 */
@Generated
public class DelegatingWebMvcConfiguration__BeanDefinitions {
  /**
   * Get the bean definition for 'delegatingWebMvcConfiguration'.
   */
  public static BeanDefinition getDelegatingWebMvcConfigurationBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(DelegatingWebMvcConfiguration.class);
    InstanceSupplier<DelegatingWebMvcConfiguration> instanceSupplier = InstanceSupplier.using(DelegatingWebMvcConfiguration::new);
    instanceSupplier = instanceSupplier.andThen(DelegatingWebMvcConfiguration__Autowiring::apply);
    beanDefinition.setInstanceSupplier(instanceSupplier);
    return beanDefinition;
  }
}
