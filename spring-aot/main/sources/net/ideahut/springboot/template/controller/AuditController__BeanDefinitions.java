package net.ideahut.springboot.template.controller;

import org.springframework.aot.generate.Generated;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.InstanceSupplier;
import org.springframework.beans.factory.support.RootBeanDefinition;

/**
 * Bean definitions for {@link AuditController}.
 */
@Generated
public class AuditController__BeanDefinitions {
  /**
   * Get the bean definition for 'auditController'.
   */
  public static BeanDefinition getAuditControllerBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(AuditController.class);
    InstanceSupplier<AuditController> instanceSupplier = InstanceSupplier.using(AuditController::new);
    instanceSupplier = instanceSupplier.andThen(AuditController__Autowiring::apply);
    beanDefinition.setInstanceSupplier(instanceSupplier);
    return beanDefinition;
  }
}
