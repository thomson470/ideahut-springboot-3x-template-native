package net.ideahut.springboot.template.controller;

import org.springframework.aot.generate.Generated;
import org.springframework.beans.factory.aot.AutowiredFieldValueResolver;
import org.springframework.beans.factory.support.RegisteredBean;

/**
 * Autowiring for {@link MenuController}.
 */
@Generated
public class MenuController__Autowiring {
  /**
   * Apply the autowiring.
   */
  public static MenuController apply(RegisteredBean registeredBean, MenuController instance) {
    AutowiredFieldValueResolver.forRequiredField("dataMapper").resolveAndSet(registeredBean, instance);
    AutowiredFieldValueResolver.forRequiredField("gridHandler").resolveAndSet(registeredBean, instance);
    return instance;
  }
}
