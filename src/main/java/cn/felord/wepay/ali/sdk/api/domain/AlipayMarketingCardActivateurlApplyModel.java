package cn.felord.wepay.ali.sdk.api.domain;

import cn.felord.wepay.ali.sdk.api.AlipayObject;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;

/**
 * 会员卡领卡链接获取接口
 *
 * @author auto create
 * @version $Id : $Id
 */
public class AlipayMarketingCardActivateurlApplyModel extends AlipayObject {

    private static final long serialVersionUID = 1473629646238645844L;

    /**
     * 会员卡开卡表单提交后回调地址。
     * 1.该地址不可带参数，如需回传参数，可设置out_string入参。
     */
    @ApiField("callback")
    private String callback;

    /**
     * 需要关注的生活号AppId。若需要在领卡页面展示“关注生活号”提示，可设置此参数为待关注的生活号AppId。
     *
     * @see <a href="https://doc.open.alipay.com/docs/doc.htm?treeId=193&articleId=105933&docType=1">生活号快速接入详见</a>
     */
    @ApiField("follow_app_id")
    private String followAppId;

    /**
     * 扩展信息，会员领卡完成后将此参数原样带回商户页面。
     */
    @ApiField("out_string")
    private String outString;

    /**
     * 会员卡模板id。使用会员卡模板创建接口(alipay.marketing.card.template.create)返回的结果
     */
    @ApiField("template_id")
    private String templateId;

    /**
     * <p>Getter for the field <code>callback</code>.</p>
     *
     * @return a {@link java.lang.String} object.
     */
    public String getCallback() {
        return this.callback;
    }

    /**
     * <p>Setter for the field <code>callback</code>.</p>
     *
     * @param callback a {@link java.lang.String} object.
     */
    public void setCallback(String callback) {
        this.callback = callback;
    }

    /**
     * <p>Getter for the field <code>followAppId</code>.</p>
     *
     * @return a {@link java.lang.String} object.
     */
    public String getFollowAppId() {
        return this.followAppId;
    }

    /**
     * <p>Setter for the field <code>followAppId</code>.</p>
     *
     * @param followAppId a {@link java.lang.String} object.
     */
    public void setFollowAppId(String followAppId) {
        this.followAppId = followAppId;
    }

    /**
     * <p>Getter for the field <code>outString</code>.</p>
     *
     * @return a {@link java.lang.String} object.
     */
    public String getOutString() {
        return this.outString;
    }

    /**
     * <p>Setter for the field <code>outString</code>.</p>
     *
     * @param outString a {@link java.lang.String} object.
     */
    public void setOutString(String outString) {
        this.outString = outString;
    }

    /**
     * <p>Getter for the field <code>templateId</code>.</p>
     *
     * @return a {@link java.lang.String} object.
     */
    public String getTemplateId() {
        return this.templateId;
    }

    /**
     * <p>Setter for the field <code>templateId</code>.</p>
     *
     * @param templateId a {@link java.lang.String} object.
     */
    public void setTemplateId(String templateId) {
        this.templateId = templateId;
    }

}
