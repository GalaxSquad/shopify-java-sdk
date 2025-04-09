// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* The type used for targeting a set of customers who are eligible for the discount. For example, the
* discount might be available to all customers or it might only be available to a specific set of
* customers. You can define the set of customers by targeting a list of customer segments, or by
* targeting a list of specific customers.
*/
public class DiscountCustomerSelectionQuery extends Query<DiscountCustomerSelectionQuery> {
    DiscountCustomerSelectionQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);

        startField("__typename");
    }

    public DiscountCustomerSelectionQuery onDiscountCustomerAll(DiscountCustomerAllQueryDefinition queryDef) {
        startInlineFragment("DiscountCustomerAll");
        queryDef.define(new DiscountCustomerAllQuery(_queryBuilder));
        _queryBuilder.append('}');
        return this;
    }

    public DiscountCustomerSelectionQuery onDiscountCustomerSegments(DiscountCustomerSegmentsQueryDefinition queryDef) {
        startInlineFragment("DiscountCustomerSegments");
        queryDef.define(new DiscountCustomerSegmentsQuery(_queryBuilder));
        _queryBuilder.append('}');
        return this;
    }

    public DiscountCustomerSelectionQuery onDiscountCustomers(DiscountCustomersQueryDefinition queryDef) {
        startInlineFragment("DiscountCustomers");
        queryDef.define(new DiscountCustomersQuery(_queryBuilder));
        _queryBuilder.append('}');
        return this;
    }
}
