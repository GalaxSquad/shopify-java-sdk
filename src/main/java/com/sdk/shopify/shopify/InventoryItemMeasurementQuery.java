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
* Represents the packaged dimension for an inventory item.
*/
public class InventoryItemMeasurementQuery extends Query<InventoryItemMeasurementQuery> {
    InventoryItemMeasurementQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);

        startField("id");
    }

    /**
    * The weight of the inventory item.
    */
    public InventoryItemMeasurementQuery weight(WeightQueryDefinition queryDef) {
        startField("weight");

        _queryBuilder.append('{');
        queryDef.define(new WeightQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }
}
