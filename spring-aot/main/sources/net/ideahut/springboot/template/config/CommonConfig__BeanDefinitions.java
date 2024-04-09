package net.ideahut.springboot.template.config;

import net.ideahut.springboot.entity.EntityTrxManager;
import net.ideahut.springboot.mapper.DataMapper;
import org.springframework.aot.generate.Generated;
import org.springframework.beans.factory.aot.BeanInstanceSupplier;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.RootBeanDefinition;
import org.springframework.context.annotation.ConfigurationClassUtils;

/**
 * Bean definitions for {@link CommonConfig}.
 */
@Generated
public class CommonConfig__BeanDefinitions {
  /**
   * Get the bean definition for 'commonConfig'.
   */
  public static BeanDefinition getCommonConfigBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(CommonConfig.class);
    beanDefinition.setTargetType(CommonConfig.class);
    ConfigurationClassUtils.initializeConfigurationClass(CommonConfig.class);
    beanDefinition.setInstanceSupplier(CommonConfig$$SpringCGLIB$$0::new);
    return beanDefinition;
  }

  /**
   * Get the bean instance supplier for 'dataMapper'.
   */
  private static BeanInstanceSupplier<DataMapper> getDataMapperInstanceSupplier() {
    return BeanInstanceSupplier.<DataMapper>forFactoryMethod(CommonConfig.class, "dataMapper")
            .withGenerator((registeredBean) -> registeredBean.getBeanFactory().getBean(CommonConfig.class).dataMapper());
  }

  /**
   * Get the bean definition for 'dataMapper'.
   */
  public static BeanDefinition getDataMapperBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(DataMapper.class);
    beanDefinition.setInstanceSupplier(getDataMapperInstanceSupplier());
    return beanDefinition;
  }

  /**
   * Get the bean instance supplier for 'entityTrxManager'.
   */
  private static BeanInstanceSupplier<EntityTrxManager> getEntityTrxManagerInstanceSupplier() {
    return BeanInstanceSupplier.<EntityTrxManager>forFactoryMethod(CommonConfig.class, "entityTrxManager")
            .withGenerator((registeredBean) -> registeredBean.getBeanFactory().getBean(CommonConfig.class).entityTrxManager());
  }

  /**
   * Get the bean definition for 'entityTrxManager'.
   */
  public static BeanDefinition getEntityTrxManagerBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(EntityTrxManager.class);
    beanDefinition.setInstanceSupplier(getEntityTrxManagerInstanceSupplier());
    return beanDefinition;
  }
}
