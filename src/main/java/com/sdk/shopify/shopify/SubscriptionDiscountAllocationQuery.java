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
* Represents what a particular discount reduces from a line price.
*/
public class SubscriptionDiscountAllocationQuery extends Query<SubscriptionDiscountAllocationQuery> {
    SubscriptionDiscountAllocationQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * Allocation amount.
    */
    public SubscriptionDiscountAllocationQuery amount(MoneyV2QueryDefinition queryDef) {
        startField("amount");

        _queryBuilder.append('{');
        queryDef.define(new MoneyV2Query(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * Discount that created the allocation.
    */
    public SubscriptionDiscountAllocationQuery discount(SubscriptionDiscountQueryDefinition queryDef) {
        startField("discount");

        _queryBuilder.append('{');
        queryDef.define(new SubscriptionDiscountQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }
}
