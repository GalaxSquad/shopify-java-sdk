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
* An alert message that appears in the Shopify admin about a problem with a store setting, with an
* action to take. For example, you could show an alert to ask the merchant to enter their billing
* information to activate Shopify Plus.
*/
public class ShopAlertQuery extends Query<ShopAlertQuery> {
    ShopAlertQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * The text for the button in the alert that links to related information. For example, _Add credit
    * card_.
    */
    public ShopAlertQuery action(ShopAlertActionQueryDefinition queryDef) {
        startField("action");

        _queryBuilder.append('{');
        queryDef.define(new ShopAlertActionQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * A description of the alert and further information, such as whether the merchant will be charged.
    */
    public ShopAlertQuery description() {
        startField("description");

        return this;
    }
}
