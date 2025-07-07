// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* Represents a shipping total for a Shop Pay payment request.
*/
public class ShopPayPaymentRequestTotalShippingPriceQuery extends Query<ShopPayPaymentRequestTotalShippingPriceQuery> {
    ShopPayPaymentRequestTotalShippingPriceQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * The discounts for the shipping total.
    */
    public ShopPayPaymentRequestTotalShippingPriceQuery discounts(ShopPayPaymentRequestDiscountQueryDefinition queryDef) {
        startField("discounts");

        _queryBuilder.append('{');
        queryDef.define(new ShopPayPaymentRequestDiscountQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The final total for the shipping line.
    */
    public ShopPayPaymentRequestTotalShippingPriceQuery finalTotal(MoneyV2QueryDefinition queryDef) {
        startField("finalTotal");

        _queryBuilder.append('{');
        queryDef.define(new MoneyV2Query(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The original total for the shipping line.
    */
    public ShopPayPaymentRequestTotalShippingPriceQuery originalTotal(MoneyV2QueryDefinition queryDef) {
        startField("originalTotal");

        _queryBuilder.append('{');
        queryDef.define(new MoneyV2Query(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }
}
