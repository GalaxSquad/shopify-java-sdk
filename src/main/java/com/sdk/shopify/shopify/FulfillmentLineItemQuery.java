// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* Represents a line item from an order that's included in a fulfillment.
*/
public class FulfillmentLineItemQuery extends Query<FulfillmentLineItemQuery> {
    FulfillmentLineItemQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);

        startField("id");
    }

    /**
    * The total price after discounts are applied in shop and presentment currencies. This value doesn't
    * include order-level discounts.
    */
    public FulfillmentLineItemQuery discountedTotalSet(MoneyBagQueryDefinition queryDef) {
        startField("discountedTotalSet");

        _queryBuilder.append('{');
        queryDef.define(new MoneyBagQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The associated order's line item.
    */
    public FulfillmentLineItemQuery lineItem(LineItemQueryDefinition queryDef) {
        startField("lineItem");

        _queryBuilder.append('{');
        queryDef.define(new LineItemQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The total price before discounts are applied in shop and presentment currencies.
    */
    public FulfillmentLineItemQuery originalTotalSet(MoneyBagQueryDefinition queryDef) {
        startField("originalTotalSet");

        _queryBuilder.append('{');
        queryDef.define(new MoneyBagQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * Number of line items in the fulfillment.
    */
    public FulfillmentLineItemQuery quantity() {
        startField("quantity");

        return this;
    }
}
