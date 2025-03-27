// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* Error codes for failed product variant bulk create mutations.
*/
public class ProductVariantsBulkCreateUserErrorQuery extends Query<ProductVariantsBulkCreateUserErrorQuery> {
    ProductVariantsBulkCreateUserErrorQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * The error code.
    */
    public ProductVariantsBulkCreateUserErrorQuery code() {
        startField("code");

        return this;
    }

    /**
    * The path to the input field that caused the error.
    */
    public ProductVariantsBulkCreateUserErrorQuery field() {
        startField("field");

        return this;
    }

    /**
    * The error message.
    */
    public ProductVariantsBulkCreateUserErrorQuery message() {
        startField("message");

        return this;
    }
}
