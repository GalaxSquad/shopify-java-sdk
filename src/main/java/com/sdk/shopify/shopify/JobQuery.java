// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* A job corresponds to some long running task that the client should poll for status.
*/
public class JobQuery extends Query<JobQuery> {
    JobQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * This indicates if the job is still queued or has been run.
    */
    public JobQuery done() {
        startField("done");

        return this;
    }

    /**
    * A globally-unique ID that's returned when running an asynchronous mutation.
    */
    public JobQuery id() {
        startField("id");

        return this;
    }

    /**
    * This field will only resolve once the job is done. Can be used to ask for object(s) that have been
    * changed by the job.
    */
    public JobQuery query(QueryRootQueryDefinition queryDef) {
        startField("query");

        _queryBuilder.append('{');
        queryDef.define(new QueryRootQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }
}
