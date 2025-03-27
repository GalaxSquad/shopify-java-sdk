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
* The number of method definitions for a zone, separated into merchant-owned and participant
* definitions.
*/
public class DeliveryMethodDefinitionCountsQuery extends Query<DeliveryMethodDefinitionCountsQuery> {
    DeliveryMethodDefinitionCountsQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * The number of participant method definitions for the specified zone.
    */
    public DeliveryMethodDefinitionCountsQuery participantDefinitionsCount() {
        startField("participantDefinitionsCount");

        return this;
    }

    /**
    * The number of merchant-defined method definitions for the specified zone.
    */
    public DeliveryMethodDefinitionCountsQuery rateDefinitionsCount() {
        startField("rateDefinitionsCount");

        return this;
    }
}
