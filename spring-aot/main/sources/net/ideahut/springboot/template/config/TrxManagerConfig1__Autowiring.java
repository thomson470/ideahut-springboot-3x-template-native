package net.ideahut.springboot.template.config;

import org.springframework.aot.generate.Generated;
import org.springframework.beans.factory.aot.AutowiredFieldValueResolver;
import org.springframework.beans.factory.support.RegisteredBean;

/**
 * Autowiring for {@link TrxManagerConfig1}.
 */
@Generated
public class TrxManagerConfig1__Autowiring {
  /**
   * Apply the autowiring.
   */
  public static TrxManagerConfig1 apply(RegisteredBean registeredBean, TrxManagerConfig1 instance) {
    AutowiredFieldValueResolver.forRequiredField("environment").resolveAndSet(registeredBean, instance);
    AutowiredFieldValueResolver.forRequiredField("appProperties").resolveAndSet(registeredBean, instance);
    return instance;
  }
}
