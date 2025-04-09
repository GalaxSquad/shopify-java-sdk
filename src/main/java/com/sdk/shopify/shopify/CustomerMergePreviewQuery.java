// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* A preview of the results of a customer merge request.
*/
public class CustomerMergePreviewQuery extends Query<CustomerMergePreviewQuery> {
    CustomerMergePreviewQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * The fields that can be used to override the default fields.
    */
    public CustomerMergePreviewQuery alternateFields(CustomerMergePreviewAlternateFieldsQueryDefinition queryDef) {
        startField("alternateFields");

        _queryBuilder.append('{');
        queryDef.define(new CustomerMergePreviewAlternateFieldsQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The fields that will block the merge if the two customers are merged.
    */
    public CustomerMergePreviewQuery blockingFields(CustomerMergePreviewBlockingFieldsQueryDefinition queryDef) {
        startField("blockingFields");

        _queryBuilder.append('{');
        queryDef.define(new CustomerMergePreviewBlockingFieldsQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The errors blocking the customer merge.
    */
    public CustomerMergePreviewQuery customerMergeErrors(CustomerMergeErrorQueryDefinition queryDef) {
        startField("customerMergeErrors");

        _queryBuilder.append('{');
        queryDef.define(new CustomerMergeErrorQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The fields that will be kept if the two customers are merged.
    */
    public CustomerMergePreviewQuery defaultFields(CustomerMergePreviewDefaultFieldsQueryDefinition queryDef) {
        startField("defaultFields");

        _queryBuilder.append('{');
        queryDef.define(new CustomerMergePreviewDefaultFieldsQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The resulting customer ID if the two customers are merged.
    */
    public CustomerMergePreviewQuery resultingCustomerId() {
        startField("resultingCustomerId");

        return this;
    }
}
