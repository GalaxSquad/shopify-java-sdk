// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* An object that represents whether a customer can be merged with another customer.
*/
public class CustomerMergeableQuery extends Query<CustomerMergeableQuery> {
    CustomerMergeableQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * The list of fields preventing the customer from being merged.
    */
    public CustomerMergeableQuery errorFields() {
        startField("errorFields");

        return this;
    }

    /**
    * Whether the customer can be merged with another customer.
    */
    public CustomerMergeableQuery isMergeable() {
        startField("isMergeable");

        return this;
    }

    /**
    * The merge request if one is currently in progress.
    */
    public CustomerMergeableQuery mergeInProgress(CustomerMergeRequestQueryDefinition queryDef) {
        startField("mergeInProgress");

        _queryBuilder.append('{');
        queryDef.define(new CustomerMergeRequestQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The reason why the customer can't be merged with another customer.
    */
    public CustomerMergeableQuery reason() {
        startField("reason");

        return this;
    }
}
