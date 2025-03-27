// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* Return type for `shopifyPaymentsPayoutAlternateCurrencyCreate` mutation.
*/
public class ShopifyPaymentsPayoutAlternateCurrencyCreatePayloadQuery extends Query<ShopifyPaymentsPayoutAlternateCurrencyCreatePayloadQuery> {
    ShopifyPaymentsPayoutAlternateCurrencyCreatePayloadQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * The resulting alternate currency payout created.
    */
    public ShopifyPaymentsPayoutAlternateCurrencyCreatePayloadQuery payout(ShopifyPaymentsToolingProviderPayoutQueryDefinition queryDef) {
        startField("payout");

        _queryBuilder.append('{');
        queryDef.define(new ShopifyPaymentsToolingProviderPayoutQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * Whether the alternate currency payout was created successfully.
    */
    public ShopifyPaymentsPayoutAlternateCurrencyCreatePayloadQuery success() {
        startField("success");

        return this;
    }

    /**
    * The list of errors that occurred from executing the mutation.
    */
    public ShopifyPaymentsPayoutAlternateCurrencyCreatePayloadQuery userErrors(ShopifyPaymentsPayoutAlternateCurrencyCreateUserErrorQueryDefinition queryDef) {
        startField("userErrors");

        _queryBuilder.append('{');
        queryDef.define(new ShopifyPaymentsPayoutAlternateCurrencyCreateUserErrorQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }
}
