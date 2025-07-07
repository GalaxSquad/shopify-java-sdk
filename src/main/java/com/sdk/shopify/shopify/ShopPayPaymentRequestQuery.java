// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* Represents a Shop Pay payment request.
*/
public class ShopPayPaymentRequestQuery extends Query<ShopPayPaymentRequestQuery> {
    ShopPayPaymentRequestQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * The discounts for the payment request order.
    */
    public ShopPayPaymentRequestQuery discounts(ShopPayPaymentRequestDiscountQueryDefinition queryDef) {
        startField("discounts");

        _queryBuilder.append('{');
        queryDef.define(new ShopPayPaymentRequestDiscountQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The line items for the payment request.
    */
    public ShopPayPaymentRequestQuery lineItems(ShopPayPaymentRequestLineItemQueryDefinition queryDef) {
        startField("lineItems");

        _queryBuilder.append('{');
        queryDef.define(new ShopPayPaymentRequestLineItemQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The presentment currency for the payment request.
    */
    public ShopPayPaymentRequestQuery presentmentCurrency() {
        startField("presentmentCurrency");

        return this;
    }

    /**
    * The delivery method type for the payment request.
    */
    public ShopPayPaymentRequestQuery selectedDeliveryMethodType() {
        startField("selectedDeliveryMethodType");

        return this;
    }

    /**
    * The shipping address for the payment request.
    */
    public ShopPayPaymentRequestQuery shippingAddress(ShopPayPaymentRequestContactFieldQueryDefinition queryDef) {
        startField("shippingAddress");

        _queryBuilder.append('{');
        queryDef.define(new ShopPayPaymentRequestContactFieldQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The shipping lines for the payment request.
    */
    public ShopPayPaymentRequestQuery shippingLines(ShopPayPaymentRequestShippingLineQueryDefinition queryDef) {
        startField("shippingLines");

        _queryBuilder.append('{');
        queryDef.define(new ShopPayPaymentRequestShippingLineQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The subtotal amount for the payment request.
    */
    public ShopPayPaymentRequestQuery subtotal(MoneyV2QueryDefinition queryDef) {
        startField("subtotal");

        _queryBuilder.append('{');
        queryDef.define(new MoneyV2Query(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The total amount for the payment request.
    */
    public ShopPayPaymentRequestQuery total(MoneyV2QueryDefinition queryDef) {
        startField("total");

        _queryBuilder.append('{');
        queryDef.define(new MoneyV2Query(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The total shipping price for the payment request.
    */
    public ShopPayPaymentRequestQuery totalShippingPrice(ShopPayPaymentRequestTotalShippingPriceQueryDefinition queryDef) {
        startField("totalShippingPrice");

        _queryBuilder.append('{');
        queryDef.define(new ShopPayPaymentRequestTotalShippingPriceQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The total tax for the payment request.
    */
    public ShopPayPaymentRequestQuery totalTax(MoneyV2QueryDefinition queryDef) {
        startField("totalTax");

        _queryBuilder.append('{');
        queryDef.define(new MoneyV2Query(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }
}
