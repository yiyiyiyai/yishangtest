package com.fyy.YiShang.service.impl;

import com.fyy.YiShang.comm.ServiceCode;
import com.fyy.YiShang.domain.AppAppinfo;
import com.fyy.YiShang.domain.gen.AppAppinfoCriteria;
import com.fyy.YiShang.mapper.AppAppinfoMapper;
import com.fyy.YiShang.service.AppService;
import com.fyy.YiShang.util.BeanUtil;
import com.fyy.YiShang.vo.AppVo;
import com.fyy.YiShang.vo.BaseRes;
import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.HashMap;
import java.util.List;

@Service
public class AppServiceImpl implements AppService {
    @Autowired
    private AppAppinfoMapper appAppinfoMapper;

    @Override
    public BaseRes<List<AppVo>> entityPage(AppVo appVo) {
        BaseRes<List<AppVo>> res =new BaseRes<>();


        //----关键字查询
        /*AppAppinfoCriteria example = new AppAppinfoCriteria();
        AppAppinfoCriteria.Criteria mCriteria = example.createCriteria();

        //以下方法中只有状态是真的存在的，其他三个根本不会传值
        if( StringUtils.isNotEmpty(appVo.getNickName()) ) {     //商户
            mCriteria.andAppNickNameLike("%"+appVo.getNickName()+ "%");
        }
        if( StringUtils.isNotEmpty(appVo.getUserName())){       //账号 需要通过accountId来找
            mCriteria.andAppUserNameLike("%"+appVo.getUserName()+ "%");
        }

        if( StringUtils.isNotEmpty(appVo.getAppId()) ) {          //应用ID
            mCriteria.andAppIdLike("%"+ appVo.getAppId()+ "%");
        }
        if( StringUtils.isNotEmpty(appVo.getStatus()) ) {       //状态
            mCriteria.andStatusEqualTo(appVo.getStatus());
        }*/

        BeanUtil.voConvert(appVo, AppAppinfo.class);
        List<AppAppinfo> list=appAppinfoMapper.selectAppByExample(appVo);

        System.out.println(appVo.getUserName());

        res.setData(BeanUtil.voConvertList(list, AppVo.class));
        res.setServiceCode(ServiceCode.SUCCESS);
        return res;
    }

    @Override
    public BaseRes<AppVo> getAppInfo(Integer id) {
        BaseRes<AppVo> res=new BaseRes<>();
        AppAppinfo app=appAppinfoMapper.selectByPrimaryKey(id);
        res.setData(BeanUtil.voConvert(app, AppVo.class));
        res.setServiceCode(ServiceCode.SUCCESS);
        return res;
    }

    @Override
    public BaseRes<String> deleteApp(Integer id) {
        appAppinfoMapper.deleteByPrimaryKey(id);
        return new BaseRes<>(ServiceCode.SUCCESS);
    }

    @Override
    public BaseRes<String> addAppInfo(AppVo appVo) {
        appVo.setCreateTime(new Date());
        appVo.setUpdateTime(new Date());

        appAppinfoMapper.insertSelective(appVo);
        return new BaseRes<>(ServiceCode.SUCCESS);
    }

    @Override
    public BaseRes<String> modifyAppInfo(AppVo appVo) {
        appVo.setUpdateTime(new Date());

        appAppinfoMapper.updateByPrimaryKeySelective(appVo);
        return new BaseRes<>(ServiceCode.SUCCESS);
    }
}
