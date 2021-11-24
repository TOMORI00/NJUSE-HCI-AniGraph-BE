package cn.anigraph.serviceImpl;

import cn.anigraph.dao.RelationMapper;
import cn.anigraph.po.Relation;
import cn.anigraph.service.RelationService;
import cn.anigraph.vo.RelationVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class RelationServiceImpl implements RelationService {
    @Autowired
    private RelationMapper relationMapper;

    @Override
    public List<RelationVO> getRelationsByEntityId(int entityId) {
        List<Relation> list = relationMapper.getRelationsByEntityId(entityId);
        if(list.size() == 0) return new ArrayList<>();
        return list.stream().map(x -> new RelationVO(x)).collect(Collectors.toList());
    }
}
