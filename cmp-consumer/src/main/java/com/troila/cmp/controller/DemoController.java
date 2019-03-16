package com.troila.cmp.controller;

import org.springframework.stereotype.Component;

import com.alibaba.dubbo.config.annotation.Reference;
import com.troila.cmp.dto.DemoEntity;
import com.troila.cmp.service.DemoService;

@Component
public class DemoController {
//	private static Logger logger = Logger.getLogger(DemoController.class);
	
	@Reference
	private DemoService demoService;
	
	public String printDemoRes() {
        DemoEntity demoEntity = new DemoEntity();
        demoEntity.setName("Wang Wang");
		return demoService.saySomething(demoEntity);
    }
}
