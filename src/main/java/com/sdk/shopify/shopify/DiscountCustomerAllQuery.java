// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* The `DiscountCustomerAll` object lets you target all customers for discount eligibility.
*/
public class DiscountCustomerAllQuery extends Query<DiscountCustomerAllQuery> {
    DiscountCustomerAllQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * Whether the discount can be applied by all customers. This value is always `true`.
    */
    public DiscountCustomerAllQuery allCustomers() {
        startField("allCustomers");

        return this;
    }
}
