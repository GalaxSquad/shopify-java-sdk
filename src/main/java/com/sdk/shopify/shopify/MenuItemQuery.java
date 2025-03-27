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
* A menu item for display on the storefront.
*/
public class MenuItemQuery extends Query<MenuItemQuery> {
    MenuItemQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * A globally-unique ID of the navigation menu item.
    */
    public MenuItemQuery id() {
        startField("id");

        return this;
    }

    /**
    * List of the menu items nested under this item sorted by position.
    */
    public MenuItemQuery items(MenuItemQueryDefinition queryDef) {
        startField("items");

        _queryBuilder.append('{');
        queryDef.define(new MenuItemQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The ID of the resource to link to.
    */
    public MenuItemQuery resourceId() {
        startField("resourceId");

        return this;
    }

    /**
    * The menu item's tags to filter a collection.
    */
    public MenuItemQuery tags() {
        startField("tags");

        return this;
    }

    /**
    * The menu item's title.
    */
    public MenuItemQuery title() {
        startField("title");

        return this;
    }

    /**
    * The menu item's type.
    */
    public MenuItemQuery type() {
        startField("type");

        return this;
    }

    /**
    * The menu item's url.
    */
    public MenuItemQuery url() {
        startField("url");

        return this;
    }
}
