// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* An auto-generated type which holds one ExchangeV2 and a cursor during pagination.
*/
public class ExchangeV2EdgeQuery extends Query<ExchangeV2EdgeQuery> {
    ExchangeV2EdgeQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * The position of each node in an array, used in
    * [pagination](https://shopify.dev/api/usage/pagination-graphql).
    */
    public ExchangeV2EdgeQuery cursor() {
        startField("cursor");

        return this;
    }

    /**
    * The item at the end of ExchangeV2Edge.
    */
    public ExchangeV2EdgeQuery node(ExchangeV2QueryDefinition queryDef) {
        startField("node");

        _queryBuilder.append('{');
        queryDef.define(new ExchangeV2Query(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }
}
