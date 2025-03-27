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
* Return type for `marketingActivityCreate` mutation.
*/
public class MarketingActivityCreatePayloadQuery extends Query<MarketingActivityCreatePayloadQuery> {
    MarketingActivityCreatePayloadQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * The created marketing activity.
    */
    public MarketingActivityCreatePayloadQuery marketingActivity(MarketingActivityQueryDefinition queryDef) {
        startField("marketingActivity");

        _queryBuilder.append('{');
        queryDef.define(new MarketingActivityQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The path to return back to shopify admin from embedded editor.
    */
    public MarketingActivityCreatePayloadQuery redirectPath() {
        startField("redirectPath");

        return this;
    }

    /**
    * The list of errors that occurred from executing the mutation.
    */
    public MarketingActivityCreatePayloadQuery userErrors(UserErrorQueryDefinition queryDef) {
        startField("userErrors");

        _queryBuilder.append('{');
        queryDef.define(new UserErrorQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }
}
