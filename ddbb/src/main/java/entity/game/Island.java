package entity.game;

/**
 * 岛屿
 */
public class Island {

    private String id;
    private String name;            //岛名
    private double area;            //岛屿面积
    private double enableArea;      //可用面积      用来建造建筑，农田使用
    private double disableArea;     //不可用面积     用来放牧
    private Integer longitude;      //经度（游戏）
    private Integer latitude;       //纬度（游戏）
    private double fertile;         //肥沃度
    private String description;     //描述

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public double getEnableArea() {
        return enableArea;
    }

    public void setEnableArea(double enableArea) {
        this.enableArea = enableArea;
    }

    public double getDisableArea() {
        return disableArea;
    }

    public void setDisableArea(double disableArea) {
        this.disableArea = disableArea;
    }

    public Integer getLongitude() {
        return longitude;
    }

    public void setLongitude(Integer longitude) {
        this.longitude = longitude;
    }

    public Integer getLatitude() {
        return latitude;
    }

    public void setLatitude(Integer latitude) {
        this.latitude = latitude;
    }

    public double getFertile() {
        return fertile;
    }

    public void setFertile(double fertile) {
        this.fertile = fertile;
    }
}
