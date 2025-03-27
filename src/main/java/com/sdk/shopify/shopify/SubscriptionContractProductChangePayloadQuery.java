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
* Return type for `subscriptionContractProductChange` mutation.
*/
public class SubscriptionContractProductChangePayloadQuery extends Query<SubscriptionContractProductChangePayloadQuery> {
    SubscriptionContractProductChangePayloadQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * The new Subscription Contract object.
    */
    public SubscriptionContractProductChangePayloadQuery contract(SubscriptionContractQueryDefinition queryDef) {
        startField("contract");

        _queryBuilder.append('{');
        queryDef.define(new SubscriptionContractQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The updated Subscription Line.
    */
    public SubscriptionContractProductChangePayloadQuery lineUpdated(SubscriptionLineQueryDefinition queryDef) {
        startField("lineUpdated");

        _queryBuilder.append('{');
        queryDef.define(new SubscriptionLineQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The list of errors that occurred from executing the mutation.
    */
    public SubscriptionContractProductChangePayloadQuery userErrors(SubscriptionDraftUserErrorQueryDefinition queryDef) {
        startField("userErrors");

        _queryBuilder.append('{');
        queryDef.define(new SubscriptionDraftUserErrorQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }
}
