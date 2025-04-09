// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* A list of customer segments who are eligible for the discount.
*/
public class DiscountCustomerSegmentsQuery extends Query<DiscountCustomerSegmentsQuery> {
    DiscountCustomerSegmentsQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * The list of customer segments who are eligible for the discount.
    */
    public DiscountCustomerSegmentsQuery segments(SegmentQueryDefinition queryDef) {
        startField("segments");

        _queryBuilder.append('{');
        queryDef.define(new SegmentQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }
}
