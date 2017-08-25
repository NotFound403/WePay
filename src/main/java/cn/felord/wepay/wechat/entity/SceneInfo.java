package cn.felord.wepay.wechat.entity;

import java.io.Serializable;

/**
 * Created with IntelliJ IDEA.
 * Author: Dax
 * Description:场景信息
 * Date: 17-8-20
 * Time: 上午12:20
 *
 * @author lenovo
 * @version $Id: $Id
 */
public class SceneInfo implements Serializable {
    private static final long serialVersionUID = -8262820123078436238L;
    private String id;
    private String name;
    private String area_code;
    private String address;

    /**
     * <p>Getter for the field <code>id</code>.</p>
     *
     * @return a {@link java.lang.String} object.
     */
    public String getId() {
        return id;
    }

    /**
     * <p>Setter for the field <code>id</code>.</p>
     *
     * @param id a {@link java.lang.String} object.
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * <p>Getter for the field <code>name</code>.</p>
     *
     * @return a {@link java.lang.String} object.
     */
    public String getName() {
        return name;
    }

    /**
     * <p>Setter for the field <code>name</code>.</p>
     *
     * @param name a {@link java.lang.String} object.
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>Getter for the field <code>area_code</code>.</p>
     *
     * @return a {@link java.lang.String} object.
     */
    public String getArea_code() {
        return area_code;
    }

    /**
     * <p>Setter for the field <code>area_code</code>.</p>
     *
     * @param area_code a {@link java.lang.String} object.
     */
    public void setArea_code(String area_code) {
        this.area_code = area_code;
    }

    /**
     * <p>Getter for the field <code>address</code>.</p>
     *
     * @return a {@link java.lang.String} object.
     */
    public String getAddress() {
        return address;
    }

    /**
     * <p>Setter for the field <code>address</code>.</p>
     *
     * @param address a {@link java.lang.String} object.
     */
    public void setAddress(String address) {
        this.address = address;
    }

    /** {@inheritDoc} */
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
