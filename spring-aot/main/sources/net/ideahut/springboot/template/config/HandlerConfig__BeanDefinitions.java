package net.ideahut.springboot.template.config;

import net.ideahut.springboot.audit.AuditHandler;
import net.ideahut.springboot.cache.CacheGroupHandler;
import net.ideahut.springboot.cache.CacheHandler;
import net.ideahut.springboot.crud.CrudHandler;
import net.ideahut.springboot.crud.CrudPermission;
import net.ideahut.springboot.crud.CrudResource;
import net.ideahut.springboot.entity.EntityTrxManager;
import net.ideahut.springboot.grid.GridHandler;
import net.ideahut.springboot.init.InitHandler;
import net.ideahut.springboot.job.JobService;
import net.ideahut.springboot.job.SchedulerHandler;
import net.ideahut.springboot.mail.MailHandler;
import net.ideahut.springboot.mapper.DataMapper;
import net.ideahut.springboot.sysparam.SysParamHandler;
import net.ideahut.springboot.task.TaskHandler;
import org.springframework.aot.generate.Generated;
import org.springframework.beans.factory.aot.BeanInstanceSupplier;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.InstanceSupplier;
import org.springframework.beans.factory.support.RootBeanDefinition;
import org.springframework.context.annotation.ConfigurationClassUtils;
import org.springframework.data.redis.core.RedisTemplate;

/**
 * Bean definitions for {@link HandlerConfig}.
 */
@Generated
public class HandlerConfig__BeanDefinitions {
  /**
   * Get the bean definition for 'handlerConfig'.
   */
  public static BeanDefinition getHandlerConfigBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(HandlerConfig.class);
    beanDefinition.setTargetType(HandlerConfig.class);
    ConfigurationClassUtils.initializeConfigurationClass(HandlerConfig.class);
    InstanceSupplier<HandlerConfig> instanceSupplier = InstanceSupplier.using(HandlerConfig$$SpringCGLIB$$0::new);
    instanceSupplier = instanceSupplier.andThen(HandlerConfig__Autowiring::apply);
    beanDefinition.setInstanceSupplier(instanceSupplier);
    return beanDefinition;
  }

  /**
   * Get the bean instance supplier for 'initHandler'.
   */
  private static BeanInstanceSupplier<InitHandler> getInitHandlerInstanceSupplier() {
    return BeanInstanceSupplier.<InitHandler>forFactoryMethod(HandlerConfig.class, "initHandler")
            .withGenerator((registeredBean) -> registeredBean.getBeanFactory().getBean(HandlerConfig.class).initHandler());
  }

  /**
   * Get the bean definition for 'initHandler'.
   */
  public static BeanDefinition getInitHandlerBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(InitHandler.class);
    beanDefinition.setInstanceSupplier(getInitHandlerInstanceSupplier());
    return beanDefinition;
  }

  /**
   * Get the bean instance supplier for 'auditHandler'.
   */
  private static BeanInstanceSupplier<AuditHandler> getAuditHandlerInstanceSupplier() {
    return BeanInstanceSupplier.<AuditHandler>forFactoryMethod(HandlerConfig.class, "auditHandler", EntityTrxManager.class, TaskHandler.class)
            .withGenerator((registeredBean, args) -> registeredBean.getBeanFactory().getBean(HandlerConfig.class).auditHandler(args.get(0), args.get(1)));
  }

  /**
   * Get the bean definition for 'auditHandler'.
   */
  public static BeanDefinition getAuditHandlerBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(AuditHandler.class);
    beanDefinition.setInstanceSupplier(getAuditHandlerInstanceSupplier());
    return beanDefinition;
  }

  /**
   * Get the bean instance supplier for 'cacheGroupHandler'.
   */
  private static BeanInstanceSupplier<CacheGroupHandler> getCacheGroupHandlerInstanceSupplier() {
    return BeanInstanceSupplier.<CacheGroupHandler>forFactoryMethod(HandlerConfig.class, "cacheGroupHandler", DataMapper.class, RedisTemplate.class, TaskHandler.class)
            .withGenerator((registeredBean, args) -> registeredBean.getBeanFactory().getBean(HandlerConfig.class).cacheGroupHandler(args.get(0), args.get(1), args.get(2)));
  }

  /**
   * Get the bean definition for 'cacheGroupHandler'.
   */
  public static BeanDefinition getCacheGroupHandlerBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(CacheGroupHandler.class);
    beanDefinition.setInstanceSupplier(getCacheGroupHandlerInstanceSupplier());
    return beanDefinition;
  }

  /**
   * Get the bean instance supplier for 'cacheHandler'.
   */
  private static BeanInstanceSupplier<CacheHandler> getCacheHandlerInstanceSupplier() {
    return BeanInstanceSupplier.<CacheHandler>forFactoryMethod(HandlerConfig.class, "cacheHandler", DataMapper.class, RedisTemplate.class, TaskHandler.class)
            .withGenerator((registeredBean, args) -> registeredBean.getBeanFactory().getBean(HandlerConfig.class).cacheHandler(args.get(0), args.get(1), args.get(2)));
  }

  /**
   * Get the bean definition for 'cacheHandler'.
   */
  public static BeanDefinition getCacheHandlerBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(CacheHandler.class);
    beanDefinition.setInstanceSupplier(getCacheHandlerInstanceSupplier());
    return beanDefinition;
  }

  /**
   * Get the bean instance supplier for 'mailHandler'.
   */
  private static BeanInstanceSupplier<MailHandler> getMailHandlerInstanceSupplier() {
    return BeanInstanceSupplier.<MailHandler>forFactoryMethod(HandlerConfig.class, "mailHandler", TaskHandler.class)
            .withGenerator((registeredBean, args) -> registeredBean.getBeanFactory().getBean(HandlerConfig.class).mailHandler(args.get(0)));
  }

  /**
   * Get the bean definition for 'mailHandler'.
   */
  public static BeanDefinition getMailHandlerBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(MailHandler.class);
    beanDefinition.setInstanceSupplier(getMailHandlerInstanceSupplier());
    return beanDefinition;
  }

  /**
   * Get the bean instance supplier for 'gridHandler'.
   */
  private static BeanInstanceSupplier<GridHandler> getGridHandlerInstanceSupplier() {
    return BeanInstanceSupplier.<GridHandler>forFactoryMethod(HandlerConfig.class, "gridHandler", DataMapper.class, RedisTemplate.class)
            .withGenerator((registeredBean, args) -> registeredBean.getBeanFactory().getBean(HandlerConfig.class).gridHandler(args.get(0), args.get(1)));
  }

  /**
   * Get the bean definition for 'gridHandler'.
   */
  public static BeanDefinition getGridHandlerBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(GridHandler.class);
    beanDefinition.setInstanceSupplier(getGridHandlerInstanceSupplier());
    return beanDefinition;
  }

  /**
   * Get the bean instance supplier for 'sysParamHandler'.
   */
  private static BeanInstanceSupplier<SysParamHandler> getSysParamHandlerInstanceSupplier() {
    return BeanInstanceSupplier.<SysParamHandler>forFactoryMethod(HandlerConfig.class, "sysParamHandler", DataMapper.class, RedisTemplate.class, EntityTrxManager.class)
            .withGenerator((registeredBean, args) -> registeredBean.getBeanFactory().getBean(HandlerConfig.class).sysParamHandler(args.get(0), args.get(1), args.get(2)));
  }

  /**
   * Get the bean definition for 'sysParamHandler'.
   */
  public static BeanDefinition getSysParamHandlerBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(SysParamHandler.class);
    beanDefinition.setInstanceSupplier(getSysParamHandlerInstanceSupplier());
    return beanDefinition;
  }

  /**
   * Get the bean instance supplier for 'schedulerHandler'.
   */
  private static BeanInstanceSupplier<SchedulerHandler> getSchedulerHandlerInstanceSupplier() {
    return BeanInstanceSupplier.<SchedulerHandler>forFactoryMethod(HandlerConfig.class, "schedulerHandler", DataMapper.class, JobService.class)
            .withGenerator((registeredBean, args) -> registeredBean.getBeanFactory().getBean(HandlerConfig.class).schedulerHandler(args.get(0), args.get(1)));
  }

  /**
   * Get the bean definition for 'schedulerHandler'.
   */
  public static BeanDefinition getSchedulerHandlerBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(SchedulerHandler.class);
    beanDefinition.setInstanceSupplier(getSchedulerHandlerInstanceSupplier());
    return beanDefinition;
  }

  /**
   * Get the bean instance supplier for 'crudHandler'.
   */
  private static BeanInstanceSupplier<CrudHandler> getCrudHandlerInstanceSupplier() {
    return BeanInstanceSupplier.<CrudHandler>forFactoryMethod(HandlerConfig.class, "crudHandler", EntityTrxManager.class, DataMapper.class, CrudResource.class, CrudPermission.class)
            .withGenerator((registeredBean, args) -> registeredBean.getBeanFactory().getBean(HandlerConfig.class).crudHandler(args.get(0), args.get(1), args.get(2), args.get(3)));
  }

  /**
   * Get the bean definition for 'crudHandler'.
   */
  public static BeanDefinition getCrudHandlerBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(CrudHandler.class);
    beanDefinition.setInstanceSupplier(getCrudHandlerInstanceSupplier());
    return beanDefinition;
  }

  /**
   * Get the bean instance supplier for 'crudResource'.
   */
  private static BeanInstanceSupplier<CrudResource> getCrudResourceInstanceSupplier() {
    return BeanInstanceSupplier.<CrudResource>forFactoryMethod(HandlerConfig.class, "crudResource", EntityTrxManager.class)
            .withGenerator((registeredBean, args) -> registeredBean.getBeanFactory().getBean(HandlerConfig.class).crudResource(args.get(0)));
  }

  /**
   * Get the bean definition for 'crudResource'.
   */
  public static BeanDefinition getCrudResourceBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(CrudResource.class);
    beanDefinition.setInstanceSupplier(getCrudResourceInstanceSupplier());
    return beanDefinition;
  }

  /**
   * Get the bean instance supplier for 'crudPermission'.
   */
  private static BeanInstanceSupplier<CrudPermission> getCrudPermissionInstanceSupplier() {
    return BeanInstanceSupplier.<CrudPermission>forFactoryMethod(HandlerConfig.class, "crudPermission")
            .withGenerator((registeredBean) -> registeredBean.getBeanFactory().getBean(HandlerConfig.class).crudPermission());
  }

  /**
   * Get the bean definition for 'crudPermission'.
   */
  public static BeanDefinition getCrudPermissionBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(CrudPermission.class);
    beanDefinition.setInstanceSupplier(getCrudPermissionInstanceSupplier());
    return beanDefinition;
  }
}
