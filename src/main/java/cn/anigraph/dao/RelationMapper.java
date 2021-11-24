package cn.anigraph.dao;

import cn.anigraph.po.Relation;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;

@Mapper
@Repository
public interface RelationMapper {
    ArrayList<Relation> getRelationsByEntityId(@Param("entityId")int entityId);
}
