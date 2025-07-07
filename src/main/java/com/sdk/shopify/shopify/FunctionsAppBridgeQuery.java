// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* The App Bridge information for a Shopify Function.
*/
public class FunctionsAppBridgeQuery extends Query<FunctionsAppBridgeQuery> {
    FunctionsAppBridgeQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * The relative path for creating a customization.
    */
    public FunctionsAppBridgeQuery createPath() {
        startField("createPath");

        return this;
    }

    /**
    * The relative path for viewing a customization.
    */
    public FunctionsAppBridgeQuery detailsPath() {
        startField("detailsPath");

        return this;
    }
}
