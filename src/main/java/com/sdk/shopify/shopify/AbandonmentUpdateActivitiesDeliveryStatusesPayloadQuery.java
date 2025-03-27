// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* Return type for `abandonmentUpdateActivitiesDeliveryStatuses` mutation.
*/
public class AbandonmentUpdateActivitiesDeliveryStatusesPayloadQuery extends Query<AbandonmentUpdateActivitiesDeliveryStatusesPayloadQuery> {
    AbandonmentUpdateActivitiesDeliveryStatusesPayloadQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * The updated abandonment.
    */
    public AbandonmentUpdateActivitiesDeliveryStatusesPayloadQuery abandonment(AbandonmentQueryDefinition queryDef) {
        startField("abandonment");

        _queryBuilder.append('{');
        queryDef.define(new AbandonmentQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The list of errors that occurred from executing the mutation.
    */
    public AbandonmentUpdateActivitiesDeliveryStatusesPayloadQuery userErrors(AbandonmentUpdateActivitiesDeliveryStatusesUserErrorQueryDefinition queryDef) {
        startField("userErrors");

        _queryBuilder.append('{');
        queryDef.define(new AbandonmentUpdateActivitiesDeliveryStatusesUserErrorQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }
}
