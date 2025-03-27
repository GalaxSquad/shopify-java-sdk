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
* Represents a discount that was manually created for an order that is being edited.
*/
public class CalculatedManualDiscountApplicationQuery extends Query<CalculatedManualDiscountApplicationQuery> {
    CalculatedManualDiscountApplicationQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * The method by which the discount's value is allocated to its entitled items.
    */
    public CalculatedManualDiscountApplicationQuery allocationMethod() {
        startField("allocationMethod");

        return this;
    }

    /**
    * The level at which the discount was applied.
    */
    public CalculatedManualDiscountApplicationQuery appliedTo() {
        startField("appliedTo");

        return this;
    }

    /**
    * The description of discount application. Indicates the reason why the discount was applied.
    */
    public CalculatedManualDiscountApplicationQuery description() {
        startField("description");

        return this;
    }

    /**
    * A globally-unique ID.
    */
    public CalculatedManualDiscountApplicationQuery id() {
        startField("id");

        return this;
    }

    /**
    * How the discount amount is distributed on the discounted lines.
    */
    public CalculatedManualDiscountApplicationQuery targetSelection() {
        startField("targetSelection");

        return this;
    }

    /**
    * Whether the discount is applied on line items or shipping lines.
    */
    public CalculatedManualDiscountApplicationQuery targetType() {
        startField("targetType");

        return this;
    }

    /**
    * The value of the discount application.
    */
    public CalculatedManualDiscountApplicationQuery value(PricingValueQueryDefinition queryDef) {
        startField("value");

        _queryBuilder.append('{');
        queryDef.define(new PricingValueQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }
}
