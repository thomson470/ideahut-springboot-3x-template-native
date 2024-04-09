package org.springframework.data.redis.core.mapping;

import org.springframework.aot.generate.Generated;
import org.springframework.beans.factory.aot.BeanInstanceSupplier;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.config.RuntimeBeanReference;
import org.springframework.beans.factory.support.RootBeanDefinition;
import org.springframework.data.redis.core.convert.MappingConfiguration;

/**
 * Bean definitions for {@link RedisMappingContext}.
 */
@Generated
public class RedisMappingContext__BeanDefinitions {
  /**
   * Get the bean instance supplier for 'keyValueMappingContext'.
   */
  private static BeanInstanceSupplier<RedisMappingContext> getKeyValueMappingContextInstanceSupplier(
      ) {
    return BeanInstanceSupplier.<RedisMappingContext>forConstructor(MappingConfiguration.class)
            .withGenerator((registeredBean, args) -> new RedisMappingContext(args.get(0)));
  }

  /**
   * Get the bean definition for 'keyValueMappingContext'.
   */
  public static BeanDefinition getKeyValueMappingContextBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(RedisMappingContext.class);
    beanDefinition.getConstructorArgumentValues().addIndexedArgumentValue(0, new RuntimeBeanReference("redisMappingConfiguration#0"));
    beanDefinition.setInstanceSupplier(getKeyValueMappingContextInstanceSupplier());
    return beanDefinition;
  }
}
