package net.ideahut.springboot.template.controller.repo;

import org.springframework.aot.generate.Generated;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.InstanceSupplier;
import org.springframework.beans.factory.support.RootBeanDefinition;

/**
 * Bean definitions for {@link AutoGenStrIdHardDelController}.
 */
@Generated
public class AutoGenStrIdHardDelController__BeanDefinitions {
  /**
   * Get the bean definition for 'autoGenStrIdHardDelController'.
   */
  public static BeanDefinition getAutoGenStrIdHardDelControllerBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(AutoGenStrIdHardDelController.class);
    InstanceSupplier<AutoGenStrIdHardDelController> instanceSupplier = InstanceSupplier.using(AutoGenStrIdHardDelController::new);
    instanceSupplier = instanceSupplier.andThen(AutoGenStrIdHardDelController__Autowiring::apply);
    beanDefinition.setInstanceSupplier(instanceSupplier);
    return beanDefinition;
  }
}
