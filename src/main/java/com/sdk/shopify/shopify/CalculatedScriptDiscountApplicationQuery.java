// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* A discount created by a Shopify script for an order that is being edited.
*/
public class CalculatedScriptDiscountApplicationQuery extends Query<CalculatedScriptDiscountApplicationQuery> {
    CalculatedScriptDiscountApplicationQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * The method by which the discount's value is allocated to its entitled items.
    */
    public CalculatedScriptDiscountApplicationQuery allocationMethod() {
        startField("allocationMethod");

        return this;
    }

    /**
    * The level at which the discount was applied.
    */
    public CalculatedScriptDiscountApplicationQuery appliedTo() {
        startField("appliedTo");

        return this;
    }

    /**
    * The description of discount application. Indicates the reason why the discount was applied.
    */
    public CalculatedScriptDiscountApplicationQuery description() {
        startField("description");

        return this;
    }

    /**
    * A globally-unique ID.
    */
    public CalculatedScriptDiscountApplicationQuery id() {
        startField("id");

        return this;
    }

    /**
    * How the discount amount is distributed on the discounted lines.
    */
    public CalculatedScriptDiscountApplicationQuery targetSelection() {
        startField("targetSelection");

        return this;
    }

    /**
    * Whether the discount is applied on line items or shipping lines.
    */
    public CalculatedScriptDiscountApplicationQuery targetType() {
        startField("targetType");

        return this;
    }

    /**
    * The value of the discount application.
    */
    public CalculatedScriptDiscountApplicationQuery value(PricingValueQueryDefinition queryDef) {
        startField("value");

        _queryBuilder.append('{');
        queryDef.define(new PricingValueQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }
}
