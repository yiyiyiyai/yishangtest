package com.fyy.YiShang.controller;

import java.util.List;
import java.util.Set;

import javax.annotation.Resource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.CollectionUtils;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fyy.YiShang.comm.ServiceCode;
import com.fyy.YiShang.domain.SysUser;
import com.fyy.YiShang.domain.gen.SysUserCriteria;
import com.fyy.YiShang.mapper.SysUserMapper;
import com.fyy.YiShang.security.LoginUser;
import com.fyy.YiShang.service.SysAuthorityService;
import com.fyy.YiShang.util.JWTHelperUtil;
import com.fyy.YiShang.util.Constants.LoginUserType;
import com.fyy.YiShang.vo.BaseRes;
import com.fyy.YiShang.vo.LoginResVo;
import com.fyy.YiShang.vo.SysUserVo;
import com.fyy.YiShang.vo.SysUserVo.AdminLogin;

@RestController
@RequestMapping("comm")
public class CommController {

	private Logger log = LoggerFactory.getLogger(CommController.class);

	@Resource
	private SysAuthorityService sysAuthorityService;

	@Autowired
	private SysUserMapper sysUserMapper;

	@Resource
	private JWTHelperUtil jWTHelperUtil;

	/**
	 * 管理员登录
	 * @param sysUserVo
	 * @param bindingResult
	 * @return
	 */
	@PostMapping("admin/login")
	public BaseRes<LoginResVo> adminLogin(@Validated(AdminLogin.class) @RequestBody SysUserVo sysUserVo, BindingResult bindingResult) {

		BaseRes<LoginResVo> res = new BaseRes<>();

		String username = sysUserVo.getUsername();
		String password = sysUserVo.getPassword();

		SysUserCriteria suCriteria = new SysUserCriteria();
		suCriteria.createCriteria()
		.andUsernameEqualTo(username)
		.andPasswordEqualTo(password)
		.andStatusEqualTo("enable");
		List<SysUser> users = sysUserMapper.selectByExample(suCriteria);

		if (!CollectionUtils.isEmpty(users)) {
			SysUser sUser = users.get(0);
			SysUserVo sysUser = new SysUserVo();
			sysUser.setId(sUser.getId());
			sysUser.setUsername(sUser.getUsername());
			sysUser.setType(LoginUserType.admin.name());
			
			String token = jWTHelperUtil.getToken(sysUser);
			
			log.info("token={}", token);
			
			LoginUser loginUser = jWTHelperUtil.verifyAdminToken(token);
			Set<String> authIds = loginUser.getAuthIds();
			
			log.info("username={}, token={}", username, token);
			LoginResVo loginRes = new LoginResVo(token, authIds);
			res.setData(loginRes);
			res.setServiceCode(ServiceCode.SUCCESS);
			return res;
		}
		return new BaseRes<>(ServiceCode.LOGIN_ERROR);
	}
}