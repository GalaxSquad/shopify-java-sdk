// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* An error that occurs during the execution of `AbandonmentUpdateActivitiesDeliveryStatuses`.
*/
public class AbandonmentUpdateActivitiesDeliveryStatusesUserErrorQuery extends Query<AbandonmentUpdateActivitiesDeliveryStatusesUserErrorQuery> {
    AbandonmentUpdateActivitiesDeliveryStatusesUserErrorQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * The error code.
    */
    public AbandonmentUpdateActivitiesDeliveryStatusesUserErrorQuery code() {
        startField("code");

        return this;
    }

    /**
    * The path to the input field that caused the error.
    */
    public AbandonmentUpdateActivitiesDeliveryStatusesUserErrorQuery field() {
        startField("field");

        return this;
    }

    /**
    * The error message.
    */
    public AbandonmentUpdateActivitiesDeliveryStatusesUserErrorQuery message() {
        startField("message");

        return this;
    }
}
