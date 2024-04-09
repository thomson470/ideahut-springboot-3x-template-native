package net.ideahut.springboot.template.controller;

import org.springframework.aot.generate.Generated;
import org.springframework.beans.factory.aot.AutowiredFieldValueResolver;
import org.springframework.beans.factory.support.RegisteredBean;

/**
 * Autowiring for {@link CacheController}.
 */
@Generated
public class CacheController__Autowiring {
  /**
   * Apply the autowiring.
   */
  public static CacheController apply(RegisteredBean registeredBean, CacheController instance) {
    AutowiredFieldValueResolver.forRequiredField("cacheGroupHandler").resolveAndSet(registeredBean, instance);
    return instance;
  }
}
