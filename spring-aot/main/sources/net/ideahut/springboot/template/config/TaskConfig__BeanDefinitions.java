package net.ideahut.springboot.template.config;

import net.ideahut.springboot.task.TaskHandler;
import org.springframework.aot.generate.Generated;
import org.springframework.beans.factory.aot.BeanInstanceSupplier;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.InstanceSupplier;
import org.springframework.beans.factory.support.RootBeanDefinition;
import org.springframework.context.annotation.ConfigurationClassUtils;

/**
 * Bean definitions for {@link TaskConfig}.
 */
@Generated
public class TaskConfig__BeanDefinitions {
  /**
   * Get the bean definition for 'taskConfig'.
   */
  public static BeanDefinition getTaskConfigBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(TaskConfig.class);
    beanDefinition.setTargetType(TaskConfig.class);
    ConfigurationClassUtils.initializeConfigurationClass(TaskConfig.class);
    InstanceSupplier<TaskConfig> instanceSupplier = InstanceSupplier.using(TaskConfig$$SpringCGLIB$$0::new);
    instanceSupplier = instanceSupplier.andThen(TaskConfig__Autowiring::apply);
    beanDefinition.setInstanceSupplier(instanceSupplier);
    return beanDefinition;
  }

  /**
   * Get the bean instance supplier for 'commonTask'.
   */
  private static BeanInstanceSupplier<TaskHandler> getCommonTaskInstanceSupplier() {
    return BeanInstanceSupplier.<TaskHandler>forFactoryMethod(TaskConfig.class, "commonTask")
            .withGenerator((registeredBean) -> registeredBean.getBeanFactory().getBean(TaskConfig.class).commonTask());
  }

  /**
   * Get the bean definition for 'commonTask'.
   */
  public static BeanDefinition getCommonTaskBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(TaskHandler.class);
    beanDefinition.setPrimary(true);
    beanDefinition.setDestroyMethodNames("shutdown");
    beanDefinition.setInstanceSupplier(getCommonTaskInstanceSupplier());
    return beanDefinition;
  }

  /**
   * Get the bean instance supplier for 'auditTask'.
   */
  private static BeanInstanceSupplier<TaskHandler> getAuditTaskInstanceSupplier() {
    return BeanInstanceSupplier.<TaskHandler>forFactoryMethod(TaskConfig.class, "auditTask")
            .withGenerator((registeredBean) -> registeredBean.getBeanFactory().getBean(TaskConfig.class).auditTask());
  }

  /**
   * Get the bean definition for 'auditTask'.
   */
  public static BeanDefinition getAuditTaskBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(TaskHandler.class);
    beanDefinition.setDestroyMethodNames("shutdown");
    beanDefinition.setInstanceSupplier(getAuditTaskInstanceSupplier());
    return beanDefinition;
  }
}
