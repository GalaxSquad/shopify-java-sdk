// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* A return line item.
*/
public class ReturnLineItemQuery extends Query<ReturnLineItemQuery> {
    ReturnLineItemQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);

        startField("id");
    }

    /**
    * A note from the customer that describes the item to be returned. Maximum length: 300 characters.
    */
    public ReturnLineItemQuery customerNote() {
        startField("customerNote");

        return this;
    }

    /**
    * The fulfillment line item from which items are returned.
    */
    public ReturnLineItemQuery fulfillmentLineItem(FulfillmentLineItemQueryDefinition queryDef) {
        startField("fulfillmentLineItem");

        _queryBuilder.append('{');
        queryDef.define(new FulfillmentLineItemQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The quantity being returned.
    */
    public ReturnLineItemQuery quantity() {
        startField("quantity");

        return this;
    }

    /**
    * The quantity that can be refunded.
    */
    public ReturnLineItemQuery refundableQuantity() {
        startField("refundableQuantity");

        return this;
    }

    /**
    * The quantity that was refunded.
    */
    public ReturnLineItemQuery refundedQuantity() {
        startField("refundedQuantity");

        return this;
    }

    /**
    * The restocking fee for the return line item.
    */
    public ReturnLineItemQuery restockingFee(RestockingFeeQueryDefinition queryDef) {
        startField("restockingFee");

        _queryBuilder.append('{');
        queryDef.define(new RestockingFeeQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The reason for returning the item.
    */
    public ReturnLineItemQuery returnReason() {
        startField("returnReason");

        return this;
    }

    /**
    * Additional information about the reason for the return. Maximum length: 255 characters.
    */
    public ReturnLineItemQuery returnReasonNote() {
        startField("returnReasonNote");

        return this;
    }

    /**
    * The total weight of the item.
    */
    public ReturnLineItemQuery totalWeight(WeightQueryDefinition queryDef) {
        startField("totalWeight");

        _queryBuilder.append('{');
        queryDef.define(new WeightQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The total line price after all discounts on the line item, including both line item level discounts
    * and code-based line item discounts, are applied.
    */
    public ReturnLineItemQuery withCodeDiscountedTotalPriceSet(MoneyBagQueryDefinition queryDef) {
        startField("withCodeDiscountedTotalPriceSet");

        _queryBuilder.append('{');
        queryDef.define(new MoneyBagQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }
}
