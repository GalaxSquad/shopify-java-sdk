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
* The type used to target the items required for discount eligibility, or the items to which the
* application of a discount might apply. For example, for a customer to be eligible for a discount,
* they're required to add an item from a specified collection to their order. Alternatively, a
* customer might be required to add a specific product or product variant. When using this type to
* target which items the discount will apply to, the discount might apply to all items on the order,
* or to specific products and product variants, or items in a given collection.
*/
public class DiscountItemsQuery extends Query<DiscountItemsQuery> {
    DiscountItemsQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);

        startField("__typename");
    }

    public DiscountItemsQuery onAllDiscountItems(AllDiscountItemsQueryDefinition queryDef) {
        startInlineFragment("AllDiscountItems");
        queryDef.define(new AllDiscountItemsQuery(_queryBuilder));
        _queryBuilder.append('}');
        return this;
    }

    public DiscountItemsQuery onDiscountCollections(DiscountCollectionsQueryDefinition queryDef) {
        startInlineFragment("DiscountCollections");
        queryDef.define(new DiscountCollectionsQuery(_queryBuilder));
        _queryBuilder.append('}');
        return this;
    }

    public DiscountItemsQuery onDiscountProducts(DiscountProductsQueryDefinition queryDef) {
        startInlineFragment("DiscountProducts");
        queryDef.define(new DiscountProductsQuery(_queryBuilder));
        _queryBuilder.append('}');
        return this;
    }
}
