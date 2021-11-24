package cn.anigraph.controller;

import cn.anigraph.service.RelationService;
import cn.anigraph.vo.ResponseVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/relation")
public class RelationController {
    @Autowired
    private RelationService relationService;

    @GetMapping("/getRelationsByEntityId")
    public ResponseVO getRelationsByEntityId(@RequestParam("id")int id){
        return ResponseVO.buildSuccess(relationService.getRelationsByEntityId(id));
    }
}
