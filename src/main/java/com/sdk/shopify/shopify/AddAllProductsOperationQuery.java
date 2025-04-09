// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* Represents an operation publishing all products to a publication.
*/
public class AddAllProductsOperationQuery extends Query<AddAllProductsOperationQuery> {
    AddAllProductsOperationQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);

        startField("id");
    }

    /**
    * The count of processed rows, summing imported, failed, and skipped rows.
    */
    public AddAllProductsOperationQuery processedRowCount() {
        startField("processedRowCount");

        return this;
    }

    /**
    * Represents a rows objects within this background operation.
    */
    public AddAllProductsOperationQuery rowCount(RowCountQueryDefinition queryDef) {
        startField("rowCount");

        _queryBuilder.append('{');
        queryDef.define(new RowCountQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The status of this operation.
    */
    public AddAllProductsOperationQuery status() {
        startField("status");

        return this;
    }
}
