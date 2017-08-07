package org.wepay.common.exception;

/**
 * Created with IntelliJ IDEA.
 *
 * @author Dax
 * @version v1.0.0
 * @since 2017 /7/18  16:40
 */


public class RequiredParamException extends Exception {
    private static final long serialVersionUID = -8363449024687868772L;


    /**
     * Instantiates a new Required param exception.
     *
     * @param message the message
     */
    public RequiredParamException(String message) {
        super(message);
    }

    /**
     * Instantiates a new Required param exception.
     *
     * @param message the message
     * @param cause   the cause
     */
    public RequiredParamException(String message, Throwable cause) {
        super(message, cause);
    }

    /**
     * Instantiates a new Required param exception.
     *
     * @param cause the cause
     */
    public RequiredParamException(Throwable cause) {
        super(cause);
    }

    /**
     * Instantiates a new Required param exception.
     *
     * @param message            the message
     * @param cause              the cause
     * @param enableSuppression  the enable suppression
     * @param writableStackTrace the writable stack trace
     */
    public RequiredParamException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
