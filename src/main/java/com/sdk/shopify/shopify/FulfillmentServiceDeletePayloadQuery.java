// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* Return type for `fulfillmentServiceDelete` mutation.
*/
public class FulfillmentServiceDeletePayloadQuery extends Query<FulfillmentServiceDeletePayloadQuery> {
    FulfillmentServiceDeletePayloadQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * The ID of the deleted fulfillment service.
    */
    public FulfillmentServiceDeletePayloadQuery deletedId() {
        startField("deletedId");

        return this;
    }

    /**
    * The list of errors that occurred from executing the mutation.
    */
    public FulfillmentServiceDeletePayloadQuery userErrors(UserErrorQueryDefinition queryDef) {
        startField("userErrors");

        _queryBuilder.append('{');
        queryDef.define(new UserErrorQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }
}
