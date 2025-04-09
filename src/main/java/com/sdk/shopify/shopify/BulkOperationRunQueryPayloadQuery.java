// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* Return type for `bulkOperationRunQuery` mutation.
*/
public class BulkOperationRunQueryPayloadQuery extends Query<BulkOperationRunQueryPayloadQuery> {
    BulkOperationRunQueryPayloadQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * The newly created bulk operation.
    */
    public BulkOperationRunQueryPayloadQuery bulkOperation(BulkOperationQueryDefinition queryDef) {
        startField("bulkOperation");

        _queryBuilder.append('{');
        queryDef.define(new BulkOperationQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The list of errors that occurred from executing the mutation.
    */
    public BulkOperationRunQueryPayloadQuery userErrors(BulkOperationUserErrorQueryDefinition queryDef) {
        startField("userErrors");

        _queryBuilder.append('{');
        queryDef.define(new BulkOperationUserErrorQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }
}
