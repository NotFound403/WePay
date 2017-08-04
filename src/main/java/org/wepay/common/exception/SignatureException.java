package org.wepay.common.exception;

/**
 * Created with IntelliJ IDEA.
 * <p>
 * 签名异常
 *
 * @author Dax
 * @version v1.0.0
 * @since 2017 /7/18  15:15
 */


public class SignatureException extends Exception{
    private static final long serialVersionUID = 4661983063155751455L;

    /**
     * Instantiates a new Signature exception.
     *
     * @param message the message
     */
    public SignatureException(String message) {
        super(message);
    }

    /**
     * Instantiates a new Signature exception.
     *
     * @param message the message
     * @param cause   the cause
     */
    public SignatureException(String message, Throwable cause) {
        super(message, cause);
    }

    /**
     * Instantiates a new Signature exception.
     *
     * @param cause the cause
     */
    public SignatureException(Throwable cause) {
        super(cause);
    }

    /**
     * Instantiates a new Signature exception.
     *
     * @param message            the message
     * @param cause              the cause
     * @param enableSuppression  the enable suppression
     * @param writableStackTrace the writable stack trace
     */
    public SignatureException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
