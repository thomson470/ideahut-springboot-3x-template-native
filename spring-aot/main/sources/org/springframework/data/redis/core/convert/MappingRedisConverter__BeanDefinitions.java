package org.springframework.data.redis.core.convert;

import org.springframework.aot.generate.Generated;
import org.springframework.beans.factory.aot.BeanInstanceSupplier;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.config.RuntimeBeanReference;
import org.springframework.beans.factory.support.RootBeanDefinition;
import org.springframework.data.redis.core.mapping.RedisMappingContext;

/**
 * Bean definitions for {@link MappingRedisConverter}.
 */
@Generated
public class MappingRedisConverter__BeanDefinitions {
  /**
   * Get the bean instance supplier for 'redisConverter'.
   */
  private static BeanInstanceSupplier<MappingRedisConverter> getRedisConverterInstanceSupplier() {
    return BeanInstanceSupplier.<MappingRedisConverter>forConstructor(RedisMappingContext.class)
            .withGenerator((registeredBean, args) -> new MappingRedisConverter(args.get(0)));
  }

  /**
   * Get the bean definition for 'redisConverter'.
   */
  public static BeanDefinition getRedisConverterBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(MappingRedisConverter.class);
    beanDefinition.getConstructorArgumentValues().addIndexedArgumentValue(0, new RuntimeBeanReference("keyValueMappingContext"));
    beanDefinition.getPropertyValues().addPropertyValue("referenceResolver", new RuntimeBeanReference("redisReferenceResolver"));
    beanDefinition.getPropertyValues().addPropertyValue("customConversions", new RuntimeBeanReference("redisCustomConversions"));
    beanDefinition.setInstanceSupplier(getRedisConverterInstanceSupplier());
    return beanDefinition;
  }
}
