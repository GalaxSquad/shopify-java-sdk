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
* A sale associated with a fee.
*/
public class FeeSaleQuery extends Query<FeeSaleQuery> {
    FeeSaleQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * The type of order action that the sale represents.
    */
    public FeeSaleQuery actionType() {
        startField("actionType");

        return this;
    }

    /**
    * The fee associated with the sale.
    */
    public FeeSaleQuery fee(FeeQueryDefinition queryDef) {
        startField("fee");

        _queryBuilder.append('{');
        queryDef.define(new FeeQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The unique ID for the sale.
    */
    public FeeSaleQuery id() {
        startField("id");

        return this;
    }

    /**
    * The line type assocated with the sale.
    */
    public FeeSaleQuery lineType() {
        startField("lineType");

        return this;
    }

    /**
    * The number of units either ordered or intended to be returned.
    */
    public FeeSaleQuery quantity() {
        startField("quantity");

        return this;
    }

    /**
    * All individual taxes associated with the sale.
    */
    public FeeSaleQuery taxes(SaleTaxQueryDefinition queryDef) {
        startField("taxes");

        _queryBuilder.append('{');
        queryDef.define(new SaleTaxQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The total sale amount after taxes and discounts.
    */
    public FeeSaleQuery totalAmount(MoneyBagQueryDefinition queryDef) {
        startField("totalAmount");

        _queryBuilder.append('{');
        queryDef.define(new MoneyBagQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The total discounts allocated to the sale after taxes.
    */
    public FeeSaleQuery totalDiscountAmountAfterTaxes(MoneyBagQueryDefinition queryDef) {
        startField("totalDiscountAmountAfterTaxes");

        _queryBuilder.append('{');
        queryDef.define(new MoneyBagQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The total discounts allocated to the sale before taxes.
    */
    public FeeSaleQuery totalDiscountAmountBeforeTaxes(MoneyBagQueryDefinition queryDef) {
        startField("totalDiscountAmountBeforeTaxes");

        _queryBuilder.append('{');
        queryDef.define(new MoneyBagQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The total amount of taxes for the sale.
    */
    public FeeSaleQuery totalTaxAmount(MoneyBagQueryDefinition queryDef) {
        startField("totalTaxAmount");

        _queryBuilder.append('{');
        queryDef.define(new MoneyBagQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }
}
