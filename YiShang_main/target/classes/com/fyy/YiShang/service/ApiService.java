package com.fyy.YiShang.service;

import com.fyy.YiShang.vo.ApiVo;
import com.fyy.YiShang.vo.BaseRes;

import java.util.List;

public interface ApiService {

    BaseRes<List<ApiVo>> entityPage(ApiVo apiVo); //获取所有的信息列表（也可以通过关键字查询）

    BaseRes<ApiVo> getApiInfo(Integer id);  //根据id获取单个信息

    BaseRes<String> deleteApi(Integer id);

    BaseRes<String> addApiInfo(ApiVo apiVo);

    BaseRes<String> modifyApiInfo(ApiVo apiVo);
}
