// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* Return items associated to the exchange.
*/
public class ExchangeV2ReturnsQuery extends Query<ExchangeV2ReturnsQuery> {
    ExchangeV2ReturnsQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * The list of return items for the exchange.
    */
    public ExchangeV2ReturnsQuery lineItems(ExchangeV2LineItemQueryDefinition queryDef) {
        startField("lineItems");

        _queryBuilder.append('{');
        queryDef.define(new ExchangeV2LineItemQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The amount of the order-level discount for the items and shipping being returned, which doesn't
    * contain any line item discounts.
    */
    public ExchangeV2ReturnsQuery orderDiscountAmountSet(MoneyBagQueryDefinition queryDef) {
        startField("orderDiscountAmountSet");

        _queryBuilder.append('{');
        queryDef.define(new MoneyBagQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The amount of money to be refunded for shipping.
    */
    public ExchangeV2ReturnsQuery shippingRefundAmountSet(MoneyBagQueryDefinition queryDef) {
        startField("shippingRefundAmountSet");

        _queryBuilder.append('{');
        queryDef.define(new MoneyBagQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The subtotal of the items being returned.
    */
    public ExchangeV2ReturnsQuery subtotalPriceSet(MoneyBagQueryDefinition queryDef) {
        startField("subtotalPriceSet");

        _queryBuilder.append('{');
        queryDef.define(new MoneyBagQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The summary of all taxes of the items being returned.
    */
    public ExchangeV2ReturnsQuery taxLines(TaxLineQueryDefinition queryDef) {
        startField("taxLines");

        _queryBuilder.append('{');
        queryDef.define(new TaxLineQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The amount of money to be refunded for tip.
    */
    public ExchangeV2ReturnsQuery tipRefundAmountSet(MoneyBagQueryDefinition queryDef) {
        startField("tipRefundAmountSet");

        _queryBuilder.append('{');
        queryDef.define(new MoneyBagQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The total value of the items being returned.
    */
    public ExchangeV2ReturnsQuery totalPriceSet(MoneyBagQueryDefinition queryDef) {
        startField("totalPriceSet");

        _queryBuilder.append('{');
        queryDef.define(new MoneyBagQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }
}
