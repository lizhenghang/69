package entity.sys;

/**
 * 账户玩家
 */
public class Account {

    private String id;
    private String username;        //用户名
    private String password;        //密码
    private String tel;             //电话
    private String qq;              //QQ
    private String wechat;          //微信
    private String alipay;          //支付宝
    private String iCard;           //身份证号
    private String email;           //邮箱

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getQq() {
        return qq;
    }

    public void setQq(String qq) {
        this.qq = qq;
    }

    public String getWechat() {
        return wechat;
    }

    public void setWechat(String wechat) {
        this.wechat = wechat;
    }

    public String getAlipay() {
        return alipay;
    }

    public void setAlipay(String alipay) {
        this.alipay = alipay;
    }

    public String getiCard() {
        return iCard;
    }

    public void setiCard(String iCard) {
        this.iCard = iCard;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
