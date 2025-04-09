// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* SEO information.
*/
public class SEOQuery extends Query<SEOQuery> {
    SEOQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * SEO Description.
    */
    public SEOQuery description() {
        startField("description");

        return this;
    }

    /**
    * SEO Title.
    */
    public SEOQuery title() {
        startField("title");

        return this;
    }
}
