// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* An error that occurs during the execution of `ProductFullSync`.
*/
public class ProductFullSyncUserErrorQuery extends Query<ProductFullSyncUserErrorQuery> {
    ProductFullSyncUserErrorQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * The error code.
    */
    public ProductFullSyncUserErrorQuery code() {
        startField("code");

        return this;
    }

    /**
    * The path to the input field that caused the error.
    */
    public ProductFullSyncUserErrorQuery field() {
        startField("field");

        return this;
    }

    /**
    * The error message.
    */
    public ProductFullSyncUserErrorQuery message() {
        startField("message");

        return this;
    }
}
