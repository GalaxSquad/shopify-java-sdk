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
* A sale associated with an order price adjustment.
*/
public class AdjustmentSaleQuery extends Query<AdjustmentSaleQuery> {
    AdjustmentSaleQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * The type of order action that the sale represents.
    */
    public AdjustmentSaleQuery actionType() {
        startField("actionType");

        return this;
    }

    /**
    * The unique ID for the sale.
    */
    public AdjustmentSaleQuery id() {
        startField("id");

        return this;
    }

    /**
    * The line type assocated with the sale.
    */
    public AdjustmentSaleQuery lineType() {
        startField("lineType");

        return this;
    }

    /**
    * The number of units either ordered or intended to be returned.
    */
    public AdjustmentSaleQuery quantity() {
        startField("quantity");

        return this;
    }

    /**
    * All individual taxes associated with the sale.
    */
    public AdjustmentSaleQuery taxes(SaleTaxQueryDefinition queryDef) {
        startField("taxes");

        _queryBuilder.append('{');
        queryDef.define(new SaleTaxQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The total sale amount after taxes and discounts.
    */
    public AdjustmentSaleQuery totalAmount(MoneyBagQueryDefinition queryDef) {
        startField("totalAmount");

        _queryBuilder.append('{');
        queryDef.define(new MoneyBagQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The total discounts allocated to the sale after taxes.
    */
    public AdjustmentSaleQuery totalDiscountAmountAfterTaxes(MoneyBagQueryDefinition queryDef) {
        startField("totalDiscountAmountAfterTaxes");

        _queryBuilder.append('{');
        queryDef.define(new MoneyBagQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The total discounts allocated to the sale before taxes.
    */
    public AdjustmentSaleQuery totalDiscountAmountBeforeTaxes(MoneyBagQueryDefinition queryDef) {
        startField("totalDiscountAmountBeforeTaxes");

        _queryBuilder.append('{');
        queryDef.define(new MoneyBagQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The total amount of taxes for the sale.
    */
    public AdjustmentSaleQuery totalTaxAmount(MoneyBagQueryDefinition queryDef) {
        startField("totalTaxAmount");

        _queryBuilder.append('{');
        queryDef.define(new MoneyBagQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }
}
