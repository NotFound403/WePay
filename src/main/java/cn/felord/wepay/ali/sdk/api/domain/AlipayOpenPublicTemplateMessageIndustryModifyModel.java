package cn.felord.wepay.ali.sdk.api.domain;

import cn.felord.wepay.ali.sdk.api.AlipayObject;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;

/**
 * 模板消息行业设置修改接口
 *
 * @author auto create
 * @version $Id: $Id
 */
public class AlipayOpenPublicTemplateMessageIndustryModifyModel extends AlipayObject {

	private static final long serialVersionUID = 4631825885529452528L;

	/**
	 * 服务窗消息模板所属主行业一/二级编码
	 */
	@ApiField("primary_industry_code")
	private String primaryIndustryCode;

	/**
	 * 服务窗消息模板所属主行业一/二级名称(参数说明如下：)
|主行业|	副行业	|代码|
IT科技/互联网|电子商务	10001/20101
IT科技/IT软件与服务	10001/20102
IT科技/IT软件与设备	10001/20103
IT科技/电子技术	10001/20104
IT科技/通信与运营商	10001/20105
IT科技/网络游戏	10001/20106
金融业/银行	10002/20201
金融业/证券|基金|理财|信托	10002/20202
金融业/保险	10002/20203
餐饮/餐饮	10003/20301
酒店旅游/酒店	10004/20401
酒店旅游/旅游	10004/20401
运输与仓储/快递	10005/20501
运输与仓储/物流	10005/20501
运输与仓储/仓储	10005/20501
教育/培训	10006/20601
教育/院校	10006/20602
政府与公共事业/学术科研	10007/20701
政府与公共事业/交警	10007/20702
政府与公共事业/博物馆	10007/20703
政府与公共事业/政府公共事业非盈利机构	10007/20704
医药护理/医药医疗	10008/20801
医药护理/护理美容	10008/20802
医药护理/保健与卫生	10008/20803
交通工具/汽车相关	10009/20901
交通工具/摩托车相关	10009/20902
交通工具/火车相关	10009/20903
交通工具/飞机相关	10009/20904
房地产/房地产|建筑	10010/21001
房地产/物业	10010/21002
消费品/消费品	10011/21101
商业服务/法律	10012/21201
商业服务/广告会展	10012/21201
商业服务/中介服务	10012/21202
商业服务/检测|认证	10012/21203
商业服务/会计|审计	10012/21204
文体娱乐/文化|传媒	10013/21301
文体娱乐/体育	10013/21302
文体娱乐/娱乐休闲	10013/21303
印刷/打印|印刷	10014/21401
其它/其它	10015/21501
	 */
	@ApiField("primary_industry_name")
	private String primaryIndustryName;

	/**
	 * 服务窗消息模板所属副行业一/二级编码
	 */
	@ApiField("secondary_industry_code")
	private String secondaryIndustryCode;

	/**
	 * 服务窗消息模板所属副行业一/二级名称
	 */
	@ApiField("secondary_industry_name")
	private String secondaryIndustryName;

	/**
	 * <p>Getter for the field <code>primaryIndustryCode</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getPrimaryIndustryCode() {
		return this.primaryIndustryCode;
	}
	/**
	 * <p>Setter for the field <code>primaryIndustryCode</code>.</p>
	 *
	 * @param primaryIndustryCode a {@link java.lang.String} object.
	 */
	public void setPrimaryIndustryCode(String primaryIndustryCode) {
		this.primaryIndustryCode = primaryIndustryCode;
	}

	/**
	 * <p>Getter for the field <code>primaryIndustryName</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getPrimaryIndustryName() {
		return this.primaryIndustryName;
	}
	/**
	 * <p>Setter for the field <code>primaryIndustryName</code>.</p>
	 *
	 * @param primaryIndustryName a {@link java.lang.String} object.
	 */
	public void setPrimaryIndustryName(String primaryIndustryName) {
		this.primaryIndustryName = primaryIndustryName;
	}

	/**
	 * <p>Getter for the field <code>secondaryIndustryCode</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getSecondaryIndustryCode() {
		return this.secondaryIndustryCode;
	}
	/**
	 * <p>Setter for the field <code>secondaryIndustryCode</code>.</p>
	 *
	 * @param secondaryIndustryCode a {@link java.lang.String} object.
	 */
	public void setSecondaryIndustryCode(String secondaryIndustryCode) {
		this.secondaryIndustryCode = secondaryIndustryCode;
	}

	/**
	 * <p>Getter for the field <code>secondaryIndustryName</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getSecondaryIndustryName() {
		return this.secondaryIndustryName;
	}
	/**
	 * <p>Setter for the field <code>secondaryIndustryName</code>.</p>
	 *
	 * @param secondaryIndustryName a {@link java.lang.String} object.
	 */
	public void setSecondaryIndustryName(String secondaryIndustryName) {
		this.secondaryIndustryName = secondaryIndustryName;
	}

}
