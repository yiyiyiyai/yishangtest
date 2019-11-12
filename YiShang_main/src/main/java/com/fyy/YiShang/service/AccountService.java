package com.fyy.YiShang.service;

import com.fyy.YiShang.vo.AccountVo;
import com.fyy.YiShang.vo.BaseRes;
import com.fyy.YiShang.vo.PageData;

import java.util.List;

public interface AccountService {

    BaseRes<List<AccountVo>> entityPage(AccountVo accountVo); //获取所有的信息列表（也可以通过关键字查询）

    BaseRes<AccountVo> getAccountInfo(Integer id);  //根据id获取单个信息

    BaseRes<String> deleteAccount(Integer id);

    BaseRes<String> addAccountInfo(AccountVo accountVo);

    BaseRes<String> modifyAccountInfo(AccountVo accountVo);

}
