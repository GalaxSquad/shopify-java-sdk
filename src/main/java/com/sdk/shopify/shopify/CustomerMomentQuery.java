// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* Represents a session preceding an order, often used for building a timeline of events leading to an
* order.
*/
public class CustomerMomentQuery extends Query<CustomerMomentQuery> {
    CustomerMomentQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);

        startField("__typename");
    }

    /**
    * The date and time when the customer's session occurred.
    */
    public CustomerMomentQuery occurredAt() {
        startField("occurredAt");

        return this;
    }

    public CustomerMomentQuery onCustomerVisit(CustomerVisitQueryDefinition queryDef) {
        startInlineFragment("CustomerVisit");
        queryDef.define(new CustomerVisitQuery(_queryBuilder));
        _queryBuilder.append('}');
        return this;
    }
}
