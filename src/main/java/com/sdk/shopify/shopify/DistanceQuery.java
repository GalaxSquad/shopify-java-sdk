// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* A distance, which includes a numeric value and a unit of measurement.
*/
public class DistanceQuery extends Query<DistanceQuery> {
    DistanceQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * The unit of measurement for `value`.
    */
    public DistanceQuery unit() {
        startField("unit");

        return this;
    }

    /**
    * The distance value using the unit system specified with `unit`.
    */
    public DistanceQuery value() {
        startField("value");

        return this;
    }
}
