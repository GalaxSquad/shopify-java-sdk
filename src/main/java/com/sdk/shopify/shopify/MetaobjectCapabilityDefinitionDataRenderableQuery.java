// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* The renderable capability data for the metaobject definition.
*/
public class MetaobjectCapabilityDefinitionDataRenderableQuery extends Query<MetaobjectCapabilityDefinitionDataRenderableQuery> {
    MetaobjectCapabilityDefinitionDataRenderableQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * The metaobject field used as an alias for the SEO page description.
    */
    public MetaobjectCapabilityDefinitionDataRenderableQuery metaDescriptionKey() {
        startField("metaDescriptionKey");

        return this;
    }

    /**
    * The metaobject field used as an alias for the SEO page title.
    */
    public MetaobjectCapabilityDefinitionDataRenderableQuery metaTitleKey() {
        startField("metaTitleKey");

        return this;
    }
}
