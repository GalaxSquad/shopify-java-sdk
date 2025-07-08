// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* Return type for `orderCustomerSet` mutation.
*/
public class OrderCustomerSetPayloadQuery extends Query<OrderCustomerSetPayloadQuery> {
    OrderCustomerSetPayloadQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * The order that had a customer set.
    */
    public OrderCustomerSetPayloadQuery order(OrderQueryDefinition queryDef) {
        startField("order");

        _queryBuilder.append('{');
        queryDef.define(new OrderQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The list of errors that occurred from executing the mutation.
    */
    public OrderCustomerSetPayloadQuery userErrors(OrderCustomerSetUserErrorQueryDefinition queryDef) {
        startField("userErrors");

        _queryBuilder.append('{');
        queryDef.define(new OrderCustomerSetUserErrorQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }
}
