package cn.felord.wepay.ali.sdk.api.domain;

import cn.felord.wepay.ali.sdk.api.AlipayObject;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;

/**
 * 商家给用户赠送彩票，由亚博科技提供服务
 *
 * @author auto create
 * @version $Id: $Id
 */
public class AlipayCommerceLotteryPresentSendModel extends AlipayObject {

    private static final long serialVersionUID = 4336951475484511159L;

    /**
     * 被赠送彩票的支付宝用户的ID，不支持一次赠送给多个用户
     */
    @ApiField("alipay_user_id")
    private String alipayUserId;

    /**
     * 彩种ID
     */
    @ApiField("lottery_type_id")
    private Long lotteryTypeId;

    /**
     * 外部订单号，不超过255字符，可包含英文和数字，需保证在商户端不重复
     */
    @ApiField("out_order_no")
    private String outOrderNo;

    /**
     * 彩票注数，大于0，最大为100
     */
    @ApiField("stake_count")
    private Long stakeCount;

    /**
     * 赠言，不超过20个汉字
     */
    @ApiField("swety_words")
    private String swetyWords;

    /**
     * Gets alipay user id.
     *
     * @return the alipay user id
     */
    public String getAlipayUserId() {
        return this.alipayUserId;
    }

    /**
     * Sets alipay user id.
     *
     * @param alipayUserId the alipay user id
     */
    public void setAlipayUserId(String alipayUserId) {
        this.alipayUserId = alipayUserId;
    }

    /**
     * Gets lottery type id.
     *
     * @return the lottery type id
     */
    public Long getLotteryTypeId() {
        return this.lotteryTypeId;
    }

    /**
     * Sets lottery type id.
     *
     * @param lotteryTypeId the lottery type id
     */
    public void setLotteryTypeId(Long lotteryTypeId) {
        this.lotteryTypeId = lotteryTypeId;
    }

    /**
     * Gets out order no.
     *
     * @return the out order no
     */
    public String getOutOrderNo() {
        return this.outOrderNo;
    }

    /**
     * Sets out order no.
     *
     * @param outOrderNo the out order no
     */
    public void setOutOrderNo(String outOrderNo) {
        this.outOrderNo = outOrderNo;
    }

    /**
     * Gets stake count.
     *
     * @return the stake count
     */
    public Long getStakeCount() {
        return this.stakeCount;
    }

    /**
     * Sets stake count.
     *
     * @param stakeCount the stake count
     */
    public void setStakeCount(Long stakeCount) {
        this.stakeCount = stakeCount;
    }

    /**
     * Gets swety words.
     *
     * @return the swety words
     */
    public String getSwetyWords() {
        return this.swetyWords;
    }

    /**
     * Sets swety words.
     *
     * @param swetyWords the swety words
     */
    public void setSwetyWords(String swetyWords) {
        this.swetyWords = swetyWords;
    }

}
