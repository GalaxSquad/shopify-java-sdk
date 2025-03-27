// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* The publishable capability of a metaobject definition.
*/
public class MetaobjectCapabilitiesPublishableQuery extends Query<MetaobjectCapabilitiesPublishableQuery> {
    MetaobjectCapabilitiesPublishableQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * Indicates if the capability is enabled.
    */
    public MetaobjectCapabilitiesPublishableQuery enabled() {
        startField("enabled");

        return this;
    }
}
