package com.fyy.YiShang.service;

import com.fyy.YiShang.domain.SysUser;
import com.fyy.YiShang.vo.BaseRes;
import com.fyy.YiShang.vo.PageData;
import com.fyy.YiShang.vo.SysUserVo;

public interface SysUserService {
	
	BaseRes<PageData<SysUser>> entityPage(SysUserVo sysUserVo);

	BaseRes<SysUser> entityInfo(Integer id);

	BaseRes<String> deleteEntity(Integer id);

	BaseRes<String> addEntityInfo(SysUserVo sysUserVo);

	BaseRes<String> modifyEntityInfo(SysUserVo sysUserVo);
	
}
