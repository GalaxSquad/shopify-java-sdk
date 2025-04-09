// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* The [application](https://shopify.dev/apps) that created the order.
*/
public class OrderAppQuery extends Query<OrderAppQuery> {
    OrderAppQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * The application icon.
    */
    public OrderAppQuery icon(ImageQueryDefinition queryDef) {
        startField("icon");

        _queryBuilder.append('{');
        queryDef.define(new ImageQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The application ID.
    */
    public OrderAppQuery id() {
        startField("id");

        return this;
    }

    /**
    * The name of the application.
    */
    public OrderAppQuery name() {
        startField("name");

        return this;
    }
}
