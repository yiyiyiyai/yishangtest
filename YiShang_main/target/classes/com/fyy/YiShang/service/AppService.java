package com.fyy.YiShang.service;

import com.fyy.YiShang.vo.AppVo;
import com.fyy.YiShang.vo.BaseRes;
import com.fyy.YiShang.vo.PageData;

import java.util.List;

public interface AppService {
    BaseRes<List<AppVo>> entityPage(AppVo appVo); //获取所有的信息列表（也可以通过关键字查询）

    BaseRes<AppVo> getAppInfo(Integer id);  //根据id获取单个信息

    BaseRes<String> deleteApp(Integer id);

    BaseRes<String> addAppInfo(AppVo appVo);

    BaseRes<String> modifyAppInfo(AppVo appVo);
}
