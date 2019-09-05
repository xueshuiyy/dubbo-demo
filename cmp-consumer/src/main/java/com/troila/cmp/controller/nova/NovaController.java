package com.troila.cmp.controller.nova;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Component;

import com.alibaba.dubbo.config.annotation.Reference;
import com.troila.cmp.dto.host.HostDTO;
import com.troila.cmp.service.NovaService;

@Component
public class NovaController {
	private static Logger logger = Logger.getLogger(NovaController.class);

	@Reference
	private NovaService novaService;
	
	public void getHosts() {
		HostDTO hostDTO = new HostDTO();
		hostDTO.setVirtualId(Integer.valueOf("1"));
		logger.info(novaService.getHost(hostDTO));
    }
}
