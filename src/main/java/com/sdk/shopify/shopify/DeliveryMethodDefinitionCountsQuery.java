// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* The number of method definitions for a zone, separated into merchant-owned and participant
* definitions.
*/
public class DeliveryMethodDefinitionCountsQuery extends Query<DeliveryMethodDefinitionCountsQuery> {
    DeliveryMethodDefinitionCountsQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * The number of participant method definitions for the specified zone.
    */
    public DeliveryMethodDefinitionCountsQuery participantDefinitionsCount() {
        startField("participantDefinitionsCount");

        return this;
    }

    /**
    * The number of merchant-defined method definitions for the specified zone.
    */
    public DeliveryMethodDefinitionCountsQuery rateDefinitionsCount() {
        startField("rateDefinitionsCount");

        return this;
    }
}
