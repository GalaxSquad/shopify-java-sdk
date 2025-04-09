// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* Quantity of prerequisite items required for the price rule to be applicable, compared to quantity of
* entitled items.
*/
public class PriceRuleEntitlementToPrerequisiteQuantityRatioQuery extends Query<PriceRuleEntitlementToPrerequisiteQuantityRatioQuery> {
    PriceRuleEntitlementToPrerequisiteQuantityRatioQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * The quantity of entitled items in the ratio.
    */
    public PriceRuleEntitlementToPrerequisiteQuantityRatioQuery entitlementQuantity() {
        startField("entitlementQuantity");

        return this;
    }

    /**
    * The quantity of prerequisite items in the ratio.
    */
    public PriceRuleEntitlementToPrerequisiteQuantityRatioQuery prerequisiteQuantity() {
        startField("prerequisiteQuantity");

        return this;
    }
}
