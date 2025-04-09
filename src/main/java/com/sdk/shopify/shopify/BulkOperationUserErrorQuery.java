// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* Represents an error in the input of a mutation.
*/
public class BulkOperationUserErrorQuery extends Query<BulkOperationUserErrorQuery> {
    BulkOperationUserErrorQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * The error code.
    */
    public BulkOperationUserErrorQuery code() {
        startField("code");

        return this;
    }

    /**
    * The path to the input field that caused the error.
    */
    public BulkOperationUserErrorQuery field() {
        startField("field");

        return this;
    }

    /**
    * The error message.
    */
    public BulkOperationUserErrorQuery message() {
        startField("message");

        return this;
    }
}
