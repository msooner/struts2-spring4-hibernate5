package com.xx.www.demo2;

import org.junit.Test;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

public class jdbcdemo {
	@Test
	public void demo() {
		// 创建连接池
		DriverManagerDataSource datasource = new DriverManagerDataSource();
		datasource.setDriverClassName("com.mysql.jdbc.Driver");
		datasource.setUrl("jdbc:mysql://localhost:3307/spring");
		datasource.setUsername("root");
		datasource.setPassword("ubuntu");
		// 创建jdbc模板
		JdbcTemplate jdbctempalte = new JdbcTemplate(datasource);
		jdbctempalte.update("insert into account values(null,?,?)","小张",10000d);
	}
}
