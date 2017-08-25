package cn.felord.wepay.ali.sdk.api.domain;

import java.util.List;

import cn.felord.wepay.ali.sdk.api.AlipayObject;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiListField;

/**
 * 修改手艺人信息接口
 *
 * @author auto create
 * @version $Id: $Id
 */
public class KoubeiCraftsmanDataProviderModifyModel extends AlipayObject {

	private static final long serialVersionUID = 7882349769331481587L;

	/**
	 * 服务商、服务商员工、商户、商户员工等口碑角色操作时必填，对应为《koubei.member.data.oauth.query》中的auth_code，默认有效期24小时；isv自身角色操作的时候，无需传该参数
	 */
	@ApiField("auth_code")
	private String authCode;

	/**
	 * 手艺人头像，在商家端手艺人管理和用户端手艺人个人简介中展示手艺人头像 （通过 alipay.offline.material.image.upload 接口上传图片获取的资源id），上限最大5M,支持bmp,png,jpeg,jpg,gif格式的图片。
	 */
	@ApiField("avatar")
	private String avatar;

	/**
	 * 从业起始年月日
	 */
	@ApiField("career_begin")
	private String careerBegin;

	/**
	 * 职业。目前只能传支持一个。枚举类型目前有19种，发型师、美甲师、美容师、美睫师、纹绣师、纹身师、摄影师、教练、教师、化妆师、司仪、摄像师、按摩技师、足疗技师、灸疗师、理疗师、修脚师、采耳师、其他。
	 */
	@ApiListField("careers")
	@ApiField("string")
	private List<String> careers;

	/**
	 * 口碑手艺人id(外部手艺人id和口碑手艺人id二选一，如果都传的话，那么优先使用口碑手艺人id)
	 */
	@ApiField("craftsman_id")
	private String craftsmanId;

	/**
	 * 手艺人简介，上限300字。
	 */
	@ApiField("introduction")
	private String introduction;

	/**
	 * 昵称，上限16字,手艺人个人主页名称，展示给消费者看。
	 */
	@ApiField("nick_name")
	private String nickName;

	/**
	 * 外部手艺人id，由ISV生成，isv的appId + 外部手艺人id全局唯一
	 */
	@ApiField("out_craftsman_id")
	private String outCraftsmanId;

	/**
	 * 手艺人关联门店
	 */
	@ApiListField("shop_relations")
	@ApiField("craftsman_shop_relation_open_model")
	private List<CraftsmanShopRelationOpenModel> shopRelations;

	/**
	 * 描述手艺人擅长的技术（如烫染、二分式剪法、足疗、中医推拿、刮痧、火疗、拔罐、婚纱、儿童、写真...）。最多6个标签
每个标签字段上限10个字。
	 */
	@ApiListField("specialities")
	@ApiField("string")
	private List<String> specialities;

	/**
	 * 手艺人的手机号，在商家端和用户端展示，不支持座机
	 */
	@ApiField("tel_num")
	private String telNum;

	/**
	 * 头衔，手艺人在店内的职称。上限10个字。
	 */
	@ApiField("title")
	private String title;

	/**
	 * <p>Getter for the field <code>authCode</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getAuthCode() {
		return this.authCode;
	}
	/**
	 * <p>Setter for the field <code>authCode</code>.</p>
	 *
	 * @param authCode a {@link java.lang.String} object.
	 */
	public void setAuthCode(String authCode) {
		this.authCode = authCode;
	}

	/**
	 * <p>Getter for the field <code>avatar</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getAvatar() {
		return this.avatar;
	}
	/**
	 * <p>Setter for the field <code>avatar</code>.</p>
	 *
	 * @param avatar a {@link java.lang.String} object.
	 */
	public void setAvatar(String avatar) {
		this.avatar = avatar;
	}

	/**
	 * <p>Getter for the field <code>careerBegin</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getCareerBegin() {
		return this.careerBegin;
	}
	/**
	 * <p>Setter for the field <code>careerBegin</code>.</p>
	 *
	 * @param careerBegin a {@link java.lang.String} object.
	 */
	public void setCareerBegin(String careerBegin) {
		this.careerBegin = careerBegin;
	}

	/**
	 * <p>Getter for the field <code>careers</code>.</p>
	 *
	 * @return a {@link java.util.List} object.
	 */
	public List<String> getCareers() {
		return this.careers;
	}
	/**
	 * <p>Setter for the field <code>careers</code>.</p>
	 *
	 * @param careers a {@link java.util.List} object.
	 */
	public void setCareers(List<String> careers) {
		this.careers = careers;
	}

	/**
	 * <p>Getter for the field <code>craftsmanId</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getCraftsmanId() {
		return this.craftsmanId;
	}
	/**
	 * <p>Setter for the field <code>craftsmanId</code>.</p>
	 *
	 * @param craftsmanId a {@link java.lang.String} object.
	 */
	public void setCraftsmanId(String craftsmanId) {
		this.craftsmanId = craftsmanId;
	}

	/**
	 * <p>Getter for the field <code>introduction</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getIntroduction() {
		return this.introduction;
	}
	/**
	 * <p>Setter for the field <code>introduction</code>.</p>
	 *
	 * @param introduction a {@link java.lang.String} object.
	 */
	public void setIntroduction(String introduction) {
		this.introduction = introduction;
	}

	/**
	 * <p>Getter for the field <code>nickName</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getNickName() {
		return this.nickName;
	}
	/**
	 * <p>Setter for the field <code>nickName</code>.</p>
	 *
	 * @param nickName a {@link java.lang.String} object.
	 */
	public void setNickName(String nickName) {
		this.nickName = nickName;
	}

	/**
	 * <p>Getter for the field <code>outCraftsmanId</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getOutCraftsmanId() {
		return this.outCraftsmanId;
	}
	/**
	 * <p>Setter for the field <code>outCraftsmanId</code>.</p>
	 *
	 * @param outCraftsmanId a {@link java.lang.String} object.
	 */
	public void setOutCraftsmanId(String outCraftsmanId) {
		this.outCraftsmanId = outCraftsmanId;
	}

	/**
	 * <p>Getter for the field <code>shopRelations</code>.</p>
	 *
	 * @return a {@link java.util.List} object.
	 */
	public List<CraftsmanShopRelationOpenModel> getShopRelations() {
		return this.shopRelations;
	}
	/**
	 * <p>Setter for the field <code>shopRelations</code>.</p>
	 *
	 * @param shopRelations a {@link java.util.List} object.
	 */
	public void setShopRelations(List<CraftsmanShopRelationOpenModel> shopRelations) {
		this.shopRelations = shopRelations;
	}

	/**
	 * <p>Getter for the field <code>specialities</code>.</p>
	 *
	 * @return a {@link java.util.List} object.
	 */
	public List<String> getSpecialities() {
		return this.specialities;
	}
	/**
	 * <p>Setter for the field <code>specialities</code>.</p>
	 *
	 * @param specialities a {@link java.util.List} object.
	 */
	public void setSpecialities(List<String> specialities) {
		this.specialities = specialities;
	}

	/**
	 * <p>Getter for the field <code>telNum</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getTelNum() {
		return this.telNum;
	}
	/**
	 * <p>Setter for the field <code>telNum</code>.</p>
	 *
	 * @param telNum a {@link java.lang.String} object.
	 */
	public void setTelNum(String telNum) {
		this.telNum = telNum;
	}

	/**
	 * <p>Getter for the field <code>title</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getTitle() {
		return this.title;
	}
	/**
	 * <p>Setter for the field <code>title</code>.</p>
	 *
	 * @param title a {@link java.lang.String} object.
	 */
	public void setTitle(String title) {
		this.title = title;
	}

}
