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
* Each subject (individual) of an account has a verification object giving
* information about the verification state.
*/
public class ShopifyPaymentsVerificationQuery extends Query<ShopifyPaymentsVerificationQuery> {
    ShopifyPaymentsVerificationQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);

        startField("id");
    }

    /**
    * The status of the verification.
    */
    public ShopifyPaymentsVerificationQuery status() {
        startField("status");

        return this;
    }

    /**
    * The subject/individual who has to be verified.
    */
    public ShopifyPaymentsVerificationQuery subject(ShopifyPaymentsVerificationSubjectQueryDefinition queryDef) {
        startField("subject");

        _queryBuilder.append('{');
        queryDef.define(new ShopifyPaymentsVerificationSubjectQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }
}
