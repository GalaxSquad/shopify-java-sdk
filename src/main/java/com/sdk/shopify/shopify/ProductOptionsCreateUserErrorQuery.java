// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* Error codes for failed `ProductOptionsCreate` mutation.
*/
public class ProductOptionsCreateUserErrorQuery extends Query<ProductOptionsCreateUserErrorQuery> {
    ProductOptionsCreateUserErrorQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * The error code.
    */
    public ProductOptionsCreateUserErrorQuery code() {
        startField("code");

        return this;
    }

    /**
    * The path to the input field that caused the error.
    */
    public ProductOptionsCreateUserErrorQuery field() {
        startField("field");

        return this;
    }

    /**
    * The error message.
    */
    public ProductOptionsCreateUserErrorQuery message() {
        startField("message");

        return this;
    }
}
