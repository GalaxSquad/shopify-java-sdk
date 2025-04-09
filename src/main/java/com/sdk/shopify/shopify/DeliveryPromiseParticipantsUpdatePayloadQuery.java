// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* Return type for `deliveryPromiseParticipantsUpdate` mutation.
*/
public class DeliveryPromiseParticipantsUpdatePayloadQuery extends Query<DeliveryPromiseParticipantsUpdatePayloadQuery> {
    DeliveryPromiseParticipantsUpdatePayloadQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * The promise participants that were added.
    */
    public DeliveryPromiseParticipantsUpdatePayloadQuery promiseParticipants(DeliveryPromiseParticipantQueryDefinition queryDef) {
        startField("promiseParticipants");

        _queryBuilder.append('{');
        queryDef.define(new DeliveryPromiseParticipantQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The list of errors that occurred from executing the mutation.
    */
    public DeliveryPromiseParticipantsUpdatePayloadQuery userErrors(UserErrorQueryDefinition queryDef) {
        startField("userErrors");

        _queryBuilder.append('{');
        queryDef.define(new UserErrorQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }
}
