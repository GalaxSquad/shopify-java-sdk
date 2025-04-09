// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* The store logo customizations.
*/
public class CheckoutBrandingLogoQuery extends Query<CheckoutBrandingLogoQuery> {
    CheckoutBrandingLogoQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * The logo image.
    */
    public CheckoutBrandingLogoQuery image(ImageQueryDefinition queryDef) {
        startField("image");

        _queryBuilder.append('{');
        queryDef.define(new ImageQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The maximum width of the logo.
    */
    public CheckoutBrandingLogoQuery maxWidth() {
        startField("maxWidth");

        return this;
    }

    /**
    * The visibility of the logo.
    */
    public CheckoutBrandingLogoQuery visibility() {
        startField("visibility");

        return this;
    }
}
