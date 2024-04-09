package net.ideahut.springboot.template.properties;

import org.springframework.aot.generate.Generated;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.RootBeanDefinition;
import org.springframework.context.annotation.ConfigurationClassUtils;

/**
 * Bean definitions for {@link AppProperties}.
 */
@Generated
public class AppProperties__BeanDefinitions {
  /**
   * Get the bean definition for 'appProperties'.
   */
  public static BeanDefinition getAppPropertiesBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(AppProperties.class);
    beanDefinition.setTargetType(AppProperties.class);
    ConfigurationClassUtils.initializeConfigurationClass(AppProperties.class);
    beanDefinition.setInstanceSupplier(AppProperties$$SpringCGLIB$$0::new);
    return beanDefinition;
  }
}
