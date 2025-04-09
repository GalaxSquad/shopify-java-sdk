// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* An asynchronous long-running operation to fetch data in bulk or to bulk import data.
* Bulk operations are created using the `bulkOperationRunQuery` or `bulkOperationRunMutation`
* mutation. After
* they are created, clients should poll the `status` field for updates. When `COMPLETED`, the `url`
* field contains
* a link to the data in [JSONL](http://jsonlines.org/) format.
* Refer to the [bulk operations guide](https://shopify.dev/api/usage/bulk-operations/imports) for more
* details.
*/
public class BulkOperationQuery extends Query<BulkOperationQuery> {
    BulkOperationQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);

        startField("id");
    }

    /**
    * When the bulk operation was successfully completed.
    */
    public BulkOperationQuery completedAt() {
        startField("completedAt");

        return this;
    }

    /**
    * When the bulk operation was created.
    */
    public BulkOperationQuery createdAt() {
        startField("createdAt");

        return this;
    }

    /**
    * Error code for failed operations.
    */
    public BulkOperationQuery errorCode() {
        startField("errorCode");

        return this;
    }

    /**
    * File size in bytes of the file in the `url` field.
    */
    public BulkOperationQuery fileSize() {
        startField("fileSize");

        return this;
    }

    /**
    * A running count of all the objects processed.
    * For example, when fetching all the products and their variants, this field counts both products and
    * variants.
    * This field can be used to track operation progress.
    */
    public BulkOperationQuery objectCount() {
        startField("objectCount");

        return this;
    }

    /**
    * The URL that points to the partial or incomplete response data (in [JSONL](http://jsonlines.org/)
    * format) that was returned by a failed operation.
    * The URL expires 7 days after the operation fails. Returns `null` when there's no data available.
    */
    public BulkOperationQuery partialDataUrl() {
        startField("partialDataUrl");

        return this;
    }

    /**
    * GraphQL query document specified in `bulkOperationRunQuery`.
    */
    public BulkOperationQuery query() {
        startField("query");

        return this;
    }

    /**
    * A running count of all the objects that are processed at the root of the query.
    * For example, when fetching all the products and their variants, this field only counts products.
    * This field can be used to track operation progress.
    */
    public BulkOperationQuery rootObjectCount() {
        startField("rootObjectCount");

        return this;
    }

    /**
    * Status of the bulk operation.
    */
    public BulkOperationQuery status() {
        startField("status");

        return this;
    }

    /**
    * The bulk operation's type.
    */
    public BulkOperationQuery type() {
        startField("type");

        return this;
    }

    /**
    * The URL that points to the response data in [JSONL](http://jsonlines.org/) format.
    * The URL expires 7 days after the operation completes.
    */
    public BulkOperationQuery url() {
        startField("url");

        return this;
    }
}
