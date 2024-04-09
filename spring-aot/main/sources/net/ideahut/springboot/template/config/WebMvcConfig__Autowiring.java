package net.ideahut.springboot.template.config;

import org.springframework.aot.generate.Generated;
import org.springframework.beans.factory.aot.AutowiredFieldValueResolver;
import org.springframework.beans.factory.support.RegisteredBean;

/**
 * Autowiring for {@link WebMvcConfig}.
 */
@Generated
public class WebMvcConfig__Autowiring {
  /**
   * Apply the autowiring.
   */
  public static WebMvcConfig apply(RegisteredBean registeredBean, WebMvcConfig instance) {
    AutowiredFieldValueResolver.forRequiredField("dataMapper").resolveAndSet(registeredBean, instance);
    AutowiredFieldValueResolver.forRequiredField("requestInterceptor").resolveAndSet(registeredBean, instance);
    AutowiredFieldValueResolver.forRequiredField("adminHandler").resolveAndSet(registeredBean, instance);
    return instance;
  }
}
