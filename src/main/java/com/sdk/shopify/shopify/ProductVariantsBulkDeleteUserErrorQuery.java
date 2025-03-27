// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* Error codes for failed bulk variant delete mutations.
*/
public class ProductVariantsBulkDeleteUserErrorQuery extends Query<ProductVariantsBulkDeleteUserErrorQuery> {
    ProductVariantsBulkDeleteUserErrorQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * The error code.
    */
    public ProductVariantsBulkDeleteUserErrorQuery code() {
        startField("code");

        return this;
    }

    /**
    * The path to the input field that caused the error.
    */
    public ProductVariantsBulkDeleteUserErrorQuery field() {
        startField("field");

        return this;
    }

    /**
    * The error message.
    */
    public ProductVariantsBulkDeleteUserErrorQuery message() {
        startField("message");

        return this;
    }
}
