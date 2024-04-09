package net.ideahut.springboot.template.listener;

import org.springframework.aot.generate.Generated;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.InstanceSupplier;
import org.springframework.beans.factory.support.RootBeanDefinition;

/**
 * Bean definitions for {@link EntityPostListener}.
 */
@Generated
public class EntityPostListener__BeanDefinitions {
  /**
   * Get the bean definition for 'entityPostListener'.
   */
  public static BeanDefinition getEntityPostListenerBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(EntityPostListener.class);
    InstanceSupplier<EntityPostListener> instanceSupplier = InstanceSupplier.using(EntityPostListener::new);
    instanceSupplier = instanceSupplier.andThen(EntityPostListener__Autowiring::apply);
    beanDefinition.setInstanceSupplier(instanceSupplier);
    return beanDefinition;
  }
}
