package cn.anigraph.service;

import cn.anigraph.vo.RelationVO;

import java.util.List;
import java.util.Map;

public interface RelationService {
    public Map<String, List<Object>> getRelationsByEntityId(int entityId);
}
