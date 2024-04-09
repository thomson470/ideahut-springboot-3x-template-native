package org.springframework.boot.autoconfigure.http;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.aot.generate.Generated;
import org.springframework.beans.factory.aot.BeanInstanceSupplier;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.RootBeanDefinition;
import org.springframework.http.converter.json.Jackson2ObjectMapperBuilder;
import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;
import org.springframework.http.converter.xml.MappingJackson2XmlHttpMessageConverter;

/**
 * Bean definitions for {@link JacksonHttpMessageConvertersConfiguration}.
 */
@Generated
public class JacksonHttpMessageConvertersConfiguration__BeanDefinitions {
  /**
   * Get the bean definition for 'jacksonHttpMessageConvertersConfiguration'.
   */
  public static BeanDefinition getJacksonHttpMessageConvertersConfigurationBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(JacksonHttpMessageConvertersConfiguration.class);
    beanDefinition.setInstanceSupplier(JacksonHttpMessageConvertersConfiguration::new);
    return beanDefinition;
  }

  /**
   * Bean definitions for {@link JacksonHttpMessageConvertersConfiguration.MappingJackson2HttpMessageConverterConfiguration}.
   */
  @Generated
  public static class MappingJackson2HttpMessageConverterConfiguration {
    /**
     * Get the bean definition for 'mappingJackson2HttpMessageConverterConfiguration'.
     */
    public static BeanDefinition getMappingJacksonHttpMessageConverterConfigurationBeanDefinition(
        ) {
      RootBeanDefinition beanDefinition = new RootBeanDefinition(JacksonHttpMessageConvertersConfiguration.MappingJackson2HttpMessageConverterConfiguration.class);
      beanDefinition.setInstanceSupplier(JacksonHttpMessageConvertersConfiguration.MappingJackson2HttpMessageConverterConfiguration::new);
      return beanDefinition;
    }

    /**
     * Get the bean instance supplier for 'mappingJackson2HttpMessageConverter'.
     */
    private static BeanInstanceSupplier<MappingJackson2HttpMessageConverter> getMappingJacksonHttpMessageConverterInstanceSupplier(
        ) {
      return BeanInstanceSupplier.<MappingJackson2HttpMessageConverter>forFactoryMethod(JacksonHttpMessageConvertersConfiguration.MappingJackson2HttpMessageConverterConfiguration.class, "mappingJackson2HttpMessageConverter", ObjectMapper.class)
              .withGenerator((registeredBean, args) -> registeredBean.getBeanFactory().getBean(JacksonHttpMessageConvertersConfiguration.MappingJackson2HttpMessageConverterConfiguration.class).mappingJackson2HttpMessageConverter(args.get(0)));
    }

    /**
     * Get the bean definition for 'mappingJackson2HttpMessageConverter'.
     */
    public static BeanDefinition getMappingJacksonHttpMessageConverterBeanDefinition() {
      RootBeanDefinition beanDefinition = new RootBeanDefinition(MappingJackson2HttpMessageConverter.class);
      beanDefinition.setInstanceSupplier(getMappingJacksonHttpMessageConverterInstanceSupplier());
      return beanDefinition;
    }
  }

  /**
   * Bean definitions for {@link JacksonHttpMessageConvertersConfiguration.MappingJackson2XmlHttpMessageConverterConfiguration}.
   */
  @Generated
  public static class MappingJackson2XmlHttpMessageConverterConfiguration {
    /**
     * Get the bean definition for 'mappingJackson2XmlHttpMessageConverterConfiguration'.
     */
    public static BeanDefinition getMappingJacksonXmlHttpMessageConverterConfigurationBeanDefinition(
        ) {
      RootBeanDefinition beanDefinition = new RootBeanDefinition(JacksonHttpMessageConvertersConfiguration.MappingJackson2XmlHttpMessageConverterConfiguration.class);
      beanDefinition.setInstanceSupplier(JacksonHttpMessageConvertersConfiguration.MappingJackson2XmlHttpMessageConverterConfiguration::new);
      return beanDefinition;
    }

    /**
     * Get the bean instance supplier for 'mappingJackson2XmlHttpMessageConverter'.
     */
    private static BeanInstanceSupplier<MappingJackson2XmlHttpMessageConverter> getMappingJacksonXmlHttpMessageConverterInstanceSupplier(
        ) {
      return BeanInstanceSupplier.<MappingJackson2XmlHttpMessageConverter>forFactoryMethod(JacksonHttpMessageConvertersConfiguration.MappingJackson2XmlHttpMessageConverterConfiguration.class, "mappingJackson2XmlHttpMessageConverter", Jackson2ObjectMapperBuilder.class)
              .withGenerator((registeredBean, args) -> registeredBean.getBeanFactory().getBean(JacksonHttpMessageConvertersConfiguration.MappingJackson2XmlHttpMessageConverterConfiguration.class).mappingJackson2XmlHttpMessageConverter(args.get(0)));
    }

    /**
     * Get the bean definition for 'mappingJackson2XmlHttpMessageConverter'.
     */
    public static BeanDefinition getMappingJacksonXmlHttpMessageConverterBeanDefinition() {
      RootBeanDefinition beanDefinition = new RootBeanDefinition(MappingJackson2XmlHttpMessageConverter.class);
      beanDefinition.setInstanceSupplier(getMappingJacksonXmlHttpMessageConverterInstanceSupplier());
      return beanDefinition;
    }
  }
}
