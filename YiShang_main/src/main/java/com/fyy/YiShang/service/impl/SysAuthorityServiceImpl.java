package com.fyy.YiShang.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fyy.YiShang.domain.SysAuthority;
import com.fyy.YiShang.mapper.SysAuthorityMapper;
import com.fyy.YiShang.service.SysAuthorityService;

@Service
public class SysAuthorityServiceImpl implements SysAuthorityService {

	@Autowired
	private SysAuthorityMapper sysAuthorityMapper;
	
	@Override
	public List<SysAuthority> getAllAuthority() {
		return sysAuthorityMapper.selectByExample(null);
	}

}
