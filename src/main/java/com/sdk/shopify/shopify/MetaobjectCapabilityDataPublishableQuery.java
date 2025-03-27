// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* The publishable capability for the parent metaobject.
*/
public class MetaobjectCapabilityDataPublishableQuery extends Query<MetaobjectCapabilityDataPublishableQuery> {
    MetaobjectCapabilityDataPublishableQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * The visibility status of this metaobject across all channels.
    */
    public MetaobjectCapabilityDataPublishableQuery status() {
        startField("status");

        return this;
    }
}
