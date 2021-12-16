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
    ArrayList<Entity> searchEntityByNameCN(@Param("sname") String name);
    ArrayList<Entity> searchEntityByAlias(@Param("sname") String name);
    Entity getEntityById(@Param("id")int id);
    ArrayList<String> getMatchedEntityNamesJP(@Param("prefix")String prefix);
    ArrayList<String> getMatchedEntityNamesCN(@Param("prefix")String prefix);
    ArrayList<Entity> getExpandedSeries(@Param("id") int id);
}
