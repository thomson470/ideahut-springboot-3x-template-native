package net.ideahut.springboot.template.controller.repo;

import org.springframework.aot.generate.Generated;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.InstanceSupplier;
import org.springframework.beans.factory.support.RootBeanDefinition;

/**
 * Bean definitions for {@link ManualGenStrIdSoftDelController}.
 */
@Generated
public class ManualGenStrIdSoftDelController__BeanDefinitions {
  /**
   * Get the bean definition for 'manualGenStrIdSoftDelController'.
   */
  public static BeanDefinition getManualGenStrIdSoftDelControllerBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(ManualGenStrIdSoftDelController.class);
    InstanceSupplier<ManualGenStrIdSoftDelController> instanceSupplier = InstanceSupplier.using(ManualGenStrIdSoftDelController::new);
    instanceSupplier = instanceSupplier.andThen(ManualGenStrIdSoftDelController__Autowiring::apply);
    beanDefinition.setInstanceSupplier(instanceSupplier);
    return beanDefinition;
  }
}
