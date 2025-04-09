// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* The adjustment order object.
*/
public class ShopifyPaymentsAdjustmentOrderQuery extends Query<ShopifyPaymentsAdjustmentOrderQuery> {
    ShopifyPaymentsAdjustmentOrderQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * The amount of the adjustment order.
    */
    public ShopifyPaymentsAdjustmentOrderQuery amount(MoneyV2QueryDefinition queryDef) {
        startField("amount");

        _queryBuilder.append('{');
        queryDef.define(new MoneyV2Query(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The link to the adjustment order.
    */
    public ShopifyPaymentsAdjustmentOrderQuery link() {
        startField("link");

        return this;
    }

    /**
    * The name of the adjustment order.
    */
    public ShopifyPaymentsAdjustmentOrderQuery name() {
        startField("name");

        return this;
    }

    /**
    * The ID of the order transaction.
    */
    public ShopifyPaymentsAdjustmentOrderQuery orderTransactionId() {
        startField("orderTransactionId");

        return this;
    }
}
