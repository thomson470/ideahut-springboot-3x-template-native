package net.ideahut.springboot.template.controller;

import org.springframework.aot.generate.Generated;
import org.springframework.beans.factory.aot.AutowiredFieldValueResolver;
import org.springframework.beans.factory.support.RegisteredBean;

/**
 * Autowiring for {@link AdminController}.
 */
@Generated
public class AdminController__Autowiring {
  /**
   * Apply the autowiring.
   */
  public static AdminController apply(RegisteredBean registeredBean, AdminController instance) {
    AutowiredFieldValueResolver.forRequiredField("dataMapper").resolveAndSet(registeredBean, instance);
    AutowiredFieldValueResolver.forRequiredField("adminHandler").resolveAndSet(registeredBean, instance);
    return instance;
  }
}
