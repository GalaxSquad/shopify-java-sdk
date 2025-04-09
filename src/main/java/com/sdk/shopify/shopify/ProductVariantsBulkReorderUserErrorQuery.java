// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* Error codes for failed bulk product variants reorder operation.
*/
public class ProductVariantsBulkReorderUserErrorQuery extends Query<ProductVariantsBulkReorderUserErrorQuery> {
    ProductVariantsBulkReorderUserErrorQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * The error code.
    */
    public ProductVariantsBulkReorderUserErrorQuery code() {
        startField("code");

        return this;
    }

    /**
    * The path to the input field that caused the error.
    */
    public ProductVariantsBulkReorderUserErrorQuery field() {
        startField("field");

        return this;
    }

    /**
    * The error message.
    */
    public ProductVariantsBulkReorderUserErrorQuery message() {
        startField("message");

        return this;
    }
}
