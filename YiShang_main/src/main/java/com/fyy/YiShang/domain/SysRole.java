package com.fyy.YiShang.domain;

import java.io.Serializable;
import java.util.List;

import com.fyy.YiShang.domain.gen.SuperSysRole;

public class SysRole extends SuperSysRole implements Serializable {
	private static final long serialVersionUID = 1L;
	
	private List<String> authIds;

	public List<String> getAuthIds() {
		return authIds;
	}

	public void setAuthIds(List<String> authIds) {
		this.authIds = authIds;
	}

}