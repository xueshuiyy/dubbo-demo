package com.troila.cmp.app;

import org.apache.log4j.Logger;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.troila.cmp.utils.BeanUtil;

@SpringBootApplication
@MapperScan("com.troila.cmp.dao")
public class CmpApiApp {
	private static Logger logger = Logger.getLogger(CmpApiApp.class);

	public static void main(String[] args) {
		ApplicationContext applicationContext = SpringApplication.run(CmpApiApp.class, args);
		BeanUtil.setApplicationContext(applicationContext);

		logger.info("Cloud Manage API Project Start Success!");
	}
}
