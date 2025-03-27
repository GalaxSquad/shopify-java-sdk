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
* Return type for `locationDelete` mutation.
*/
public class LocationDeletePayloadQuery extends Query<LocationDeletePayloadQuery> {
    LocationDeletePayloadQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * The ID of the location that was deleted.
    */
    public LocationDeletePayloadQuery deletedLocationId() {
        startField("deletedLocationId");

        return this;
    }

    /**
    * The list of errors that occurred from executing the mutation.
    */
    public LocationDeletePayloadQuery locationDeleteUserErrors(LocationDeleteUserErrorQueryDefinition queryDef) {
        startField("locationDeleteUserErrors");

        _queryBuilder.append('{');
        queryDef.define(new LocationDeleteUserErrorQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }
}
