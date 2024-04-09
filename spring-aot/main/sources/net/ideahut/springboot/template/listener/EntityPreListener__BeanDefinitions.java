package net.ideahut.springboot.template.listener;

import org.springframework.aot.generate.Generated;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.RootBeanDefinition;

/**
 * Bean definitions for {@link EntityPreListener}.
 */
@Generated
public class EntityPreListener__BeanDefinitions {
  /**
   * Get the bean definition for 'entityPreListener'.
   */
  public static BeanDefinition getEntityPreListenerBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(EntityPreListener.class);
    beanDefinition.setInstanceSupplier(EntityPreListener::new);
    return beanDefinition;
  }
}
