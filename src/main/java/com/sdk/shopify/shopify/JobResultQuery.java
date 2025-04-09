// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* A job corresponds to some long running task that the client should poll for status.
*/
public class JobResultQuery extends Query<JobResultQuery> {
    JobResultQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);

        startField("__typename");
    }

    /**
    * This indicates if the job is still queued or has been run.
    */
    public JobResultQuery done() {
        startField("done");

        return this;
    }

    /**
    * A globally-unique ID that's returned when running an asynchronous mutation.
    */
    public JobResultQuery id() {
        startField("id");

        return this;
    }

    public JobResultQuery onCustomerSegmentMembersQuery(CustomerSegmentMembersQueryQueryDefinition queryDef) {
        startInlineFragment("CustomerSegmentMembersQuery");
        queryDef.define(new CustomerSegmentMembersQueryQuery(_queryBuilder));
        _queryBuilder.append('}');
        return this;
    }
}
