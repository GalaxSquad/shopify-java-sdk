// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* A typed identifier that represents an individual within a tax jurisdiction.
*/
public class ShopifyPaymentsTaxIdentificationQuery extends Query<ShopifyPaymentsTaxIdentificationQuery> {
    ShopifyPaymentsTaxIdentificationQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * The type of the identification.
    */
    public ShopifyPaymentsTaxIdentificationQuery taxIdentificationType() {
        startField("taxIdentificationType");

        return this;
    }

    /**
    * The value of the identification.
    */
    public ShopifyPaymentsTaxIdentificationQuery value() {
        startField("value");

        return this;
    }
}
