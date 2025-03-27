// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* Returns enabled delivery promise participants.
*/
public class DeliveryPromiseParticipantQuery extends Query<DeliveryPromiseParticipantQuery> {
    DeliveryPromiseParticipantQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);

        startField("id");
    }

    /**
    * The resource that the participant is attached to.
    */
    public DeliveryPromiseParticipantQuery owner(DeliveryPromiseParticipantOwnerQueryDefinition queryDef) {
        startField("owner");

        _queryBuilder.append('{');
        queryDef.define(new DeliveryPromiseParticipantOwnerQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The owner type of the participant.
    */
    public DeliveryPromiseParticipantQuery ownerType() {
        startField("ownerType");

        return this;
    }
}
