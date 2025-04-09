// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* A bulk update operation on a publication.
*/
public class PublicationResourceOperationQuery extends Query<PublicationResourceOperationQuery> {
    PublicationResourceOperationQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);

        startField("id");
    }

    /**
    * The count of processed rows, summing imported, failed, and skipped rows.
    */
    public PublicationResourceOperationQuery processedRowCount() {
        startField("processedRowCount");

        return this;
    }

    /**
    * Represents a rows objects within this background operation.
    */
    public PublicationResourceOperationQuery rowCount(RowCountQueryDefinition queryDef) {
        startField("rowCount");

        _queryBuilder.append('{');
        queryDef.define(new RowCountQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The status of this operation.
    */
    public PublicationResourceOperationQuery status() {
        startField("status");

        return this;
    }
}
