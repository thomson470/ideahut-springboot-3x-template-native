package net.ideahut.springboot.template.config;

import org.springframework.aot.generate.Generated;
import org.springframework.beans.factory.aot.AutowiredFieldValueResolver;
import org.springframework.beans.factory.support.RegisteredBean;

/**
 * Autowiring for {@link TaskConfig}.
 */
@Generated
public class TaskConfig__Autowiring {
  /**
   * Apply the autowiring.
   */
  public static TaskConfig apply(RegisteredBean registeredBean, TaskConfig instance) {
    AutowiredFieldValueResolver.forRequiredField("appProperties").resolveAndSet(registeredBean, instance);
    return instance;
  }
}
