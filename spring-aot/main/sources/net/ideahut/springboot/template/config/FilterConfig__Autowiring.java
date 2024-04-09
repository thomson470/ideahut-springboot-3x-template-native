package net.ideahut.springboot.template.config;

import org.springframework.aot.generate.Generated;
import org.springframework.beans.factory.aot.AutowiredFieldValueResolver;
import org.springframework.beans.factory.support.RegisteredBean;

/**
 * Autowiring for {@link FilterConfig}.
 */
@Generated
public class FilterConfig__Autowiring {
  /**
   * Apply the autowiring.
   */
  public static FilterConfig apply(RegisteredBean registeredBean, FilterConfig instance) {
    AutowiredFieldValueResolver.forRequiredField("environment").resolveAndSet(registeredBean, instance);
    AutowiredFieldValueResolver.forRequiredField("appProperties").resolveAndSet(registeredBean, instance);
    return instance;
  }
}
