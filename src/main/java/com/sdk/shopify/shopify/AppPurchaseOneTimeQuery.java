// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* Services and features purchased once by a store.
*/
public class AppPurchaseOneTimeQuery extends Query<AppPurchaseOneTimeQuery> {
    AppPurchaseOneTimeQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);

        startField("id");
    }

    /**
    * The date and time when the app purchase occurred.
    */
    public AppPurchaseOneTimeQuery createdAt() {
        startField("createdAt");

        return this;
    }

    /**
    * The name of the app purchase.
    */
    public AppPurchaseOneTimeQuery name() {
        startField("name");

        return this;
    }

    /**
    * The amount to be charged to the store for the app purchase.
    */
    public AppPurchaseOneTimeQuery price(MoneyV2QueryDefinition queryDef) {
        startField("price");

        _queryBuilder.append('{');
        queryDef.define(new MoneyV2Query(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The status of the app purchase.
    */
    public AppPurchaseOneTimeQuery status() {
        startField("status");

        return this;
    }

    /**
    * Whether the app purchase is a test transaction.
    */
    public AppPurchaseOneTimeQuery test() {
        startField("test");

        return this;
    }
}
