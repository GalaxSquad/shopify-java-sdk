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
* Represents a generic custom attribute, such as whether an order is a customer's first.
*/
public class AttributeQuery extends Query<AttributeQuery> {
    AttributeQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * The key or name of the attribute. For example, `"customersFirstOrder"`.
    */
    public AttributeQuery key() {
        startField("key");

        return this;
    }

    /**
    * The value of the attribute. For example, `"true"`.
    */
    public AttributeQuery value() {
        startField("value");

        return this;
    }
}
