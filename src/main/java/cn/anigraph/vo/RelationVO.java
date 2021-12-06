package cn.anigraph.vo;

import cn.anigraph.po.Relation;
import org.springframework.beans.BeanUtils;

public class RelationVO {
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getSource() {
        return source;
    }

    public void setSource(Integer source) {
        this.source = source;
    }

    public Integer getTarget() {
        return target;
    }

    public void setTarget(Integer target) {
        this.target = target;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    private Integer id;
    private Integer source;
    private Integer target;
    private String name;
    private String type;

    public RelationVO(Relation relation){
        BeanUtils.copyProperties(relation, this);
    }

    @Override
    public boolean equals(Object object){
        if( object == null ) return false;
        if( !(object instanceof RelationVO) ) return false;
        RelationVO relationVO = (RelationVO) object;
        return this.id.equals(relationVO.getId()) && this.source.equals(relationVO.getSource()) && this.target.equals(relationVO.getTarget())
                && this.name.equals(relationVO.getName()) && this.type.equals(relationVO.getType());
    }

    @Override
    public int hashCode(){
        return 1 + 17 * this.source + 31 * this.id;
    }
}
