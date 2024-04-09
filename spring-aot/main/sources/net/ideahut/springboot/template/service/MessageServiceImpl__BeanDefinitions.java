package net.ideahut.springboot.template.service;

import org.springframework.aot.generate.Generated;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.InstanceSupplier;
import org.springframework.beans.factory.support.RootBeanDefinition;

/**
 * Bean definitions for {@link MessageServiceImpl}.
 */
@Generated
public class MessageServiceImpl__BeanDefinitions {
  /**
   * Get the bean definition for 'messageServiceImpl'.
   */
  public static BeanDefinition getMessageServiceImplBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(MessageServiceImpl.class);
    InstanceSupplier<MessageServiceImpl> instanceSupplier = InstanceSupplier.using(MessageServiceImpl::new);
    instanceSupplier = instanceSupplier.andThen(MessageServiceImpl__Autowiring::apply);
    beanDefinition.setInstanceSupplier(instanceSupplier);
    return beanDefinition;
  }
}
