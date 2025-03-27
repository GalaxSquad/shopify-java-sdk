// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* An auto-generated type which holds one StoreCreditAccountTransaction and a cursor during pagination.
*/
public class StoreCreditAccountTransactionEdgeQuery extends Query<StoreCreditAccountTransactionEdgeQuery> {
    StoreCreditAccountTransactionEdgeQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * The position of each node in an array, used in
    * [pagination](https://shopify.dev/api/usage/pagination-graphql).
    */
    public StoreCreditAccountTransactionEdgeQuery cursor() {
        startField("cursor");

        return this;
    }

    /**
    * The item at the end of StoreCreditAccountTransactionEdge.
    */
    public StoreCreditAccountTransactionEdgeQuery node(StoreCreditAccountTransactionQueryDefinition queryDef) {
        startField("node");

        _queryBuilder.append('{');
        queryDef.define(new StoreCreditAccountTransactionQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }
}
