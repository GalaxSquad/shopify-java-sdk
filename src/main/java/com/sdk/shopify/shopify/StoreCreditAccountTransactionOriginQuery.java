// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* The origin of a store credit account transaction.
*/
public class StoreCreditAccountTransactionOriginQuery extends Query<StoreCreditAccountTransactionOriginQuery> {
    StoreCreditAccountTransactionOriginQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);

        startField("__typename");
    }

    public StoreCreditAccountTransactionOriginQuery onOrderTransaction(OrderTransactionQueryDefinition queryDef) {
        startInlineFragment("OrderTransaction");
        queryDef.define(new OrderTransactionQuery(_queryBuilder));
        _queryBuilder.append('}');
        return this;
    }
}
