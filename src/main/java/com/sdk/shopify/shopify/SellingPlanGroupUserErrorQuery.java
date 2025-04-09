// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* Represents a selling plan group custom error.
*/
public class SellingPlanGroupUserErrorQuery extends Query<SellingPlanGroupUserErrorQuery> {
    SellingPlanGroupUserErrorQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * The error code.
    */
    public SellingPlanGroupUserErrorQuery code() {
        startField("code");

        return this;
    }

    /**
    * The path to the input field that caused the error.
    */
    public SellingPlanGroupUserErrorQuery field() {
        startField("field");

        return this;
    }

    /**
    * The error message.
    */
    public SellingPlanGroupUserErrorQuery message() {
        startField("message");

        return this;
    }
}
