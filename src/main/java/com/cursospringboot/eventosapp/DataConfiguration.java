package com.cursospringboot.eventosapp;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.jpa.JpaVendorAdapter;
import org.springframework.orm.jpa.vendor.Database;
import org.springframework.orm.jpa.vendor.HibernateJpaVendorAdapter;

//@Configuration
public class DataConfiguration { //classe de configuração com o banco

//	@Bean
//	public DriverManagerDataSource dataSource() { //faz a conexão com o banco de dados
//		DriverManagerDataSource dataSource = new DriverManagerDataSource();
//		dataSource.setDriverClassName("com.mysql.jdbc.Driver");
//		dataSource.setUrl("jdbc:mysql://localhost:3306/eventosapp");
//		dataSource.setUsername("root");
//		dataSource.setPassword("root");
//		return dataSource;
//	}
//
//	@Bean
//	public JpaVendorAdapter jpaVendorAdapter() { //faz a configuração com hibernate
//		HibernateJpaVendorAdapter adapter = new HibernateJpaVendorAdapter();
//		adapter.setDatabase(Database.MYSQL);
//		adapter.setShowSql(true); //mostra o log no console
//		adapter.setGenerateDdl(true); //hibernate cria as tabelas
//		adapter.setDatabasePlatform("org.hibernate.dialect.MySQLDialect");
//		adapter.setPrepareConnection(true); //hibernate preparar a conexão
//		return adapter;
//	}
}
