package net.ideahut.springboot.template;

import org.springframework.aot.generate.Generated;
import org.springframework.beans.factory.aot.AutowiredFieldValueResolver;
import org.springframework.beans.factory.support.RegisteredBean;

/**
 * Autowiring for {@link AppAdvice}.
 */
@Generated
public class AppAdvice__Autowiring {
  /**
   * Apply the autowiring.
   */
  public static AppAdvice apply(RegisteredBean registeredBean, AppAdvice instance) {
    AutowiredFieldValueResolver.forRequiredField("appProperties").resolveAndSet(registeredBean, instance);
    return instance;
  }
}
