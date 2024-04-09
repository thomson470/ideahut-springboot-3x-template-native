package net.ideahut.springboot.template.config;

import java.lang.String;
import org.springframework.aot.generate.Generated;
import org.springframework.beans.factory.aot.BeanInstanceSupplier;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.InstanceSupplier;
import org.springframework.beans.factory.support.RootBeanDefinition;
import org.springframework.context.annotation.ConfigurationClassUtils;
import org.springframework.core.ResolvableType;
import org.springframework.data.redis.core.RedisTemplate;

/**
 * Bean definitions for {@link RedisConfig}.
 */
@Generated
public class RedisConfig__BeanDefinitions {
  /**
   * Get the bean definition for 'redisConfig'.
   */
  public static BeanDefinition getRedisConfigBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(RedisConfig.class);
    beanDefinition.setTargetType(RedisConfig.class);
    ConfigurationClassUtils.initializeConfigurationClass(RedisConfig.class);
    InstanceSupplier<RedisConfig> instanceSupplier = InstanceSupplier.using(RedisConfig$$SpringCGLIB$$0::new);
    instanceSupplier = instanceSupplier.andThen(RedisConfig__Autowiring::apply);
    beanDefinition.setInstanceSupplier(instanceSupplier);
    return beanDefinition;
  }

  /**
   * Get the bean instance supplier for 'commonRedis'.
   */
  private static BeanInstanceSupplier<RedisTemplate> getCommonRedisInstanceSupplier() {
    return BeanInstanceSupplier.<RedisTemplate>forFactoryMethod(RedisConfig.class, "commonRedis")
            .withGenerator((registeredBean) -> registeredBean.getBeanFactory().getBean(RedisConfig.class).commonRedis());
  }

  /**
   * Get the bean definition for 'commonRedis'.
   */
  public static BeanDefinition getCommonRedisBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(RedisTemplate.class);
    beanDefinition.setTargetType(ResolvableType.forClassWithGenerics(RedisTemplate.class, String.class, byte[].class));
    beanDefinition.setPrimary(true);
    beanDefinition.setInstanceSupplier(getCommonRedisInstanceSupplier());
    return beanDefinition;
  }
}
