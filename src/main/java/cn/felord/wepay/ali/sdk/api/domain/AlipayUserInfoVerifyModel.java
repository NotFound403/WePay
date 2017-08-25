package cn.felord.wepay.ali.sdk.api.domain;

import cn.felord.wepay.ali.sdk.api.AlipayObject;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;

/**
 * 支付宝会员信息验证
 *
 * @author auto create
 * @version $Id: $Id
 */
public class AlipayUserInfoVerifyModel extends AlipayObject {

	private static final long serialVersionUID = 4264195272584878828L;

	/**
	 * JSON字符串，格式如下：
{
    principalInfo:{ userId: "用户的userId"},
    subRequests:[
        {
             type:"字段类型，支持的类型见后续说明",
             value:"字段值"
         }
    ]
}

说明：
（1）入参中的principalInfo信息用于指示待检查的用户，目前支持userId。
（2）subRequests为待检查的信息项，会与principalInfo所指示的用户留存在支付宝的信息进行匹配；数组类型，支持多种字段的校验；其中type为信息类型，value为信息值。
（3）type目前支持的类型:
        手机：mobile  
        姓名：realName
	 */
	@ApiField("request")
	private String request;

	/**
	 * <p>Getter for the field <code>request</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getRequest() {
		return this.request;
	}
	/**
	 * <p>Setter for the field <code>request</code>.</p>
	 *
	 * @param request a {@link java.lang.String} object.
	 */
	public void setRequest(String request) {
		this.request = request;
	}

}
