// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* Defines errors encountered while managing a catalog.
*/
public class CatalogUserErrorQuery extends Query<CatalogUserErrorQuery> {
    CatalogUserErrorQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * The error code.
    */
    public CatalogUserErrorQuery code() {
        startField("code");

        return this;
    }

    /**
    * The path to the input field that caused the error.
    */
    public CatalogUserErrorQuery field() {
        startField("field");

        return this;
    }

    /**
    * The error message.
    */
    public CatalogUserErrorQuery message() {
        startField("message");

        return this;
    }
}
