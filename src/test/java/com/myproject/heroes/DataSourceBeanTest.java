package com.myproject.heroes;

import java.sql.Connection;
import java.sql.SQLException;

import javax.sql.DataSource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mybatis.spring.SqlSessionTemplate;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(
		locations= {"file:src/main/webapp/WEB-INF/spring/root-context.xml"}
		)
public class DataSourceBeanTest {
	
	private static final Logger log = LoggerFactory.getLogger(DataSourceBeanTest.class);
	
	// 디비연결정보 객체 주입
	@Autowired
	private DataSource ds;

	// sqlSessionTemplate 객체 생성
	@Autowired
	private SqlSessionTemplate sqlTemplate;
	
	
	
	@Test
	public void sqlSessionTemplate_객체확인() {
		log.info("@@@@@@@@@@@" + sqlTemplate + "");
	}
	
	
	
	//@Test
	public void 디비연결확인() throws Exception {
		Connection con = ds.getConnection();
		log.info("@@@"+ con);
	}
	
	
	
	
	
	
	
	
	
}
