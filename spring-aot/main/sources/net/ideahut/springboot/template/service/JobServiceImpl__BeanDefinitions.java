package net.ideahut.springboot.template.service;

import org.springframework.aot.generate.Generated;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.InstanceSupplier;
import org.springframework.beans.factory.support.RootBeanDefinition;

/**
 * Bean definitions for {@link JobServiceImpl}.
 */
@Generated
public class JobServiceImpl__BeanDefinitions {
  /**
   * Get the bean definition for 'jobServiceImpl'.
   */
  public static BeanDefinition getJobServiceImplBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(JobServiceImpl.class);
    InstanceSupplier<JobServiceImpl> instanceSupplier = InstanceSupplier.using(JobServiceImpl::new);
    instanceSupplier = instanceSupplier.andThen(JobServiceImpl__Autowiring::apply);
    beanDefinition.setInstanceSupplier(instanceSupplier);
    return beanDefinition;
  }
}
