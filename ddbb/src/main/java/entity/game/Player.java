package entity.game;

/**
 * 玩家实体
 */
public class Player extends People{


    private String id;
    private String playNme;         //游戏名
    private double money;           //充值钱币
    private int level;              //等级
    private Navigator navigator;    //导航器
    private Integer longitude;      //经度（游戏）
    private Integer latitude;       //纬度（游戏）



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

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPlayNme() {
        return playNme;
    }

    public void setPlayNme(String playNme) {
        this.playNme = playNme;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }

    public Navigator getNavigator() {
        return navigator;
    }

    public void setNavigator(Navigator navigator) {
        this.navigator = navigator;
    }
}
