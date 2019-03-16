package com.troila.cmp.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.troila.cmp.dto.DemoEntity;
import com.troila.cmp.service.DemoService;

@Service
public class DemoServiceImpl implements DemoService {
	@Override
	public String saySomething(DemoEntity demoEntity) {
		return "Hi! There is a lovely dog!His Name is " + demoEntity.getName();
	}
}
