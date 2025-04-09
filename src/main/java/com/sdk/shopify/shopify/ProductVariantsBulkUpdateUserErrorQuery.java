// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* Error codes for failed variant bulk update mutations.
*/
public class ProductVariantsBulkUpdateUserErrorQuery extends Query<ProductVariantsBulkUpdateUserErrorQuery> {
    ProductVariantsBulkUpdateUserErrorQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * The error code.
    */
    public ProductVariantsBulkUpdateUserErrorQuery code() {
        startField("code");

        return this;
    }

    /**
    * The path to the input field that caused the error.
    */
    public ProductVariantsBulkUpdateUserErrorQuery field() {
        startField("field");

        return this;
    }

    /**
    * The error message.
    */
    public ProductVariantsBulkUpdateUserErrorQuery message() {
        startField("message");

        return this;
    }
}
