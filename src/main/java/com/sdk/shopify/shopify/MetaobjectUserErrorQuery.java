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
* Defines errors encountered while managing metaobject resources.
*/
public class MetaobjectUserErrorQuery extends Query<MetaobjectUserErrorQuery> {
    MetaobjectUserErrorQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * The error code.
    */
    public MetaobjectUserErrorQuery code() {
        startField("code");

        return this;
    }

    /**
    * The index of the failing list element in an array.
    */
    public MetaobjectUserErrorQuery elementIndex() {
        startField("elementIndex");

        return this;
    }

    /**
    * The key of the failing object element.
    */
    public MetaobjectUserErrorQuery elementKey() {
        startField("elementKey");

        return this;
    }

    /**
    * The path to the input field that caused the error.
    */
    public MetaobjectUserErrorQuery field() {
        startField("field");

        return this;
    }

    /**
    * The error message.
    */
    public MetaobjectUserErrorQuery message() {
        startField("message");

        return this;
    }
}
