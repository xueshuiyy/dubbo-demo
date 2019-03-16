package com.troila.cmp.app;

import org.apache.log4j.Logger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.troila.cmp.controller.nova.NovaController;

@SpringBootApplication
public class CmpConsumerApp {
	private static Logger logger = Logger.getLogger(CmpConsumerApp.class);
	
	public static void main(String[] args) {
		ConfigurableApplicationContext applicationContext = SpringApplication.run(CmpConsumerApp.class, args);
		logger.info("Cloud Manage Consumer Project Start Success!");
		
		NovaController novaController = applicationContext.getBean(NovaController.class);
		novaController.getHosts();
//		DemoService demoService = applicationContext.getBean(DemoService.class); // 不行，这个接口这样是无法注入的，必须在包装一层
	}
}
