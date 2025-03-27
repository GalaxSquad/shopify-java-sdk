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
* An explicit access grant for the metafields under this definition.
* Explicit grants are
* [deprecated](https://shopify.dev/changelog/deprecating-explicit-access-grants-for-app-owned-metafiel
* ds).
*/
public class MetafieldAccessGrantQuery extends Query<MetafieldAccessGrantQuery> {
    MetafieldAccessGrantQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * The level of access the grantee has.
    */
    public MetafieldAccessGrantQuery access() {
        startField("access");

        return this;
    }

    /**
    * The grantee being granted access.
    */
    public MetafieldAccessGrantQuery grantee() {
        startField("grantee");

        return this;
    }
}
