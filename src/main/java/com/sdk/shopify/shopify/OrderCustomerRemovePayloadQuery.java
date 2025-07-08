// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* Return type for `orderCustomerRemove` mutation.
*/
public class OrderCustomerRemovePayloadQuery extends Query<OrderCustomerRemovePayloadQuery> {
    OrderCustomerRemovePayloadQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * The order that had its customer removed.
    */
    public OrderCustomerRemovePayloadQuery order(OrderQueryDefinition queryDef) {
        startField("order");

        _queryBuilder.append('{');
        queryDef.define(new OrderQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The list of errors that occurred from executing the mutation.
    */
    public OrderCustomerRemovePayloadQuery userErrors(OrderCustomerRemoveUserErrorQueryDefinition queryDef) {
        startField("userErrors");

        _queryBuilder.append('{');
        queryDef.define(new OrderCustomerRemoveUserErrorQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }
}
