package net.ideahut.springboot.template.config;

import org.springframework.aot.generate.Generated;
import org.springframework.beans.factory.aot.AutowiredFieldValueResolver;
import org.springframework.beans.factory.support.RegisteredBean;

/**
 * Autowiring for {@link AdminConfig}.
 */
@Generated
public class AdminConfig__Autowiring {
  /**
   * Apply the autowiring.
   */
  public static AdminConfig apply(RegisteredBean registeredBean, AdminConfig instance) {
    AutowiredFieldValueResolver.forRequiredField("applicationContext").resolveAndSet(registeredBean, instance);
    AutowiredFieldValueResolver.forRequiredField("appProperties").resolveAndSet(registeredBean, instance);
    return instance;
  }
}
