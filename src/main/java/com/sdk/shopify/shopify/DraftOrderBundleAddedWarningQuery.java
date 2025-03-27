// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* A warning indicating that a bundle was added to a draft order.
*/
public class DraftOrderBundleAddedWarningQuery extends Query<DraftOrderBundleAddedWarningQuery> {
    DraftOrderBundleAddedWarningQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * The error code.
    */
    public DraftOrderBundleAddedWarningQuery errorCode() {
        startField("errorCode");

        return this;
    }

    /**
    * The input field that the warning applies to.
    */
    public DraftOrderBundleAddedWarningQuery field() {
        startField("field");

        return this;
    }

    /**
    * The warning message.
    */
    public DraftOrderBundleAddedWarningQuery message() {
        startField("message");

        return this;
    }
}
