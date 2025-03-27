// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* Defines errors encountered while managing a product bundle.
*/
public class ProductBundleMutationUserErrorQuery extends Query<ProductBundleMutationUserErrorQuery> {
    ProductBundleMutationUserErrorQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * The error code.
    */
    public ProductBundleMutationUserErrorQuery code() {
        startField("code");

        return this;
    }

    /**
    * The path to the input field that caused the error.
    */
    public ProductBundleMutationUserErrorQuery field() {
        startField("field");

        return this;
    }

    /**
    * The error message.
    */
    public ProductBundleMutationUserErrorQuery message() {
        startField("message");

        return this;
    }
}
