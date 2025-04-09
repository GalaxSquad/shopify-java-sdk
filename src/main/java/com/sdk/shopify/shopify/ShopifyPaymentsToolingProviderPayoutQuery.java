// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* Relevant reference information for an alternate currency payout.
*/
public class ShopifyPaymentsToolingProviderPayoutQuery extends Query<ShopifyPaymentsToolingProviderPayoutQuery> {
    ShopifyPaymentsToolingProviderPayoutQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * The balance amount the alternate currency payout was created for.
    */
    public ShopifyPaymentsToolingProviderPayoutQuery amount(MoneyV2QueryDefinition queryDef) {
        startField("amount");

        _queryBuilder.append('{');
        queryDef.define(new MoneyV2Query(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * A timestamp for the arrival of the alternate currency payout.
    */
    public ShopifyPaymentsToolingProviderPayoutQuery arrivalDate() {
        startField("arrivalDate");

        return this;
    }

    /**
    * A timestamp for the creation of the alternate currency payout.
    */
    public ShopifyPaymentsToolingProviderPayoutQuery createdAt() {
        startField("createdAt");

        return this;
    }

    /**
    * The currency alternate currency payout was created in.
    */
    public ShopifyPaymentsToolingProviderPayoutQuery currency() {
        startField("currency");

        return this;
    }

    /**
    * The remote ID for the alternate currency payout.
    */
    public ShopifyPaymentsToolingProviderPayoutQuery remoteId() {
        startField("remoteId");

        return this;
    }
}
