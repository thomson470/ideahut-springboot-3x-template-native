package org.springframework.data.redis.core.convert;

import org.springframework.aot.generate.Generated;
import org.springframework.beans.factory.aot.BeanInstanceSupplier;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.config.RuntimeBeanReference;
import org.springframework.beans.factory.support.RootBeanDefinition;
import org.springframework.data.redis.core.RedisOperations;

/**
 * Bean definitions for {@link ReferenceResolverImpl}.
 */
@Generated
public class ReferenceResolverImpl__BeanDefinitions {
  /**
   * Get the bean instance supplier for 'redisReferenceResolver'.
   */
  private static BeanInstanceSupplier<ReferenceResolverImpl> getRedisReferenceResolverInstanceSupplier(
      ) {
    return BeanInstanceSupplier.<ReferenceResolverImpl>forConstructor(RedisOperations.class)
            .withGenerator((registeredBean, args) -> new ReferenceResolverImpl(args.get(0)));
  }

  /**
   * Get the bean definition for 'redisReferenceResolver'.
   */
  public static BeanDefinition getRedisReferenceResolverBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(ReferenceResolverImpl.class);
    beanDefinition.getConstructorArgumentValues().addIndexedArgumentValue(0, new RuntimeBeanReference("redisTemplate"));
    beanDefinition.setInstanceSupplier(getRedisReferenceResolverInstanceSupplier());
    return beanDefinition;
  }
}
