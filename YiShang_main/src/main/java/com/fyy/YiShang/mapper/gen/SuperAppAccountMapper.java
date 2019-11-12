package com.fyy.YiShang.mapper.gen;

import com.fyy.YiShang.domain.AppAccount;
import com.fyy.YiShang.domain.gen.AppAccountCriteria;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface SuperAppAccountMapper {
    long countByExample(AppAccountCriteria example);

    int deleteByExample(AppAccountCriteria example);

    int deleteByPrimaryKey(Integer id);

    int insert(AppAccount record);

    int insertSelective(AppAccount record);

    List<AppAccount> selectByExample(AppAccountCriteria example);

    AppAccount selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") AppAccount record, @Param("example") AppAccountCriteria example);

    int updateByExample(@Param("record") AppAccount record, @Param("example") AppAccountCriteria example);

    int updateByPrimaryKeySelective(AppAccount record);

    int updateByPrimaryKey(AppAccount record);
}