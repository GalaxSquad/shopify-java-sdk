// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* Payouts represent the movement of money between a merchant's Shopify
* Payments balance and their bank account.
*/
public class ShopifyPaymentsPayoutQuery extends Query<ShopifyPaymentsPayoutQuery> {
    ShopifyPaymentsPayoutQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);

        startField("id");
    }

    /**
    * The business entity associated with the payout.
    */
    public ShopifyPaymentsPayoutQuery businessEntity(BusinessEntityQueryDefinition queryDef) {
        startField("businessEntity");

        _queryBuilder.append('{');
        queryDef.define(new BusinessEntityQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The exact time when the payout was issued. The payout only contains
    * balance transactions that were available at this time.
    */
    public ShopifyPaymentsPayoutQuery issuedAt() {
        startField("issuedAt");

        return this;
    }

    /**
    * The ID of the corresponding resource in the REST Admin API.
    */
    public ShopifyPaymentsPayoutQuery legacyResourceId() {
        startField("legacyResourceId");

        return this;
    }

    /**
    * The total amount and currency of the payout.
    */
    public ShopifyPaymentsPayoutQuery net(MoneyV2QueryDefinition queryDef) {
        startField("net");

        _queryBuilder.append('{');
        queryDef.define(new MoneyV2Query(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The transfer status of the payout.
    */
    public ShopifyPaymentsPayoutQuery status() {
        startField("status");

        return this;
    }

    /**
    * The summary of the payout.
    */
    public ShopifyPaymentsPayoutQuery summary(ShopifyPaymentsPayoutSummaryQueryDefinition queryDef) {
        startField("summary");

        _queryBuilder.append('{');
        queryDef.define(new ShopifyPaymentsPayoutSummaryQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The direction of the payout.
    */
    public ShopifyPaymentsPayoutQuery transactionType() {
        startField("transactionType");

        return this;
    }
}
