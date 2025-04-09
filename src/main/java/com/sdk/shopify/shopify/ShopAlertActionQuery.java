// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

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
