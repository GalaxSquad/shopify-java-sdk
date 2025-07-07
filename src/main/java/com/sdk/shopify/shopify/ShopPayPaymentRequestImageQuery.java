// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* Represents an image for a Shop Pay payment request line item.
*/
public class ShopPayPaymentRequestImageQuery extends Query<ShopPayPaymentRequestImageQuery> {
    ShopPayPaymentRequestImageQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * The alt text of the image.
    */
    public ShopPayPaymentRequestImageQuery alt() {
        startField("alt");

        return this;
    }

    /**
    * The source URL of the image.
    */
    public ShopPayPaymentRequestImageQuery url() {
        startField("url");

        return this;
    }
}
