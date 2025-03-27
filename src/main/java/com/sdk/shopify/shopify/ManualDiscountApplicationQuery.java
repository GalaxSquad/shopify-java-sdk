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
* Manual discount applications capture the intentions of a discount that was manually created for an
* order.
* Discount applications don't represent the actual final amount discounted on a line (line item or
* shipping line). The actual amount discounted on a line is represented by the
* [DiscountAllocation](https://shopify.dev/api/admin-graphql/latest/objects/discountallocation)
* object.
*/
public class ManualDiscountApplicationQuery extends Query<ManualDiscountApplicationQuery> {
    ManualDiscountApplicationQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * The method by which the discount's value is applied to its entitled items.
    */
    public ManualDiscountApplicationQuery allocationMethod() {
        startField("allocationMethod");

        return this;
    }

    /**
    * The description of the discount application.
    */
    public ManualDiscountApplicationQuery description() {
        startField("description");

        return this;
    }

    /**
    * An ordered index that can be used to identify the discount application and indicate the precedence
    * of the discount application for calculations.
    */
    public ManualDiscountApplicationQuery index() {
        startField("index");

        return this;
    }

    /**
    * How the discount amount is distributed on the discounted lines.
    */
    public ManualDiscountApplicationQuery targetSelection() {
        startField("targetSelection");

        return this;
    }

    /**
    * Whether the discount is applied on line items or shipping lines.
    */
    public ManualDiscountApplicationQuery targetType() {
        startField("targetType");

        return this;
    }

    /**
    * The title of the discount application.
    */
    public ManualDiscountApplicationQuery title() {
        startField("title");

        return this;
    }

    /**
    * The value of the discount application.
    */
    public ManualDiscountApplicationQuery value(PricingValueQueryDefinition queryDef) {
        startField("value");

        _queryBuilder.append('{');
        queryDef.define(new PricingValueQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }
}
