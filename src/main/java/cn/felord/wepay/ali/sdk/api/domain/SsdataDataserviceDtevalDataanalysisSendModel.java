package cn.felord.wepay.ali.sdk.api.domain;

import cn.felord.wepay.ali.sdk.api.AlipayObject;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;

/**
 * 数据报告服务数据传输接口
 *
 * @author auto create
 * @version $Id: $Id
 */
public class SsdataDataserviceDtevalDataanalysisSendModel extends AlipayObject {

	private static final long serialVersionUID = 5397974976619893756L;

	/**
	 * 业务编号, 唯一流水标识
	 */
	@ApiField("biz_number")
	private String bizNumber;

	/**
	 * 业务来源，暂只支持上数来源数据流入
	 */
	@ApiField("biz_source")
	private String bizSource;

	/**
	 * 授权采集数据，爬取的完整数据加部分业务标识信息
	 */
	@ApiField("data_content")
	private String dataContent;

	/**
	 * 处理业务类型，包括运营商、公积金等
	 */
	@ApiField("process_biz_type")
	private String processBizType;

	/**
	 * <p>Getter for the field <code>bizNumber</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getBizNumber() {
		return this.bizNumber;
	}
	/**
	 * <p>Setter for the field <code>bizNumber</code>.</p>
	 *
	 * @param bizNumber a {@link java.lang.String} object.
	 */
	public void setBizNumber(String bizNumber) {
		this.bizNumber = bizNumber;
	}

	/**
	 * <p>Getter for the field <code>bizSource</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getBizSource() {
		return this.bizSource;
	}
	/**
	 * <p>Setter for the field <code>bizSource</code>.</p>
	 *
	 * @param bizSource a {@link java.lang.String} object.
	 */
	public void setBizSource(String bizSource) {
		this.bizSource = bizSource;
	}

	/**
	 * <p>Getter for the field <code>dataContent</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getDataContent() {
		return this.dataContent;
	}
	/**
	 * <p>Setter for the field <code>dataContent</code>.</p>
	 *
	 * @param dataContent a {@link java.lang.String} object.
	 */
	public void setDataContent(String dataContent) {
		this.dataContent = dataContent;
	}

	/**
	 * <p>Getter for the field <code>processBizType</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getProcessBizType() {
		return this.processBizType;
	}
	/**
	 * <p>Setter for the field <code>processBizType</code>.</p>
	 *
	 * @param processBizType a {@link java.lang.String} object.
	 */
	public void setProcessBizType(String processBizType) {
		this.processBizType = processBizType;
	}

}
