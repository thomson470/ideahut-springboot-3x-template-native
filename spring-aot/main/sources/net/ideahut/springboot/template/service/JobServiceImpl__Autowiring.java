package net.ideahut.springboot.template.service;

import org.springframework.aot.generate.Generated;
import org.springframework.beans.factory.aot.AutowiredFieldValueResolver;
import org.springframework.beans.factory.support.RegisteredBean;

/**
 * Autowiring for {@link JobServiceImpl}.
 */
@Generated
public class JobServiceImpl__Autowiring {
  /**
   * Apply the autowiring.
   */
  public static JobServiceImpl apply(RegisteredBean registeredBean, JobServiceImpl instance) {
    AutowiredFieldValueResolver.forRequiredField("entityTrxManager").resolveAndSet(registeredBean, instance);
    AutowiredFieldValueResolver.forRequiredField("taskHandler").resolveAndSet(registeredBean, instance);
    AutowiredFieldValueResolver.forRequiredField("crudHandler").resolveAndSet(registeredBean, instance);
    return instance;
  }
}
