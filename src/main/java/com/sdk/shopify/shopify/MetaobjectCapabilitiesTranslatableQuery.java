// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* The translatable capability of a metaobject definition.
*/
public class MetaobjectCapabilitiesTranslatableQuery extends Query<MetaobjectCapabilitiesTranslatableQuery> {
    MetaobjectCapabilitiesTranslatableQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * Indicates if the capability is enabled.
    */
    public MetaobjectCapabilitiesTranslatableQuery enabled() {
        startField("enabled");

        return this;
    }
}
