// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* Error codes for failed `ProductOptionsDelete` mutation.
*/
public class ProductOptionsDeleteUserErrorQuery extends Query<ProductOptionsDeleteUserErrorQuery> {
    ProductOptionsDeleteUserErrorQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * The error code.
    */
    public ProductOptionsDeleteUserErrorQuery code() {
        startField("code");

        return this;
    }

    /**
    * The path to the input field that caused the error.
    */
    public ProductOptionsDeleteUserErrorQuery field() {
        startField("field");

        return this;
    }

    /**
    * The error message.
    */
    public ProductOptionsDeleteUserErrorQuery message() {
        startField("message");

        return this;
    }
}
