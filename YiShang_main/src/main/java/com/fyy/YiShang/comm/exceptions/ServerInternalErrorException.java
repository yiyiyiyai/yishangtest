package com.fyy.YiShang.comm.exceptions;

import org.springframework.http.HttpStatus;

import com.fyy.YiShang.comm.ServiceCode;

/**
 * 500
 */
public class ServerInternalErrorException extends BaseRuntimeException {

	private static final long serialVersionUID = 1L;

	public ServerInternalErrorException(ServiceCode serviceCode, String message) {
		this.setServiceCode(serviceCode);
		this.setMessage(message);
		this.setHttpStatus(HttpStatus.INTERNAL_SERVER_ERROR);
	}

	public ServerInternalErrorException(ServiceCode serviceCode) {
		this.setServiceCode(serviceCode);
		this.setMessage(serviceCode.msg);
		this.setHttpStatus(HttpStatus.INTERNAL_SERVER_ERROR);
	}

}
