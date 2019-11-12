package com.fyy.YiShang.vo;

import javax.validation.constraints.NotEmpty;

import com.fyy.YiShang.domain.SysUser;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class SysUserVo extends SysUser {
	private static final long serialVersionUID = 1L;

	private String type; //  admin,customer
	private Integer current;
	private Integer pageSize;

	@NotEmpty(groups={AdminLogin.class})
	@Override
	public String getUsername() {
		return super.getUsername();
	}
	
	@NotEmpty(groups={AdminLogin.class})
	@Override
	public String getPassword() {
		return super.getPassword();
	}
	
	public Integer getCurrent() {
		return current;
	}

	public void setCurrent(Integer current) {
		this.current = current;
	}

	public Integer getPageSize() {
		return pageSize;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
	}
	
	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}


	public static interface DeleteEntity {}
	public static interface AddEntityInfo {}
	public static interface ModifyEntityInfo {}
	public static interface AdminLogin {}
	
}
