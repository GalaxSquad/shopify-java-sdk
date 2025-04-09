// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* Defines errors encountered while managing a publication.
*/
public class PublicationUserErrorQuery extends Query<PublicationUserErrorQuery> {
    PublicationUserErrorQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * The error code.
    */
    public PublicationUserErrorQuery code() {
        startField("code");

        return this;
    }

    /**
    * The path to the input field that caused the error.
    */
    public PublicationUserErrorQuery field() {
        startField("field");

        return this;
    }

    /**
    * The error message.
    */
    public PublicationUserErrorQuery message() {
        startField("message");

        return this;
    }
}
