// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* A [discount
* application](https://shopify.dev/api/admin-graphql/latest/interfaces/discountapplication) involved
* in order editing that might be newly added or have new changes applied.
*/
public class CalculatedDiscountApplicationQuery extends Query<CalculatedDiscountApplicationQuery> {
    CalculatedDiscountApplicationQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);

        startField("__typename");
    }

    /**
    * The method by which the discount's value is allocated to its entitled items.
    */
    public CalculatedDiscountApplicationQuery allocationMethod() {
        startField("allocationMethod");

        return this;
    }

    /**
    * The level at which the discount was applied.
    */
    public CalculatedDiscountApplicationQuery appliedTo() {
        startField("appliedTo");

        return this;
    }

    /**
    * The description of discount application. Indicates the reason why the discount was applied.
    */
    public CalculatedDiscountApplicationQuery description() {
        startField("description");

        return this;
    }

    /**
    * A globally-unique ID.
    */
    public CalculatedDiscountApplicationQuery id() {
        startField("id");

        return this;
    }

    /**
    * How the discount amount is distributed on the discounted lines.
    */
    public CalculatedDiscountApplicationQuery targetSelection() {
        startField("targetSelection");

        return this;
    }

    /**
    * Whether the discount is applied on line items or shipping lines.
    */
    public CalculatedDiscountApplicationQuery targetType() {
        startField("targetType");

        return this;
    }

    /**
    * The value of the discount application.
    */
    public CalculatedDiscountApplicationQuery value(PricingValueQueryDefinition queryDef) {
        startField("value");

        _queryBuilder.append('{');
        queryDef.define(new PricingValueQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    public CalculatedDiscountApplicationQuery onCalculatedAutomaticDiscountApplication(CalculatedAutomaticDiscountApplicationQueryDefinition queryDef) {
        startInlineFragment("CalculatedAutomaticDiscountApplication");
        queryDef.define(new CalculatedAutomaticDiscountApplicationQuery(_queryBuilder));
        _queryBuilder.append('}');
        return this;
    }

    public CalculatedDiscountApplicationQuery onCalculatedDiscountCodeApplication(CalculatedDiscountCodeApplicationQueryDefinition queryDef) {
        startInlineFragment("CalculatedDiscountCodeApplication");
        queryDef.define(new CalculatedDiscountCodeApplicationQuery(_queryBuilder));
        _queryBuilder.append('}');
        return this;
    }

    public CalculatedDiscountApplicationQuery onCalculatedManualDiscountApplication(CalculatedManualDiscountApplicationQueryDefinition queryDef) {
        startInlineFragment("CalculatedManualDiscountApplication");
        queryDef.define(new CalculatedManualDiscountApplicationQuery(_queryBuilder));
        _queryBuilder.append('}');
        return this;
    }

    public CalculatedDiscountApplicationQuery onCalculatedScriptDiscountApplication(CalculatedScriptDiscountApplicationQueryDefinition queryDef) {
        startInlineFragment("CalculatedScriptDiscountApplication");
        queryDef.define(new CalculatedScriptDiscountApplicationQuery(_queryBuilder));
        _queryBuilder.append('}');
        return this;
    }
}
