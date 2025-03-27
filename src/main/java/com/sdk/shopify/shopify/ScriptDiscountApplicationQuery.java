// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* Script discount applications capture the intentions of a discount that
* was created by a Shopify Script for an order's line item or shipping line.
* Discount applications don't represent the actual final amount discounted on a line (line item or
* shipping line). The actual amount discounted on a line is represented by the
* [DiscountAllocation](https://shopify.dev/api/admin-graphql/latest/objects/discountallocation)
* object.
*/
public class ScriptDiscountApplicationQuery extends Query<ScriptDiscountApplicationQuery> {
    ScriptDiscountApplicationQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * The method by which the discount's value is applied to its entitled items.
    */
    public ScriptDiscountApplicationQuery allocationMethod() {
        startField("allocationMethod");

        return this;
    }

    /**
    * An ordered index that can be used to identify the discount application and indicate the precedence
    * of the discount application for calculations.
    */
    public ScriptDiscountApplicationQuery index() {
        startField("index");

        return this;
    }

    /**
    * How the discount amount is distributed on the discounted lines.
    */
    public ScriptDiscountApplicationQuery targetSelection() {
        startField("targetSelection");

        return this;
    }

    /**
    * Whether the discount is applied on line items or shipping lines.
    */
    public ScriptDiscountApplicationQuery targetType() {
        startField("targetType");

        return this;
    }

    /**
    * The title of the application as defined by the Script.
    */
    public ScriptDiscountApplicationQuery title() {
        startField("title");

        return this;
    }

    /**
    * The value of the discount application.
    */
    public ScriptDiscountApplicationQuery value(PricingValueQueryDefinition queryDef) {
        startField("value");

        _queryBuilder.append('{');
        queryDef.define(new PricingValueQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }
}
