// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* The renderable capability of a metaobject definition.
*/
public class MetaobjectCapabilitiesRenderableQuery extends Query<MetaobjectCapabilitiesRenderableQuery> {
    MetaobjectCapabilitiesRenderableQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * The data associated with the renderable capability.
    */
    public MetaobjectCapabilitiesRenderableQuery data(MetaobjectCapabilityDefinitionDataRenderableQueryDefinition queryDef) {
        startField("data");

        _queryBuilder.append('{');
        queryDef.define(new MetaobjectCapabilityDefinitionDataRenderableQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * Indicates if the capability is enabled.
    */
    public MetaobjectCapabilitiesRenderableQuery enabled() {
        startField("enabled");

        return this;
    }
}
