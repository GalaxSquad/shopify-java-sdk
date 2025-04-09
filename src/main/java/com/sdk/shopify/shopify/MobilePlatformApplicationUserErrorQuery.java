// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* Represents an error in the input of a mutation.
*/
public class MobilePlatformApplicationUserErrorQuery extends Query<MobilePlatformApplicationUserErrorQuery> {
    MobilePlatformApplicationUserErrorQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * The error code.
    */
    public MobilePlatformApplicationUserErrorQuery code() {
        startField("code");

        return this;
    }

    /**
    * The path to the input field that caused the error.
    */
    public MobilePlatformApplicationUserErrorQuery field() {
        startField("field");

        return this;
    }

    /**
    * The error message.
    */
    public MobilePlatformApplicationUserErrorQuery message() {
        startField("message");

        return this;
    }
}
