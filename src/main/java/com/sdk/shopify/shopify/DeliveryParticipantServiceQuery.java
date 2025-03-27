// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* A mail service provided by the participant.
*/
public class DeliveryParticipantServiceQuery extends Query<DeliveryParticipantServiceQuery> {
    DeliveryParticipantServiceQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * Whether the service is active.
    */
    public DeliveryParticipantServiceQuery active() {
        startField("active");

        return this;
    }

    /**
    * The name of the service.
    */
    public DeliveryParticipantServiceQuery name() {
        startField("name");

        return this;
    }
}
