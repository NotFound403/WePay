package cn.felord.wepay.ali.sdk.api.domain;

import cn.felord.wepay.ali.sdk.api.AlipayObject;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;

/**
 * 上数元数据信息同步服务
 *
 * @author auto create
 * @version $Id: $Id
 */
public class SsdataDataserviceMetainfoSyncModel extends AlipayObject {

	private static final long serialVersionUID = 2558899534729639981L;

	/**
	 * 元数据信息
	 */
	@ApiField("meta_info")
	private String metaInfo;

	/**
	 * <p>Getter for the field <code>metaInfo</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getMetaInfo() {
		return this.metaInfo;
	}
	/**
	 * <p>Setter for the field <code>metaInfo</code>.</p>
	 *
	 * @param metaInfo a {@link java.lang.String} object.
	 */
	public void setMetaInfo(String metaInfo) {
		this.metaInfo = metaInfo;
	}

}
