// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* How many product variants are in a profile. This count is capped at 500.
*/
public class DeliveryProductVariantsCountQuery extends Query<DeliveryProductVariantsCountQuery> {
    DeliveryProductVariantsCountQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * Whether the count has reached the cap of 500.
    */
    public DeliveryProductVariantsCountQuery capped() {
        startField("capped");

        return this;
    }

    /**
    * The product variant count.
    */
    public DeliveryProductVariantsCountQuery count() {
        startField("count");

        return this;
    }
}
