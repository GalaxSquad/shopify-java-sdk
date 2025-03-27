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
* The details of the arrangement of an item.
*/
public class ReverseFulfillmentOrderDispositionQuery extends Query<ReverseFulfillmentOrderDispositionQuery> {
    ReverseFulfillmentOrderDispositionQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);

        startField("id");
    }

    /**
    * The location where the disposition occurred.
    */
    public ReverseFulfillmentOrderDispositionQuery location(LocationQueryDefinition queryDef) {
        startField("location");

        _queryBuilder.append('{');
        queryDef.define(new LocationQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The number of disposed units.
    */
    public ReverseFulfillmentOrderDispositionQuery quantity() {
        startField("quantity");

        return this;
    }

    /**
    * The final arrangement of an item.
    */
    public ReverseFulfillmentOrderDispositionQuery type() {
        startField("type");

        return this;
    }
}
