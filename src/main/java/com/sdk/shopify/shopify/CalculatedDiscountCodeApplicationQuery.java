// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* A discount code that is applied to an order that is being edited.
*/
public class CalculatedDiscountCodeApplicationQuery extends Query<CalculatedDiscountCodeApplicationQuery> {
    CalculatedDiscountCodeApplicationQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * The method by which the discount's value is allocated to its entitled items.
    */
    public CalculatedDiscountCodeApplicationQuery allocationMethod() {
        startField("allocationMethod");

        return this;
    }

    /**
    * The level at which the discount was applied.
    */
    public CalculatedDiscountCodeApplicationQuery appliedTo() {
        startField("appliedTo");

        return this;
    }

    /**
    * The string identifying the discount code that was used at the time of application.
    */
    public CalculatedDiscountCodeApplicationQuery code() {
        startField("code");

        return this;
    }

    /**
    * The description of discount application. Indicates the reason why the discount was applied.
    */
    public CalculatedDiscountCodeApplicationQuery description() {
        startField("description");

        return this;
    }

    /**
    * A globally-unique ID.
    */
    public CalculatedDiscountCodeApplicationQuery id() {
        startField("id");

        return this;
    }

    /**
    * How the discount amount is distributed on the discounted lines.
    */
    public CalculatedDiscountCodeApplicationQuery targetSelection() {
        startField("targetSelection");

        return this;
    }

    /**
    * Whether the discount is applied on line items or shipping lines.
    */
    public CalculatedDiscountCodeApplicationQuery targetType() {
        startField("targetType");

        return this;
    }

    /**
    * The value of the discount application.
    */
    public CalculatedDiscountCodeApplicationQuery value(PricingValueQueryDefinition queryDef) {
        startField("value");

        _queryBuilder.append('{');
        queryDef.define(new PricingValueQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }
}
