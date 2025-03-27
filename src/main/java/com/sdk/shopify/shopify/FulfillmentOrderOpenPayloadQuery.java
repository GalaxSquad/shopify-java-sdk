// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* Return type for `fulfillmentOrderOpen` mutation.
*/
public class FulfillmentOrderOpenPayloadQuery extends Query<FulfillmentOrderOpenPayloadQuery> {
    FulfillmentOrderOpenPayloadQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * The fulfillment order that was transitioned to open and is fulfillable.
    */
    public FulfillmentOrderOpenPayloadQuery fulfillmentOrder(FulfillmentOrderQueryDefinition queryDef) {
        startField("fulfillmentOrder");

        _queryBuilder.append('{');
        queryDef.define(new FulfillmentOrderQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The list of errors that occurred from executing the mutation.
    */
    public FulfillmentOrderOpenPayloadQuery userErrors(UserErrorQueryDefinition queryDef) {
        startField("userErrors");

        _queryBuilder.append('{');
        queryDef.define(new UserErrorQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }
}
