package com.xx.www.demo2;

import org.junit.Test;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

public class jdbcdemo {
	@Test
	public void demo() {
		// �������ӳ�
		DriverManagerDataSource datasource = new DriverManagerDataSource();
		datasource.setDriverClassName("com.mysql.jdbc.Driver");
		datasource.setUrl("jdbc:mysql://localhost:3307/spring");
		datasource.setUsername("root");
		datasource.setPassword("ubuntu");
		// ����jdbcģ��
		JdbcTemplate jdbctempalte = new JdbcTemplate(datasource);
		jdbctempalte.update("insert into account values(null,?,?)","С��",10000d);
	}
}
