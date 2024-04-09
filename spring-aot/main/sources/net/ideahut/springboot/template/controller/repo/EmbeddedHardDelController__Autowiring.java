package net.ideahut.springboot.template.controller.repo;

import org.springframework.aot.generate.Generated;
import org.springframework.beans.factory.aot.AutowiredFieldValueResolver;
import org.springframework.beans.factory.support.RegisteredBean;

/**
 * Autowiring for {@link EmbeddedHardDelController}.
 */
@Generated
public class EmbeddedHardDelController__Autowiring {
  /**
   * Apply the autowiring.
   */
  public static EmbeddedHardDelController apply(RegisteredBean registeredBean,
      EmbeddedHardDelController instance) {
    AutowiredFieldValueResolver.forRequiredField("entityTrxManager").resolveAndSet(registeredBean, instance);
    AutowiredFieldValueResolver.forRequiredField("repo").resolveAndSet(registeredBean, instance);
    return instance;
  }
}
