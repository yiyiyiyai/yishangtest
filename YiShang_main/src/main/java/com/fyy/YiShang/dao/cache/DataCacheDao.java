package com.fyy.YiShang.dao.cache;

import com.fyy.YiShang.security.LoginUser;

public interface DataCacheDao {

	String getCacheData(String key);

	void setCacheData(String key, String value);

	String getCacheValidCode(String key);

	void setCacheValidCode(String key, String value);
	
	LoginUser getAdminLoginCacheData(String key);

	LoginUser getApiLoginCacheData(String key);
	
	void setLoginCacheData(String key, LoginUser value);
	
	
}
