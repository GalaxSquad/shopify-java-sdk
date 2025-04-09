// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* Deletion events chronicle the destruction of resources (e.g. products and collections).
* Once deleted, the deletion event is the only trace of the original's existence,
* as the resource itself has been removed and can no longer be accessed.
*/
public class DeletionEventQuery extends Query<DeletionEventQuery> {
    DeletionEventQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * The date and time when the deletion event for the related resource was generated.
    */
    public DeletionEventQuery occurredAt() {
        startField("occurredAt");

        return this;
    }

    /**
    * The ID of the resource that was deleted.
    */
    public DeletionEventQuery subjectId() {
        startField("subjectId");

        return this;
    }

    /**
    * The type of resource that was deleted.
    */
    public DeletionEventQuery subjectType() {
        startField("subjectType");

        return this;
    }
}
