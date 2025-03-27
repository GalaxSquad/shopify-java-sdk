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
* Return type for `deliveryPromiseParticipantsUpdate` mutation.
*/
public class DeliveryPromiseParticipantsUpdatePayloadQuery extends Query<DeliveryPromiseParticipantsUpdatePayloadQuery> {
    DeliveryPromiseParticipantsUpdatePayloadQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * The promise participants that were added.
    */
    public DeliveryPromiseParticipantsUpdatePayloadQuery promiseParticipants(DeliveryPromiseParticipantQueryDefinition queryDef) {
        startField("promiseParticipants");

        _queryBuilder.append('{');
        queryDef.define(new DeliveryPromiseParticipantQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The list of errors that occurred from executing the mutation.
    */
    public DeliveryPromiseParticipantsUpdatePayloadQuery userErrors(UserErrorQueryDefinition queryDef) {
        startField("userErrors");

        _queryBuilder.append('{');
        queryDef.define(new UserErrorQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }
}
