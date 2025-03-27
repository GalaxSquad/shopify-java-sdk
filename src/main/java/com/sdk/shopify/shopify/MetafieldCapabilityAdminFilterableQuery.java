// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* Information about the admin filterable capability on a metafield definition.
*/
public class MetafieldCapabilityAdminFilterableQuery extends Query<MetafieldCapabilityAdminFilterableQuery> {
    MetafieldCapabilityAdminFilterableQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * Indicates if the definition is eligible to have the capability.
    */
    public MetafieldCapabilityAdminFilterableQuery eligible() {
        startField("eligible");

        return this;
    }

    /**
    * Indicates if the capability is enabled.
    */
    public MetafieldCapabilityAdminFilterableQuery enabled() {
        startField("enabled");

        return this;
    }

    /**
    * Determines the metafield definition's filter status for use in admin filtering.
    */
    public MetafieldCapabilityAdminFilterableQuery status() {
        startField("status");

        return this;
    }
}
