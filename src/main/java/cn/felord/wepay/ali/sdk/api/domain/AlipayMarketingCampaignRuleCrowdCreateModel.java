package cn.felord.wepay.ali.sdk.api.domain;

import cn.felord.wepay.ali.sdk.api.AlipayObject;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;

/**
 * 圈人规则创建
 *
 * @author auto create
 * @version $Id : $Id
 */
public class AlipayMarketingCampaignRuleCrowdCreateModel extends AlipayObject {

    private static final long serialVersionUID = 3737662675876391598L;

    /**
     * tagCode：标签别名，指定标签类型，如城市、年龄等，如pubsrv_city_code为城市标签，创建时必填，可传入多组标签
     * op：操作码，EQ（等于）、IN（包含），tagCode与op绑定，以查询出来的标签操作符确定该用EQ还是IN
     * value：tagCode对应选中的值，如：440100为城市地区代码，可支持多个
     * <p>
     * 具体参数参考如下：
     * 1）消费能力：pubsrv_consume_level 操作符：(EQ、IN) 枚举值：高、中、低
     * 2）性别：pubsrv_gender 操作符：(EQ)	 枚举值：1男，2女，0未知
     * 3）年龄区间：pubsrv_age操作符：(EQ、IN)	枚举值见后面年龄区间标签枚举定义
     * 4）职业：pubsrv_occupation操作符：(EQ)	枚举值：白领、大学生、未知
     * 5）常驻城市CODE：pubsrv_city_code操作符：(EQ)	行政区划代码 样例数据：440100
     * 6)住房类型：pubsrv_house_type操作符：(EQ)	枚举值：rent 租房,home 自有住房，other 其他
     * 7)婚姻状态：pubsrv_is_married操作符：(EQ)	枚举值：0 否，1 是
     * 8)是否有小孩：pubsrv_have_baby操作符：(EQ) 枚举值：0 否，1 是
     * 9)是否实名认证：pubsrv_is_realname操作符：(EQ)	枚举值：0 否，1 是，2 未知
     * 10)是否有车：pubsrv_have_auto操作符：(EQ)	枚举值：0 否，1 是，2 未知
     * 11)达人偏好：pubsrv_preference操作符：(IN)	多值列，枚举值：travel=旅游;video=影视;game=游戏;music=音乐;photography=摄影;pet=宠物;sports=运动;digital=数码
     * <p>
     * 年龄区间标签枚举 枚举值: 1-11
     * user_age  &lt;=  17 then 1
     * [18,20] then 2
     * [21,25] then 3
     * [26,30] then 4
     * [31,35] then 5
     * [36,40] then 6
     * [41,45] then 7
     * [46,50] then 8
     * [51,55] then 9
     * [56,60] then 10
     * user_age &gt;60 then 11
     */
    @ApiField("mdatacrowdsource")
    private String mdatacrowdsource;

    /**
     * 签约商户下属机构唯一编号
     */
    @ApiField("mpid")
    private String mpid;

    /**
     * 圈人规则描述，说明规则用途
     */
    @ApiField("ruledesc")
    private String ruledesc;

    /**
     * <p>Getter for the field <code>mdatacrowdsource</code>.</p>
     *
     * @return a {@link java.lang.String} object.
     */
    public String getMdatacrowdsource() {
        return this.mdatacrowdsource;
    }

    /**
     * <p>Setter for the field <code>mdatacrowdsource</code>.</p>
     *
     * @param mdatacrowdsource a {@link java.lang.String} object.
     */
    public void setMdatacrowdsource(String mdatacrowdsource) {
        this.mdatacrowdsource = mdatacrowdsource;
    }

    /**
     * <p>Getter for the field <code>mpid</code>.</p>
     *
     * @return a {@link java.lang.String} object.
     */
    public String getMpid() {
        return this.mpid;
    }

    /**
     * <p>Setter for the field <code>mpid</code>.</p>
     *
     * @param mpid a {@link java.lang.String} object.
     */
    public void setMpid(String mpid) {
        this.mpid = mpid;
    }

    /**
     * <p>Getter for the field <code>ruledesc</code>.</p>
     *
     * @return a {@link java.lang.String} object.
     */
    public String getRuledesc() {
        return this.ruledesc;
    }

    /**
     * <p>Setter for the field <code>ruledesc</code>.</p>
     *
     * @param ruledesc a {@link java.lang.String} object.
     */
    public void setRuledesc(String ruledesc) {
        this.ruledesc = ruledesc;
    }

}
