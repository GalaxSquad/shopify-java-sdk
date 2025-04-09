// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* The shipping lines to which the price rule applies to.
*/
public class PriceRuleShippingLineEntitlementsQuery extends Query<PriceRuleShippingLineEntitlementsQuery> {
    PriceRuleShippingLineEntitlementsQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * The codes for the countries to which the price rule applies to.
    */
    public PriceRuleShippingLineEntitlementsQuery countryCodes() {
        startField("countryCodes");

        return this;
    }

    /**
    * Whether the price rule is applicable to countries that haven't been defined in the shop's shipping
    * zones.
    */
    public PriceRuleShippingLineEntitlementsQuery includeRestOfWorld() {
        startField("includeRestOfWorld");

        return this;
    }

    /**
    * Whether the price rule applies to all shipping lines.
    */
    public PriceRuleShippingLineEntitlementsQuery targetAllShippingLines() {
        startField("targetAllShippingLines");

        return this;
    }
}
