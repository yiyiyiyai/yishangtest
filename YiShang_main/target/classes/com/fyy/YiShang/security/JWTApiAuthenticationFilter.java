package com.fyy.YiShang.security;

import java.io.IOException;

import javax.annotation.Resource;
import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.lang.StringUtils;
import org.json.JSONObject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.web.authentication.WebAuthenticationDetailsSource;
import org.springframework.stereotype.Component;
import org.springframework.web.filter.OncePerRequestFilter;

import com.fyy.YiShang.comm.ServiceCode;
import com.fyy.YiShang.util.JWTHelperUtil;

/**
 * api 认证/授权验证
 */

@Component
public class JWTApiAuthenticationFilter extends OncePerRequestFilter {

	public static final String AUTHENTICATE_URL = "/api";
	private static final Logger log = LoggerFactory.getLogger(JWTApiAuthenticationFilter.class);
	
	@Resource
	private JWTHelperUtil jWTHelperUtil;
	
	@Override
	protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain chain) throws IOException,
			ServletException {
		
		boolean authentication = request.getServletPath().startsWith(AUTHENTICATE_URL);
		log.info("authentication={}", authentication);
		if (authentication) {
			authentication(request, response);
		}
		chain.doFilter(request, response);
	}
	
	private void authentication(HttpServletRequest request, HttpServletResponse response) {
		
        String authHeader = request.getHeader("Authorization");
        String tokenHead = "Bearer ";
        if(StringUtils.isBlank(authHeader)) {
        	return;
        }
        
        if (authHeader.startsWith(tokenHead)) {
        	String authToken = authHeader.substring(tokenHead.length());
        	
        	try {
	        	LoginUser mUserVo = jWTHelperUtil.verifyApiToken(authToken);
	        		
        		UsernamePasswordAuthenticationToken authentication = new UsernamePasswordAuthenticationToken(mUserVo, null, mUserVo.getAuthorities());
                authentication.setDetails(new WebAuthenticationDetailsSource().buildDetails(request));
                SecurityContextHolder.getContext().setAuthentication(authentication);
	            
        	} catch(Exception e) {
        		log.error("error={}", e.getMessage(), e);
        		JSONObject jsonObj = new JSONObject();
    			try {
					jsonObj.put("code", ServiceCode.TOKEN_INVALID.code);
	    			jsonObj.put("msg", ServiceCode.TOKEN_INVALID.msg);
	    			response.setContentType("text/html;charset=utf-8");
	        		response.getWriter().println(jsonObj.toString());
    			} catch (Exception e1) {
    				log.error("error={}", e1.getMessage(), e1);
				}
        	}
        }
    }
}
