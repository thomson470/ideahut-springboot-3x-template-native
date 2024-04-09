package net.ideahut.springboot.template.controller.repo;

import org.springframework.aot.generate.Generated;
import org.springframework.beans.factory.aot.AutowiredFieldValueResolver;
import org.springframework.beans.factory.support.RegisteredBean;

/**
 * Autowiring for {@link AutoGenStrIdHardDelController}.
 */
@Generated
public class AutoGenStrIdHardDelController__Autowiring {
  /**
   * Apply the autowiring.
   */
  public static AutoGenStrIdHardDelController apply(RegisteredBean registeredBean,
      AutoGenStrIdHardDelController instance) {
    AutowiredFieldValueResolver.forRequiredField("entityTrxManager").resolveAndSet(registeredBean, instance);
    AutowiredFieldValueResolver.forRequiredField("repo").resolveAndSet(registeredBean, instance);
    return instance;
  }
}
