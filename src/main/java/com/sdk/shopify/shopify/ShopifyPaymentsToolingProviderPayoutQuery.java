// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.shopify.graphql.support.AbstractResponse;
import com.shopify.graphql.support.Arguments;
import com.shopify.graphql.support.Error;
import com.shopify.graphql.support.Query;
import com.shopify.graphql.support.SchemaViolationError;
import com.shopify.graphql.support.TopLevelResponse;
import com.shopify.graphql.support.Input;

import com.shopify.graphql.support.ID;

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
