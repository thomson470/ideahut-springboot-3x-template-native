package net.ideahut.springboot.template.controller;

import org.springframework.aot.generate.Generated;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.InstanceSupplier;
import org.springframework.beans.factory.support.RootBeanDefinition;

/**
 * Bean definitions for {@link ReplicaController}.
 */
@Generated
public class ReplicaController__BeanDefinitions {
  /**
   * Get the bean definition for 'replicaController'.
   */
  public static BeanDefinition getReplicaControllerBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(ReplicaController.class);
    InstanceSupplier<ReplicaController> instanceSupplier = InstanceSupplier.using(ReplicaController::new);
    instanceSupplier = instanceSupplier.andThen(ReplicaController__Autowiring::apply);
    beanDefinition.setInstanceSupplier(instanceSupplier);
    return beanDefinition;
  }
}
