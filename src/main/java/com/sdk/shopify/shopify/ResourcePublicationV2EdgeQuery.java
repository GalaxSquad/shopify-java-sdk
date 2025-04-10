// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* An auto-generated type which holds one ResourcePublicationV2 and a cursor during pagination.
*/
public class ResourcePublicationV2EdgeQuery extends Query<ResourcePublicationV2EdgeQuery> {
    ResourcePublicationV2EdgeQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * The position of each node in an array, used in
    * [pagination](https://shopify.dev/api/usage/pagination-graphql).
    */
    public ResourcePublicationV2EdgeQuery cursor() {
        startField("cursor");

        return this;
    }

    /**
    * The item at the end of ResourcePublicationV2Edge.
    */
    public ResourcePublicationV2EdgeQuery node(ResourcePublicationV2QueryDefinition queryDef) {
        startField("node");

        _queryBuilder.append('{');
        queryDef.define(new ResourcePublicationV2Query(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }
}
