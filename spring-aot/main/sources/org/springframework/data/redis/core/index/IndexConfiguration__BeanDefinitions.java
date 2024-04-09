package org.springframework.data.redis.core.index;

import org.springframework.aot.generate.Generated;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.RootBeanDefinition;

/**
 * Bean definitions for {@link IndexConfiguration}.
 */
@Generated
public class IndexConfiguration__BeanDefinitions {
  /**
   * Get the bean definition for 'redisIndexConfiguration#0'.
   */
  public static BeanDefinition getRedisIndexConfigurationBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(IndexConfiguration.class);
    beanDefinition.setRole(BeanDefinition.ROLE_INFRASTRUCTURE);
    beanDefinition.setInstanceSupplier(IndexConfiguration::new);
    return beanDefinition;
  }
}
