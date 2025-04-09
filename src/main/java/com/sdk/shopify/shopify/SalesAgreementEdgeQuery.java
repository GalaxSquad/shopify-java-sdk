// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* An auto-generated type which holds one SalesAgreement and a cursor during pagination.
*/
public class SalesAgreementEdgeQuery extends Query<SalesAgreementEdgeQuery> {
    SalesAgreementEdgeQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * The position of each node in an array, used in
    * [pagination](https://shopify.dev/api/usage/pagination-graphql).
    */
    public SalesAgreementEdgeQuery cursor() {
        startField("cursor");

        return this;
    }

    /**
    * The item at the end of SalesAgreementEdge.
    */
    public SalesAgreementEdgeQuery node(SalesAgreementQueryDefinition queryDef) {
        startField("node");

        _queryBuilder.append('{');
        queryDef.define(new SalesAgreementQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }
}
