package com.app.firstpostgrsqlproject.config;

import javax.persistence.EntityManagerFactory;
import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.boot.orm.jpa.EntityManagerFactoryBuilder;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.transaction.PlatformTransactionManager;

@Configuration
@EnableJpaRepositories(basePackages="com.app.firstpostgrsqlproject.repository.user", entityManagerFactoryRef = "userEntityManager",
transactionManagerRef = "userTransactionManager")
public class PersistenceUserAutoConfig {
	@Bean(name = "userDataSource")
    @ConfigurationProperties(prefix = "db2.datasource")
    public DataSource dataSource() {
        return DataSourceBuilder.create().build();
    }

    @Bean(name = "userEntityManagerFactory")
    public LocalContainerEntityManagerFactoryBean
    barEntityManagerFactory(
        EntityManagerFactoryBuilder builder,
        @Qualifier("userDataSource") DataSource dataSource ) {
        return
        builder.dataSource(dataSource).packages("com.app.firstpostgrsqlproject.user.entity").persistenceUnit("db2").build();
    }

    @Bean(name = "userTransactionManager")
    public PlatformTransactionManager userTransactionManager(
        @Qualifier("userEntityManagerFactory") EntityManagerFactory userEntityManagerFactory ) {
        return new JpaTransactionManager(userEntityManagerFactory);
    }
	
}
