// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* An error that occurs during the execution of `AppSubscriptionTrialExtend`.
*/
public class AppSubscriptionTrialExtendUserErrorQuery extends Query<AppSubscriptionTrialExtendUserErrorQuery> {
    AppSubscriptionTrialExtendUserErrorQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * The error code.
    */
    public AppSubscriptionTrialExtendUserErrorQuery code() {
        startField("code");

        return this;
    }

    /**
    * The path to the input field that caused the error.
    */
    public AppSubscriptionTrialExtendUserErrorQuery field() {
        startField("field");

        return this;
    }

    /**
    * The error message.
    */
    public AppSubscriptionTrialExtendUserErrorQuery message() {
        startField("message");

        return this;
    }
}
