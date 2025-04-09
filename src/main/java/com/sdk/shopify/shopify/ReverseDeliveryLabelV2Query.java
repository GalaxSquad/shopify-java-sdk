// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* The return label file information for a reverse delivery.
*/
public class ReverseDeliveryLabelV2Query extends Query<ReverseDeliveryLabelV2Query> {
    ReverseDeliveryLabelV2Query(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * The date and time when the reverse delivery label was created.
    */
    public ReverseDeliveryLabelV2Query createdAt() {
        startField("createdAt");

        return this;
    }

    /**
    * A public link that can be used to download the label image.
    */
    public ReverseDeliveryLabelV2Query publicFileUrl() {
        startField("publicFileUrl");

        return this;
    }

    /**
    * The date and time when the reverse delivery label was updated.
    */
    public ReverseDeliveryLabelV2Query updatedAt() {
        startField("updatedAt");

        return this;
    }
}
