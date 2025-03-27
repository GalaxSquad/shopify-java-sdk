// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* The header cart link customizations.
*/
public class CheckoutBrandingHeaderCartLinkQuery extends Query<CheckoutBrandingHeaderCartLinkQuery> {
    CheckoutBrandingHeaderCartLinkQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * The content type for the header back to cart link in 1-page checkout. Setting this to image will
    * render the custom image provided using the image field on the header cart_link object. If no image
    * is provided, the default cart icon will be used.
    */
    public CheckoutBrandingHeaderCartLinkQuery contentType() {
        startField("contentType");

        return this;
    }

    /**
    * The image that's used for the header back to cart link in 1-page checkout when the content type is
    * set to image.
    */
    public CheckoutBrandingHeaderCartLinkQuery image(ImageQueryDefinition queryDef) {
        startField("image");

        _queryBuilder.append('{');
        queryDef.define(new ImageQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }
}
