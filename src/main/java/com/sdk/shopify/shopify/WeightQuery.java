// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* A weight, which includes a numeric value and a unit of measurement.
*/
public class WeightQuery extends Query<WeightQuery> {
    WeightQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * The unit of measurement for `value`.
    */
    public WeightQuery unit() {
        startField("unit");

        return this;
    }

    /**
    * The weight value using the unit system specified with `unit`.
    */
    public WeightQuery value() {
        startField("value");

        return this;
    }
}
