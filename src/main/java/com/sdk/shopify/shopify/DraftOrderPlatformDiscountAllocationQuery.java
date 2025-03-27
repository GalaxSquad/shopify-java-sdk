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
* Price reduction allocations across the draft order's lines.
*/
public class DraftOrderPlatformDiscountAllocationQuery extends Query<DraftOrderPlatformDiscountAllocationQuery> {
    DraftOrderPlatformDiscountAllocationQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * The ID of the allocation.
    */
    public DraftOrderPlatformDiscountAllocationQuery id() {
        startField("id");

        return this;
    }

    /**
    * The quantity of the target being discounted.
    */
    public DraftOrderPlatformDiscountAllocationQuery quantity() {
        startField("quantity");

        return this;
    }

    /**
    * Amount of the discount allocated to the target.
    */
    public DraftOrderPlatformDiscountAllocationQuery reductionAmount(MoneyV2QueryDefinition queryDef) {
        startField("reductionAmount");

        _queryBuilder.append('{');
        queryDef.define(new MoneyV2Query(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * Amount of the discount allocated to the target in both shop currency and presentment currency.
    */
    public DraftOrderPlatformDiscountAllocationQuery reductionAmountSet(MoneyBagQueryDefinition queryDef) {
        startField("reductionAmountSet");

        _queryBuilder.append('{');
        queryDef.define(new MoneyBagQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The element of the draft being discounted.
    */
    public DraftOrderPlatformDiscountAllocationQuery target(DraftOrderPlatformDiscountAllocationTargetQueryDefinition queryDef) {
        startField("target");

        _queryBuilder.append('{');
        queryDef.define(new DraftOrderPlatformDiscountAllocationTargetQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }
}
