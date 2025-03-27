// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* A list of suggested values associated with an individual segment. A
* segment is a group of members, such as customers, that meet specific
* criteria.
*/
public class SegmentValueQuery extends Query<SegmentValueQuery> {
    SegmentValueQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * The localized version of the value's name. This name is displayed to the merchant.
    */
    public SegmentValueQuery localizedValue() {
        startField("localizedValue");

        return this;
    }

    /**
    * The name of the query associated with the suggestion.
    */
    public SegmentValueQuery queryName() {
        startField("queryName");

        return this;
    }
}
