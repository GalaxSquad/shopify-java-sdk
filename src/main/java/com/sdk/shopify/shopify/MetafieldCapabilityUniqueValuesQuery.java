// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* Information about the unique values capability on a metafield definition.
*/
public class MetafieldCapabilityUniqueValuesQuery extends Query<MetafieldCapabilityUniqueValuesQuery> {
    MetafieldCapabilityUniqueValuesQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * Indicates if the definition is eligible to have the capability.
    */
    public MetafieldCapabilityUniqueValuesQuery eligible() {
        startField("eligible");

        return this;
    }

    /**
    * Indicates if the capability is enabled.
    */
    public MetafieldCapabilityUniqueValuesQuery enabled() {
        startField("enabled");

        return this;
    }
}
