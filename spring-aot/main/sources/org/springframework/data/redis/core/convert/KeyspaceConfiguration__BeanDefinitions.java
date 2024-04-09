package org.springframework.data.redis.core.convert;

import org.springframework.aot.generate.Generated;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.RootBeanDefinition;

/**
 * Bean definitions for {@link KeyspaceConfiguration}.
 */
@Generated
public class KeyspaceConfiguration__BeanDefinitions {
  /**
   * Get the bean definition for 'redisKeyspaceConfiguration#0'.
   */
  public static BeanDefinition getRedisKeyspaceConfigurationBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(KeyspaceConfiguration.class);
    beanDefinition.setRole(BeanDefinition.ROLE_INFRASTRUCTURE);
    beanDefinition.setInstanceSupplier(KeyspaceConfiguration::new);
    return beanDefinition;
  }
}
