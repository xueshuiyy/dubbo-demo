package com.troila.cmp.dao.po;

public class VirtualHostPO {
	
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

}
