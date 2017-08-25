package cn.felord.wepay.ali.sdk.api.domain;

import cn.felord.wepay.ali.sdk.api.AlipayObject;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiListField;

import java.util.List;

/**
 * 广告推广用于参与接口
 *
 * @author auto create
 * @version $Id : $Id
 */
public class KoubeiAdvertCommissionAdvertPurchaseModel extends AlipayObject {

    private static final long serialVersionUID = 2853799552312438491L;

    /**
     * 渠道ID
     */
    @ApiField("channel_id")
    private String channelId;

    /**
     * 外部用户唯一标识(用于生成校验码，只有白名单ISV才可不填)
     */
    @ApiField("out_unique_id")
    private String outUniqueId;

    /**
     * 校验码（只有白名单ISV才可不填）
     * <p>
     * 生成地址：
     * http://pin.aliyun.com/get_img
     * 参数：
     * sessionid-外部用户唯一标识(和上面的out_unique_id保持一致)
     * identity-固定值，请输入kbadvert
     * type-验证码图片类型
     * 【type取值说明】
     * type - 内容 - 尺寸
     * default  4位数字 大小写  100x30
     * number   6位纯数字 - 100x30
     * 150_40  4位数字 大小写  150x40
     * <p>
     * 请求示例：<a href="http://pin.aliyun.com/get_img?sessionid=13000000000&identity=kbadvert&type=default">参考文档</a>。
     * <p>
     * 验证码校验地址示例：<a href="http://pin.aliyun.com/check_code?sessionid=13000000000&identity=kbadvert&code=PNRT">参考文档</a>。
     */
    @ApiField("security_code")
    private String securityCode;

    /**
     * 推广参与打标(无实际业务作用，后期可供ISV分析不同渠道的推广效能)
     */
    @ApiField("tag")
    private String tag;

    /**
     * 参与主键列表
     * trigger_identify_type=advert所有值都必须是广告ID
     */
    @ApiListField("trigger_identifies")
    @ApiField("string")
    private List<String> triggerIdentifies;

    /**
     * 参与主键类型
     * advert-广告ID
     */
    @ApiField("trigger_identify_type")
    private String triggerIdentifyType;

    /**
     * 用户身份主键
     * user_identify_type=phone-值必须是用户手机号
     * user_identify_type=logon_id-值必须是用户支付宝登录账号
     */
    @ApiField("user_identify")
    private String userIdentify;

    /**
     * 用户身份主键类型
     * phone-手机号
     * logon_id-支付宝登录账号
     * user_id - 支付宝账户ID
     */
    @ApiField("user_identify_type")
    private String userIdentifyType;

    /**
     * <p>Getter for the field <code>channelId</code>.</p>
     *
     * @return a {@link java.lang.String} object.
     */
    public String getChannelId() {
        return this.channelId;
    }

    /**
     * <p>Setter for the field <code>channelId</code>.</p>
     *
     * @param channelId a {@link java.lang.String} object.
     */
    public void setChannelId(String channelId) {
        this.channelId = channelId;
    }

    /**
     * <p>Getter for the field <code>outUniqueId</code>.</p>
     *
     * @return a {@link java.lang.String} object.
     */
    public String getOutUniqueId() {
        return this.outUniqueId;
    }

    /**
     * <p>Setter for the field <code>outUniqueId</code>.</p>
     *
     * @param outUniqueId a {@link java.lang.String} object.
     */
    public void setOutUniqueId(String outUniqueId) {
        this.outUniqueId = outUniqueId;
    }

    /**
     * <p>Getter for the field <code>securityCode</code>.</p>
     *
     * @return a {@link java.lang.String} object.
     */
    public String getSecurityCode() {
        return this.securityCode;
    }

    /**
     * <p>Setter for the field <code>securityCode</code>.</p>
     *
     * @param securityCode a {@link java.lang.String} object.
     */
    public void setSecurityCode(String securityCode) {
        this.securityCode = securityCode;
    }

    /**
     * <p>Getter for the field <code>tag</code>.</p>
     *
     * @return a {@link java.lang.String} object.
     */
    public String getTag() {
        return this.tag;
    }

    /**
     * <p>Setter for the field <code>tag</code>.</p>
     *
     * @param tag a {@link java.lang.String} object.
     */
    public void setTag(String tag) {
        this.tag = tag;
    }

    /**
     * <p>Getter for the field <code>triggerIdentifies</code>.</p>
     *
     * @return a {@link java.util.List} object.
     */
    public List<String> getTriggerIdentifies() {
        return this.triggerIdentifies;
    }

    /**
     * <p>Setter for the field <code>triggerIdentifies</code>.</p>
     *
     * @param triggerIdentifies a {@link java.util.List} object.
     */
    public void setTriggerIdentifies(List<String> triggerIdentifies) {
        this.triggerIdentifies = triggerIdentifies;
    }

    /**
     * <p>Getter for the field <code>triggerIdentifyType</code>.</p>
     *
     * @return a {@link java.lang.String} object.
     */
    public String getTriggerIdentifyType() {
        return this.triggerIdentifyType;
    }

    /**
     * <p>Setter for the field <code>triggerIdentifyType</code>.</p>
     *
     * @param triggerIdentifyType a {@link java.lang.String} object.
     */
    public void setTriggerIdentifyType(String triggerIdentifyType) {
        this.triggerIdentifyType = triggerIdentifyType;
    }

    /**
     * <p>Getter for the field <code>userIdentify</code>.</p>
     *
     * @return a {@link java.lang.String} object.
     */
    public String getUserIdentify() {
        return this.userIdentify;
    }

    /**
     * <p>Setter for the field <code>userIdentify</code>.</p>
     *
     * @param userIdentify a {@link java.lang.String} object.
     */
    public void setUserIdentify(String userIdentify) {
        this.userIdentify = userIdentify;
    }

    /**
     * <p>Getter for the field <code>userIdentifyType</code>.</p>
     *
     * @return a {@link java.lang.String} object.
     */
    public String getUserIdentifyType() {
        return this.userIdentifyType;
    }

    /**
     * <p>Setter for the field <code>userIdentifyType</code>.</p>
     *
     * @param userIdentifyType a {@link java.lang.String} object.
     */
    public void setUserIdentifyType(String userIdentifyType) {
        this.userIdentifyType = userIdentifyType;
    }

}
