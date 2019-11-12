package com.fyy.YiShang.mapper.gen;

import com.fyy.YiShang.domain.SysRole;
import com.fyy.YiShang.domain.gen.SysRoleCriteria;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface SuperSysRoleMapper {
    long countByExample(SysRoleCriteria example);

    int deleteByExample(SysRoleCriteria example);

    int deleteByPrimaryKey(Integer id);

    int insert(SysRole record);

    int insertSelective(SysRole record);

    List<SysRole> selectByExample(SysRoleCriteria example);

    SysRole selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") SysRole record, @Param("example") SysRoleCriteria example);

    int updateByExample(@Param("record") SysRole record, @Param("example") SysRoleCriteria example);

    int updateByPrimaryKeySelective(SysRole record);

    int updateByPrimaryKey(SysRole record);
}