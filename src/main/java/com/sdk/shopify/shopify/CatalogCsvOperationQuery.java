// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* A catalog csv operation represents a CSV file import.
*/
public class CatalogCsvOperationQuery extends Query<CatalogCsvOperationQuery> {
    CatalogCsvOperationQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);

        startField("id");
    }

    /**
    * The count of processed rows, summing imported, failed, and skipped rows.
    */
    public CatalogCsvOperationQuery processedRowCount() {
        startField("processedRowCount");

        return this;
    }

    /**
    * Represents a rows objects within this background operation.
    */
    public CatalogCsvOperationQuery rowCount(RowCountQueryDefinition queryDef) {
        startField("rowCount");

        _queryBuilder.append('{');
        queryDef.define(new RowCountQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The status of this operation.
    */
    public CatalogCsvOperationQuery status() {
        startField("status");

        return this;
    }
}
