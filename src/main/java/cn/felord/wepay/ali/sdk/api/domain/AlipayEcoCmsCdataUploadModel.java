package cn.felord.wepay.ali.sdk.api.domain;

import java.util.Date;

import cn.felord.wepay.ali.sdk.api.AlipayObject;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;

/**
 * 上传投放消息
 *
 * @author auto create
 * @version $Id: $Id
 */
public class AlipayEcoCmsCdataUploadModel extends AlipayObject {

	private static final long serialVersionUID = 5865451719332358353L;

	/**
	 * 属性-消息投放的单个行业页面(如教育的某个幼儿园)
	 */
	@ApiField("attribute")
	private String attribute;

	/**
	 * 类目-消息投放的行业平台（教育、车主、医疗等）
	 */
	@ApiField("category")
	private String category;

	/**
	 * 消息失效时间,标准时间格式：yyyy-MM-dd HH:mm:ss
	 */
	@ApiField("exp_time")
	private Date expTime;

	/**
	 * 商户消息唯一流水,类目范围内唯一,标识此消息唯一ID,若重复上传通过此判断
	 */
	@ApiField("merch_id")
	private String merchId;

	/**
	 * 操作数据,自定义,使用方需知晓

若需要同步域内时:
如果只需要支付宝这边利用数据直接完成某个功能（通知），则使用此参数传输数据.，根据不同的scene_code,op_code,channel,version共同确定参数是否可以为空，接入时由支付宝确定参数格式。
	 */
	@ApiField("op_data")
	private String opData;

	/**
	 * 消息数据,json格式,内容由模板参数列表定义.
{"占位符":"参数值","占位符2":"参数值"…}

若需要同步域内时:
场景的数据表示. json 数组
格式，根据不同的scene_code,
op_code,channel,version共同确定
参数是否可以为空，接入时由支付宝确定
参数格式。
	 */
	@ApiField("scene_data")
	private String sceneData;

	/**
	 * 消息生效时间,标准时间格式：yyyy-MM-dd HH:mm:ss
	 */
	@ApiField("start_time")
	private Date startTime;

	/**
	 * 是否需要同步域内,设定模板时需支持;
若需要特殊可选均是必填
	 */
	@ApiField("syn")
	private Boolean syn;

	/**
	 * 消息模板的版本,由开放生态分配
	 */
	@ApiField("t_v")
	private String tV;

	/**
	 * 消息模板ID,需要预先设定模板才能进行消息投放,由开放生态协商分配
	 */
	@ApiField("tamplate_id")
	private Long tamplateId;

	/**
	 * 投放目标对象,自定义.

若需要同步到域内:
场景覆盖的目标人群标识，单个用户是支付宝的userId,多个用户userId 使用英文半角逗号隔开,最多200个如果是群组,使用支付宝分配的群组ID.
	 */
	@ApiField("target_id")
	private String targetId;

	/**
	 * <p>Getter for the field <code>attribute</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getAttribute() {
		return this.attribute;
	}
	/**
	 * <p>Setter for the field <code>attribute</code>.</p>
	 *
	 * @param attribute a {@link java.lang.String} object.
	 */
	public void setAttribute(String attribute) {
		this.attribute = attribute;
	}

	/**
	 * <p>Getter for the field <code>category</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getCategory() {
		return this.category;
	}
	/**
	 * <p>Setter for the field <code>category</code>.</p>
	 *
	 * @param category a {@link java.lang.String} object.
	 */
	public void setCategory(String category) {
		this.category = category;
	}

	/**
	 * <p>Getter for the field <code>expTime</code>.</p>
	 *
	 * @return a {@link java.util.Date} object.
	 */
	public Date getExpTime() {
		return this.expTime;
	}
	/**
	 * <p>Setter for the field <code>expTime</code>.</p>
	 *
	 * @param expTime a {@link java.util.Date} object.
	 */
	public void setExpTime(Date expTime) {
		this.expTime = expTime;
	}

	/**
	 * <p>Getter for the field <code>merchId</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getMerchId() {
		return this.merchId;
	}
	/**
	 * <p>Setter for the field <code>merchId</code>.</p>
	 *
	 * @param merchId a {@link java.lang.String} object.
	 */
	public void setMerchId(String merchId) {
		this.merchId = merchId;
	}

	/**
	 * <p>Getter for the field <code>opData</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getOpData() {
		return this.opData;
	}
	/**
	 * <p>Setter for the field <code>opData</code>.</p>
	 *
	 * @param opData a {@link java.lang.String} object.
	 */
	public void setOpData(String opData) {
		this.opData = opData;
	}

	/**
	 * <p>Getter for the field <code>sceneData</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getSceneData() {
		return this.sceneData;
	}
	/**
	 * <p>Setter for the field <code>sceneData</code>.</p>
	 *
	 * @param sceneData a {@link java.lang.String} object.
	 */
	public void setSceneData(String sceneData) {
		this.sceneData = sceneData;
	}

	/**
	 * <p>Getter for the field <code>startTime</code>.</p>
	 *
	 * @return a {@link java.util.Date} object.
	 */
	public Date getStartTime() {
		return this.startTime;
	}
	/**
	 * <p>Setter for the field <code>startTime</code>.</p>
	 *
	 * @param startTime a {@link java.util.Date} object.
	 */
	public void setStartTime(Date startTime) {
		this.startTime = startTime;
	}

	/**
	 * <p>Getter for the field <code>syn</code>.</p>
	 *
	 * @return a {@link java.lang.Boolean} object.
	 */
	public Boolean getSyn() {
		return this.syn;
	}
	/**
	 * <p>Setter for the field <code>syn</code>.</p>
	 *
	 * @param syn a {@link java.lang.Boolean} object.
	 */
	public void setSyn(Boolean syn) {
		this.syn = syn;
	}

	/**
	 * <p>Getter for the field <code>tV</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String gettV() {
		return this.tV;
	}
	/**
	 * <p>Setter for the field <code>tV</code>.</p>
	 *
	 * @param tV a {@link java.lang.String} object.
	 */
	public void settV(String tV) {
		this.tV = tV;
	}

	/**
	 * <p>Getter for the field <code>tamplateId</code>.</p>
	 *
	 * @return a {@link java.lang.Long} object.
	 */
	public Long getTamplateId() {
		return this.tamplateId;
	}
	/**
	 * <p>Setter for the field <code>tamplateId</code>.</p>
	 *
	 * @param tamplateId a {@link java.lang.Long} object.
	 */
	public void setTamplateId(Long tamplateId) {
		this.tamplateId = tamplateId;
	}

	/**
	 * <p>Getter for the field <code>targetId</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getTargetId() {
		return this.targetId;
	}
	/**
	 * <p>Setter for the field <code>targetId</code>.</p>
	 *
	 * @param targetId a {@link java.lang.String} object.
	 */
	public void setTargetId(String targetId) {
		this.targetId = targetId;
	}

}
