// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* A calculated return line item.
*/
public class CalculatedReturnLineItemQuery extends Query<CalculatedReturnLineItemQuery> {
    CalculatedReturnLineItemQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * The fulfillment line item from which items are returned.
    */
    public CalculatedReturnLineItemQuery fulfillmentLineItem(FulfillmentLineItemQueryDefinition queryDef) {
        startField("fulfillmentLineItem");

        _queryBuilder.append('{');
        queryDef.define(new FulfillmentLineItemQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * A globally-unique ID.
    */
    public CalculatedReturnLineItemQuery id() {
        startField("id");

        return this;
    }

    /**
    * The quantity being returned.
    */
    public CalculatedReturnLineItemQuery quantity() {
        startField("quantity");

        return this;
    }

    /**
    * The restocking fee of the return line item.
    */
    public CalculatedReturnLineItemQuery restockingFee(CalculatedRestockingFeeQueryDefinition queryDef) {
        startField("restockingFee");

        _queryBuilder.append('{');
        queryDef.define(new CalculatedRestockingFeeQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The subtotal of the return line item before order discounts.
    */
    public CalculatedReturnLineItemQuery subtotalBeforeOrderDiscountsSet(MoneyBagQueryDefinition queryDef) {
        startField("subtotalBeforeOrderDiscountsSet");

        _queryBuilder.append('{');
        queryDef.define(new MoneyBagQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The subtotal of the return line item.
    */
    public CalculatedReturnLineItemQuery subtotalSet(MoneyBagQueryDefinition queryDef) {
        startField("subtotalSet");

        _queryBuilder.append('{');
        queryDef.define(new MoneyBagQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The total tax of the return line item.
    */
    public CalculatedReturnLineItemQuery totalTaxSet(MoneyBagQueryDefinition queryDef) {
        startField("totalTaxSet");

        _queryBuilder.append('{');
        queryDef.define(new MoneyBagQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }
}
