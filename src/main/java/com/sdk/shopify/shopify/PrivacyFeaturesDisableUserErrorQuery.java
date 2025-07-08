// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* An error that occurs during the execution of `PrivacyFeaturesDisable`.
*/
public class PrivacyFeaturesDisableUserErrorQuery extends Query<PrivacyFeaturesDisableUserErrorQuery> {
    PrivacyFeaturesDisableUserErrorQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * The error code.
    */
    public PrivacyFeaturesDisableUserErrorQuery code() {
        startField("code");

        return this;
    }

    /**
    * The path to the input field that caused the error.
    */
    public PrivacyFeaturesDisableUserErrorQuery field() {
        startField("field");

        return this;
    }

    /**
    * The error message.
    */
    public PrivacyFeaturesDisableUserErrorQuery message() {
        startField("message");

        return this;
    }
}
