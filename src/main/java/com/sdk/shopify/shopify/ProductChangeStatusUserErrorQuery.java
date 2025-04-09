// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* An error that occurs during the execution of `ProductChangeStatus`.
*/
public class ProductChangeStatusUserErrorQuery extends Query<ProductChangeStatusUserErrorQuery> {
    ProductChangeStatusUserErrorQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * The error code.
    */
    public ProductChangeStatusUserErrorQuery code() {
        startField("code");

        return this;
    }

    /**
    * The path to the input field that caused the error.
    */
    public ProductChangeStatusUserErrorQuery field() {
        startField("field");

        return this;
    }

    /**
    * The error message.
    */
    public ProductChangeStatusUserErrorQuery message() {
        startField("message");

        return this;
    }
}
