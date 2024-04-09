package net.ideahut.springboot.template.interceptor;

import org.springframework.aot.generate.Generated;
import org.springframework.beans.factory.aot.AutowiredFieldValueResolver;
import org.springframework.beans.factory.support.RegisteredBean;

/**
 * Autowiring for {@link RequestInterceptor}.
 */
@Generated
public class RequestInterceptor__Autowiring {
  /**
   * Apply the autowiring.
   */
  public static RequestInterceptor apply(RegisteredBean registeredBean,
      RequestInterceptor instance) {
    AutowiredFieldValueResolver.forRequiredField("appProperties").resolveAndSet(registeredBean, instance);
    AutowiredFieldValueResolver.forRequiredField("adminHandler").resolveAndSet(registeredBean, instance);
    AutowiredFieldValueResolver.forRequiredField("adminSecurity").resolveAndSet(registeredBean, instance);
    AutowiredFieldValueResolver.forRequiredField("adminCredential").resolveAndSet(registeredBean, instance);
    return instance;
  }
}
