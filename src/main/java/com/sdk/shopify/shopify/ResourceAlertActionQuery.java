// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* An action associated to a resource alert, such as editing variants.
*/
public class ResourceAlertActionQuery extends Query<ResourceAlertActionQuery> {
    ResourceAlertActionQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * Whether the action appears as a button or as a link.
    */
    public ResourceAlertActionQuery primary() {
        startField("primary");

        return this;
    }

    /**
    * Resource for the action to show.
    */
    public ResourceAlertActionQuery show() {
        startField("show");

        return this;
    }

    /**
    * The text for the button in the alert. For example, _Edit variants_.
    */
    public ResourceAlertActionQuery title() {
        startField("title");

        return this;
    }

    /**
    * The target URL that the button links to.
    */
    public ResourceAlertActionQuery url() {
        startField("url");

        return this;
    }
}
