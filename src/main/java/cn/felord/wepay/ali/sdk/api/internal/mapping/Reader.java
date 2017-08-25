package cn.felord.wepay.ali.sdk.api.internal.mapping;

import cn.felord.wepay.ali.sdk.api.AlipayApiException;

import java.util.List;

/**
 * 格式转换器。
 *
 * @author carver.gu
 * @version $Id: $Id
 */
public interface Reader {

    /**
     * 判断返回结果是否包含指定的属性。
     *
     * @param name 属性名称
     * @return true /false
     */
    boolean hasReturnField(Object name);

    /**
     * 读取单个基本对象。
     *
     * @param name 映射名称
     * @return 基本对象值 primitive object
     */
    Object getPrimitiveObject(Object name);

    /**
     * 读取单个自定义对象。
     *
     * @param name 映射名称
     * @param type 映射类型
     * @return 映射类型的实例 object
     * @throws cn.felord.wepay.ali.sdk.api.AlipayApiException the alipay api exception
     */
    Object getObject(Object name, Class<?> type) throws AlipayApiException;

    /**
     * 读取多个对象的值。
     *
     * @param listName 列表名称
     * @param itemName 映射名称
     * @param subType  嵌套映射类型
     * @return 嵌套映射类型实例列表 list objects
     * @throws cn.felord.wepay.ali.sdk.api.AlipayApiException the alipay api exception
     */
    List<?> getListObjects(Object listName, Object itemName, Class<?> subType)
            throws AlipayApiException;

}
