package cn.felord.wepay.common.util;

import java.lang.annotation.Annotation;

/**
 * Created with IntelliJ IDEA.
 * Author: Dax
 * Description:
 * Date: 17-8-23
 * Time: 下午9:58
 */


public class AnnotationUtil {

    private AnnotationUtil() {
    }

    /**
     * 获取类中的某种注解
     *
     * @param <A>             the type parameter
     * @param clazz           the clazz
     * @param annotationClazz the annotation clazz
     * @return the a
     */
    public static <A extends Annotation> A getAnnotation(Class<?> clazz, Class<A> annotationClazz) {
        return clazz.isAnnotationPresent(annotationClazz) ? clazz.getAnnotation(annotationClazz) : null;
    }


}
