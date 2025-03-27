// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* Return type for `fulfillmentTrackingInfoUpdateV2` mutation.
*/
public class FulfillmentTrackingInfoUpdateV2PayloadQuery extends Query<FulfillmentTrackingInfoUpdateV2PayloadQuery> {
    FulfillmentTrackingInfoUpdateV2PayloadQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * The updated fulfillment with tracking information.
    */
    public FulfillmentTrackingInfoUpdateV2PayloadQuery fulfillment(FulfillmentQueryDefinition queryDef) {
        startField("fulfillment");

        _queryBuilder.append('{');
        queryDef.define(new FulfillmentQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The list of errors that occurred from executing the mutation.
    */
    public FulfillmentTrackingInfoUpdateV2PayloadQuery userErrors(UserErrorQueryDefinition queryDef) {
        startField("userErrors");

        _queryBuilder.append('{');
        queryDef.define(new UserErrorQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }
}
