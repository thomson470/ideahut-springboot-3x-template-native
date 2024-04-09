package org.springframework.data.redis.core;

import org.springframework.aot.generate.Generated;
import org.springframework.beans.factory.aot.BeanInstanceSupplier;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.config.RuntimeBeanReference;
import org.springframework.beans.factory.support.RootBeanDefinition;
import org.springframework.data.redis.core.mapping.RedisMappingContext;

/**
 * Bean definitions for {@link RedisKeyValueTemplate}.
 */
@Generated
public class RedisKeyValueTemplate__BeanDefinitions {
  /**
   * Get the bean instance supplier for 'redisKeyValueTemplate'.
   */
  private static BeanInstanceSupplier<RedisKeyValueTemplate> getRedisKeyValueTemplateInstanceSupplier(
      ) {
    return BeanInstanceSupplier.<RedisKeyValueTemplate>forConstructor(RedisKeyValueAdapter.class, RedisMappingContext.class)
            .withGenerator((registeredBean, args) -> new RedisKeyValueTemplate(args.get(0), args.get(1)));
  }

  /**
   * Get the bean definition for 'redisKeyValueTemplate'.
   */
  public static BeanDefinition getRedisKeyValueTemplateBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(RedisKeyValueTemplate.class);
    beanDefinition.getConstructorArgumentValues().addIndexedArgumentValue(0, new RuntimeBeanReference("redisKeyValueAdapter"));
    beanDefinition.getConstructorArgumentValues().addIndexedArgumentValue(1, new RuntimeBeanReference("keyValueMappingContext"));
    beanDefinition.setInstanceSupplier(getRedisKeyValueTemplateInstanceSupplier());
    return beanDefinition;
  }
}
