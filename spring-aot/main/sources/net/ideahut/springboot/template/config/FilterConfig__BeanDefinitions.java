package net.ideahut.springboot.template.config;

import net.ideahut.springboot.admin.AdminHandler;
import net.ideahut.springboot.filter.DefaultRequestFilter;
import net.ideahut.springboot.filter.SecurityAuthorizationFilter;
import net.ideahut.springboot.security.SecurityAuthorization;
import org.springframework.aot.generate.Generated;
import org.springframework.beans.factory.aot.BeanInstanceSupplier;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.InstanceSupplier;
import org.springframework.beans.factory.support.RootBeanDefinition;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.ConfigurationClassUtils;
import org.springframework.core.ResolvableType;

/**
 * Bean definitions for {@link FilterConfig}.
 */
@Generated
public class FilterConfig__BeanDefinitions {
  /**
   * Get the bean definition for 'filterConfig'.
   */
  public static BeanDefinition getFilterConfigBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(FilterConfig.class);
    beanDefinition.setTargetType(FilterConfig.class);
    ConfigurationClassUtils.initializeConfigurationClass(FilterConfig.class);
    InstanceSupplier<FilterConfig> instanceSupplier = InstanceSupplier.using(FilterConfig$$SpringCGLIB$$0::new);
    instanceSupplier = instanceSupplier.andThen(FilterConfig__Autowiring::apply);
    beanDefinition.setInstanceSupplier(instanceSupplier);
    return beanDefinition;
  }

  /**
   * Get the bean instance supplier for 'defaultRequestFilter'.
   */
  private static BeanInstanceSupplier<FilterRegistrationBean> getDefaultRequestFilterInstanceSupplier(
      ) {
    return BeanInstanceSupplier.<FilterRegistrationBean>forFactoryMethod(FilterConfig.class, "defaultRequestFilter")
            .withGenerator((registeredBean) -> registeredBean.getBeanFactory().getBean(FilterConfig.class).defaultRequestFilter());
  }

  /**
   * Get the bean definition for 'defaultRequestFilter'.
   */
  public static BeanDefinition getDefaultRequestFilterBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(FilterRegistrationBean.class);
    beanDefinition.setTargetType(ResolvableType.forClassWithGenerics(FilterRegistrationBean.class, DefaultRequestFilter.class));
    beanDefinition.setInstanceSupplier(getDefaultRequestFilterInstanceSupplier());
    return beanDefinition;
  }

  /**
   * Get the bean instance supplier for 'adminFilter'.
   */
  private static BeanInstanceSupplier<FilterRegistrationBean> getAdminFilterInstanceSupplier() {
    return BeanInstanceSupplier.<FilterRegistrationBean>forFactoryMethod(FilterConfig.class, "adminFilter", AdminHandler.class, SecurityAuthorization.class)
            .withGenerator((registeredBean, args) -> registeredBean.getBeanFactory().getBean(FilterConfig.class).adminFilter(args.get(0), args.get(1)));
  }

  /**
   * Get the bean definition for 'adminFilter'.
   */
  public static BeanDefinition getAdminFilterBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(FilterRegistrationBean.class);
    beanDefinition.setTargetType(ResolvableType.forClassWithGenerics(FilterRegistrationBean.class, SecurityAuthorizationFilter.class));
    beanDefinition.setInstanceSupplier(getAdminFilterInstanceSupplier());
    return beanDefinition;
  }
}
