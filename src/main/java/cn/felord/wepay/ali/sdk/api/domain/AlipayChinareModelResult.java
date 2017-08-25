package cn.felord.wepay.ali.sdk.api.domain;

import cn.felord.wepay.ali.sdk.api.AlipayObject;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;

/**
 * 中再核保查询结果
 *
 * @author auto create
 * @version $Id: $Id
 */
public class AlipayChinareModelResult extends AlipayObject {

    private static final long serialVersionUID = 1263371637723426919L;

    /**
     * 体检记录id
     */
    @ApiField("id")
    private String id;

    /**
     * 规则id
     */
    @ApiField("rule_id")
    private String ruleId;

    /**
     * 核保结果
     */
    @ApiField("rule_result")
    private String ruleResult;

    /**
     * 交易流水记录id
     */
    @ApiField("trans_id")
    private String transId;

    /**
     * Gets id.
     *
     * @return the id
     */
    public String getId() {
        return this.id;
    }

    /**
     * Sets id.
     *
     * @param id the id
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * Gets rule id.
     *
     * @return the rule id
     */
    public String getRuleId() {
        return this.ruleId;
    }

    /**
     * Sets rule id.
     *
     * @param ruleId the rule id
     */
    public void setRuleId(String ruleId) {
        this.ruleId = ruleId;
    }

    /**
     * Gets rule result.
     *
     * @return the rule result
     */
    public String getRuleResult() {
        return this.ruleResult;
    }

    /**
     * Sets rule result.
     *
     * @param ruleResult the rule result
     */
    public void setRuleResult(String ruleResult) {
        this.ruleResult = ruleResult;
    }

    /**
     * Gets trans id.
     *
     * @return the trans id
     */
    public String getTransId() {
        return this.transId;
    }

    /**
     * Sets trans id.
     *
     * @param transId the trans id
     */
    public void setTransId(String transId) {
        this.transId = transId;
    }

}
