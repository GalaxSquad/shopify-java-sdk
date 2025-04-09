// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* App credits can be applied by the merchant towards future app purchases, subscriptions, or usage
* records in Shopify.
*/
public class AppCreditQuery extends Query<AppCreditQuery> {
    AppCreditQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);

        startField("id");
    }

    /**
    * The amount that can be used towards future app purchases in Shopify.
    */
    public AppCreditQuery amount(MoneyV2QueryDefinition queryDef) {
        startField("amount");

        _queryBuilder.append('{');
        queryDef.define(new MoneyV2Query(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The date and time when the app credit was created.
    */
    public AppCreditQuery createdAt() {
        startField("createdAt");

        return this;
    }

    /**
    * The description of the app credit.
    */
    public AppCreditQuery description() {
        startField("description");

        return this;
    }

    /**
    * Whether the app credit is a test transaction.
    */
    public AppCreditQuery test() {
        startField("test");

        return this;
    }
}
