// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* The customizations for the breadcrumbs that represent a buyer's journey to the checkout.
*/
public class CheckoutBrandingBuyerJourneyQuery extends Query<CheckoutBrandingBuyerJourneyQuery> {
    CheckoutBrandingBuyerJourneyQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * An option to display or hide the breadcrumbs that represent the buyer's journey on 3-page checkout.
    */
    public CheckoutBrandingBuyerJourneyQuery visibility() {
        startField("visibility");

        return this;
    }
}
