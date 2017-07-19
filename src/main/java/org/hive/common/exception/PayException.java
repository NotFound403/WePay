package org.hive.common.exception;

/**
 * Created with IntelliJ IDEA.
 * <p>
 * 支付异常
 *
 * @author Dax
 * @version v1.0.0
 * @since 2017 /7/19  17:13
 */


public class PayException extends Throwable {
    private static final long serialVersionUID = -5439722412045261617L;

    /**
     * Instantiates a new Pay exception.
     */
    public PayException() {
    }

    /**
     * Instantiates a new Pay exception.
     *
     * @param message the message
     */
    public PayException(String message) {
        super(message);
    }

    /**
     * Instantiates a new Pay exception.
     *
     * @param message the message
     * @param cause   the cause
     */
    public PayException(String message, Throwable cause) {
        super(message, cause);
    }

    /**
     * Instantiates a new Pay exception.
     *
     * @param cause the cause
     */
    public PayException(Throwable cause) {
        super(cause);
    }

    /**
     * Instantiates a new Pay exception.
     *
     * @param message            the message
     * @param cause              the cause
     * @param enableSuppression  the enable suppression
     * @param writableStackTrace the writable stack trace
     */
    public PayException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }

}
