// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* Represents a product duplication job.
*/
public class ProductDuplicateJobQuery extends Query<ProductDuplicateJobQuery> {
    ProductDuplicateJobQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * This indicates if the job is still queued or has been run.
    */
    public ProductDuplicateJobQuery done() {
        startField("done");

        return this;
    }

    /**
    * A globally-unique ID that's returned when running an asynchronous mutation.
    */
    public ProductDuplicateJobQuery id() {
        startField("id");

        return this;
    }
}
