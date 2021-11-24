package cn.anigraph.dao;

import cn.anigraph.po.Entity;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;

@Mapper
@Repository
public interface EntityMapper {

    ArrayList<Entity> searchEntityByName(@Param("sname") String name);

}
