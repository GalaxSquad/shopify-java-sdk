// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* Represents a branded promise presented to buyers.
*/
public class DeliveryBrandedPromiseQuery extends Query<DeliveryBrandedPromiseQuery> {
    DeliveryBrandedPromiseQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * The handle of the branded promise.  For example: `shop_promise`.
    */
    public DeliveryBrandedPromiseQuery handle() {
        startField("handle");

        return this;
    }

    /**
    * The name of the branded promise.  For example: `Shop Promise`.
    */
    public DeliveryBrandedPromiseQuery name() {
        startField("name");

        return this;
    }
}
