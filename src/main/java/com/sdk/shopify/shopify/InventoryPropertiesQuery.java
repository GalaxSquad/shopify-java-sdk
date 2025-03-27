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
* General inventory properties for the shop.
*/
public class InventoryPropertiesQuery extends Query<InventoryPropertiesQuery> {
    InventoryPropertiesQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * All the quantity names.
    */
    public InventoryPropertiesQuery quantityNames(InventoryQuantityNameQueryDefinition queryDef) {
        startField("quantityNames");

        _queryBuilder.append('{');
        queryDef.define(new InventoryQuantityNameQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }
}
