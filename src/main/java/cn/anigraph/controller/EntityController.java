package cn.anigraph.controller;

import cn.anigraph.service.EntityService;
import cn.anigraph.vo.EntityVO;
import cn.anigraph.vo.ResponseVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/entity")
public class EntityController {
    @Autowired
    private EntityService entityService;

    @GetMapping("/searchEntityByName")
    public ResponseVO searchEntityByName(@RequestParam("name") String name){
        return ResponseVO.buildSuccess(entityService.searchEntityByName(name));
    }

    @GetMapping("/getSearchEntityCandidate")
    public ResponseVO getSearchEntityCandidate(@RequestParam("name") String prefix){
        return ResponseVO.buildSuccess(entityService.getMatchedEntityNames(prefix));
    }
}
