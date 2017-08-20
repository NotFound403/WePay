package cn.felord.wepay.ali.sdk.api.domain;

import cn.felord.wepay.ali.sdk.api.AlipayObject;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;

/**
 * 经营参谋会员人物画像查询
 *
 * @author auto create
 * @since 1.0, 2017-07-21 10:27:15
 */
public class KoubeiMarketingDataBizadviserMemberprofileQueryModel extends AlipayObject {

	private static final long serialVersionUID = 2652224859598155518L;

	/**
	 * 会员分层，可传 ALL/4/3/2/1  五个值
传ALL查询所有分层的汇总；
传4查询 流失客层级的；
传3查询 过客层级的；
传2查询 新客层级的；
传1查询 回头客层级的；
	 */
	@ApiField("member_grade")
	private String memberGrade;

	public String getMemberGrade() {
		return this.memberGrade;
	}
	public void setMemberGrade(String memberGrade) {
		this.memberGrade = memberGrade;
	}

}
