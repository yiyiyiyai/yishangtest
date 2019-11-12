package com.fyy.YiShang.mapper.gen;

import com.fyy.YiShang.domain.AppAppinfo;
import com.fyy.YiShang.domain.gen.AppAppinfoCriteria;

import java.util.HashMap;
import java.util.List;

import com.fyy.YiShang.vo.AppVo;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface SuperAppAppinfoMapper {
    long countByExample(AppAppinfoCriteria example);

    int deleteByExample(AppAppinfoCriteria example);

    int deleteByPrimaryKey(Integer id);

    int insert(AppAppinfo record);

    int insertSelective(AppAppinfo record);

    List<AppAppinfo> selectByExample(AppAppinfoCriteria example);

    AppAppinfo selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") AppAppinfo record, @Param("example") AppAppinfoCriteria example);

    int updateByExample(@Param("record") AppAppinfo record, @Param("example") AppAppinfoCriteria example);

    int updateByPrimaryKeySelective(AppAppinfo record);

    int updateByPrimaryKey(AppAppinfo record);

    //List<AppAppinfo> selectAppByExample(AppAppinfoCriteria example);

    List<AppAppinfo> selectAppByExample(AppAppinfo record);

    AppAppinfo selectAppByPrimaryKey(Integer id);

}