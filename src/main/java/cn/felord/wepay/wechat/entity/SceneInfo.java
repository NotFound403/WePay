package cn.felord.wepay.wechat.entity;

import java.io.Serializable;

/**
 * Created with IntelliJ IDEA.
 * Author: Dax
 * Description:场景信息
 * Date: 17-8-20
 * Time: 上午12:20
 */


public class SceneInfo implements Serializable {
    private static final long serialVersionUID = -8262820123078436238L;
    private String id;
    private String name;
    private String area_code;
    private String address;

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

    public String getArea_code() {
        return area_code;
    }

    public void setArea_code(String area_code) {
        this.area_code = area_code;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "{" +
                "id:" + id +
                ", name:" + name +
                ", area_code:" + area_code +
                ", address:" + address +
                '}';
    }
}
