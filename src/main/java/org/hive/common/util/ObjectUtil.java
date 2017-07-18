package org.hive.common.util;

import java.beans.BeanInfo;
import java.beans.IntrospectionException;
import java.beans.Introspector;
import java.beans.PropertyDescriptor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

/**
 * Created with IntelliJ IDEA.
 * Author: Dax
 * Description:
 * Date: 17-7-17
 * Time: 下午10:52
 */


public class ObjectUtil {
    public static Map<String, Object> beanToHashMap(Object obj) {

        if (obj == null) {
            return null;
        }
        Map<String, Object> map = new HashMap<>();
        BeanInfo beanInfo = null;
        try {
            beanInfo = Introspector.getBeanInfo(obj.getClass());
        } catch (IntrospectionException e) {
            e.printStackTrace();
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
                        value = getter.invoke(obj);
                    } catch (IllegalAccessException | InvocationTargetException e) {
                        e.printStackTrace();
                    }
                    if (value != null) {
                        map.put(key, value);
                    }
                }
            }
        }
        return map;
    }
}
