// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* Describes a capability that is enabled on a Metaobject Definition.
*/
public class StandardMetaobjectCapabilityTemplateQuery extends Query<StandardMetaobjectCapabilityTemplateQuery> {
    StandardMetaobjectCapabilityTemplateQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * The type of capability that's enabled for the metaobject definition.
    */
    public StandardMetaobjectCapabilityTemplateQuery capabilityType() {
        startField("capabilityType");

        return this;
    }
}
