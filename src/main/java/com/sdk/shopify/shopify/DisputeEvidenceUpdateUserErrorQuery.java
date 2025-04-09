// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* An error that occurs during the execution of `DisputeEvidenceUpdate`.
*/
public class DisputeEvidenceUpdateUserErrorQuery extends Query<DisputeEvidenceUpdateUserErrorQuery> {
    DisputeEvidenceUpdateUserErrorQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * The error code.
    */
    public DisputeEvidenceUpdateUserErrorQuery code() {
        startField("code");

        return this;
    }

    /**
    * The path to the input field that caused the error.
    */
    public DisputeEvidenceUpdateUserErrorQuery field() {
        startField("field");

        return this;
    }

    /**
    * The error message.
    */
    public DisputeEvidenceUpdateUserErrorQuery message() {
        startField("message");

        return this;
    }
}
