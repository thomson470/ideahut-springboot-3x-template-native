package net.ideahut.springboot.template;

import org.springframework.aot.generate.Generated;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.InstanceSupplier;
import org.springframework.beans.factory.support.RootBeanDefinition;

/**
 * Bean definitions for {@link AppAdvice}.
 */
@Generated
public class AppAdvice__BeanDefinitions {
  /**
   * Get the bean definition for 'appAdvice'.
   */
  public static BeanDefinition getAppAdviceBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(AppAdvice.class);
    InstanceSupplier<AppAdvice> instanceSupplier = InstanceSupplier.using(AppAdvice::new);
    instanceSupplier = instanceSupplier.andThen(AppAdvice__Autowiring::apply);
    beanDefinition.setInstanceSupplier(instanceSupplier);
    return beanDefinition;
  }
}
