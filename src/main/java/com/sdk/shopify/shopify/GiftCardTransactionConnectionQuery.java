// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* An auto-generated type for paginating through multiple GiftCardTransactions.
*/
public class GiftCardTransactionConnectionQuery extends Query<GiftCardTransactionConnectionQuery> {
    GiftCardTransactionConnectionQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * The connection between the node and its parent. Each edge contains a minimum of the edge's cursor
    * and the node.
    */
    public GiftCardTransactionConnectionQuery edges(GiftCardTransactionEdgeQueryDefinition queryDef) {
        startField("edges");

        _queryBuilder.append('{');
        queryDef.define(new GiftCardTransactionEdgeQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * A list of nodes that are contained in GiftCardTransactionEdge. You can fetch data about an
    * individual node, or you can follow the edges to fetch data about a collection of related nodes. At
    * each node, you specify the fields that you want to retrieve.
    */
    public GiftCardTransactionConnectionQuery nodes(GiftCardTransactionQueryDefinition queryDef) {
        startField("nodes");

        _queryBuilder.append('{');
        queryDef.define(new GiftCardTransactionQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * An object that’s used to retrieve [cursor
    * information](https://shopify.dev/api/usage/pagination-graphql) about the current page.
    */
    public GiftCardTransactionConnectionQuery pageInfo(PageInfoQueryDefinition queryDef) {
        startField("pageInfo");

        _queryBuilder.append('{');
        queryDef.define(new PageInfoQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }
}
