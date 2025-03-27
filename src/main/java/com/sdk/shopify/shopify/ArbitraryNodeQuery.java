// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

public class ArbitraryNodeQuery extends Query<ArbitraryNodeQuery> {
    ArbitraryNodeQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);

        startField("id");
    }

    public ArbitraryNodeQuery hostObject(ArbitraryHostQueryDefinition queryDef) {
        startField("hostObject");

        _queryBuilder.append('{');
        queryDef.define(new ArbitraryHostQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }
}
