/** 
应用管理
 **/
package com.fyy.YiShang.controller;

import com.fyy.YiShang.service.AppService;
import com.fyy.YiShang.util.BeanUtil;
import com.fyy.YiShang.vo.AppVo;
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
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("adapi/app")
public class AppController {

    @Resource
    private AppService appService;

    /**
     * @gen_13_lwl
     * 增加应用信息
     * 增加应用信息
     * @param appVo
    **/
    @Title("增加应用信息")
    @ResponseBody
    @RequestMapping(value="/insertApp", method=RequestMethod.POST)
    public BaseRes<String> insertApp(@RequestBody AppVo appVo, BindingResult bindingResult) {
        // TODO 
        return appService.addAppInfo(appVo);
    }

    /**
     * @gen_14_lwl
     * 删除应用信息
     * 删除应用信息
     * @param appVo
    **/
    @Title("删除应用信息")
    @ResponseBody
    @RequestMapping(value="/deleteApp", method=RequestMethod.DELETE)
    public BaseRes<String> deleteApp(@RequestBody AppVo appVo, BindingResult bindingResult) {
        // TODO 
        return appService.deleteApp(appVo.getId());
    }

    /**
     * @gen_15_lwl
     * 修改应用信息
     * 修改应用信息
     * @param appVo
    **/
    @Title("修改应用信息")
    @ResponseBody
    @RequestMapping(value="/modifyAppInfo", method=RequestMethod.POST)
    public BaseRes<String> modifyAppInfo(@RequestBody AppVo appVo, BindingResult bindingResult) {
        // TODO 
        return appService.modifyAppInfo(appVo);
    }

    /**
     * @gen_16_lwl
     * 查看单个应用信息
     * 查看单个应用信息
     * @param id
    **/
    @Title("查看单个应用信息")
    @ResponseBody
    @RequestMapping(value="/getAppInfo/{id}", method=RequestMethod.GET)
    public BaseRes<AppVo> getAppInfo(@PathVariable("id") Integer id) {
        // TODO 
        return appService.getAppInfo(id);
    }

    /**
     * @gen_17_lwl
     * 查看应用列表信息
     * 用于关键词查找和所有的查找
     * @param appVo
    **/
    @Title("查看应用列表信息")
    @ResponseBody
    @RequestMapping(value="/getAppPage", method=RequestMethod.GET)
    public BaseRes<List<AppVo>> getAppPage(AppVo appVo) {
        // TODO
        return appService.entityPage(appVo);
    }
}