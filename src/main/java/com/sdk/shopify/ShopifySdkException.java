package com.sdk.shopify;

public class ShopifySdkException extends RuntimeException {
    private static final long serialVersionUID = 1L;

    public ShopifySdkException (String message) {
        super(message);
    }

    public ShopifySdkException (String message, Throwable cause) {
        super(message, cause);
    }

    public ShopifySdkException (Throwable cause) {
        super(cause);
    }
}
