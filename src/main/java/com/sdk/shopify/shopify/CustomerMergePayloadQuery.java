// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* Return type for `customerMerge` mutation.
*/
public class CustomerMergePayloadQuery extends Query<CustomerMergePayloadQuery> {
    CustomerMergePayloadQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * The asynchronous job for merging the customers.
    */
    public CustomerMergePayloadQuery job(JobQueryDefinition queryDef) {
        startField("job");

        _queryBuilder.append('{');
        queryDef.define(new JobQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The ID of the customer resulting from the merge.
    */
    public CustomerMergePayloadQuery resultingCustomerId() {
        startField("resultingCustomerId");

        return this;
    }

    /**
    * The list of errors that occurred from executing the mutation.
    */
    public CustomerMergePayloadQuery userErrors(CustomerMergeUserErrorQueryDefinition queryDef) {
        startField("userErrors");

        _queryBuilder.append('{');
        queryDef.define(new CustomerMergeUserErrorQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }
}
