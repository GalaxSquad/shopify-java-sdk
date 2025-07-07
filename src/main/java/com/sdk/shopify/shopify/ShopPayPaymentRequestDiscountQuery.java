// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* Represents a discount for a Shop Pay payment request.
*/
public class ShopPayPaymentRequestDiscountQuery extends Query<ShopPayPaymentRequestDiscountQuery> {
    ShopPayPaymentRequestDiscountQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * The amount of the discount.
    */
    public ShopPayPaymentRequestDiscountQuery amount(MoneyV2QueryDefinition queryDef) {
        startField("amount");

        _queryBuilder.append('{');
        queryDef.define(new MoneyV2Query(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The label of the discount.
    */
    public ShopPayPaymentRequestDiscountQuery label() {
        startField("label");

        return this;
    }
}
