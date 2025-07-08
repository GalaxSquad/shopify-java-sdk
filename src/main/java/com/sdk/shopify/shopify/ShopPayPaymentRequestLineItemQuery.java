// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* Represents a line item for a Shop Pay payment request.
*/
public class ShopPayPaymentRequestLineItemQuery extends Query<ShopPayPaymentRequestLineItemQuery> {
    ShopPayPaymentRequestLineItemQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * The final item price for the line item.
    */
    public ShopPayPaymentRequestLineItemQuery finalItemPrice(MoneyV2QueryDefinition queryDef) {
        startField("finalItemPrice");

        _queryBuilder.append('{');
        queryDef.define(new MoneyV2Query(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The final line price for the line item.
    */
    public ShopPayPaymentRequestLineItemQuery finalLinePrice(MoneyV2QueryDefinition queryDef) {
        startField("finalLinePrice");

        _queryBuilder.append('{');
        queryDef.define(new MoneyV2Query(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The image of the line item.
    */
    public ShopPayPaymentRequestLineItemQuery image(ShopPayPaymentRequestImageQueryDefinition queryDef) {
        startField("image");

        _queryBuilder.append('{');
        queryDef.define(new ShopPayPaymentRequestImageQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The item discounts for the line item.
    */
    public ShopPayPaymentRequestLineItemQuery itemDiscounts(ShopPayPaymentRequestDiscountQueryDefinition queryDef) {
        startField("itemDiscounts");

        _queryBuilder.append('{');
        queryDef.define(new ShopPayPaymentRequestDiscountQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The label of the line item.
    */
    public ShopPayPaymentRequestLineItemQuery label() {
        startField("label");

        return this;
    }

    /**
    * The line discounts for the line item.
    */
    public ShopPayPaymentRequestLineItemQuery lineDiscounts(ShopPayPaymentRequestDiscountQueryDefinition queryDef) {
        startField("lineDiscounts");

        _queryBuilder.append('{');
        queryDef.define(new ShopPayPaymentRequestDiscountQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The original item price for the line item.
    */
    public ShopPayPaymentRequestLineItemQuery originalItemPrice(MoneyV2QueryDefinition queryDef) {
        startField("originalItemPrice");

        _queryBuilder.append('{');
        queryDef.define(new MoneyV2Query(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The original line price for the line item.
    */
    public ShopPayPaymentRequestLineItemQuery originalLinePrice(MoneyV2QueryDefinition queryDef) {
        startField("originalLinePrice");

        _queryBuilder.append('{');
        queryDef.define(new MoneyV2Query(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The quantity of the line item.
    */
    public ShopPayPaymentRequestLineItemQuery quantity() {
        startField("quantity");

        return this;
    }

    /**
    * Whether the line item requires shipping.
    */
    public ShopPayPaymentRequestLineItemQuery requiresShipping() {
        startField("requiresShipping");

        return this;
    }

    /**
    * The SKU of the line item.
    */
    public ShopPayPaymentRequestLineItemQuery sku() {
        startField("sku");

        return this;
    }
}
