package cn.felord.wepay.ali.sdk.api.domain;

import cn.felord.wepay.ali.sdk.api.AlipayObject;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;

/**
 * 支付宝用户冻结明细信息
 *
 * @author auto create
 * @version $Id: $Id
 */
public class AccountFreeze extends AlipayObject {

    private static final long serialVersionUID = 5811986779231519774L;

    /**
     * 冻结金额
     */
    @ApiField("freeze_amount")
    private String freezeAmount;

    /**
     * 冻结类型名称
     */
    @ApiField("freeze_name")
    private String freezeName;

    /**
     * 冻结类型值
     */
    @ApiField("freeze_type")
    private String freezeType;

    /**
     * Gets freeze amount.
     *
     * @return the freeze amount
     */
    public String getFreezeAmount() {
        return this.freezeAmount;
    }

    /**
     * Sets freeze amount.
     *
     * @param freezeAmount the freeze amount
     */
    public void setFreezeAmount(String freezeAmount) {
        this.freezeAmount = freezeAmount;
    }

    /**
     * Gets freeze name.
     *
     * @return the freeze name
     */
    public String getFreezeName() {
        return this.freezeName;
    }

    /**
     * Sets freeze name.
     *
     * @param freezeName the freeze name
     */
    public void setFreezeName(String freezeName) {
        this.freezeName = freezeName;
    }

    /**
     * Gets freeze type.
     *
     * @return the freeze type
     */
    public String getFreezeType() {
        return this.freezeType;
    }

    /**
     * Sets freeze type.
     *
     * @param freezeType the freeze type
     */
    public void setFreezeType(String freezeType) {
        this.freezeType = freezeType;
    }

}
