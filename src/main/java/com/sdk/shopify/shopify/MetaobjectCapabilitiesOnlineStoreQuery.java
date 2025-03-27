// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* The Online Store capability of a metaobject definition.
*/
public class MetaobjectCapabilitiesOnlineStoreQuery extends Query<MetaobjectCapabilitiesOnlineStoreQuery> {
    MetaobjectCapabilitiesOnlineStoreQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * The data associated with the Online Store capability.
    */
    public MetaobjectCapabilitiesOnlineStoreQuery data(MetaobjectCapabilityDefinitionDataOnlineStoreQueryDefinition queryDef) {
        startField("data");

        _queryBuilder.append('{');
        queryDef.define(new MetaobjectCapabilityDefinitionDataOnlineStoreQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * Indicates if the capability is enabled.
    */
    public MetaobjectCapabilitiesOnlineStoreQuery enabled() {
        startField("enabled");

        return this;
    }
}
