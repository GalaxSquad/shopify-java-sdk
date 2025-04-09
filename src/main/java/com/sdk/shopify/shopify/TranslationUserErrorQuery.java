// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* Represents an error that happens during the execution of a translation mutation.
*/
public class TranslationUserErrorQuery extends Query<TranslationUserErrorQuery> {
    TranslationUserErrorQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * The error code.
    */
    public TranslationUserErrorQuery code() {
        startField("code");

        return this;
    }

    /**
    * The path to the input field that caused the error.
    */
    public TranslationUserErrorQuery field() {
        startField("field");

        return this;
    }

    /**
    * The error message.
    */
    public TranslationUserErrorQuery message() {
        startField("message");

        return this;
    }
}
