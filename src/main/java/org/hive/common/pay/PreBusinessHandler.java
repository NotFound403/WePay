package org.hive.common.pay;

/**
 * Created with IntelliJ IDEA.
 * <p>
 * 预处理业务
 *
 * @author Dax
 * @version v1.0.0
 * @since 2017/7/19  17:07
 */


public interface PreBusinessHandler {
    <T> T prehandler();
}
