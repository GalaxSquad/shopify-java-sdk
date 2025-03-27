// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* A file error. This typically occurs when there is an issue with the file itself causing it to fail
* validation.
* Check the file before attempting to upload again.
*/
public class FileErrorQuery extends Query<FileErrorQuery> {
    FileErrorQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * Code representing the type of error.
    */
    public FileErrorQuery code() {
        startField("code");

        return this;
    }

    /**
    * Additional details regarding the error.
    */
    public FileErrorQuery details() {
        startField("details");

        return this;
    }

    /**
    * Translated error message.
    */
    public FileErrorQuery message() {
        startField("message");

        return this;
    }
}
