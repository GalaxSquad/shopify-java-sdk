// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* The checkboxes customizations.
*/
public class CheckoutBrandingCheckboxQuery extends Query<CheckoutBrandingCheckboxQuery> {
    CheckoutBrandingCheckboxQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * The corner radius used for checkboxes.
    */
    public CheckoutBrandingCheckboxQuery cornerRadius() {
        startField("cornerRadius");

        return this;
    }
}
