package cn.felord.wepay.ali.sdk.api.internal.mapping;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * 数据结构属性注解。
 *
 * @author carver.gu
 * @version $Id: $Id
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(value = {ElementType.FIELD})
public @interface ApiField {

    /**
     * JSON属性映射名称
     *
     * @return the string
     */
    String value() default "";

}
