// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* Defines errors for ProductSet mutation.
*/
public class ProductSetUserErrorQuery extends Query<ProductSetUserErrorQuery> {
    ProductSetUserErrorQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * The error code.
    */
    public ProductSetUserErrorQuery code() {
        startField("code");

        return this;
    }

    /**
    * The path to the input field that caused the error.
    */
    public ProductSetUserErrorQuery field() {
        startField("field");

        return this;
    }

    /**
    * The error message.
    */
    public ProductSetUserErrorQuery message() {
        startField("message");

        return this;
    }
}
