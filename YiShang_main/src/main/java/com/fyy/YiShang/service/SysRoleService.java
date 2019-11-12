package com.fyy.YiShang.service;

import java.util.List;

import com.fyy.YiShang.domain.SysAuthority;
import com.fyy.YiShang.domain.SysRole;
import com.fyy.YiShang.vo.BaseRes;
import com.fyy.YiShang.vo.PageData;
import com.fyy.YiShang.vo.SysRoleVo;

public interface SysRoleService {

	BaseRes<PageData<SysRole>> entityPage(SysRoleVo sysUserVo);

	BaseRes<SysRole> entityInfo(Integer id);

	BaseRes<String> deleteEntity(Integer id);

	BaseRes<String> addEntityInfo(SysRoleVo sysUserVo);

	BaseRes<String> modifyEntityInfo(SysRoleVo sysUserVo);

	BaseRes<List<SysAuthority>> queryAllAuthoritys();
	
}
