// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* The total number of pending orders on a shop if less then a maximum, or that maximum.
* The atMax field indicates when this maximum has been reached.
*/
public class LimitedPendingOrderCountQuery extends Query<LimitedPendingOrderCountQuery> {
    LimitedPendingOrderCountQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * This is set when the number of pending orders has reached the maximum.
    */
    public LimitedPendingOrderCountQuery atMax() {
        startField("atMax");

        return this;
    }

    /**
    * The number of pendings orders on the shop.
    * Limited to a maximum of 10000.
    */
    public LimitedPendingOrderCountQuery count() {
        startField("count");

        return this;
    }
}
