// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* Return type for `fulfillmentCreate` mutation.
*/
public class FulfillmentCreatePayloadQuery extends Query<FulfillmentCreatePayloadQuery> {
    FulfillmentCreatePayloadQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * The created fulfillment.
    */
    public FulfillmentCreatePayloadQuery fulfillment(FulfillmentQueryDefinition queryDef) {
        startField("fulfillment");

        _queryBuilder.append('{');
        queryDef.define(new FulfillmentQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The list of errors that occurred from executing the mutation.
    */
    public FulfillmentCreatePayloadQuery userErrors(UserErrorQueryDefinition queryDef) {
        startField("userErrors");

        _queryBuilder.append('{');
        queryDef.define(new UserErrorQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }
}
