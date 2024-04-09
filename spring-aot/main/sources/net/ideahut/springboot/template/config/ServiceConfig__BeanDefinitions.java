package net.ideahut.springboot.template.config;

import org.springframework.aot.generate.Generated;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.RootBeanDefinition;
import org.springframework.context.annotation.ConfigurationClassUtils;

/**
 * Bean definitions for {@link ServiceConfig}.
 */
@Generated
public class ServiceConfig__BeanDefinitions {
  /**
   * Get the bean definition for 'serviceConfig'.
   */
  public static BeanDefinition getServiceConfigBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(ServiceConfig.class);
    beanDefinition.setTargetType(ServiceConfig.class);
    ConfigurationClassUtils.initializeConfigurationClass(ServiceConfig.class);
    beanDefinition.setInstanceSupplier(ServiceConfig$$SpringCGLIB$$0::new);
    return beanDefinition;
  }
}
