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
* The Apple mobile platform application.
*/
public class AppleApplicationQuery extends Query<AppleApplicationQuery> {
    AppleApplicationQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * The iOS App Clip application ID.
    */
    public AppleApplicationQuery appClipApplicationId() {
        startField("appClipApplicationId");

        return this;
    }

    /**
    * Whether iOS App Clips are enabled for this app.
    */
    public AppleApplicationQuery appClipsEnabled() {
        startField("appClipsEnabled");

        return this;
    }

    /**
    * The iOS App ID.
    */
    public AppleApplicationQuery appId() {
        startField("appId");

        return this;
    }

    /**
    * A globally-unique ID.
    */
    public AppleApplicationQuery id() {
        startField("id");

        return this;
    }

    /**
    * Whether iOS shared web credentials are enabled for this app.
    */
    public AppleApplicationQuery sharedWebCredentialsEnabled() {
        startField("sharedWebCredentialsEnabled");

        return this;
    }

    /**
    * Whether iOS Universal Links are supported by this app.
    */
    public AppleApplicationQuery universalLinksEnabled() {
        startField("universalLinksEnabled");

        return this;
    }
}
