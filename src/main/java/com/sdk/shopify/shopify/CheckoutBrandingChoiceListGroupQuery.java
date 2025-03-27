// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* The settings that apply to the 'group' variant of ChoiceList.
*/
public class CheckoutBrandingChoiceListGroupQuery extends Query<CheckoutBrandingChoiceListGroupQuery> {
    CheckoutBrandingChoiceListGroupQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * The spacing between UI elements in the list.
    */
    public CheckoutBrandingChoiceListGroupQuery spacing() {
        startField("spacing");

        return this;
    }
}
