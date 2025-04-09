// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* An error that occurs during the execution of `CombinedListingUpdate`.
*/
public class CombinedListingUpdateUserErrorQuery extends Query<CombinedListingUpdateUserErrorQuery> {
    CombinedListingUpdateUserErrorQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * The error code.
    */
    public CombinedListingUpdateUserErrorQuery code() {
        startField("code");

        return this;
    }

    /**
    * The path to the input field that caused the error.
    */
    public CombinedListingUpdateUserErrorQuery field() {
        startField("field");

        return this;
    }

    /**
    * The error message.
    */
    public CombinedListingUpdateUserErrorQuery message() {
        startField("message");

        return this;
    }
}
