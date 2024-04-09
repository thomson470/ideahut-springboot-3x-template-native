package net.ideahut.springboot.template.controller;

import org.springframework.aot.generate.Generated;
import org.springframework.beans.factory.aot.AutowiredFieldValueResolver;
import org.springframework.beans.factory.support.RegisteredBean;

/**
 * Autowiring for {@link ReplicaController}.
 */
@Generated
public class ReplicaController__Autowiring {
  /**
   * Apply the autowiring.
   */
  public static ReplicaController apply(RegisteredBean registeredBean, ReplicaController instance) {
    AutowiredFieldValueResolver.forRequiredField("entityTrxManager").resolveAndSet(registeredBean, instance);
    return instance;
  }
}
