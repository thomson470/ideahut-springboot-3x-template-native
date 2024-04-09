package net.ideahut.springboot.template.service;

import org.springframework.aot.generate.Generated;
import org.springframework.beans.factory.aot.AutowiredFieldValueResolver;
import org.springframework.beans.factory.support.RegisteredBean;

/**
 * Autowiring for {@link MessageServiceImpl}.
 */
@Generated
public class MessageServiceImpl__Autowiring {
  /**
   * Apply the autowiring.
   */
  public static MessageServiceImpl apply(RegisteredBean registeredBean,
      MessageServiceImpl instance) {
    AutowiredFieldValueResolver.forRequiredField("dataMapper").resolveAndSet(registeredBean, instance);
    AutowiredFieldValueResolver.forRequiredField("redisTemplate").resolveAndSet(registeredBean, instance);
    AutowiredFieldValueResolver.forRequiredField("appProperties").resolveAndSet(registeredBean, instance);
    return instance;
  }
}
