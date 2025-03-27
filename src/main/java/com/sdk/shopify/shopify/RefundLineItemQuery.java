// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* A line item that's included in a refund.
*/
public class RefundLineItemQuery extends Query<RefundLineItemQuery> {
    RefundLineItemQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * A globally-unique ID.
    */
    public RefundLineItemQuery id() {
        startField("id");

        return this;
    }

    /**
    * The `LineItem` resource associated to the refunded line item.
    */
    public RefundLineItemQuery lineItem(LineItemQueryDefinition queryDef) {
        startField("lineItem");

        _queryBuilder.append('{');
        queryDef.define(new LineItemQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The inventory restock location.
    */
    public RefundLineItemQuery location(LocationQueryDefinition queryDef) {
        startField("location");

        _queryBuilder.append('{');
        queryDef.define(new LocationQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The price of a refunded line item in shop and presentment currencies.
    */
    public RefundLineItemQuery priceSet(MoneyBagQueryDefinition queryDef) {
        startField("priceSet");

        _queryBuilder.append('{');
        queryDef.define(new MoneyBagQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The quantity of a refunded line item.
    */
    public RefundLineItemQuery quantity() {
        startField("quantity");

        return this;
    }

    /**
    * The type of restock for the refunded line item.
    */
    public RefundLineItemQuery restockType() {
        startField("restockType");

        return this;
    }

    /**
    * Whether the refunded line item was restocked. Not applicable in the context of a SuggestedRefund.
    */
    public RefundLineItemQuery restocked() {
        startField("restocked");

        return this;
    }

    /**
    * The subtotal price of a refunded line item in shop and presentment currencies.
    */
    public RefundLineItemQuery subtotalSet(MoneyBagQueryDefinition queryDef) {
        startField("subtotalSet");

        _queryBuilder.append('{');
        queryDef.define(new MoneyBagQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The total tax charged on a refunded line item in shop and presentment currencies.
    */
    public RefundLineItemQuery totalTaxSet(MoneyBagQueryDefinition queryDef) {
        startField("totalTaxSet");

        _queryBuilder.append('{');
        queryDef.define(new MoneyBagQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }
}
