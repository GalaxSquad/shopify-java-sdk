// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* A merge request for merging two customers.
*/
public class CustomerMergeRequestQuery extends Query<CustomerMergeRequestQuery> {
    CustomerMergeRequestQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * The merge errors that occurred during the customer merge request.
    */
    public CustomerMergeRequestQuery customerMergeErrors(CustomerMergeErrorQueryDefinition queryDef) {
        startField("customerMergeErrors");

        _queryBuilder.append('{');
        queryDef.define(new CustomerMergeErrorQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The UUID of the merge job.
    */
    public CustomerMergeRequestQuery jobId() {
        startField("jobId");

        return this;
    }

    /**
    * The ID of the customer resulting from the merge.
    */
    public CustomerMergeRequestQuery resultingCustomerId() {
        startField("resultingCustomerId");

        return this;
    }

    /**
    * The status of the customer merge request.
    */
    public CustomerMergeRequestQuery status() {
        startField("status");

        return this;
    }
}
