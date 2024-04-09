package net.ideahut.springboot.template.controller;

import org.springframework.aot.generate.Generated;
import org.springframework.beans.factory.aot.AutowiredFieldValueResolver;
import org.springframework.beans.factory.support.RegisteredBean;

/**
 * Autowiring for {@link AuditController}.
 */
@Generated
public class AuditController__Autowiring {
  /**
   * Apply the autowiring.
   */
  public static AuditController apply(RegisteredBean registeredBean, AuditController instance) {
    AutowiredFieldValueResolver.forRequiredField("entityTrxManager").resolveAndSet(registeredBean, instance);
    AutowiredFieldValueResolver.forRequiredField("auditHandler").resolveAndSet(registeredBean, instance);
    return instance;
  }
}
