// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* Return type for `discountRedeemCodeBulkAdd` mutation.
*/
public class DiscountRedeemCodeBulkAddPayloadQuery extends Query<DiscountRedeemCodeBulkAddPayloadQuery> {
    DiscountRedeemCodeBulkAddPayloadQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * The ID of bulk operation that creates multiple unique discount codes.
    * You can use the
    * [`discountRedeemCodeBulkCreation`
    * query](https://shopify.dev/api/admin-graphql/latest/queries/discountRedeemCodeBulkCreation)
    * to track the status of the bulk operation.
    */
    public DiscountRedeemCodeBulkAddPayloadQuery bulkCreation(DiscountRedeemCodeBulkCreationQueryDefinition queryDef) {
        startField("bulkCreation");

        _queryBuilder.append('{');
        queryDef.define(new DiscountRedeemCodeBulkCreationQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The list of errors that occurred from executing the mutation.
    */
    public DiscountRedeemCodeBulkAddPayloadQuery userErrors(DiscountUserErrorQueryDefinition queryDef) {
        startField("userErrors");

        _queryBuilder.append('{');
        queryDef.define(new DiscountUserErrorQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }
}
