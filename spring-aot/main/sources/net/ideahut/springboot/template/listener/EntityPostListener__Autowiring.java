package net.ideahut.springboot.template.listener;

import org.springframework.aot.generate.Generated;
import org.springframework.beans.factory.aot.AutowiredFieldValueResolver;
import org.springframework.beans.factory.support.RegisteredBean;

/**
 * Autowiring for {@link EntityPostListener}.
 */
@Generated
public class EntityPostListener__Autowiring {
  /**
   * Apply the autowiring.
   */
  public static EntityPostListener apply(RegisteredBean registeredBean,
      EntityPostListener instance) {
    AutowiredFieldValueResolver.forRequiredField("auditHandler").resolveAndSet(registeredBean, instance);
    return instance;
  }
}
