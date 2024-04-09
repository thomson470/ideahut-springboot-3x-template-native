package net.ideahut.springboot.template.controller;

import org.springframework.aot.generate.Generated;
import org.springframework.beans.factory.aot.AutowiredFieldValueResolver;
import org.springframework.beans.factory.support.RegisteredBean;

/**
 * Autowiring for {@link GridController}.
 */
@Generated
public class GridController__Autowiring {
  /**
   * Apply the autowiring.
   */
  public static GridController apply(RegisteredBean registeredBean, GridController instance) {
    AutowiredFieldValueResolver.forRequiredField("gridHandler").resolveAndSet(registeredBean, instance);
    return instance;
  }
}
