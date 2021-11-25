package cn.anigraph.service;

import cn.anigraph.vo.EntityVO;

import java.util.List;

public interface EntityService {
    List<EntityVO> searchEntityByName(String name);
    List<String> getMatchedEntityNames(String prefix);
}
