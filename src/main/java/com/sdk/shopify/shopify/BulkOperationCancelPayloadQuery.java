// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* Return type for `bulkOperationCancel` mutation.
*/
public class BulkOperationCancelPayloadQuery extends Query<BulkOperationCancelPayloadQuery> {
    BulkOperationCancelPayloadQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * The bulk operation to be canceled.
    */
    public BulkOperationCancelPayloadQuery bulkOperation(BulkOperationQueryDefinition queryDef) {
        startField("bulkOperation");

        _queryBuilder.append('{');
        queryDef.define(new BulkOperationQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The list of errors that occurred from executing the mutation.
    */
    public BulkOperationCancelPayloadQuery userErrors(UserErrorQueryDefinition queryDef) {
        startField("userErrors");

        _queryBuilder.append('{');
        queryDef.define(new UserErrorQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }
}
