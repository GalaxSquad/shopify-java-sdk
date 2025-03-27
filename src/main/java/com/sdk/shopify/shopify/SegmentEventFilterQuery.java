// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* A filter that's used to segment customers based on the date that an event occured. For example, the
* `product_bought` event filter allows you to segment customers based on what products they've bought.
*/
public class SegmentEventFilterQuery extends Query<SegmentEventFilterQuery> {
    SegmentEventFilterQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * The localized name of the filter.
    */
    public SegmentEventFilterQuery localizedName() {
        startField("localizedName");

        return this;
    }

    /**
    * Whether a file can have multiple values for a single customer.
    */
    public SegmentEventFilterQuery multiValue() {
        startField("multiValue");

        return this;
    }

    /**
    * The parameters for an event segment filter.
    */
    public SegmentEventFilterQuery parameters(SegmentEventFilterParameterQueryDefinition queryDef) {
        startField("parameters");

        _queryBuilder.append('{');
        queryDef.define(new SegmentEventFilterParameterQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The query name of the filter.
    */
    public SegmentEventFilterQuery queryName() {
        startField("queryName");

        return this;
    }

    /**
    * The return value type for an event segment filter.
    */
    public SegmentEventFilterQuery returnValueType() {
        startField("returnValueType");

        return this;
    }
}
