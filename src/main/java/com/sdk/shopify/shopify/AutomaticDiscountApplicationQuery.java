// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* Automatic discount applications capture the intentions of a discount that was automatically applied.
*/
public class AutomaticDiscountApplicationQuery extends Query<AutomaticDiscountApplicationQuery> {
    AutomaticDiscountApplicationQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * The method by which the discount's value is applied to its entitled items.
    */
    public AutomaticDiscountApplicationQuery allocationMethod() {
        startField("allocationMethod");

        return this;
    }

    /**
    * An ordered index that can be used to identify the discount application and indicate the precedence
    * of the discount application for calculations.
    */
    public AutomaticDiscountApplicationQuery index() {
        startField("index");

        return this;
    }

    /**
    * How the discount amount is distributed on the discounted lines.
    */
    public AutomaticDiscountApplicationQuery targetSelection() {
        startField("targetSelection");

        return this;
    }

    /**
    * Whether the discount is applied on line items or shipping lines.
    */
    public AutomaticDiscountApplicationQuery targetType() {
        startField("targetType");

        return this;
    }

    /**
    * The title of the discount application.
    */
    public AutomaticDiscountApplicationQuery title() {
        startField("title");

        return this;
    }

    /**
    * The value of the discount application.
    */
    public AutomaticDiscountApplicationQuery value(PricingValueQueryDefinition queryDef) {
        startField("value");

        _queryBuilder.append('{');
        queryDef.define(new PricingValueQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }
}
