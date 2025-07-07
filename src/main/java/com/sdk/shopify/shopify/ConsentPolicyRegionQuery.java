// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* A country or region code.
*/
public class ConsentPolicyRegionQuery extends Query<ConsentPolicyRegionQuery> {
    ConsentPolicyRegionQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * The `ISO 3166` country code for which the policy applies.
    */
    public ConsentPolicyRegionQuery countryCode() {
        startField("countryCode");

        return this;
    }

    /**
    * The `ISO 3166` region code for which the policy applies.
    */
    public ConsentPolicyRegionQuery regionCode() {
        startField("regionCode");

        return this;
    }
}
