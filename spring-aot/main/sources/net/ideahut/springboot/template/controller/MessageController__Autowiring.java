package net.ideahut.springboot.template.controller;

import org.springframework.aot.generate.Generated;
import org.springframework.beans.factory.aot.AutowiredFieldValueResolver;
import org.springframework.beans.factory.support.RegisteredBean;

/**
 * Autowiring for {@link MessageController}.
 */
@Generated
public class MessageController__Autowiring {
  /**
   * Apply the autowiring.
   */
  public static MessageController apply(RegisteredBean registeredBean, MessageController instance) {
    AutowiredFieldValueResolver.forRequiredField("messageService").resolveAndSet(registeredBean, instance);
    return instance;
  }
}
