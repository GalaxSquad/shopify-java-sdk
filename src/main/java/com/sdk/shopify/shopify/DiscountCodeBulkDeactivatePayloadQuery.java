// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* Return type for `discountCodeBulkDeactivate` mutation.
*/
public class DiscountCodeBulkDeactivatePayloadQuery extends Query<DiscountCodeBulkDeactivatePayloadQuery> {
    DiscountCodeBulkDeactivatePayloadQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * The asynchronous job that deactivates the discounts.
    */
    public DiscountCodeBulkDeactivatePayloadQuery job(JobQueryDefinition queryDef) {
        startField("job");

        _queryBuilder.append('{');
        queryDef.define(new JobQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The list of errors that occurred from executing the mutation.
    */
    public DiscountCodeBulkDeactivatePayloadQuery userErrors(DiscountUserErrorQueryDefinition queryDef) {
        startField("userErrors");

        _queryBuilder.append('{');
        queryDef.define(new DiscountUserErrorQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }
}
