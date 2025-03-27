// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* The error blocking a customer merge.
*/
public class CustomerMergeErrorQuery extends Query<CustomerMergeErrorQuery> {
    CustomerMergeErrorQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * The list of fields preventing the customer from being merged.
    */
    public CustomerMergeErrorQuery errorFields() {
        startField("errorFields");

        return this;
    }

    /**
    * The customer merge error message.
    */
    public CustomerMergeErrorQuery message() {
        startField("message");

        return this;
    }
}
