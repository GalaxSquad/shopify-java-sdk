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
* A carrier service and the associated list of shop locations.
*/
public class DeliveryCarrierServiceAndLocationsQuery extends Query<DeliveryCarrierServiceAndLocationsQuery> {
    DeliveryCarrierServiceAndLocationsQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * The carrier service.
    */
    public DeliveryCarrierServiceAndLocationsQuery carrierService(DeliveryCarrierServiceQueryDefinition queryDef) {
        startField("carrierService");

        _queryBuilder.append('{');
        queryDef.define(new DeliveryCarrierServiceQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The list of locations that support this carrier service.
    */
    public DeliveryCarrierServiceAndLocationsQuery locations(LocationQueryDefinition queryDef) {
        startField("locations");

        _queryBuilder.append('{');
        queryDef.define(new LocationQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }
}
