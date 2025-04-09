// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* A checkout branding image.
*/
public class CheckoutBrandingImageQuery extends Query<CheckoutBrandingImageQuery> {
    CheckoutBrandingImageQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * The image details.
    */
    public CheckoutBrandingImageQuery image(ImageQueryDefinition queryDef) {
        startField("image");

        _queryBuilder.append('{');
        queryDef.define(new ImageQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }
}
