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
* Represents an error in the input of a mutation.
*/
public class CustomerPaymentMethodRemoteUserErrorQuery extends Query<CustomerPaymentMethodRemoteUserErrorQuery> {
    CustomerPaymentMethodRemoteUserErrorQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * The error code.
    */
    public CustomerPaymentMethodRemoteUserErrorQuery code() {
        startField("code");

        return this;
    }

    /**
    * The path to the input field that caused the error.
    */
    public CustomerPaymentMethodRemoteUserErrorQuery field() {
        startField("field");

        return this;
    }

    /**
    * The error message.
    */
    public CustomerPaymentMethodRemoteUserErrorQuery message() {
        startField("message");

        return this;
    }
}
