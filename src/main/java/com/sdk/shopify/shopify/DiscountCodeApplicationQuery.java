// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* Discount code applications capture the intentions of a discount code at
* the time that it is applied onto an order.
* Discount applications don't represent the actual final amount discounted on a line (line item or
* shipping line). The actual amount discounted on a line is represented by the
* [DiscountAllocation](https://shopify.dev/api/admin-graphql/latest/objects/discountallocation)
* object.
*/
public class DiscountCodeApplicationQuery extends Query<DiscountCodeApplicationQuery> {
    DiscountCodeApplicationQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * The method by which the discount's value is applied to its entitled items.
    */
    public DiscountCodeApplicationQuery allocationMethod() {
        startField("allocationMethod");

        return this;
    }

    /**
    * The string identifying the discount code that was used at the time of application.
    */
    public DiscountCodeApplicationQuery code() {
        startField("code");

        return this;
    }

    /**
    * An ordered index that can be used to identify the discount application and indicate the precedence
    * of the discount application for calculations.
    */
    public DiscountCodeApplicationQuery index() {
        startField("index");

        return this;
    }

    /**
    * How the discount amount is distributed on the discounted lines.
    */
    public DiscountCodeApplicationQuery targetSelection() {
        startField("targetSelection");

        return this;
    }

    /**
    * Whether the discount is applied on line items or shipping lines.
    */
    public DiscountCodeApplicationQuery targetType() {
        startField("targetType");

        return this;
    }

    /**
    * The value of the discount application.
    */
    public DiscountCodeApplicationQuery value(PricingValueQueryDefinition queryDef) {
        startField("value");

        _queryBuilder.append('{');
        queryDef.define(new PricingValueQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }
}
