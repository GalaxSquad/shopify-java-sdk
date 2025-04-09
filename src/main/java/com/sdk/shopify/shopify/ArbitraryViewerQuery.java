// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

public class ArbitraryViewerQuery extends Query<ArbitraryViewerQuery> {
    ArbitraryViewerQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    public ArbitraryViewerQuery aNode(ArbitraryNodeQueryDefinition queryDef) {
        startField("aNode");

        _queryBuilder.append('{');
        queryDef.define(new ArbitraryNodeQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

}
