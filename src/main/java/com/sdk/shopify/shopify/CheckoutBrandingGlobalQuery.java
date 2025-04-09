// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* The global customizations.
*/
public class CheckoutBrandingGlobalQuery extends Query<CheckoutBrandingGlobalQuery> {
    CheckoutBrandingGlobalQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * The global corner radius setting that overrides all other [corner
    * radius](https://shopify.dev/docs/api/admin-graphql/latest/enums/CheckoutBrandingCornerRadius)
    * customizations.
    */
    public CheckoutBrandingGlobalQuery cornerRadius() {
        startField("cornerRadius");

        return this;
    }

    /**
    * The global typography customizations.
    */
    public CheckoutBrandingGlobalQuery typography(CheckoutBrandingTypographyStyleGlobalQueryDefinition queryDef) {
        startField("typography");

        _queryBuilder.append('{');
        queryDef.define(new CheckoutBrandingTypographyStyleGlobalQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }
}
