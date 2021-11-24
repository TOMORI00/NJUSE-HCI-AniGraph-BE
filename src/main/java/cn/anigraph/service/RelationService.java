package cn.anigraph.service;

import cn.anigraph.vo.RelationVO;

import java.util.List;

public interface RelationService {
    public List<RelationVO> getRelationsByEntityId(int entityId);
}
