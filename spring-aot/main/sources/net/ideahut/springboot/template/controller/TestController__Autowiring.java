package net.ideahut.springboot.template.controller;

import org.springframework.aot.generate.Generated;
import org.springframework.beans.factory.aot.AutowiredFieldValueResolver;
import org.springframework.beans.factory.support.RegisteredBean;

/**
 * Autowiring for {@link TestController}.
 */
@Generated
public class TestController__Autowiring {
  /**
   * Apply the autowiring.
   */
  public static TestController apply(RegisteredBean registeredBean, TestController instance) {
    AutowiredFieldValueResolver.forRequiredField("dataMapper").resolveAndSet(registeredBean, instance);
    AutowiredFieldValueResolver.forRequiredField("entityTrxManager").resolveAndSet(registeredBean, instance);
    AutowiredFieldValueResolver.forRequiredField("crudHandler").resolveAndSet(registeredBean, instance);
    AutowiredFieldValueResolver.forRequiredField("taskHandler").resolveAndSet(registeredBean, instance);
    AutowiredFieldValueResolver.forRequiredField("auditHandler").resolveAndSet(registeredBean, instance);
    AutowiredFieldValueResolver.forRequiredField("adminCredential").resolveAndSet(registeredBean, instance);
    AutowiredFieldValueResolver.forRequiredField("sysParamHandler").resolveAndSet(registeredBean, instance);
    return instance;
  }
}
