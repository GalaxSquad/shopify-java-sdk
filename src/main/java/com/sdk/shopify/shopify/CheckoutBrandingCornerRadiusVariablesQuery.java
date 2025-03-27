// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* Define the pixel size of corner radius options.
*/
public class CheckoutBrandingCornerRadiusVariablesQuery extends Query<CheckoutBrandingCornerRadiusVariablesQuery> {
    CheckoutBrandingCornerRadiusVariablesQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * The value in pixels for base corner radii. Example: 5.
    */
    public CheckoutBrandingCornerRadiusVariablesQuery base() {
        startField("base");

        return this;
    }

    /**
    * The value in pixels for large corner radii. Example: 10.
    */
    public CheckoutBrandingCornerRadiusVariablesQuery large() {
        startField("large");

        return this;
    }

    /**
    * The value in pixels for small corner radii. Example: 3.
    */
    public CheckoutBrandingCornerRadiusVariablesQuery small() {
        startField("small");

        return this;
    }
}
