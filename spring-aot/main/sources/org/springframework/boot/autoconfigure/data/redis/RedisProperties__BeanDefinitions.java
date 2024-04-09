package org.springframework.boot.autoconfigure.data.redis;

import org.springframework.aot.generate.Generated;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.RootBeanDefinition;

/**
 * Bean definitions for {@link RedisProperties}.
 */
@Generated
public class RedisProperties__BeanDefinitions {
  /**
   * Get the bean definition for 'redisProperties'.
   */
  public static BeanDefinition getRedisPropertiesBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(RedisProperties.class);
    beanDefinition.setInstanceSupplier(RedisProperties::new);
    return beanDefinition;
  }
}
