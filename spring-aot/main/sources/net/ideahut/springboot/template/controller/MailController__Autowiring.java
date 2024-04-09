package net.ideahut.springboot.template.controller;

import org.springframework.aot.generate.Generated;
import org.springframework.beans.factory.aot.AutowiredFieldValueResolver;
import org.springframework.beans.factory.support.RegisteredBean;

/**
 * Autowiring for {@link MailController}.
 */
@Generated
public class MailController__Autowiring {
  /**
   * Apply the autowiring.
   */
  public static MailController apply(RegisteredBean registeredBean, MailController instance) {
    AutowiredFieldValueResolver.forRequiredField("mailHandler").resolveAndSet(registeredBean, instance);
    return instance;
  }
}
