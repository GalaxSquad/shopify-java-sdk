// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* A consent policy describes the level of consent that the merchant requires from the user before
* actually
* collecting and processing the data.
*/
public class ConsentPolicyQuery extends Query<ConsentPolicyQuery> {
    ConsentPolicyQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);

        startField("id");
    }

    /**
    * Whether consent is required for the region.
    */
    public ConsentPolicyQuery consentRequired() {
        startField("consentRequired");

        return this;
    }

    /**
    * The `ISO 3166` country code for which the policy applies.
    */
    public ConsentPolicyQuery countryCode() {
        startField("countryCode");

        return this;
    }

    /**
    * Whether data sale opt-out is required for the region.
    */
    public ConsentPolicyQuery dataSaleOptOutRequired() {
        startField("dataSaleOptOutRequired");

        return this;
    }

    /**
    * The `ISO 3166` region code for which the policy applies.
    */
    public ConsentPolicyQuery regionCode() {
        startField("regionCode");

        return this;
    }

    /**
    * The global ID of the shop that owns the policy.
    */
    public ConsentPolicyQuery shopId() {
        startField("shopId");

        return this;
    }
}
