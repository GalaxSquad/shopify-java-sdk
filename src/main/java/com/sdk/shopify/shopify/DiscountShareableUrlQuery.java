// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* A shareable URL for a discount code.
*/
public class DiscountShareableUrlQuery extends Query<DiscountShareableUrlQuery> {
    DiscountShareableUrlQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * The image URL of the item (product or collection) to which the discount applies.
    */
    public DiscountShareableUrlQuery targetItemImage(ImageQueryDefinition queryDef) {
        startField("targetItemImage");

        _queryBuilder.append('{');
        queryDef.define(new ImageQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The type of page that's associated with the URL.
    */
    public DiscountShareableUrlQuery targetType() {
        startField("targetType");

        return this;
    }

    /**
    * The title of the page that's associated with the URL.
    */
    public DiscountShareableUrlQuery title() {
        startField("title");

        return this;
    }

    /**
    * The URL for the discount code.
    */
    public DiscountShareableUrlQuery url() {
        startField("url");

        return this;
    }
}
