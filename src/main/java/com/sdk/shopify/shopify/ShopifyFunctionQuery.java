// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* A Shopify Function.
*/
public class ShopifyFunctionQuery extends Query<ShopifyFunctionQuery> {
    ShopifyFunctionQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * The API type of the Shopify Function.
    */
    public ShopifyFunctionQuery apiType() {
        startField("apiType");

        return this;
    }

    /**
    * The API version of the Shopify Function.
    */
    public ShopifyFunctionQuery apiVersion() {
        startField("apiVersion");

        return this;
    }

    /**
    * The app that owns the Shopify Function.
    */
    public ShopifyFunctionQuery app(AppQueryDefinition queryDef) {
        startField("app");

        _queryBuilder.append('{');
        queryDef.define(new AppQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The App Bridge information for the Shopify Function.
    */
    public ShopifyFunctionQuery appBridge(FunctionsAppBridgeQueryDefinition queryDef) {
        startField("appBridge");

        _queryBuilder.append('{');
        queryDef.define(new FunctionsAppBridgeQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The client ID of the app that owns the Shopify Function.
    */
    public ShopifyFunctionQuery appKey() {
        startField("appKey");

        return this;
    }

    /**
    * The description of the Shopify Function.
    */
    public ShopifyFunctionQuery description() {
        startField("description");

        return this;
    }

    /**
    * The ID of the Shopify Function.
    */
    public ShopifyFunctionQuery id() {
        startField("id");

        return this;
    }

    /**
    * The input query of the Shopify Function.
    */
    public ShopifyFunctionQuery inputQuery() {
        startField("inputQuery");

        return this;
    }

    /**
    * The title of the Shopify Function.
    */
    public ShopifyFunctionQuery title() {
        startField("title");

        return this;
    }

    /**
    * If the Shopify Function uses the creation UI in the Admin.
    */
    public ShopifyFunctionQuery useCreationUi() {
        startField("useCreationUi");

        return this;
    }
}
