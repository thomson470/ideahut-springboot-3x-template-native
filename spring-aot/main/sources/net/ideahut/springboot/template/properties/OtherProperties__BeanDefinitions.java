package net.ideahut.springboot.template.properties;

import org.springframework.aot.generate.Generated;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.RootBeanDefinition;
import org.springframework.context.annotation.ConfigurationClassUtils;

/**
 * Bean definitions for {@link OtherProperties}.
 */
@Generated
public class OtherProperties__BeanDefinitions {
  /**
   * Get the bean definition for 'otherProperties'.
   */
  public static BeanDefinition getOtherPropertiesBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(OtherProperties.class);
    beanDefinition.setTargetType(OtherProperties.class);
    ConfigurationClassUtils.initializeConfigurationClass(OtherProperties.class);
    beanDefinition.setInstanceSupplier(OtherProperties$$SpringCGLIB$$0::new);
    return beanDefinition;
  }
}
