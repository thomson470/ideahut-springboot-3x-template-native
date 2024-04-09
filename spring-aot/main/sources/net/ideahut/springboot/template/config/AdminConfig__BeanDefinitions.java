package net.ideahut.springboot.template.config;

import net.ideahut.springboot.admin.AdminHandler;
import net.ideahut.springboot.admin.AdminSecurity;
import net.ideahut.springboot.mapper.DataMapper;
import net.ideahut.springboot.security.RedisMemoryCredential;
import net.ideahut.springboot.security.SecurityCredential;
import org.springframework.aot.generate.Generated;
import org.springframework.beans.factory.aot.BeanInstanceSupplier;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.InstanceSupplier;
import org.springframework.beans.factory.support.RootBeanDefinition;
import org.springframework.context.annotation.ConfigurationClassUtils;
import org.springframework.data.redis.core.RedisTemplate;

/**
 * Bean definitions for {@link AdminConfig}.
 */
@Generated
public class AdminConfig__BeanDefinitions {
  /**
   * Get the bean definition for 'adminConfig'.
   */
  public static BeanDefinition getAdminConfigBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(AdminConfig.class);
    beanDefinition.setTargetType(AdminConfig.class);
    ConfigurationClassUtils.initializeConfigurationClass(AdminConfig.class);
    InstanceSupplier<AdminConfig> instanceSupplier = InstanceSupplier.using(AdminConfig$$SpringCGLIB$$0::new);
    instanceSupplier = instanceSupplier.andThen(AdminConfig__Autowiring::apply);
    beanDefinition.setInstanceSupplier(instanceSupplier);
    return beanDefinition;
  }

  /**
   * Get the bean instance supplier for 'adminHandler'.
   */
  private static BeanInstanceSupplier<AdminHandler> getAdminHandlerInstanceSupplier() {
    return BeanInstanceSupplier.<AdminHandler>forFactoryMethod(AdminConfig.class, "adminHandler", DataMapper.class, RedisTemplate.class)
            .withGenerator((registeredBean, args) -> registeredBean.getBeanFactory().getBean(AdminConfig.class).adminHandler(args.get(0), args.get(1)));
  }

  /**
   * Get the bean definition for 'adminHandler'.
   */
  public static BeanDefinition getAdminHandlerBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(AdminHandler.class);
    beanDefinition.setInstanceSupplier(getAdminHandlerInstanceSupplier());
    return beanDefinition;
  }

  /**
   * Get the bean instance supplier for 'adminCredential'.
   */
  private static BeanInstanceSupplier<RedisMemoryCredential> getAdminCredentialInstanceSupplier() {
    return BeanInstanceSupplier.<RedisMemoryCredential>forFactoryMethod(AdminConfig.class, "adminCredential", DataMapper.class, RedisTemplate.class)
            .withGenerator((registeredBean, args) -> registeredBean.getBeanFactory().getBean(AdminConfig.class).adminCredential(args.get(0), args.get(1)));
  }

  /**
   * Get the bean definition for 'adminCredential'.
   */
  public static BeanDefinition getAdminCredentialBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(RedisMemoryCredential.class);
    beanDefinition.setInstanceSupplier(getAdminCredentialInstanceSupplier());
    return beanDefinition;
  }

  /**
   * Get the bean instance supplier for 'adminSecurity'.
   */
  private static BeanInstanceSupplier<AdminSecurity> getAdminSecurityInstanceSupplier() {
    return BeanInstanceSupplier.<AdminSecurity>forFactoryMethod(AdminConfig.class, "adminSecurity", DataMapper.class, AdminHandler.class, SecurityCredential.class)
            .withGenerator((registeredBean, args) -> registeredBean.getBeanFactory().getBean(AdminConfig.class).adminSecurity(args.get(0), args.get(1), args.get(2)));
  }

  /**
   * Get the bean definition for 'adminSecurity'.
   */
  public static BeanDefinition getAdminSecurityBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(AdminSecurity.class);
    beanDefinition.setInstanceSupplier(getAdminSecurityInstanceSupplier());
    return beanDefinition;
  }
}
