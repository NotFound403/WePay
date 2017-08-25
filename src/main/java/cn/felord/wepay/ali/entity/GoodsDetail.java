package cn.felord.wepay.ali.entity;

/**
 * Created with IntelliJ IDEA.
 * Author: Dax
 * Description:
 * Date: 17-8-17
 * Time: 上午12:07
 *
 * @author lenovo
 * @version $Id: $Id
 */
public class GoodsDetail {
    private String goods_id;
    private String goods_name;
    private String quantity;
    private String price;
    private String goods_category;
    private String body;
    private String show_url;

    /**
     * <p>Getter for the field <code>goods_id</code>.</p>
     *
     * @return a {@link java.lang.String} object.
     */
    public String getGoods_id() {
        return goods_id;
    }

    /**
     * <p>Setter for the field <code>goods_id</code>.</p>
     *
     * @param goods_id a {@link java.lang.String} object.
     */
    public void setGoods_id(String goods_id) {
        this.goods_id = goods_id;
    }

    /**
     * <p>Getter for the field <code>goods_name</code>.</p>
     *
     * @return a {@link java.lang.String} object.
     */
    public String getGoods_name() {
        return goods_name;
    }

    /**
     * <p>Setter for the field <code>goods_name</code>.</p>
     *
     * @param goods_name a {@link java.lang.String} object.
     */
    public void setGoods_name(String goods_name) {
        this.goods_name = goods_name;
    }

    /**
     * <p>Getter for the field <code>quantity</code>.</p>
     *
     * @return a {@link java.lang.String} object.
     */
    public String getQuantity() {
        return quantity;
    }

    /**
     * <p>Setter for the field <code>quantity</code>.</p>
     *
     * @param quantity a {@link java.lang.String} object.
     */
    public void setQuantity(String quantity) {
        this.quantity = quantity;
    }

    /**
     * <p>Getter for the field <code>price</code>.</p>
     *
     * @return a {@link java.lang.String} object.
     */
    public String getPrice() {
        return price;
    }

    /**
     * <p>Setter for the field <code>price</code>.</p>
     *
     * @param price a {@link java.lang.String} object.
     */
    public void setPrice(String price) {
        this.price = price;
    }

    /**
     * <p>Getter for the field <code>goods_category</code>.</p>
     *
     * @return a {@link java.lang.String} object.
     */
    public String getGoods_category() {
        return goods_category;
    }

    /**
     * <p>Setter for the field <code>goods_category</code>.</p>
     *
     * @param goods_category a {@link java.lang.String} object.
     */
    public void setGoods_category(String goods_category) {
        this.goods_category = goods_category;
    }

    /**
     * <p>Getter for the field <code>body</code>.</p>
     *
     * @return a {@link java.lang.String} object.
     */
    public String getBody() {
        return body;
    }

    /**
     * <p>Setter for the field <code>body</code>.</p>
     *
     * @param body a {@link java.lang.String} object.
     */
    public void setBody(String body) {
        this.body = body;
    }

    /**
     * <p>Getter for the field <code>show_url</code>.</p>
     *
     * @return a {@link java.lang.String} object.
     */
    public String getShow_url() {
        return show_url;
    }

    /**
     * <p>Setter for the field <code>show_url</code>.</p>
     *
     * @param show_url a {@link java.lang.String} object.
     */
    public void setShow_url(String show_url) {
        this.show_url = show_url;
    }
}
