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
* Represents a typed custom attribute.
*/
public class TypedAttributeQuery extends Query<TypedAttributeQuery> {
    TypedAttributeQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * Key or name of the attribute.
    */
    public TypedAttributeQuery key() {
        startField("key");

        return this;
    }

    /**
    * Value of the attribute.
    */
    public TypedAttributeQuery value() {
        startField("value");

        return this;
    }
}
