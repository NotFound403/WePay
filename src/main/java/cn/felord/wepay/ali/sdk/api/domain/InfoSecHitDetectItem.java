package cn.felord.wepay.ali.sdk.api.domain;

import cn.felord.wepay.ali.sdk.api.AlipayObject;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;

/**
 * 内容风险识别接口服务-命中结果
 *
 * @author auto create
 * @version $Id: $Id
 */
public class InfoSecHitDetectItem extends AlipayObject {

	private static final long serialVersionUID = 8677386685417542221L;

	/**
	 * 级别
	 */
	@ApiField("detect_resource_level")
	private String detectResourceLevel;

	/**
	 * RULEORMODEL("RULEORMODEL", "规则或模型"),
		KEYWORDS("KEYWORDS", "关键字检测 "),
		REPEAT_MODEL("REPEAT_MODEL", "防重复模型"),
		REGEX("regex", "正则表达式"),
		URL("url", "URL检测"),
		SEXY_PIC("sexyPic", "黄图检测"),
		SAMPLE_PIC("samplePic", "样图检测"),
		OCR("ocr", "图文识别"),
		PICTURE_FACE("picture_face","图片人脸检测"),
		QRCODE("QRCode", "二维码检测"),
		MDP_MODEL("mdpModel", "mdp检测"),
		ANTI_SPAM_MODEL("anti_spam_model", "反垃圾模型");
	 */
	@ApiField("detect_type_code")
	private String detectTypeCode;

	/**
	 * 保存被命中的内容： 如正则表达式，则保存被正则表达式命中的内容
	 */
	@ApiField("hit_content")
	private String hitContent;

	/**
	 * 命中的检测项的资源： 如命中关键字，则存关键字，如命中正则表达式，则保存正则表达式
	 */
	@ApiField("hit_detect_resource")
	private String hitDetectResource;

	/**
	 * <p>Getter for the field <code>detectResourceLevel</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getDetectResourceLevel() {
		return this.detectResourceLevel;
	}
	/**
	 * <p>Setter for the field <code>detectResourceLevel</code>.</p>
	 *
	 * @param detectResourceLevel a {@link java.lang.String} object.
	 */
	public void setDetectResourceLevel(String detectResourceLevel) {
		this.detectResourceLevel = detectResourceLevel;
	}

	/**
	 * <p>Getter for the field <code>detectTypeCode</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getDetectTypeCode() {
		return this.detectTypeCode;
	}
	/**
	 * <p>Setter for the field <code>detectTypeCode</code>.</p>
	 *
	 * @param detectTypeCode a {@link java.lang.String} object.
	 */
	public void setDetectTypeCode(String detectTypeCode) {
		this.detectTypeCode = detectTypeCode;
	}

	/**
	 * <p>Getter for the field <code>hitContent</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getHitContent() {
		return this.hitContent;
	}
	/**
	 * <p>Setter for the field <code>hitContent</code>.</p>
	 *
	 * @param hitContent a {@link java.lang.String} object.
	 */
	public void setHitContent(String hitContent) {
		this.hitContent = hitContent;
	}

	/**
	 * <p>Getter for the field <code>hitDetectResource</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getHitDetectResource() {
		return this.hitDetectResource;
	}
	/**
	 * <p>Setter for the field <code>hitDetectResource</code>.</p>
	 *
	 * @param hitDetectResource a {@link java.lang.String} object.
	 */
	public void setHitDetectResource(String hitDetectResource) {
		this.hitDetectResource = hitDetectResource;
	}

}
