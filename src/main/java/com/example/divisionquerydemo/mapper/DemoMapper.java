package com.example.divisionquerydemo.mapper;

import com.example.divisionquerydemo.pojo.DemoEntity;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

/**
 * @author wang
 */
@Mapper
public interface DemoMapper {
    
    @Select("select * from db_division_manage.tb_demo where id = #{id}")
    DemoEntity getById(@Param("id") Long id);
    
    @Select("<script>"
            + "select * from db_division_manage.tb_demo "
            + "where 1=1 "
            + "<if test='params != null'>"
            + "<foreach collection='params.entrySet()' index='key' item='value'> "
            + " AND ${key} LIKE concat('%',#{value,jdbcType=VARCHAR},'%') "
            + "</foreach>"
            + "</if>"
            + "</script>")
    List<DemoEntity> list(@Param("params") Map<String,String> params);
}
