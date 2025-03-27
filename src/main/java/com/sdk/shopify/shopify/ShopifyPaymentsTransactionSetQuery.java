// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* Presents all Shopify Payments specific information related to an order transaction.
*/
public class ShopifyPaymentsTransactionSetQuery extends Query<ShopifyPaymentsTransactionSetQuery> {
    ShopifyPaymentsTransactionSetQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * Contains all fields related to an extended authorization.
    */
    public ShopifyPaymentsTransactionSetQuery extendedAuthorizationSet(ShopifyPaymentsExtendedAuthorizationQueryDefinition queryDef) {
        startField("extendedAuthorizationSet");

        _queryBuilder.append('{');
        queryDef.define(new ShopifyPaymentsExtendedAuthorizationQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * Contains all fields related to a refund.
    */
    public ShopifyPaymentsTransactionSetQuery refundSet(ShopifyPaymentsRefundSetQueryDefinition queryDef) {
        startField("refundSet");

        _queryBuilder.append('{');
        queryDef.define(new ShopifyPaymentsRefundSetQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }
}
