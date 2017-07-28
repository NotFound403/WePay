package org.hive.common.util;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import java.beans.BeanInfo;
import java.beans.IntrospectionException;
import java.beans.Introspector;
import java.beans.PropertyDescriptor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.TreeMap;

/**
 * Created with IntelliJ IDEA.
 * Author: Dax
 * Description:
 * Date: 17-7-17
 * Time: 下午10:52
 */


public class BeanUtil {
    private static final Log log = LogFactory.getLog(BeanUtil.class);

    /**
     * Bean to sorted tree map without null map.
     * <p>
     * 实体 Bean 转为按照ACCSII排序后的TreeMap 并排除空值
     *
     * @param <T> the type parameter
     * @param t   the t
     * @return the map
     */
    public static <T> Map<String, Object> beanToSortedTreeMapWithoutNull(T t) {
        if (t == null) {
            return null;
        }
        Map<String, Object> map = new TreeMap<>(String::compareTo);
        BeanInfo beanInfo = null;
        try {
            beanInfo = Introspector.getBeanInfo(t.getClass());
        } catch (IntrospectionException e) {
            log.debug("获取实体bean信息异常 ", e);
        }
        if (beanInfo != null) {
            PropertyDescriptor[] propertyDescriptors = beanInfo.getPropertyDescriptors();
            for (PropertyDescriptor property : propertyDescriptors) {
                String key = property.getName();
                // 过滤class属性
                if (!"class".equals(key)) {
                    // 得到property对应的getter方法
                    Method getter = property.getReadMethod();
                    Object value = null;
                    try {
                        value = getter.invoke(t);
                    } catch (IllegalAccessException | InvocationTargetException e) {
                        log.debug("实体bean转换Map异常", e);
                    }
//                    排除空值
                    if (value != null) {
                        map.put(key, value);
                    }
                }
            }
        }
        return map;
    }
}
