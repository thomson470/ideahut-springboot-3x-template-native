package org.springframework.boot.autoconfigure.quartz;

import org.springframework.aot.generate.Generated;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.RootBeanDefinition;

/**
 * Bean definitions for {@link QuartzProperties}.
 */
@Generated
public class QuartzProperties__BeanDefinitions {
  /**
   * Get the bean definition for 'quartzProperties'.
   */
  public static BeanDefinition getQuartzPropertiesBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(QuartzProperties.class);
    beanDefinition.setInstanceSupplier(QuartzProperties::new);
    return beanDefinition;
  }
}
