// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* A participant defines carrier-calculated rates for shipping services
* with a possible merchant-defined fixed fee or a percentage-of-rate fee.
*/
public class DeliveryParticipantQuery extends Query<DeliveryParticipantQuery> {
    DeliveryParticipantQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);

        startField("id");
    }

    /**
    * Whether to display new shipping services automatically to the customer when the service becomes
    * available.
    */
    public DeliveryParticipantQuery adaptToNewServicesFlag() {
        startField("adaptToNewServicesFlag");

        return this;
    }

    /**
    * The carrier used for this participant.
    */
    public DeliveryParticipantQuery carrierService(DeliveryCarrierServiceQueryDefinition queryDef) {
        startField("carrierService");

        _queryBuilder.append('{');
        queryDef.define(new DeliveryCarrierServiceQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The merchant-defined fixed fee for this participant.
    */
    public DeliveryParticipantQuery fixedFee(MoneyV2QueryDefinition queryDef) {
        startField("fixedFee");

        _queryBuilder.append('{');
        queryDef.define(new MoneyV2Query(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The carrier-specific services offered by the participant, and whether each service is active.
    */
    public DeliveryParticipantQuery participantServices(DeliveryParticipantServiceQueryDefinition queryDef) {
        startField("participantServices");

        _queryBuilder.append('{');
        queryDef.define(new DeliveryParticipantServiceQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The merchant-defined percentage-of-rate fee for this participant.
    */
    public DeliveryParticipantQuery percentageOfRateFee() {
        startField("percentageOfRateFee");

        return this;
    }
}
