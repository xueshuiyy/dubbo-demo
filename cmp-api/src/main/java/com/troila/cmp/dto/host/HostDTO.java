package com.troila.cmp.dto.host;

import java.io.Serializable;

public class HostDTO implements Serializable{

	private static final long serialVersionUID = 1L;
	
	private Integer virtualId; 
	private String hypervisorName; 
	private String virtualStatus;
	public Integer getVirtualId() {
		return virtualId;
	}
	public void setVirtualId(Integer virtualId) {
		this.virtualId = virtualId;
	}
	public String getHypervisorName() {
		return hypervisorName;
	}
	public void setHypervisorName(String hypervisorName) {
		this.hypervisorName = hypervisorName;
	}
	public String getVirtualStatus() {
		return virtualStatus;
	}
	public void setVirtualStatus(String virtualStatus) {
		this.virtualStatus = virtualStatus;
	}
	@Override
	public String toString() {
		return "HostDTO [virtualId=" + virtualId + ", hypervisorName=" + hypervisorName + ", virtualStatus="
				+ virtualStatus + "]";
	}

}
