package cn.anigraph.serviceImpl;

import cn.anigraph.dao.EntityMapper;
import cn.anigraph.dao.RelationMapper;
import cn.anigraph.po.Entity;
import cn.anigraph.po.Relation;
import cn.anigraph.service.RelationService;
import cn.anigraph.vo.EntityVO;
import cn.anigraph.vo.RelationVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@Service
public class RelationServiceImpl implements RelationService {
    @Autowired
    private RelationMapper relationMapper;
    @Autowired
    private EntityMapper entityMapper;

    @Override
    public Map<String, List<Object>> getRelationsByEntityId(int entityId) {
        List<Relation> list = relationMapper.getRelationsByEntityId(entityId);
        List<Entity> entities = new ArrayList<>();
        entities.add(entityMapper.getEntityById(entityId));
        Map<String, List<Object>> ret = new HashMap<>();
        if(list.size() == 0){
            ret.put("Entities", entities.stream().map(x -> new EntityVO(x)).collect(Collectors.toList()));
            ret.put("Relations", new ArrayList<>());
            return ret;
        }
        ret.put("Relations", list.stream().map(x -> new RelationVO(x)).distinct().collect(Collectors.toList()));
        for(Relation relation : list){
            entities.add(entityMapper.getEntityById(relation.getSource() == entityId ? relation.getTarget() : relation.getSource()));
        }
        ret.put("Entities", entities.stream().map(x -> new EntityVO(x)).distinct().collect(Collectors.toList()));
        return ret;
    }
}
