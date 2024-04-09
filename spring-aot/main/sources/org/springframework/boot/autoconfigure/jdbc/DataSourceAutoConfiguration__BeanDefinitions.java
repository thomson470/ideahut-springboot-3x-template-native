package org.springframework.boot.autoconfigure.jdbc;

import org.springframework.aot.generate.Generated;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.RootBeanDefinition;

/**
 * Bean definitions for {@link DataSourceAutoConfiguration}.
 */
@Generated
public class DataSourceAutoConfiguration__BeanDefinitions {
  /**
   * Get the bean definition for 'dataSourceAutoConfiguration'.
   */
  public static BeanDefinition getDataSourceAutoConfigurationBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(DataSourceAutoConfiguration.class);
    beanDefinition.setInstanceSupplier(DataSourceAutoConfiguration::new);
    return beanDefinition;
  }
}
