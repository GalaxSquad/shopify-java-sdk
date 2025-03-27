// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.shopify.graphql.support.AbstractResponse;
import com.shopify.graphql.support.Arguments;
import com.shopify.graphql.support.Error;
import com.shopify.graphql.support.Query;
import com.shopify.graphql.support.SchemaViolationError;
import com.shopify.graphql.support.TopLevelResponse;
import com.shopify.graphql.support.Input;

import com.shopify.graphql.support.ID;

/**
* New items associated to the exchange.
*/
public class ExchangeV2AdditionsQuery extends Query<ExchangeV2AdditionsQuery> {
    ExchangeV2AdditionsQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * The list of new items for the exchange.
    */
    public ExchangeV2AdditionsQuery lineItems(ExchangeV2LineItemQueryDefinition queryDef) {
        startField("lineItems");

        _queryBuilder.append('{');
        queryDef.define(new ExchangeV2LineItemQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The subtotal of the items being added, including discounts.
    */
    public ExchangeV2AdditionsQuery subtotalPriceSet(MoneyBagQueryDefinition queryDef) {
        startField("subtotalPriceSet");

        _queryBuilder.append('{');
        queryDef.define(new MoneyBagQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The summary of all taxes of the items being added.
    */
    public ExchangeV2AdditionsQuery taxLines(TaxLineQueryDefinition queryDef) {
        startField("taxLines");

        _queryBuilder.append('{');
        queryDef.define(new TaxLineQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The total price of the items being added, including discounts and taxes.
    */
    public ExchangeV2AdditionsQuery totalPriceSet(MoneyBagQueryDefinition queryDef) {
        startField("totalPriceSet");

        _queryBuilder.append('{');
        queryDef.define(new MoneyBagQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }
}
