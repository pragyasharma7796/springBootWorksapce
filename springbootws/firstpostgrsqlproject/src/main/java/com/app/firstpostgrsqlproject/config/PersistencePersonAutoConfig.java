package com.app.firstpostgrsqlproject.config;




import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.boot.orm.jpa.EntityManagerFactoryBuilder;

import javax.persistence.EntityManagerFactory;
import javax.sql.DataSource;

@Configuration
@EnableJpaRepositories(basePackages="com.app.firstpostgrsqlproject.repository.person", entityManagerFactoryRef = "personEntityManager",
transactionManagerRef = "personTransactionManager")
public class PersistencePersonAutoConfig {
	@Primary
    @Bean
    @ConfigurationProperties(prefix="spring.datasource")
    public DataSource personDataSource() {
        return DataSourceBuilder.create().build();
    }

    @Primary
    @Bean(name = "personEntityManagerFactory")
    public LocalContainerEntityManagerFactoryBean entityManagerFactory(EntityManagerFactoryBuilder builder,@Qualifier("personDataSource") DataSource dataSource) {
        return builder.dataSource(dataSource).packages("com.app.firstpostgrsqlproject.person.entity").persistenceUnit("db1").build();
    }

    @Primary
    @Bean(name = "personTransactionManager")
    public PlatformTransactionManager personTransactionManager(
        @Qualifier("personEntityManagerFactory") EntityManagerFactory personEntityManagerFactory ) {
        return new JpaTransactionManager(personEntityManagerFactory);
    }
}
