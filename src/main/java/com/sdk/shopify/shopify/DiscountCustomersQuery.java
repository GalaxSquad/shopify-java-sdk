// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* A list of individual customers eligible for the discount.
*/
public class DiscountCustomersQuery extends Query<DiscountCustomersQuery> {
    DiscountCustomersQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * The list of individual customers eligible for the discount.
    */
    public DiscountCustomersQuery customers(CustomerQueryDefinition queryDef) {
        startField("customers");

        _queryBuilder.append('{');
        queryDef.define(new CustomerQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }
}
