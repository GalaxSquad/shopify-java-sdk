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
* The platform discounts applied to the draft order.
*/
public class DraftOrderPlatformDiscountQuery extends Query<DraftOrderPlatformDiscountQuery> {
    DraftOrderPlatformDiscountQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * Price reduction allocations across the draft order's lines.
    */
    public DraftOrderPlatformDiscountQuery allocations(DraftOrderPlatformDiscountAllocationQueryDefinition queryDef) {
        startField("allocations");

        _queryBuilder.append('{');
        queryDef.define(new DraftOrderPlatformDiscountAllocationQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * Whether the discount is an automatic discount.
    */
    public DraftOrderPlatformDiscountQuery automaticDiscount() {
        startField("automaticDiscount");

        return this;
    }

    /**
    * Whether the discount is a buy x get y discount.
    */
    public DraftOrderPlatformDiscountQuery bxgyDiscount() {
        startField("bxgyDiscount");

        return this;
    }

    /**
    * If a code-based discount, the code used to add the discount.
    */
    public DraftOrderPlatformDiscountQuery code() {
        startField("code");

        return this;
    }

    /**
    * The discount node for the platform discount.
    */
    public DraftOrderPlatformDiscountQuery discountNode(DiscountNodeQueryDefinition queryDef) {
        startField("discountNode");

        _queryBuilder.append('{');
        queryDef.define(new DiscountNodeQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The ID of the discount.
    */
    public DraftOrderPlatformDiscountQuery id() {
        startField("id");

        return this;
    }

    /**
    * Whether the discount is line, order or shipping level.
    */
    public DraftOrderPlatformDiscountQuery presentationLevel() {
        startField("presentationLevel");

        return this;
    }

    /**
    * The short summary of the discount.
    */
    public DraftOrderPlatformDiscountQuery shortSummary() {
        startField("shortSummary");

        return this;
    }

    /**
    * The summary of the discount.
    */
    public DraftOrderPlatformDiscountQuery summary() {
        startField("summary");

        return this;
    }

    /**
    * The name of the discount.
    */
    public DraftOrderPlatformDiscountQuery title() {
        startField("title");

        return this;
    }

    /**
    * The discount total amount in shop currency.
    */
    public DraftOrderPlatformDiscountQuery totalAmount(MoneyV2QueryDefinition queryDef) {
        startField("totalAmount");

        _queryBuilder.append('{');
        queryDef.define(new MoneyV2Query(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The amount of money discounted, with values shown in both shop currency and presentment currency.
    */
    public DraftOrderPlatformDiscountQuery totalAmountPriceSet(MoneyBagQueryDefinition queryDef) {
        startField("totalAmountPriceSet");

        _queryBuilder.append('{');
        queryDef.define(new MoneyBagQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }
}
