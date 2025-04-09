// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* A rate provided by a merchant-defined rate or a participant.
*/
public class DeliveryRateProviderQuery extends Query<DeliveryRateProviderQuery> {
    DeliveryRateProviderQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);

        startField("__typename");
    }

    public DeliveryRateProviderQuery onDeliveryParticipant(DeliveryParticipantQueryDefinition queryDef) {
        startInlineFragment("DeliveryParticipant");
        queryDef.define(new DeliveryParticipantQuery(_queryBuilder));
        _queryBuilder.append('}');
        return this;
    }

    public DeliveryRateProviderQuery onDeliveryRateDefinition(DeliveryRateDefinitionQueryDefinition queryDef) {
        startInlineFragment("DeliveryRateDefinition");
        queryDef.define(new DeliveryRateDefinitionQuery(_queryBuilder));
        _queryBuilder.append('}');
        return this;
    }
}
