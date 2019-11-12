package com.fyy.YiShang.mapper.gen;

import com.fyy.YiShang.domain.AppJurisdiction;
import com.fyy.YiShang.domain.gen.AppJurisdictionCriteria;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface SuperAppJurisdictionMapper {
    long countByExample(AppJurisdictionCriteria example);

    int deleteByExample(AppJurisdictionCriteria example);

    int deleteByPrimaryKey(Integer id);

    int insert(AppJurisdiction record);

    int insertSelective(AppJurisdiction record);

    List<AppJurisdiction> selectByExample(AppJurisdictionCriteria example);

    AppJurisdiction selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") AppJurisdiction record, @Param("example") AppJurisdictionCriteria example);

    int updateByExample(@Param("record") AppJurisdiction record, @Param("example") AppJurisdictionCriteria example);

    int updateByPrimaryKeySelective(AppJurisdiction record);

    int updateByPrimaryKey(AppJurisdiction record);
}