package com.fyy.YiShang.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.fyy.YiShang.domain.SysRole;
import com.fyy.YiShang.mapper.gen.SuperSysRoleMapper;

@Mapper
public interface SysRoleMapper extends SuperSysRoleMapper {
	
	List<SysRole> querySysUserRoles(Integer roleId);
	
}