// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* Represents an error that happens during execution of a bulk mutation.
*/
public class BulkMutationUserErrorQuery extends Query<BulkMutationUserErrorQuery> {
    BulkMutationUserErrorQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * The error code.
    */
    public BulkMutationUserErrorQuery code() {
        startField("code");

        return this;
    }

    /**
    * The path to the input field that caused the error.
    */
    public BulkMutationUserErrorQuery field() {
        startField("field");

        return this;
    }

    /**
    * The error message.
    */
    public BulkMutationUserErrorQuery message() {
        startField("message");

        return this;
    }
}
