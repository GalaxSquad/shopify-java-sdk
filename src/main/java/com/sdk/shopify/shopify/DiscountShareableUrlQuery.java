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
* A shareable URL for a discount code.
*/
public class DiscountShareableUrlQuery extends Query<DiscountShareableUrlQuery> {
    DiscountShareableUrlQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * The image URL of the item (product or collection) to which the discount applies.
    */
    public DiscountShareableUrlQuery targetItemImage(ImageQueryDefinition queryDef) {
        startField("targetItemImage");

        _queryBuilder.append('{');
        queryDef.define(new ImageQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The type of page that's associated with the URL.
    */
    public DiscountShareableUrlQuery targetType() {
        startField("targetType");

        return this;
    }

    /**
    * The title of the page that's associated with the URL.
    */
    public DiscountShareableUrlQuery title() {
        startField("title");

        return this;
    }

    /**
    * The URL for the discount code.
    */
    public DiscountShareableUrlQuery url() {
        startField("url");

        return this;
    }
}
