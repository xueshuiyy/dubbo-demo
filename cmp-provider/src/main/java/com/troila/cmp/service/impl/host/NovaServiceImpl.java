package com.troila.cmp.service.impl.host;

import javax.annotation.Resource;

import org.springframework.beans.BeanUtils;

import com.alibaba.dubbo.config.annotation.Service;
import com.troila.cmp.dao.VirtualHostDAO;
import com.troila.cmp.dao.po.VirtualHostPO;
import com.troila.cmp.dto.host.HostDTO;
import com.troila.cmp.service.NovaService;

@Service
public class NovaServiceImpl implements NovaService {

	@Resource
	private VirtualHostDAO virtualHostDAO;
	
	@Override
	public HostDTO getHost(HostDTO hostDTO) {
		HostDTO hostResDTO = new HostDTO();
		VirtualHostPO virtualHost = virtualHostDAO.selectHost(hostDTO.getVirtualId().toString());
		BeanUtils.copyProperties(virtualHost, hostResDTO);
		return hostResDTO;
	}
	

}
