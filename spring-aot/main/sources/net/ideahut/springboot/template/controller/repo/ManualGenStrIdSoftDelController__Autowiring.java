package net.ideahut.springboot.template.controller.repo;

import org.springframework.aot.generate.Generated;
import org.springframework.beans.factory.aot.AutowiredFieldValueResolver;
import org.springframework.beans.factory.support.RegisteredBean;

/**
 * Autowiring for {@link ManualGenStrIdSoftDelController}.
 */
@Generated
public class ManualGenStrIdSoftDelController__Autowiring {
  /**
   * Apply the autowiring.
   */
  public static ManualGenStrIdSoftDelController apply(RegisteredBean registeredBean,
      ManualGenStrIdSoftDelController instance) {
    AutowiredFieldValueResolver.forRequiredField("entityTrxManager").resolveAndSet(registeredBean, instance);
    AutowiredFieldValueResolver.forRequiredField("repo").resolveAndSet(registeredBean, instance);
    return instance;
  }
}
