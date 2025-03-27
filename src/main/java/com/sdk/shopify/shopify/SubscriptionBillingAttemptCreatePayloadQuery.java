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
* Return type for `subscriptionBillingAttemptCreate` mutation.
*/
public class SubscriptionBillingAttemptCreatePayloadQuery extends Query<SubscriptionBillingAttemptCreatePayloadQuery> {
    SubscriptionBillingAttemptCreatePayloadQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * The subscription billing attempt.
    */
    public SubscriptionBillingAttemptCreatePayloadQuery subscriptionBillingAttempt(SubscriptionBillingAttemptQueryDefinition queryDef) {
        startField("subscriptionBillingAttempt");

        _queryBuilder.append('{');
        queryDef.define(new SubscriptionBillingAttemptQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The list of errors that occurred from executing the mutation.
    */
    public SubscriptionBillingAttemptCreatePayloadQuery userErrors(BillingAttemptUserErrorQueryDefinition queryDef) {
        startField("userErrors");

        _queryBuilder.append('{');
        queryDef.define(new BillingAttemptUserErrorQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }
}
