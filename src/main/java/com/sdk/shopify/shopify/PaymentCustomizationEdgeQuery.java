// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* An auto-generated type which holds one PaymentCustomization and a cursor during pagination.
*/
public class PaymentCustomizationEdgeQuery extends Query<PaymentCustomizationEdgeQuery> {
    PaymentCustomizationEdgeQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * The position of each node in an array, used in
    * [pagination](https://shopify.dev/api/usage/pagination-graphql).
    */
    public PaymentCustomizationEdgeQuery cursor() {
        startField("cursor");

        return this;
    }

    /**
    * The item at the end of PaymentCustomizationEdge.
    */
    public PaymentCustomizationEdgeQuery node(PaymentCustomizationQueryDefinition queryDef) {
        startField("node");

        _queryBuilder.append('{');
        queryDef.define(new PaymentCustomizationQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }
}
