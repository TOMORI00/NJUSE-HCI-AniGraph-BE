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
        List<Entity> list = entityMapper.searchEntityByName(name);
        if(list.size() == 0) return new ArrayList<>();
        return list.stream().map(x -> new EntityVO(x)).distinct().collect(Collectors.toList());
    }

}
