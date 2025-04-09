// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* The payment collection details for an order that requires additional payment following an edit to
* the order.
*/
public class OrderPaymentCollectionDetailsQuery extends Query<OrderPaymentCollectionDetailsQuery> {
    OrderPaymentCollectionDetailsQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * The URL to use for collecting an additional payment on the order.
    */
    public OrderPaymentCollectionDetailsQuery additionalPaymentCollectionUrl() {
        startField("additionalPaymentCollectionUrl");

        return this;
    }

    /**
    * The list of vaulted payment methods for the order with their permissions.
    */
    public OrderPaymentCollectionDetailsQuery vaultedPaymentMethods(PaymentMandateQueryDefinition queryDef) {
        startField("vaultedPaymentMethods");

        _queryBuilder.append('{');
        queryDef.define(new PaymentMandateQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }
}
