package org.springframework.boot.autoconfigure.data.redis;

import org.springframework.aot.generate.Generated;
import org.springframework.beans.factory.ObjectProvider;
import org.springframework.beans.factory.aot.BeanInstanceSupplier;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.RootBeanDefinition;
import org.springframework.data.redis.connection.jedis.JedisConnectionFactory;

/**
 * Bean definitions for {@link JedisConnectionConfiguration}.
 */
@Generated
public class JedisConnectionConfiguration__BeanDefinitions {
  /**
   * Get the bean instance supplier for 'org.springframework.boot.autoconfigure.data.redis.JedisConnectionConfiguration'.
   */
  private static BeanInstanceSupplier<JedisConnectionConfiguration> getJedisConnectionConfigurationInstanceSupplier(
      ) {
    return BeanInstanceSupplier.<JedisConnectionConfiguration>forConstructor(RedisProperties.class, ObjectProvider.class, ObjectProvider.class, ObjectProvider.class, RedisConnectionDetails.class, ObjectProvider.class)
            .withGenerator((registeredBean, args) -> new JedisConnectionConfiguration(args.get(0), args.get(1), args.get(2), args.get(3), args.get(4), args.get(5)));
  }

  /**
   * Get the bean definition for 'jedisConnectionConfiguration'.
   */
  public static BeanDefinition getJedisConnectionConfigurationBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(JedisConnectionConfiguration.class);
    beanDefinition.setInstanceSupplier(getJedisConnectionConfigurationInstanceSupplier());
    return beanDefinition;
  }

  /**
   * Get the bean instance supplier for 'redisConnectionFactory'.
   */
  private static BeanInstanceSupplier<JedisConnectionFactory> getRedisConnectionFactoryInstanceSupplier(
      ) {
    return BeanInstanceSupplier.<JedisConnectionFactory>forFactoryMethod(JedisConnectionConfiguration.class, "redisConnectionFactory", ObjectProvider.class)
            .withGenerator((registeredBean, args) -> registeredBean.getBeanFactory().getBean(JedisConnectionConfiguration.class).redisConnectionFactory(args.get(0)));
  }

  /**
   * Get the bean definition for 'redisConnectionFactory'.
   */
  public static BeanDefinition getRedisConnectionFactoryBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(JedisConnectionFactory.class);
    beanDefinition.setInstanceSupplier(getRedisConnectionFactoryInstanceSupplier());
    return beanDefinition;
  }
}
