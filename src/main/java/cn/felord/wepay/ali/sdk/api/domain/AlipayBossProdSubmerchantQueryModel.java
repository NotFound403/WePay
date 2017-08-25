package cn.felord.wepay.ali.sdk.api.domain;

import cn.felord.wepay.ali.sdk.api.AlipayObject;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;

/**
 * 商户查询接口
 *
 * @author auto create
 * @version $Id: $Id
 */
public class AlipayBossProdSubmerchantQueryModel extends AlipayObject {

    private static final long serialVersionUID = 5139788158322787755L;

    /**
     * 受理商户在受理机构下的唯一标识，与sub_merchant_id二选一必传
     */
    @ApiField("external_id")
    private String externalId;

    /**
     * 受理商户在支付宝入驻后的识别号，商户入驻后由支付宝返回，与external_id二选一必传
     */
    @ApiField("sub_merchant_id")
    private String subMerchantId;

    /**
     * Gets external id.
     *
     * @return the external id
     */
    public String getExternalId() {
        return this.externalId;
    }

    /**
     * Sets external id.
     *
     * @param externalId the external id
     */
    public void setExternalId(String externalId) {
        this.externalId = externalId;
    }

    /**
     * Gets sub merchant id.
     *
     * @return the sub merchant id
     */
    public String getSubMerchantId() {
        return this.subMerchantId;
    }

    /**
     * Sets sub merchant id.
     *
     * @param subMerchantId the sub merchant id
     */
    public void setSubMerchantId(String subMerchantId) {
        this.subMerchantId = subMerchantId;
    }

}
