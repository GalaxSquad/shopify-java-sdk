// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* Information about the smart collection condition capability on a metafield definition.
*/
public class MetafieldCapabilitySmartCollectionConditionQuery extends Query<MetafieldCapabilitySmartCollectionConditionQuery> {
    MetafieldCapabilitySmartCollectionConditionQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * Indicates if the definition is eligible to have the capability.
    */
    public MetafieldCapabilitySmartCollectionConditionQuery eligible() {
        startField("eligible");

        return this;
    }

    /**
    * Indicates if the capability is enabled.
    */
    public MetafieldCapabilitySmartCollectionConditionQuery enabled() {
        startField("enabled");

        return this;
    }
}
