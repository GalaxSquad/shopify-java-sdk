// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* Quantity of prerequisite items required for the price rule to be applicable, compared to quantity of
* entitled items.
*/
public class PriceRulePrerequisiteToEntitlementQuantityRatioQuery extends Query<PriceRulePrerequisiteToEntitlementQuantityRatioQuery> {
    PriceRulePrerequisiteToEntitlementQuantityRatioQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * The quantity of entitled items in the ratio.
    */
    public PriceRulePrerequisiteToEntitlementQuantityRatioQuery entitlementQuantity() {
        startField("entitlementQuantity");

        return this;
    }

    /**
    * The quantity of prerequisite items in the ratio.
    */
    public PriceRulePrerequisiteToEntitlementQuantityRatioQuery prerequisiteQuantity() {
        startField("prerequisiteQuantity");

        return this;
    }
}
