package net.ideahut.springboot.template.controller;

import org.springframework.aot.generate.Generated;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.InstanceSupplier;
import org.springframework.beans.factory.support.RootBeanDefinition;

/**
 * Bean definitions for {@link MessageController}.
 */
@Generated
public class MessageController__BeanDefinitions {
  /**
   * Get the bean definition for 'messageController'.
   */
  public static BeanDefinition getMessageControllerBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(MessageController.class);
    InstanceSupplier<MessageController> instanceSupplier = InstanceSupplier.using(MessageController::new);
    instanceSupplier = instanceSupplier.andThen(MessageController__Autowiring::apply);
    beanDefinition.setInstanceSupplier(instanceSupplier);
    return beanDefinition;
  }
}
