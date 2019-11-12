/** 
权限管理
 **/
package com.fyy.YiShang.controller;

import com.fyy.YiShang.service.ApiService;
import com.fyy.YiShang.vo.ApiVo;
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
@RequestMapping("adapi/api")
public class ApiController {
    @Resource
    private ApiService apiService;

    /**
     * @gen_18_lwl
     * 增加权限信息
     * 增加权限信息
     * @param apiVo
    **/
    @Title("增加权限信息")
    @ResponseBody
    @RequestMapping(value="/insertApi", method=RequestMethod.POST)
    public BaseRes<String> insertApi(@RequestBody ApiVo apiVo, BindingResult bindingResult) {
        // TODO 
        return apiService.addApiInfo(apiVo);
    }

    /**
     * @gen_19_lwl
     * 删除权限信息
     * 删除权限信息
     * @param apiVo
    **/
    @Title("删除权限信息")
    @ResponseBody
    @RequestMapping(value="/deleteApi", method=RequestMethod.DELETE)
    public BaseRes<String> deleteApi(@RequestBody ApiVo apiVo, BindingResult bindingResult) {
        // TODO 
        return apiService.deleteApi(apiVo.getId());
    }

    /**
     * @gen_20_lwl
     * 修改权限信息
     * 修改权限信息
     * @param apiVo
    **/
    @Title("修改权限信息")
    @ResponseBody
    @RequestMapping(value="/modifyApiInfo", method=RequestMethod.POST)
    public BaseRes<String> modifyApiInfo(@RequestBody ApiVo apiVo, BindingResult bindingResult) {
        // TODO 
        return apiService.modifyApiInfo(apiVo);
    }

    /**
     * @gen_21_lwl
     * 查看单个权限信息
     * 查看单个权限信息
     * @param id
    **/
    @Title("查看单个权限信息")
    @ResponseBody
    @RequestMapping(value="/getApiInfo/{id}", method=RequestMethod.GET)
    public BaseRes<ApiVo> getApiInfo(@PathVariable("id") Integer id) {
        // TODO
        return apiService.getApiInfo(id);
    }

    /**
     * @gen_22_lwl
     * 查看权限列表信息
     * 查看权限列表信息
     * @param apiVo
    **/
    @Title("查看权限列表信息")
    @ResponseBody
    @RequestMapping(value="/getApiPage", method=RequestMethod.GET)
    public BaseRes<List<ApiVo>> getApiPage(ApiVo apiVo) {
        // TODO 
        return apiService.entityPage(apiVo);
    }
}