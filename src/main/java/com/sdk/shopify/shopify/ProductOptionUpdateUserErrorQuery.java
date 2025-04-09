// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* Error codes for failed `ProductOptionUpdate` mutation.
*/
public class ProductOptionUpdateUserErrorQuery extends Query<ProductOptionUpdateUserErrorQuery> {
    ProductOptionUpdateUserErrorQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * The error code.
    */
    public ProductOptionUpdateUserErrorQuery code() {
        startField("code");

        return this;
    }

    /**
    * The path to the input field that caused the error.
    */
    public ProductOptionUpdateUserErrorQuery field() {
        startField("field");

        return this;
    }

    /**
    * The error message.
    */
    public ProductOptionUpdateUserErrorQuery message() {
        startField("message");

        return this;
    }
}
