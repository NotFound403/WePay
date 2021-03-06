package cn.felord.wepay.ali.sdk.api.domain;

import cn.felord.wepay.ali.sdk.api.AlipayObject;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;

/**
 * 标准的兑换交易受理接口
 *
 * @author auto create
 * @version $Id: $Id
 */
public class AlipayAccountExrateAdviceAcceptModel extends AlipayObject {

    private static final long serialVersionUID = 4813466594586753352L;

    /**
     * 交易请求对象内容
     */
    @ApiField("advice")
    private AdviceVO advice;

    /**
     * Gets advice.
     *
     * @return the advice
     */
    public AdviceVO getAdvice() {
        return this.advice;
    }

    /**
     * Sets advice.
     *
     * @param advice the advice
     */
    public void setAdvice(AdviceVO advice) {
        this.advice = advice;
    }

}
