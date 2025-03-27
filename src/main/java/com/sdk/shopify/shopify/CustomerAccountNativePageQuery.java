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
* A native page for the customer account navigation menu.
*/
public class CustomerAccountNativePageQuery extends Query<CustomerAccountNativePageQuery> {
    CustomerAccountNativePageQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);

        startField("id");
    }

    /**
    * A default [cursor](https://shopify.dev/api/usage/pagination-graphql) that returns the single next
    * record, sorted ascending by ID.
    */
    public CustomerAccountNativePageQuery defaultCursor() {
        startField("defaultCursor");

        return this;
    }

    /**
    * A unique, human-friendly string for the customer account page.
    */
    public CustomerAccountNativePageQuery handle() {
        startField("handle");

        return this;
    }

    /**
    * The type of customer account native page.
    */
    public CustomerAccountNativePageQuery pageType() {
        startField("pageType");

        return this;
    }

    /**
    * The title of the customer account page.
    */
    public CustomerAccountNativePageQuery title() {
        startField("title");

        return this;
    }
}
