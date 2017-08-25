package cn.felord.wepay.common.annotation;

import cn.felord.wepay.wechat.enumeration.BaseParamEnum;

import java.lang.annotation.*;

/**
 * Created with IntelliJ IDEA.
 *
 * @author Dax
 * @version v1.0.0
 * @since 2017/8/25  15:04
 */

@Target(ElementType.FIELD)
@Documented
@Retention(RetentionPolicy.RUNTIME)
public @interface PayParam {
    BaseParamEnum fieldName();
}
