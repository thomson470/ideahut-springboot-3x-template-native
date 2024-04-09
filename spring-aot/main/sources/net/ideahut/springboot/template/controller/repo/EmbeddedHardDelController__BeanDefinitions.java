package net.ideahut.springboot.template.controller.repo;

import org.springframework.aot.generate.Generated;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.InstanceSupplier;
import org.springframework.beans.factory.support.RootBeanDefinition;

/**
 * Bean definitions for {@link EmbeddedHardDelController}.
 */
@Generated
public class EmbeddedHardDelController__BeanDefinitions {
  /**
   * Get the bean definition for 'embeddedHardDelController'.
   */
  public static BeanDefinition getEmbeddedHardDelControllerBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(EmbeddedHardDelController.class);
    InstanceSupplier<EmbeddedHardDelController> instanceSupplier = InstanceSupplier.using(EmbeddedHardDelController::new);
    instanceSupplier = instanceSupplier.andThen(EmbeddedHardDelController__Autowiring::apply);
    beanDefinition.setInstanceSupplier(instanceSupplier);
    return beanDefinition;
  }
}
