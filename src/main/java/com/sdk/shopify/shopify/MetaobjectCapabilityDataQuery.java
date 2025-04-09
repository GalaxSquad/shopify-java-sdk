// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* Provides the capabilities of a metaobject.
*/
public class MetaobjectCapabilityDataQuery extends Query<MetaobjectCapabilityDataQuery> {
    MetaobjectCapabilityDataQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * The Online Store capability for this metaobject.
    */
    public MetaobjectCapabilityDataQuery onlineStore(MetaobjectCapabilityDataOnlineStoreQueryDefinition queryDef) {
        startField("onlineStore");

        _queryBuilder.append('{');
        queryDef.define(new MetaobjectCapabilityDataOnlineStoreQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The publishable capability for this metaobject.
    */
    public MetaobjectCapabilityDataQuery publishable(MetaobjectCapabilityDataPublishableQueryDefinition queryDef) {
        startField("publishable");

        _queryBuilder.append('{');
        queryDef.define(new MetaobjectCapabilityDataPublishableQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }
}
