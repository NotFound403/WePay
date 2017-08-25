package cn.felord.wepay.ali.sdk.api.domain;

import cn.felord.wepay.ali.sdk.api.AlipayObject;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;

/**
 * 数据枢纽验证码服务返回结果
 *
 * @author auto create
 * @version $Id: $Id
 */
public class AlipayCodeRecoResult extends AlipayObject {

    private static final long serialVersionUID = 2112559618638583537L;

    /**
     * 识别的验证码内容
     */
    @ApiField("content")
    private String content;

    /**
     * Gets content.
     *
     * @return the content
     */
    public String getContent() {
        return this.content;
    }

    /**
     * Sets content.
     *
     * @param content the content
     */
    public void setContent(String content) {
        this.content = content;
    }

}
