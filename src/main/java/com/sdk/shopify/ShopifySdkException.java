package com.sdk.shopify;

/**
 * Custom exception for Shopify SDK related errors.
 * Provides different constructors for flexible error handling.
 */
public class ShopifySdkException extends RuntimeException {
    private static final long serialVersionUID = 1L;

    /**
     * HTTP status code associated with this exception, if applicable.
     * Zero indicates no HTTP status code is associated.
     */
    private final int statusCode;

    /**
     * Creates a new exception with the specified message.
     *
     * @param message the error message
     */
    public ShopifySdkException(String message) {
        super(message);
        this.statusCode = 0;
    }

    /**
     * Creates a new exception with the specified message and cause.
     *
     * @param message the error message
     * @param cause the cause of this exception
     */
    public ShopifySdkException(String message, Throwable cause) {
        super(message, cause);
        this.statusCode = 0;
    }

    /**
     * Creates a new exception with the specified cause.
     *
     * @param cause the cause of this exception
     */
    public ShopifySdkException(Throwable cause) {
        super(cause);
        this.statusCode = 0;
    }
    
    /**
     * Creates a new exception with the specified message and HTTP status code.
     *
     * @param message the error message
     * @param statusCode the HTTP status code associated with this exception
     */
    public ShopifySdkException(String message, int statusCode) {
        super(message);
        this.statusCode = statusCode;
    }

    /**
     * Creates a new exception with the specified message, cause, and HTTP status code.
     *
     * @param message the error message
     * @param cause the cause of this exception
     * @param statusCode the HTTP status code associated with this exception
     */
    public ShopifySdkException(String message, Throwable cause, int statusCode) {
        super(message, cause);
        this.statusCode = statusCode;
    }

    /**
     * Gets the HTTP status code associated with this exception, if any.
     * 
     * @return the HTTP status code, or 0 if no status code is associated
     */
    public int getStatusCode() {
        return statusCode;
    }
}
