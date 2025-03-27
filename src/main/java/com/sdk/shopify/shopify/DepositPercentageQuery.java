// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* A percentage deposit.
*/
public class DepositPercentageQuery extends Query<DepositPercentageQuery> {
    DepositPercentageQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * The percentage value of the deposit.
    */
    public DepositPercentageQuery percentage() {
        startField("percentage");

        return this;
    }
}
