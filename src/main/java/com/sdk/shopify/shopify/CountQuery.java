// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* Details for count of elements.
*/
public class CountQuery extends Query<CountQuery> {
    CountQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * The count of elements.
    */
    public CountQuery count() {
        startField("count");

        return this;
    }

    /**
    * The count's precision, or the exactness of the value.
    */
    public CountQuery precision() {
        startField("precision");

        return this;
    }
}
