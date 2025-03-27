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
* The country details and the associated shipping zone.
*/
public class DeliveryCountryAndZoneQuery extends Query<DeliveryCountryAndZoneQuery> {
    DeliveryCountryAndZoneQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * The country details.
    */
    public DeliveryCountryAndZoneQuery country(DeliveryCountryQueryDefinition queryDef) {
        startField("country");

        _queryBuilder.append('{');
        queryDef.define(new DeliveryCountryQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The name of the shipping zone.
    */
    public DeliveryCountryAndZoneQuery zone() {
        startField("zone");

        return this;
    }
}
