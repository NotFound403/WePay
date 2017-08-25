package cn.felord.wepay.ali.sdk.api.domain;

import cn.felord.wepay.ali.sdk.api.AlipayObject;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;

/**
 * 营销报表下载
 *
 * @author auto create
 * @version $Id: $Id
 */
public class KoubeiMarketingDataActivityBillDownloadModel extends AlipayObject {

	private static final long serialVersionUID = 5871941736727347361L;

	/**
	 * 活动id
	 */
	@ApiField("camp_id")
	private String campId;

	/**
	 * <p>Getter for the field <code>campId</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getCampId() {
		return this.campId;
	}
	/**
	 * <p>Setter for the field <code>campId</code>.</p>
	 *
	 * @param campId a {@link java.lang.String} object.
	 */
	public void setCampId(String campId) {
		this.campId = campId;
	}

}
