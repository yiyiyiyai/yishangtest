package com.fyy.YiShang.domain;

import com.fyy.YiShang.domain.gen.SuperSysUser;

import java.io.Serializable;
import java.util.List;

public class SysUser extends SuperSysUser implements Serializable {
	private static final long serialVersionUID = 1L;

	private List<Integer> roles;

	public List<Integer> getRoles() {
		return roles;
	}

	public void setRoles(List<Integer> roles) {
		this.roles = roles;
	}
}