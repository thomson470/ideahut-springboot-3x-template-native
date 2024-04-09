package org.springframework.boot.autoconfigure.quartz;

import java.util.Map;
import org.springframework.aot.generate.Generated;
import org.springframework.beans.factory.ObjectProvider;
import org.springframework.beans.factory.aot.BeanInstanceSupplier;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.RootBeanDefinition;
import org.springframework.context.ApplicationContext;
import org.springframework.scheduling.quartz.SchedulerFactoryBean;

/**
 * Bean definitions for {@link QuartzAutoConfiguration}.
 */
@Generated
public class QuartzAutoConfiguration__BeanDefinitions {
  /**
   * Get the bean definition for 'quartzAutoConfiguration'.
   */
  public static BeanDefinition getQuartzAutoConfigurationBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(QuartzAutoConfiguration.class);
    beanDefinition.setInstanceSupplier(QuartzAutoConfiguration::new);
    return beanDefinition;
  }

  /**
   * Get the bean instance supplier for 'quartzScheduler'.
   */
  private static BeanInstanceSupplier<SchedulerFactoryBean> getQuartzSchedulerInstanceSupplier() {
    return BeanInstanceSupplier.<SchedulerFactoryBean>forFactoryMethod(QuartzAutoConfiguration.class, "quartzScheduler", QuartzProperties.class, ObjectProvider.class, ObjectProvider.class, Map.class, ObjectProvider.class, ApplicationContext.class)
            .withGenerator((registeredBean, args) -> registeredBean.getBeanFactory().getBean(QuartzAutoConfiguration.class).quartzScheduler(args.get(0), args.get(1), args.get(2), args.get(3), args.get(4), args.get(5)));
  }

  /**
   * Get the bean definition for 'quartzScheduler'.
   */
  public static BeanDefinition getQuartzSchedulerBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(SchedulerFactoryBean.class);
    beanDefinition.setDependsOn("dataSourceScriptDatabaseInitializer");
    beanDefinition.setInstanceSupplier(getQuartzSchedulerInstanceSupplier());
    return beanDefinition;
  }
}
