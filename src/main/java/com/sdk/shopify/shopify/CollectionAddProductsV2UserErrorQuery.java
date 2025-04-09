// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* An error that occurs during the execution of `CollectionAddProductsV2`.
*/
public class CollectionAddProductsV2UserErrorQuery extends Query<CollectionAddProductsV2UserErrorQuery> {
    CollectionAddProductsV2UserErrorQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * The error code.
    */
    public CollectionAddProductsV2UserErrorQuery code() {
        startField("code");

        return this;
    }

    /**
    * The path to the input field that caused the error.
    */
    public CollectionAddProductsV2UserErrorQuery field() {
        startField("field");

        return this;
    }

    /**
    * The error message.
    */
    public CollectionAddProductsV2UserErrorQuery message() {
        startField("message");

        return this;
    }
}
