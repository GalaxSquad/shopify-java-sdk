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
* The permission required to access a Shopify Admin API or Storefront API resource for a shop.
* Merchants grant access scopes that are requested by applications.
*/
public class AccessScopeQuery extends Query<AccessScopeQuery> {
    AccessScopeQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * A description of the actions that the access scope allows an app to perform.
    */
    public AccessScopeQuery description() {
        startField("description");

        return this;
    }

    /**
    * A readable string that represents the access scope. The string usually follows the format
    * `{action}_{resource}`. `{action}` is `read` or `write`, and `{resource}` is the resource that the
    * action can be performed on. `{action}` and `{resource}` are separated by an underscore. For example,
    * `read_orders` or `write_products`.
    */
    public AccessScopeQuery handle() {
        startField("handle");

        return this;
    }
}
