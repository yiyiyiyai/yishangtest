package com.fyy.YiShang.service.impl;

import com.fyy.YiShang.comm.ServiceCode;
import com.fyy.YiShang.domain.AppJurisdiction;
import com.fyy.YiShang.domain.gen.AppJurisdictionCriteria;
import com.fyy.YiShang.mapper.AppJurisdictionMapper;
import com.fyy.YiShang.service.ApiService;
import com.fyy.YiShang.util.BeanUtil;
import com.fyy.YiShang.vo.ApiVo;
import com.fyy.YiShang.vo.BaseRes;
import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class ApiServiceImpl implements ApiService {
    @Autowired
    private AppJurisdictionMapper appApiMapper;

    @Override
    public BaseRes<List<ApiVo>> entityPage(ApiVo apiVo) {
        BaseRes<List<ApiVo>> res =new BaseRes<>();

        AppJurisdictionCriteria example=new AppJurisdictionCriteria();
        AppJurisdictionCriteria.Criteria mCriteria=example.createCriteria();
        /*if( StringUtils.isNotEmpty(apiVo.getAppId()) ) {    //账号
            mCriteria.andStatusEqualTo(apiVo.getAppId());   //account表中的username，需要通过app_id找到appinfo表中的accountId再去找account表中的username
        }
        if( StringUtils.isNotEmpty(apiVo ) {       //应用
            mCriteria.andStatusEqualTo(apiVo.getStatus());  //通过权限表中的appid来找到app表中的name
        }*/
        if( StringUtils.isNotEmpty(apiVo.getStatus()) ) {       //状态
            mCriteria.andStatusEqualTo(apiVo.getStatus());
        }
        if( StringUtils.isNotEmpty(apiVo.getAppId()) ) {          //Key
            mCriteria.andStatusEqualTo(apiVo.getAppId()+ "%");
        }


        List<AppJurisdiction> list=appApiMapper.selectByExample(example);
        res.setData(BeanUtil.voConvertList(list,ApiVo.class));
        res.setServiceCode(ServiceCode.SUCCESS);
        return res;
    }

    @Override
    public BaseRes<ApiVo> getApiInfo(Integer id) {
        BaseRes<ApiVo> res=new BaseRes<>();
        AppJurisdiction api =appApiMapper.selectByPrimaryKey(id);
        res.setData(BeanUtil.voConvert(api, ApiVo.class));
        res.setServiceCode(ServiceCode.SUCCESS);
        return res;
    }

    @Override
    public BaseRes<String> deleteApi(Integer id) {
        appApiMapper.deleteByPrimaryKey(id);
        return new BaseRes<>(ServiceCode.SUCCESS);
    }

    @Override
    public BaseRes<String> addApiInfo(ApiVo apiVo) {
        apiVo.setCreateTime(new Date());
        apiVo.setUpdateTime(new Date());

        appApiMapper.insertSelective(apiVo);
        return new BaseRes<>(ServiceCode.SUCCESS);
    }

    @Override
    public BaseRes<String> modifyApiInfo(ApiVo apiVo) {
        apiVo.setUpdateTime(new Date());

        appApiMapper.updateByPrimaryKeySelective(apiVo);
        return new BaseRes<>(ServiceCode.SUCCESS);
    }
}
