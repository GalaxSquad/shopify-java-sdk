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
* An action associated to a shop alert, such as adding a credit card.
*/
public class ShopAlertActionQuery extends Query<ShopAlertActionQuery> {
    ShopAlertActionQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * The text for the button in the alert. For example, _Add credit card_.
    */
    public ShopAlertActionQuery title() {
        startField("title");

        return this;
    }

    /**
    * The target URL that the button links to.
    */
    public ShopAlertActionQuery url() {
        startField("url");

        return this;
    }
}
