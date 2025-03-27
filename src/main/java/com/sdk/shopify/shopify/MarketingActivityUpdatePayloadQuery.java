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
* Return type for `marketingActivityUpdate` mutation.
*/
public class MarketingActivityUpdatePayloadQuery extends Query<MarketingActivityUpdatePayloadQuery> {
    MarketingActivityUpdatePayloadQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * The updated marketing activity.
    */
    public MarketingActivityUpdatePayloadQuery marketingActivity(MarketingActivityQueryDefinition queryDef) {
        startField("marketingActivity");

        _queryBuilder.append('{');
        queryDef.define(new MarketingActivityQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The redirect path from the embedded editor to the Shopify admin.
    */
    public MarketingActivityUpdatePayloadQuery redirectPath() {
        startField("redirectPath");

        return this;
    }

    /**
    * The list of errors that occurred from executing the mutation.
    */
    public MarketingActivityUpdatePayloadQuery userErrors(UserErrorQueryDefinition queryDef) {
        startField("userErrors");

        _queryBuilder.append('{');
        queryDef.define(new UserErrorQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }
}
