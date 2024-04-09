package net.ideahut.springboot.template.config;

import jakarta.persistence.EntityManagerFactory;
import java.lang.String;
import java.util.List;
import javax.sql.DataSource;
import org.hibernate.SessionFactory;
import org.springframework.aot.generate.Generated;
import org.springframework.beans.factory.aot.BeanInstanceSupplier;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.InstanceSupplier;
import org.springframework.beans.factory.support.RootBeanDefinition;
import org.springframework.boot.orm.jpa.EntityManagerFactoryBuilder;
import org.springframework.context.annotation.ConfigurationClassUtils;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.orm.jpa.persistenceunit.PersistenceManagedTypes;
import org.springframework.transaction.PlatformTransactionManager;

/**
 * Bean definitions for {@link TrxManagerConfig1}.
 */
@Generated
public class TrxManagerConfig1__BeanDefinitions {
  /**
   * Get the bean definition for 'trxManagerConfig1'.
   */
  public static BeanDefinition getTrxManagerConfigBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(TrxManagerConfig1.class);
    beanDefinition.setTargetType(TrxManagerConfig1.class);
    ConfigurationClassUtils.initializeConfigurationClass(TrxManagerConfig1.class);
    InstanceSupplier<TrxManagerConfig1> instanceSupplier = InstanceSupplier.using(TrxManagerConfig1$$SpringCGLIB$$0::new);
    instanceSupplier = instanceSupplier.andThen(TrxManagerConfig1__Autowiring::apply);
    beanDefinition.setInstanceSupplier(instanceSupplier);
    return beanDefinition;
  }

  /**
   * Get the bean instance supplier for 'dataSource_1'.
   */
  private static BeanInstanceSupplier<DataSource> getDataSourceInstanceSupplier() {
    return BeanInstanceSupplier.<DataSource>forFactoryMethod(TrxManagerConfig1.class, "dataSource")
            .withGenerator((registeredBean) -> registeredBean.getBeanFactory().getBean(TrxManagerConfig1.class).dataSource());
  }

  /**
   * Get the bean definition for 'dataSource_1'.
   */
  public static BeanDefinition getDataSourceBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(DataSource.class);
    beanDefinition.setPrimary(true);
    beanDefinition.setInstanceSupplier(getDataSourceInstanceSupplier());
    return beanDefinition;
  }

  /**
   * Get the bean instance for 'persistenceManagedTypes_1'.
   */
  private static PersistenceManagedTypes getPersistenceManagedTypesInstance() {
    List<String> managedClassNames = List.of("net.ideahut.springboot.template.entity.AutoGenLongIdHardDel", "net.ideahut.springboot.template.entity.AutoGenStrIdHardDel", "net.ideahut.springboot.template.entity.AutoGenStrIdSoftDel", "net.ideahut.springboot.template.entity.CompositeHardDel", "net.ideahut.springboot.template.entity.CompositeSoftDel", "net.ideahut.springboot.template.entity.EmbeddedHardDel", "net.ideahut.springboot.template.entity.EmbeddedSoftDel", "net.ideahut.springboot.template.entity.EmbeddedWithoutAttribute", "net.ideahut.springboot.template.entity.EmbededId", "net.ideahut.springboot.template.entity.Information", "net.ideahut.springboot.template.entity.InformationLink", "net.ideahut.springboot.template.entity.IntegerIdWithBytes", "net.ideahut.springboot.template.entity.JobGroup", "net.ideahut.springboot.template.entity.JobInstance", "net.ideahut.springboot.template.entity.JobTrigger", "net.ideahut.springboot.template.entity.JobTriggerConfiguration", "net.ideahut.springboot.template.entity.JobTriggerConfigurationId", "net.ideahut.springboot.template.entity.JobType", "net.ideahut.springboot.template.entity.JobTypeParameter", "net.ideahut.springboot.template.entity.JobTypeParameterId", "net.ideahut.springboot.template.entity.LongIdJoinComposite", "net.ideahut.springboot.template.entity.LongIdJoinEmbedded", "net.ideahut.springboot.template.entity.ManualGenStrIdSoftDel", "net.ideahut.springboot.template.entity.Menu", "net.ideahut.springboot.template.entity.MenuId", "net.ideahut.springboot.template.entity.MenuRole", "net.ideahut.springboot.template.entity.MenuRoleId", "net.ideahut.springboot.template.entity.Role", "net.ideahut.springboot.template.entity.SysParam", "net.ideahut.springboot.template.entity.SysParamId", "net.ideahut.springboot.template.entity.User", "net.ideahut.springboot.template.entity.UserDetail", "net.ideahut.springboot.template.entity.UserFavorite", "net.ideahut.springboot.template.entity.UserFavoriteId");
    List<String> managedPackages = List.of();
    return PersistenceManagedTypes.of(managedClassNames, managedPackages);
  }

  /**
   * Get the bean definition for 'persistenceManagedTypes_1'.
   */
  public static BeanDefinition getPersistenceManagedTypesBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(PersistenceManagedTypes.class);
    beanDefinition.setInstanceSupplier(TrxManagerConfig1__BeanDefinitions::getPersistenceManagedTypesInstance);
    return beanDefinition;
  }

  /**
   * Get the bean instance supplier for 'entityManagerFactory_1'.
   */
  private static BeanInstanceSupplier<LocalContainerEntityManagerFactoryBean> getEntityManagerFactoryInstanceSupplier(
      ) {
    return BeanInstanceSupplier.<LocalContainerEntityManagerFactoryBean>forFactoryMethod(TrxManagerConfig1.class, "entityManagerFactory", EntityManagerFactoryBuilder.class, PersistenceManagedTypes.class, DataSource.class, SessionFactory.class)
            .withGenerator((registeredBean, args) -> registeredBean.getBeanFactory().getBean(TrxManagerConfig1.class).entityManagerFactory(args.get(0), args.get(1), args.get(2), args.get(3)));
  }

  /**
   * Get the bean definition for 'entityManagerFactory_1'.
   */
  public static BeanDefinition getEntityManagerFactoryBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(LocalContainerEntityManagerFactoryBean.class);
    beanDefinition.setPrimary(true);
    beanDefinition.setDependsOn("dataSourceScriptDatabaseInitializer");
    beanDefinition.setInstanceSupplier(getEntityManagerFactoryInstanceSupplier());
    return beanDefinition;
  }

  /**
   * Get the bean instance supplier for 'transactionManager_1'.
   */
  private static BeanInstanceSupplier<PlatformTransactionManager> getTransactionManagerInstanceSupplier(
      ) {
    return BeanInstanceSupplier.<PlatformTransactionManager>forFactoryMethod(TrxManagerConfig1.class, "transactionManager", EntityManagerFactory.class)
            .withGenerator((registeredBean, args) -> registeredBean.getBeanFactory().getBean(TrxManagerConfig1.class).transactionManager(args.get(0)));
  }

  /**
   * Get the bean definition for 'transactionManager_1'.
   */
  public static BeanDefinition getTransactionManagerBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(PlatformTransactionManager.class);
    beanDefinition.setPrimary(true);
    beanDefinition.setInstanceSupplier(getTransactionManagerInstanceSupplier());
    return beanDefinition;
  }

  /**
   * Get the bean instance supplier for 'auditDatasource_1'.
   */
  private static BeanInstanceSupplier<DataSource> getAuditDatasourceInstanceSupplier() {
    return BeanInstanceSupplier.<DataSource>forFactoryMethod(TrxManagerConfig1.class, "auditDatasource")
            .withGenerator((registeredBean) -> registeredBean.getBeanFactory().getBean(TrxManagerConfig1.class).auditDatasource());
  }

  /**
   * Get the bean definition for 'auditDatasource_1'.
   */
  public static BeanDefinition getAuditDatasourceBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(DataSource.class);
    beanDefinition.setInstanceSupplier(getAuditDatasourceInstanceSupplier());
    return beanDefinition;
  }

  /**
   * Get the bean instance supplier for 'auditSessionFactory_1'.
   */
  private static BeanInstanceSupplier<LocalSessionFactoryBean> getAuditSessionFactoryInstanceSupplier(
      ) {
    return BeanInstanceSupplier.<LocalSessionFactoryBean>forFactoryMethod(TrxManagerConfig1.class, "auditSessionFactory", DataSource.class)
            .withGenerator((registeredBean, args) -> registeredBean.getBeanFactory().getBean(TrxManagerConfig1.class).auditSessionFactory(args.get(0)));
  }

  /**
   * Get the bean definition for 'auditSessionFactory_1'.
   */
  public static BeanDefinition getAuditSessionFactoryBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(LocalSessionFactoryBean.class);
    beanDefinition.setDependsOn("dataSourceScriptDatabaseInitializer");
    beanDefinition.setInstanceSupplier(getAuditSessionFactoryInstanceSupplier());
    return beanDefinition;
  }
}
