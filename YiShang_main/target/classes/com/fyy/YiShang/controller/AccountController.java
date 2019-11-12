/** 
商户管理
 **/
package com.fyy.YiShang.controller;

import com.fyy.YiShang.service.AccountService;
import com.fyy.YiShang.vo.AccountVo;
import com.fyy.YiShang.vo.BaseRes;
import java.util.List;
import javax.annotation.Resource;
import javax.annotation.Title;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("adapi/account")
public class AccountController {

    @Resource
    private AccountService accountService;

    /**
     * @gen_8_lwl
     * 增加商户信息
     * 增加商户信息
     * @param accountVo
    **/
    @Title("增加商户信息")
    @ResponseBody
    @RequestMapping(value="/insertAccount", method=RequestMethod.POST)
    public BaseRes<String> insertAccount(@RequestBody AccountVo accountVo, BindingResult bindingResult) {
        // TODO 
        return accountService.addAccountInfo(accountVo);
    }

    /**
     * @gen_9_lwl
     * 删除商户信息
     * 删除商户信息
     * @param accountVo
    **/
    @Title("删除商户信息")
    @ResponseBody
    @RequestMapping(value="/deleteAccount", method=RequestMethod.DELETE)
    public BaseRes<String> deleteAccount(@RequestBody AccountVo accountVo, BindingResult bindingResult) {
        // TODO 
        return accountService.deleteAccount(accountVo.getId());
    }

    /**
     * @gen_10_lwl
     * 修改商户信息
     * 修改商户信息
     * @param accountVo
    **/
    @Title("修改商户信息")
    @ResponseBody
    @RequestMapping(value="/modifyAccountInfo", method=RequestMethod.POST)
    public BaseRes<String> modifyAccountInfo(@RequestBody AccountVo accountVo, BindingResult bindingResult) {
        // TODO 
        return accountService.modifyAccountInfo(accountVo);
    }

    /**
     * @gen_11_lwl
     * 查看单个商户信息
     * 查看单个商户信息
     * @param id
    **/
    @Title("查看单个商户信息")
    @ResponseBody
    @RequestMapping(value="/getAccountInfo/{id}", method=RequestMethod.GET)
    public BaseRes<AccountVo> getAccountInfo(@PathVariable("id") Integer id) {
        // TODO 
        return accountService.getAccountInfo(id);
    }

    /**
     * @gen_12_lwl
     * 获取商户列表信息
     * 关键词查找等
     * @param accountVo
    **/
    @Title("获取商户列表信息")
    @ResponseBody
        @RequestMapping(value="/getAccountPage", method=RequestMethod.GET)
    public BaseRes<List<AccountVo>> getAccountPage(AccountVo accountVo) {
        // TODO 
        return accountService.entityPage(accountVo);
    }
}