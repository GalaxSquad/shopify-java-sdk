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
* A phone number.
*/
public class CustomerPhoneNumberQuery extends Query<CustomerPhoneNumberQuery> {
    CustomerPhoneNumberQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * Whether the customer has subscribed to SMS marketing material.
    */
    public CustomerPhoneNumberQuery marketingState() {
        startField("marketingState");

        return this;
    }

    /**
    * A customer's phone number.
    */
    public CustomerPhoneNumberQuery phoneNumber() {
        startField("phoneNumber");

        return this;
    }
}
