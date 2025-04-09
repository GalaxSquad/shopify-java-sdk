// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* The Online Store capability for the parent metaobject.
*/
public class MetaobjectCapabilityDataOnlineStoreQuery extends Query<MetaobjectCapabilityDataOnlineStoreQuery> {
    MetaobjectCapabilityDataOnlineStoreQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * The theme template used when viewing the metaobject in a store.
    */
    public MetaobjectCapabilityDataOnlineStoreQuery templateSuffix() {
        startField("templateSuffix");

        return this;
    }
}
