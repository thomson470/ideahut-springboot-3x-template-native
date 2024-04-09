package org.springframework.orm.jpa;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import org.springframework.aot.generate.Generated;
import org.springframework.beans.factory.aot.BeanInstanceSupplier;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.config.RuntimeBeanReference;
import org.springframework.beans.factory.support.AutowireCandidateQualifier;
import org.springframework.beans.factory.support.RootBeanDefinition;

/**
 * Bean definitions for {@link SharedEntityManagerCreator}.
 */
@Generated
public class SharedEntityManagerCreator__BeanDefinitions {
  /**
   * Get the bean instance supplier for 'jpaSharedEM_entityManagerFactory_1'.
   */
  private static BeanInstanceSupplier<EntityManager> getJpaSharedEMentityManagerFactoryInstanceSupplier(
      ) {
    return BeanInstanceSupplier.<EntityManager>forFactoryMethod(SharedEntityManagerCreator.class, "createSharedEntityManager", EntityManagerFactory.class)
            .withGenerator((registeredBean, args) -> SharedEntityManagerCreator.createSharedEntityManager(args.get(0)));
  }

  /**
   * Get the bean definition for 'jpaSharedEM_entityManagerFactory_1'.
   */
  public static BeanDefinition getJpaSharedEMentityManagerFactoryBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(SharedEntityManagerCreator.class);
    beanDefinition.setTargetType(EntityManager.class);
    beanDefinition.setAutowireCandidate(false);
    beanDefinition.setRole(BeanDefinition.ROLE_SUPPORT);
    beanDefinition.setDestroyMethodNames("close");
    beanDefinition.getConstructorArgumentValues().addIndexedArgumentValue(0, new RuntimeBeanReference("entityManagerFactory_1"));
    beanDefinition.setInstanceSupplier(getJpaSharedEMentityManagerFactoryInstanceSupplier());
    return beanDefinition;
  }

  /**
   * Get the bean instance supplier for 'jpaSharedEM_AWC_auditSessionFactory_1'.
   */
  private static BeanInstanceSupplier<EntityManager> getJpaSharedEMAWCauditSessionFactoryInstanceSupplier(
      ) {
    return BeanInstanceSupplier.<EntityManager>forFactoryMethod(SharedEntityManagerCreator.class, "createSharedEntityManager", EntityManagerFactory.class)
            .withGenerator((registeredBean, args) -> SharedEntityManagerCreator.createSharedEntityManager(args.get(0)));
  }

  /**
   * Get the bean definition for 'jpaSharedEM_AWC_auditSessionFactory_1'.
   */
  public static BeanDefinition getJpaSharedEMAWCauditSessionFactoryBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(SharedEntityManagerCreator.class);
    beanDefinition.setTargetType(EntityManager.class);
    beanDefinition.setLazyInit(true);
    beanDefinition.setDestroyMethodNames("close");
    beanDefinition.getConstructorArgumentValues().addIndexedArgumentValue(0, new RuntimeBeanReference("auditSessionFactory_1"));
    beanDefinition.addQualifier(new AutowireCandidateQualifier("org.springframework.beans.factory.annotation.Qualifier", "auditSessionFactory_1"));
    beanDefinition.setInstanceSupplier(getJpaSharedEMAWCauditSessionFactoryInstanceSupplier());
    return beanDefinition;
  }

  /**
   * Get the bean instance supplier for 'jpaSharedEM_AWC_entityManagerFactory_1'.
   */
  private static BeanInstanceSupplier<EntityManager> getJpaSharedEMAWCentityManagerFactoryInstanceSupplier(
      ) {
    return BeanInstanceSupplier.<EntityManager>forFactoryMethod(SharedEntityManagerCreator.class, "createSharedEntityManager", EntityManagerFactory.class)
            .withGenerator((registeredBean, args) -> SharedEntityManagerCreator.createSharedEntityManager(args.get(0)));
  }

  /**
   * Get the bean definition for 'jpaSharedEM_AWC_entityManagerFactory_1'.
   */
  public static BeanDefinition getJpaSharedEMAWCentityManagerFactoryBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(SharedEntityManagerCreator.class);
    beanDefinition.setTargetType(EntityManager.class);
    beanDefinition.setPrimary(true);
    beanDefinition.setLazyInit(true);
    beanDefinition.setDestroyMethodNames("close");
    beanDefinition.getConstructorArgumentValues().addIndexedArgumentValue(0, new RuntimeBeanReference("entityManagerFactory_1"));
    beanDefinition.addQualifier(new AutowireCandidateQualifier("org.springframework.beans.factory.annotation.Qualifier", "entityManagerFactory_1"));
    beanDefinition.setInstanceSupplier(getJpaSharedEMAWCentityManagerFactoryInstanceSupplier());
    return beanDefinition;
  }
}
