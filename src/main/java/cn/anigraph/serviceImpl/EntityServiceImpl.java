package cn.anigraph.serviceImpl;

import cn.anigraph.dao.EntityMapper;
import cn.anigraph.po.Entity;
import cn.anigraph.service.EntityService;
import cn.anigraph.vo.EntityVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class EntityServiceImpl implements EntityService {
    @Autowired
    private EntityMapper entityMapper;

    public List<EntityVO> searchEntityByName(String name) {
        System.out.println("Starting Searching for: "+name);
        List<Entity> list = entityMapper.searchEntityByNameCN(name);
        list.addAll(entityMapper.searchEntityByName(name));
        list.addAll(entityMapper.searchEntityByAlias(name));
        if(list.size() == 0) return new ArrayList<>();
        List<Entity> expanded = new ArrayList<>();
        List<Integer> indexId = new ArrayList<>();
        list = list.stream().distinct().collect(Collectors.toList());
        list.stream().forEach((Entity e) -> {
            expanded.addAll(entityMapper.getExpandedSeries(e.getId()));
        });
        list.addAll(expanded.stream().distinct().collect(Collectors.toList()));
        return list.stream().map(x -> new EntityVO(x)).distinct().collect(Collectors.toList());
    }

    public List<String> getMatchedEntityNames(String prefix){
        List<String> list = entityMapper.getMatchedEntityNamesCN(prefix);
        list.addAll(entityMapper.getMatchedEntityNamesJP(prefix));
        return list.stream().distinct().collect(Collectors.toList());
    }


}
