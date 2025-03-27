// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* Return type for `bulkOperationRunMutation` mutation.
*/
public class BulkOperationRunMutationPayloadQuery extends Query<BulkOperationRunMutationPayloadQuery> {
    BulkOperationRunMutationPayloadQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * The newly created bulk operation.
    */
    public BulkOperationRunMutationPayloadQuery bulkOperation(BulkOperationQueryDefinition queryDef) {
        startField("bulkOperation");

        _queryBuilder.append('{');
        queryDef.define(new BulkOperationQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The list of errors that occurred from executing the mutation.
    */
    public BulkOperationRunMutationPayloadQuery userErrors(BulkMutationUserErrorQueryDefinition queryDef) {
        startField("userErrors");

        _queryBuilder.append('{');
        queryDef.define(new BulkMutationUserErrorQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }
}
