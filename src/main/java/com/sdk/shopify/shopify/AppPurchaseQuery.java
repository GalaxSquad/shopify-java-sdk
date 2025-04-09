// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* Services and features purchased once by the store.
*/
public class AppPurchaseQuery extends Query<AppPurchaseQuery> {
    AppPurchaseQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);

        startField("__typename");
    }

    /**
    * The date and time when the app purchase occurred.
    */
    public AppPurchaseQuery createdAt() {
        startField("createdAt");

        return this;
    }

    /**
    * The name of the app purchase.
    */
    public AppPurchaseQuery name() {
        startField("name");

        return this;
    }

    /**
    * The amount to be charged to the store for the app purchase.
    */
    public AppPurchaseQuery price(MoneyV2QueryDefinition queryDef) {
        startField("price");

        _queryBuilder.append('{');
        queryDef.define(new MoneyV2Query(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The status of the app purchase.
    */
    public AppPurchaseQuery status() {
        startField("status");

        return this;
    }

    /**
    * Whether the app purchase is a test transaction.
    */
    public AppPurchaseQuery test() {
        startField("test");

        return this;
    }

    public AppPurchaseQuery onAppPurchaseOneTime(AppPurchaseOneTimeQueryDefinition queryDef) {
        startInlineFragment("AppPurchaseOneTime");
        queryDef.define(new AppPurchaseOneTimeQuery(_queryBuilder));
        _queryBuilder.append('}');
        return this;
    }
}
