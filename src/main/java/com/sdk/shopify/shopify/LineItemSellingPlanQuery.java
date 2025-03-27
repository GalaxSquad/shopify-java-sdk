// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* Represents the selling plan for a line item.
*/
public class LineItemSellingPlanQuery extends Query<LineItemSellingPlanQuery> {
    LineItemSellingPlanQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * The name of the selling plan for display purposes.
    */
    public LineItemSellingPlanQuery name() {
        startField("name");

        return this;
    }

    /**
    * The ID of the selling plan associated with the line item.
    */
    public LineItemSellingPlanQuery sellingPlanId() {
        startField("sellingPlanId");

        return this;
    }
}
