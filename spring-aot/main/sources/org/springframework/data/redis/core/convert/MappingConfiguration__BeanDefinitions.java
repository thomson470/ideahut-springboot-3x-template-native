package org.springframework.data.redis.core.convert;

import org.springframework.aot.generate.Generated;
import org.springframework.beans.factory.aot.BeanInstanceSupplier;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.config.RuntimeBeanReference;
import org.springframework.beans.factory.support.RootBeanDefinition;
import org.springframework.data.redis.core.index.ConfigurableIndexDefinitionProvider;

/**
 * Bean definitions for {@link MappingConfiguration}.
 */
@Generated
public class MappingConfiguration__BeanDefinitions {
  /**
   * Get the bean instance supplier for 'redisMappingConfiguration#0'.
   */
  private static BeanInstanceSupplier<MappingConfiguration> getRedisMappingConfigurationInstanceSupplier(
      ) {
    return BeanInstanceSupplier.<MappingConfiguration>forConstructor(ConfigurableIndexDefinitionProvider.class, KeyspaceConfiguration.class)
            .withGenerator((registeredBean, args) -> new MappingConfiguration(args.get(0), args.get(1)));
  }

  /**
   * Get the bean definition for 'redisMappingConfiguration#0'.
   */
  public static BeanDefinition getRedisMappingConfigurationBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(MappingConfiguration.class);
    beanDefinition.getConstructorArgumentValues().addIndexedArgumentValue(0, new RuntimeBeanReference("redisIndexConfiguration#0"));
    beanDefinition.getConstructorArgumentValues().addIndexedArgumentValue(1, new RuntimeBeanReference("redisKeyspaceConfiguration#0"));
    beanDefinition.setInstanceSupplier(getRedisMappingConfigurationInstanceSupplier());
    return beanDefinition;
  }
}
