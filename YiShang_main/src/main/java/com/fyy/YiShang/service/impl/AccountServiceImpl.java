package com.fyy.YiShang.service.impl;

import com.fyy.YiShang.comm.ServiceCode;
import com.fyy.YiShang.domain.AppAccount;
import com.fyy.YiShang.domain.gen.AppAccountCriteria;
import com.fyy.YiShang.domain.gen.SysUserCriteria;
import com.fyy.YiShang.mapper.AppAccountMapper;
import com.fyy.YiShang.service.AccountService;
import com.fyy.YiShang.util.BeanUtil;
import com.fyy.YiShang.vo.AccountVo;
import com.fyy.YiShang.vo.BaseRes;
import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class AccountServiceImpl implements AccountService {
    @Autowired
    private AppAccountMapper appAccountMapper;

    @Override
    public BaseRes<List<AccountVo>> entityPage(AccountVo accountVo) {
        BaseRes<List<AccountVo>> res = new BaseRes<>();
        //----关键字查询
        AppAccountCriteria example = new AppAccountCriteria();
        AppAccountCriteria.Criteria mCriteria = example.createCriteria();
        if( StringUtils.isNotEmpty(accountVo.getUsername()) ) {
            mCriteria.andUsernameLike("%"+ accountVo.getUsername() + "%");
        }
        if( StringUtils.isNotEmpty(accountVo.getStatus()) ) {
            mCriteria.andStatusEqualTo(accountVo.getStatus());
        }

        List<AppAccount> list = appAccountMapper.selectByExample(example);
        res.setData(BeanUtil.voConvertList(list, AccountVo.class));
        res.setServiceCode(ServiceCode.SUCCESS);
        return res;
    }

    @Override
    public BaseRes<AccountVo> getAccountInfo(Integer id) {
        BaseRes<AccountVo> res=new BaseRes<>();
        AppAccount account=appAccountMapper.selectByPrimaryKey(id);        ;
        res.setData(BeanUtil.voConvert(account, AccountVo.class));
        res.setServiceCode(ServiceCode.SUCCESS);
        return res;
    }

    @Override
    public BaseRes<String> deleteAccount(Integer id) {
        //System.out.println(id);
        appAccountMapper.deleteByPrimaryKey(id);
        return new BaseRes<>(ServiceCode.SUCCESS);
    }

    @Override
    public BaseRes<String> addAccountInfo(AccountVo accountVo) {
        accountVo.setCreateTime(new Date());
        accountVo.setUpdateTime(new Date());

        appAccountMapper.insertSelective(accountVo);
        return new BaseRes<>(ServiceCode.SUCCESS);
    }

    @Override
    public BaseRes<String> modifyAccountInfo(AccountVo accountVo) {
        accountVo.setUpdateTime(new Date());

        appAccountMapper.updateByPrimaryKeySelective(accountVo);
        return new BaseRes<>(ServiceCode.SUCCESS);
    }
}
