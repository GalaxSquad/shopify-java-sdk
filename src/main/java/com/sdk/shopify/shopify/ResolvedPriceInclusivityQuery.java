// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* The resolved price inclusivity attributes.
*/
public class ResolvedPriceInclusivityQuery extends Query<ResolvedPriceInclusivityQuery> {
    ResolvedPriceInclusivityQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * Whether duties are included in the price.
    */
    public ResolvedPriceInclusivityQuery dutiesIncluded() {
        startField("dutiesIncluded");

        return this;
    }

    /**
    * Whether taxes are included in the price.
    */
    public ResolvedPriceInclusivityQuery taxesIncluded() {
        startField("taxesIncluded");

        return this;
    }
}
