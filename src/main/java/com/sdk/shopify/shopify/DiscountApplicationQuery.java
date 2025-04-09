// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* Discount applications capture the intentions of a discount source at
* the time of application on an order's line items or shipping lines.
* Discount applications don't represent the actual final amount discounted on a line (line item or
* shipping line). The actual amount discounted on a line is represented by the
* [DiscountAllocation](https://shopify.dev/api/admin-graphql/latest/objects/discountallocation)
* object.
*/
public class DiscountApplicationQuery extends Query<DiscountApplicationQuery> {
    DiscountApplicationQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);

        startField("__typename");
    }

    /**
    * The method by which the discount's value is applied to its entitled items.
    */
    public DiscountApplicationQuery allocationMethod() {
        startField("allocationMethod");

        return this;
    }

    /**
    * An ordered index that can be used to identify the discount application and indicate the precedence
    * of the discount application for calculations.
    */
    public DiscountApplicationQuery index() {
        startField("index");

        return this;
    }

    /**
    * How the discount amount is distributed on the discounted lines.
    */
    public DiscountApplicationQuery targetSelection() {
        startField("targetSelection");

        return this;
    }

    /**
    * Whether the discount is applied on line items or shipping lines.
    */
    public DiscountApplicationQuery targetType() {
        startField("targetType");

        return this;
    }

    /**
    * The value of the discount application.
    */
    public DiscountApplicationQuery value(PricingValueQueryDefinition queryDef) {
        startField("value");

        _queryBuilder.append('{');
        queryDef.define(new PricingValueQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    public DiscountApplicationQuery onAutomaticDiscountApplication(AutomaticDiscountApplicationQueryDefinition queryDef) {
        startInlineFragment("AutomaticDiscountApplication");
        queryDef.define(new AutomaticDiscountApplicationQuery(_queryBuilder));
        _queryBuilder.append('}');
        return this;
    }

    public DiscountApplicationQuery onDiscountCodeApplication(DiscountCodeApplicationQueryDefinition queryDef) {
        startInlineFragment("DiscountCodeApplication");
        queryDef.define(new DiscountCodeApplicationQuery(_queryBuilder));
        _queryBuilder.append('}');
        return this;
    }

    public DiscountApplicationQuery onManualDiscountApplication(ManualDiscountApplicationQueryDefinition queryDef) {
        startInlineFragment("ManualDiscountApplication");
        queryDef.define(new ManualDiscountApplicationQuery(_queryBuilder));
        _queryBuilder.append('}');
        return this;
    }

    public DiscountApplicationQuery onScriptDiscountApplication(ScriptDiscountApplicationQueryDefinition queryDef) {
        startInlineFragment("ScriptDiscountApplication");
        queryDef.define(new ScriptDiscountApplicationQuery(_queryBuilder));
        _queryBuilder.append('}');
        return this;
    }
}
