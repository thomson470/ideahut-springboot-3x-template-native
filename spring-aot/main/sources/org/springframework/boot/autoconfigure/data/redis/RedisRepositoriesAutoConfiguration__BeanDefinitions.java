package org.springframework.boot.autoconfigure.data.redis;

import org.springframework.aot.generate.Generated;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.RootBeanDefinition;

/**
 * Bean definitions for {@link RedisRepositoriesAutoConfiguration}.
 */
@Generated
public class RedisRepositoriesAutoConfiguration__BeanDefinitions {
  /**
   * Get the bean definition for 'redisRepositoriesAutoConfiguration'.
   */
  public static BeanDefinition getRedisRepositoriesAutoConfigurationBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(RedisRepositoriesAutoConfiguration.class);
    beanDefinition.setInstanceSupplier(RedisRepositoriesAutoConfiguration::new);
    return beanDefinition;
  }
}
