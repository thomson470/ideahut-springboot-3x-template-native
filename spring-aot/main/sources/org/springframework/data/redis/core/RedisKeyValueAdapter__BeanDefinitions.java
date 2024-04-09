package org.springframework.data.redis.core;

import org.springframework.aot.generate.Generated;
import org.springframework.beans.factory.aot.BeanInstanceSupplier;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.config.RuntimeBeanReference;
import org.springframework.beans.factory.support.RootBeanDefinition;
import org.springframework.data.redis.core.convert.RedisConverter;

/**
 * Bean definitions for {@link RedisKeyValueAdapter}.
 */
@Generated
public class RedisKeyValueAdapter__BeanDefinitions {
  /**
   * Get the bean instance supplier for 'redisKeyValueAdapter'.
   */
  private static BeanInstanceSupplier<RedisKeyValueAdapter> getRedisKeyValueAdapterInstanceSupplier(
      ) {
    return BeanInstanceSupplier.<RedisKeyValueAdapter>forConstructor(RedisOperations.class, RedisConverter.class)
            .withGenerator((registeredBean, args) -> new RedisKeyValueAdapter(args.get(0, RedisOperations.class), args.get(1, RedisConverter.class)));
  }

  /**
   * Get the bean definition for 'redisKeyValueAdapter'.
   */
  public static BeanDefinition getRedisKeyValueAdapterBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(RedisKeyValueAdapter.class);
    beanDefinition.getConstructorArgumentValues().addIndexedArgumentValue(0, new RuntimeBeanReference("redisTemplate"));
    beanDefinition.getConstructorArgumentValues().addIndexedArgumentValue(1, new RuntimeBeanReference("redisConverter"));
    beanDefinition.getPropertyValues().addPropertyValue("enableKeyspaceEvents", RedisKeyValueAdapter.EnableKeyspaceEvents.OFF);
    beanDefinition.getPropertyValues().addPropertyValue("keyspaceNotificationsConfigParameter", "Ex");
    beanDefinition.getPropertyValues().addPropertyValue("shadowCopy", RedisKeyValueAdapter.ShadowCopy.DEFAULT);
    beanDefinition.setInstanceSupplier(getRedisKeyValueAdapterInstanceSupplier());
    return beanDefinition;
  }
}
