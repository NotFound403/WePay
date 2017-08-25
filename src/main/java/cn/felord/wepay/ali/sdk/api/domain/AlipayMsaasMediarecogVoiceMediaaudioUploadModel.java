package cn.felord.wepay.ali.sdk.api.domain;

import cn.felord.wepay.ali.sdk.api.AlipayObject;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;

/**
 * 媒体实时上传音频流接口
 *
 * @author auto create
 * @version $Id: $Id
 */
public class AlipayMsaasMediarecogVoiceMediaaudioUploadModel extends AlipayObject {

	private static final long serialVersionUID = 1689759379178625867L;

	/**
	 * base64编码的声音数据
	 */
	@ApiField("data")
	private String data;

	/**
	 * 扩展字段
	 */
	@ApiField("extinfo_a")
	private String extinfoA;

	/**
	 * 扩展字段
	 */
	@ApiField("extinfo_b")
	private String extinfoB;

	/**
	 * 扩展字段
	 */
	@ApiField("extinfo_c")
	private String extinfoC;

	/**
	 * 扩展字段
	 */
	@ApiField("extinfo_d")
	private String extinfoD;

	/**
	 * 时间戳
	 */
	@ApiField("labeltime")
	private String labeltime;

	/**
	 * 媒体名称
	 */
	@ApiField("vname")
	private String vname;

	/**
	 * 媒体类型
	 */
	@ApiField("vtype")
	private String vtype;

	/**
	 * <p>Getter for the field <code>data</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getData() {
		return this.data;
	}
	/**
	 * <p>Setter for the field <code>data</code>.</p>
	 *
	 * @param data a {@link java.lang.String} object.
	 */
	public void setData(String data) {
		this.data = data;
	}

	/**
	 * <p>Getter for the field <code>extinfoA</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getExtinfoA() {
		return this.extinfoA;
	}
	/**
	 * <p>Setter for the field <code>extinfoA</code>.</p>
	 *
	 * @param extinfoA a {@link java.lang.String} object.
	 */
	public void setExtinfoA(String extinfoA) {
		this.extinfoA = extinfoA;
	}

	/**
	 * <p>Getter for the field <code>extinfoB</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getExtinfoB() {
		return this.extinfoB;
	}
	/**
	 * <p>Setter for the field <code>extinfoB</code>.</p>
	 *
	 * @param extinfoB a {@link java.lang.String} object.
	 */
	public void setExtinfoB(String extinfoB) {
		this.extinfoB = extinfoB;
	}

	/**
	 * <p>Getter for the field <code>extinfoC</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getExtinfoC() {
		return this.extinfoC;
	}
	/**
	 * <p>Setter for the field <code>extinfoC</code>.</p>
	 *
	 * @param extinfoC a {@link java.lang.String} object.
	 */
	public void setExtinfoC(String extinfoC) {
		this.extinfoC = extinfoC;
	}

	/**
	 * <p>Getter for the field <code>extinfoD</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getExtinfoD() {
		return this.extinfoD;
	}
	/**
	 * <p>Setter for the field <code>extinfoD</code>.</p>
	 *
	 * @param extinfoD a {@link java.lang.String} object.
	 */
	public void setExtinfoD(String extinfoD) {
		this.extinfoD = extinfoD;
	}

	/**
	 * <p>Getter for the field <code>labeltime</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getLabeltime() {
		return this.labeltime;
	}
	/**
	 * <p>Setter for the field <code>labeltime</code>.</p>
	 *
	 * @param labeltime a {@link java.lang.String} object.
	 */
	public void setLabeltime(String labeltime) {
		this.labeltime = labeltime;
	}

	/**
	 * <p>Getter for the field <code>vname</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getVname() {
		return this.vname;
	}
	/**
	 * <p>Setter for the field <code>vname</code>.</p>
	 *
	 * @param vname a {@link java.lang.String} object.
	 */
	public void setVname(String vname) {
		this.vname = vname;
	}

	/**
	 * <p>Getter for the field <code>vtype</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getVtype() {
		return this.vtype;
	}
	/**
	 * <p>Setter for the field <code>vtype</code>.</p>
	 *
	 * @param vtype a {@link java.lang.String} object.
	 */
	public void setVtype(String vtype) {
		this.vtype = vtype;
	}

}
