package net.ideahut.springboot.template.controller;

import org.springframework.aot.generate.Generated;
import org.springframework.beans.factory.aot.AutowiredFieldValueResolver;
import org.springframework.beans.factory.support.RegisteredBean;

/**
 * Autowiring for {@link CrudController}.
 */
@Generated
public class CrudController__Autowiring {
  /**
   * Apply the autowiring.
   */
  public static CrudController apply(RegisteredBean registeredBean, CrudController instance) {
    AutowiredFieldValueResolver.forRequiredField("handler").resolveAndSet(registeredBean, instance);
    AutowiredFieldValueResolver.forRequiredField("permission").resolveAndSet(registeredBean, instance);
    return instance;
  }
}
