package org.hive.common.exception;

/**
 * Created with IntelliJ IDEA.
 *
 * @author Dax
 * @version v1.0.0
 * @since 2017/7/18  16:40
 */


public class RequiredParamException extends Throwable {
    private static final long serialVersionUID = -8363449024687868772L;

    public RequiredParamException(String message) {
        super(message);
    }
}
