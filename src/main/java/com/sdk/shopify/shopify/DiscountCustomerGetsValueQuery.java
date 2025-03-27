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
* The type of the discount value and how it will be applied. For example, it might be a percentage
* discount on a fixed number of items. Alternatively, it might be a fixed amount evenly distributed
* across all items or on each individual item. A third example is a percentage discount on all items.
*/
public class DiscountCustomerGetsValueQuery extends Query<DiscountCustomerGetsValueQuery> {
    DiscountCustomerGetsValueQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);

        startField("__typename");
    }

    public DiscountCustomerGetsValueQuery onDiscountAmount(DiscountAmountQueryDefinition queryDef) {
        startInlineFragment("DiscountAmount");
        queryDef.define(new DiscountAmountQuery(_queryBuilder));
        _queryBuilder.append('}');
        return this;
    }

    public DiscountCustomerGetsValueQuery onDiscountOnQuantity(DiscountOnQuantityQueryDefinition queryDef) {
        startInlineFragment("DiscountOnQuantity");
        queryDef.define(new DiscountOnQuantityQuery(_queryBuilder));
        _queryBuilder.append('}');
        return this;
    }

    public DiscountCustomerGetsValueQuery onDiscountPercentage(DiscountPercentageQueryDefinition queryDef) {
        startInlineFragment("DiscountPercentage");
        queryDef.define(new DiscountPercentageQuery(_queryBuilder));
        _queryBuilder.append('}');
        return this;
    }
}
