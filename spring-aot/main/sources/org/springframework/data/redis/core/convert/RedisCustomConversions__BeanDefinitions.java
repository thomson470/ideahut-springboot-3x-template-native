package org.springframework.data.redis.core.convert;

import org.springframework.aot.generate.Generated;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.RootBeanDefinition;

/**
 * Bean definitions for {@link RedisCustomConversions}.
 */
@Generated
public class RedisCustomConversions__BeanDefinitions {
  /**
   * Get the bean definition for 'redisCustomConversions'.
   */
  public static BeanDefinition getRedisCustomConversionsBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(RedisCustomConversions.class);
    beanDefinition.setInstanceSupplier(RedisCustomConversions::new);
    return beanDefinition;
  }
}
