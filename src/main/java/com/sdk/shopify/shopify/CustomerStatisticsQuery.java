// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* A customer's computed statistics.
*/
public class CustomerStatisticsQuery extends Query<CustomerStatisticsQuery> {
    CustomerStatisticsQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * The predicted spend tier of a customer with a shop.
    */
    public CustomerStatisticsQuery predictedSpendTier() {
        startField("predictedSpendTier");

        return this;
    }

    /**
    * The RFM (Recency, Frequency, Monetary) group of the customer.
    */
    public CustomerStatisticsQuery rfmGroup() {
        startField("rfmGroup");

        return this;
    }
}
