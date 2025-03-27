// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* Return type for `fulfillmentEventCreate` mutation.
*/
public class FulfillmentEventCreatePayloadQuery extends Query<FulfillmentEventCreatePayloadQuery> {
    FulfillmentEventCreatePayloadQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * The created fulfillment event.
    */
    public FulfillmentEventCreatePayloadQuery fulfillmentEvent(FulfillmentEventQueryDefinition queryDef) {
        startField("fulfillmentEvent");

        _queryBuilder.append('{');
        queryDef.define(new FulfillmentEventQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The list of errors that occurred from executing the mutation.
    */
    public FulfillmentEventCreatePayloadQuery userErrors(UserErrorQueryDefinition queryDef) {
        startField("userErrors");

        _queryBuilder.append('{');
        queryDef.define(new UserErrorQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }
}
