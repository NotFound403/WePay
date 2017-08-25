package cn.felord.wepay.ali.sdk.api.response;

import java.util.List;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiListField;
import cn.felord.wepay.ali.sdk.api.domain.StationDetailInfo;

import cn.felord.wepay.ali.sdk.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.cityfacilitator.station.query response.
 *
 * @author auto create
 * @version $Id: $Id
 */
public class AlipayCommerceCityfacilitatorStationQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 3784533328483746414L;

	/** 
	 * 支持设为起点的站点列表
	 */
	@ApiListField("support_starts")
	@ApiField("station_detail_info")
	private List<StationDetailInfo> supportStarts;

	/**
	 * <p>Setter for the field <code>supportStarts</code>.</p>
	 *
	 * @param supportStarts a {@link java.util.List} object.
	 */
	public void setSupportStarts(List<StationDetailInfo> supportStarts) {
		this.supportStarts = supportStarts;
	}
	/**
	 * <p>Getter for the field <code>supportStarts</code>.</p>
	 *
	 * @return a {@link java.util.List} object.
	 */
	public List<StationDetailInfo> getSupportStarts( ) {
		return this.supportStarts;
	}

}
