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
* Localization extensions associated with the specified resource. For example, the tax id for
* government invoice.
*/
public class HasLocalizationExtensionsQuery extends Query<HasLocalizationExtensionsQuery> {
    HasLocalizationExtensionsQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);

        startField("__typename");
    }

    public HasLocalizationExtensionsQuery onDraftOrder(DraftOrderQueryDefinition queryDef) {
        startInlineFragment("DraftOrder");
        queryDef.define(new DraftOrderQuery(_queryBuilder));
        _queryBuilder.append('}');
        return this;
    }

    public HasLocalizationExtensionsQuery onOrder(OrderQueryDefinition queryDef) {
        startInlineFragment("Order");
        queryDef.define(new OrderQuery(_queryBuilder));
        _queryBuilder.append('}');
        return this;
    }
}
