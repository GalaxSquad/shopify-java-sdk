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
* Return type for `publishableUnpublishToCurrentChannel` mutation.
*/
public class PublishableUnpublishToCurrentChannelPayloadQuery extends Query<PublishableUnpublishToCurrentChannelPayloadQuery> {
    PublishableUnpublishToCurrentChannelPayloadQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * Resource that has been unpublished.
    */
    public PublishableUnpublishToCurrentChannelPayloadQuery publishable(PublishableQueryDefinition queryDef) {
        startField("publishable");

        _queryBuilder.append('{');
        queryDef.define(new PublishableQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The user's shop.
    */
    public PublishableUnpublishToCurrentChannelPayloadQuery shop(ShopQueryDefinition queryDef) {
        startField("shop");

        _queryBuilder.append('{');
        queryDef.define(new ShopQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The list of errors that occurred from executing the mutation.
    */
    public PublishableUnpublishToCurrentChannelPayloadQuery userErrors(UserErrorQueryDefinition queryDef) {
        startField("userErrors");

        _queryBuilder.append('{');
        queryDef.define(new UserErrorQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }
}
