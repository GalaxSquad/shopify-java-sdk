// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* Return type for `carrierServiceDelete` mutation.
*/
public class CarrierServiceDeletePayloadQuery extends Query<CarrierServiceDeletePayloadQuery> {
    CarrierServiceDeletePayloadQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * The ID of the deleted carrier service.
    */
    public CarrierServiceDeletePayloadQuery deletedId() {
        startField("deletedId");

        return this;
    }

    /**
    * The list of errors that occurred from executing the mutation.
    */
    public CarrierServiceDeletePayloadQuery userErrors(CarrierServiceDeleteUserErrorQueryDefinition queryDef) {
        startField("userErrors");

        _queryBuilder.append('{');
        queryDef.define(new CarrierServiceDeleteUserErrorQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }
}
