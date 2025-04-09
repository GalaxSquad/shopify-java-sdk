// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* An error that occurs during the execution of `DataSaleOptOut`.
*/
public class DataSaleOptOutUserErrorQuery extends Query<DataSaleOptOutUserErrorQuery> {
    DataSaleOptOutUserErrorQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * The error code.
    */
    public DataSaleOptOutUserErrorQuery code() {
        startField("code");

        return this;
    }

    /**
    * The path to the input field that caused the error.
    */
    public DataSaleOptOutUserErrorQuery field() {
        startField("field");

        return this;
    }

    /**
    * The error message.
    */
    public DataSaleOptOutUserErrorQuery message() {
        startField("message");

        return this;
    }
}
