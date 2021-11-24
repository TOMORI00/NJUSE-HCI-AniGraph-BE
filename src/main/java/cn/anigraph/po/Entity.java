package cn.anigraph.po;

import java.sql.Date;

public class Entity {
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName_cn() {
        return name_cn;
    }

    public void setName_cn(String name_cn) {
        this.name_cn = name_cn;
    }

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getImage_grid() {
        return image_grid;
    }

    public void setImage_grid(String image_grid) {
        this.image_grid = image_grid;
    }

    public String getAlias() {
        return alias;
    }

    public void setAlias(String alias) {
        this.alias = alias;
    }

    public Date getAir_date() {
        return air_date;
    }

    public void setAir_date(Date air_date) {
        this.air_date = air_date;
    }

    public Integer getEp_num() {
        return ep_num;
    }

    public void setEp_num(Integer ep_num) {
        this.ep_num = ep_num;
    }

    private Integer id;
    private String url;
    private String name;
    private String name_cn;
    private String summary;
    private String image;
    private String image_grid;
    private String alias;
    private Date air_date;
    private Integer ep_num;
}
