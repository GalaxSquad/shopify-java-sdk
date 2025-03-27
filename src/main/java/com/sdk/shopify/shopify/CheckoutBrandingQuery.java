// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* The settings of checkout visual customizations.
* To learn more about updating checkout branding settings, refer to the
* [checkoutBrandingUpsert](https://shopify.dev/api/admin-graphql/unstable/mutations/checkoutBrandingUp
* sert) mutation.
*/
public class CheckoutBrandingQuery extends Query<CheckoutBrandingQuery> {
    CheckoutBrandingQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * The customizations that apply to specific components or areas of the user interface.
    */
    public CheckoutBrandingQuery customizations(CheckoutBrandingCustomizationsQueryDefinition queryDef) {
        startField("customizations");

        _queryBuilder.append('{');
        queryDef.define(new CheckoutBrandingCustomizationsQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The design system allows you to set values that represent specific attributes
    * of your brand like color and font. These attributes are used throughout the user
    * interface. This brings consistency and allows you to easily make broad design changes.
    */
    public CheckoutBrandingQuery designSystem(CheckoutBrandingDesignSystemQueryDefinition queryDef) {
        startField("designSystem");

        _queryBuilder.append('{');
        queryDef.define(new CheckoutBrandingDesignSystemQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }
}
