// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* An item for exchange.
*/
public class ExchangeLineItemQuery extends Query<ExchangeLineItemQuery> {
    ExchangeLineItemQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);

        startField("id");
    }

    /**
    * The order line items for the exchange.
    */
    public ExchangeLineItemQuery lineItems(LineItemQueryDefinition queryDef) {
        startField("lineItems");

        _queryBuilder.append('{');
        queryDef.define(new LineItemQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The quantity of the exchange item that can be processed.
    */
    public ExchangeLineItemQuery processableQuantity() {
        startField("processableQuantity");

        return this;
    }

    /**
    * The quantity of the exchange item that have been processed.
    */
    public ExchangeLineItemQuery processedQuantity() {
        startField("processedQuantity");

        return this;
    }

    /**
    * The number of units ordered, including refunded and removed units.
    */
    public ExchangeLineItemQuery quantity() {
        startField("quantity");

        return this;
    }

    /**
    * The quantity of the exchange item that haven't been processed.
    */
    public ExchangeLineItemQuery unprocessedQuantity() {
        startField("unprocessedQuantity");

        return this;
    }

    /**
    * The ID of the variant at time of return creation.
    */
    public ExchangeLineItemQuery variantId() {
        startField("variantId");

        return this;
    }
}
