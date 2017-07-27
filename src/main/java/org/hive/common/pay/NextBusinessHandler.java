package org.hive.common.pay;

/**
 * Created with IntelliJ IDEA.
 * <p>
 * 回调业务处理
 *
 * @author Dax
 * @version v1.0.0
 * @since 2017/7/19  17:12
 */


public interface NextBusinessHandler {
    <T> boolean callback(T t);
}
