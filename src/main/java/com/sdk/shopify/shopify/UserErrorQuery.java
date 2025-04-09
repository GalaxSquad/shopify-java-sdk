// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* Represents an error in the input of a mutation.
*/
public class UserErrorQuery extends Query<UserErrorQuery> {
    UserErrorQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * The path to the input field that caused the error.
    */
    public UserErrorQuery field() {
        startField("field");

        return this;
    }

    /**
    * The error message.
    */
    public UserErrorQuery message() {
        startField("message");

        return this;
    }
}
