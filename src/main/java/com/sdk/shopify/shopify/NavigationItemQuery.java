// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* A navigation item, holding basic link attributes.
*/
public class NavigationItemQuery extends Query<NavigationItemQuery> {
    NavigationItemQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * The unique identifier of the navigation item.
    */
    public NavigationItemQuery id() {
        startField("id");

        return this;
    }

    /**
    * The name of the navigation item.
    */
    public NavigationItemQuery title() {
        startField("title");

        return this;
    }

    /**
    * The URL of the page that the navigation item links to.
    */
    public NavigationItemQuery url() {
        startField("url");

        return this;
    }
}
