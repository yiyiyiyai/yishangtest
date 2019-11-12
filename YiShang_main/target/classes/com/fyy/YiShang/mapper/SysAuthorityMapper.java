package com.fyy.YiShang.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.fyy.YiShang.domain.SysAuthority;
import com.fyy.YiShang.mapper.gen.SuperSysAuthorityMapper;

@Mapper
public interface SysAuthorityMapper extends SuperSysAuthorityMapper {
	
	List<SysAuthority> querySysRoleAuthorities(Integer roleId);

	List<SysAuthority> userAuthority(Integer userId);
	
}