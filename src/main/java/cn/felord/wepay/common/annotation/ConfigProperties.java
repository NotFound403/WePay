package cn.felord.wepay.common.annotation;

import java.lang.annotation.*;

/**
 * Created with IntelliJ IDEA.
 * Author: Dax
 * Description:
 * Date: 17-8-23
 * Time: 下午10:51
 */

@Target(ElementType.TYPE)
@Documented
@Retention(RetentionPolicy.RUNTIME)
public @interface ConfigProperties {
    String fileName() default "weChatConfig";
}
