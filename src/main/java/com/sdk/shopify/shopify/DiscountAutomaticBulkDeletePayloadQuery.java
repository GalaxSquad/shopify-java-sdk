// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* Return type for `discountAutomaticBulkDelete` mutation.
*/
public class DiscountAutomaticBulkDeletePayloadQuery extends Query<DiscountAutomaticBulkDeletePayloadQuery> {
    DiscountAutomaticBulkDeletePayloadQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * The asynchronous job removing the automatic discounts.
    */
    public DiscountAutomaticBulkDeletePayloadQuery job(JobQueryDefinition queryDef) {
        startField("job");

        _queryBuilder.append('{');
        queryDef.define(new JobQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The list of errors that occurred from executing the mutation.
    */
    public DiscountAutomaticBulkDeletePayloadQuery userErrors(DiscountUserErrorQueryDefinition queryDef) {
        startField("userErrors");

        _queryBuilder.append('{');
        queryDef.define(new DiscountUserErrorQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }
}
