package net.ideahut.springboot.template.controller;

import org.springframework.aot.generate.Generated;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.InstanceSupplier;
import org.springframework.beans.factory.support.RootBeanDefinition;

/**
 * Bean definitions for {@link MailController}.
 */
@Generated
public class MailController__BeanDefinitions {
  /**
   * Get the bean definition for 'mailController'.
   */
  public static BeanDefinition getMailControllerBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(MailController.class);
    InstanceSupplier<MailController> instanceSupplier = InstanceSupplier.using(MailController::new);
    instanceSupplier = instanceSupplier.andThen(MailController__Autowiring::apply);
    beanDefinition.setInstanceSupplier(instanceSupplier);
    return beanDefinition;
  }
}
