package net.ideahut.springboot.template.interceptor;

import org.springframework.aot.generate.Generated;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.InstanceSupplier;
import org.springframework.beans.factory.support.RootBeanDefinition;

/**
 * Bean definitions for {@link RequestInterceptor}.
 */
@Generated
public class RequestInterceptor__BeanDefinitions {
  /**
   * Get the bean definition for 'requestInterceptor'.
   */
  public static BeanDefinition getRequestInterceptorBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(RequestInterceptor.class);
    InstanceSupplier<RequestInterceptor> instanceSupplier = InstanceSupplier.using(RequestInterceptor::new);
    instanceSupplier = instanceSupplier.andThen(RequestInterceptor__Autowiring::apply);
    beanDefinition.setInstanceSupplier(instanceSupplier);
    return beanDefinition;
  }
}
