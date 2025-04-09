// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* Return type for `fulfillmentTrackingInfoUpdate` mutation.
*/
public class FulfillmentTrackingInfoUpdatePayloadQuery extends Query<FulfillmentTrackingInfoUpdatePayloadQuery> {
    FulfillmentTrackingInfoUpdatePayloadQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * The updated fulfillment with tracking information.
    */
    public FulfillmentTrackingInfoUpdatePayloadQuery fulfillment(FulfillmentQueryDefinition queryDef) {
        startField("fulfillment");

        _queryBuilder.append('{');
        queryDef.define(new FulfillmentQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The list of errors that occurred from executing the mutation.
    */
    public FulfillmentTrackingInfoUpdatePayloadQuery userErrors(UserErrorQueryDefinition queryDef) {
        startField("userErrors");

        _queryBuilder.append('{');
        queryDef.define(new UserErrorQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }
}
