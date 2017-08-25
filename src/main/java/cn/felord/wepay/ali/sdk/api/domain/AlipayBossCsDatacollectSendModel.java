package cn.felord.wepay.ali.sdk.api.domain;

import cn.felord.wepay.ali.sdk.api.AlipayObject;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;

/**
 * 舆情数据处理平台外部数据提交接口
 *
 * @author auto create
 * @version $Id: $Id
 */
public class AlipayBossCsDatacollectSendModel extends AlipayObject {

    private static final long serialVersionUID = 3725674368445198961L;

    /**
     * 上数提交数据内容
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
