// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* Return type for `carrierServiceUpdate` mutation.
*/
public class CarrierServiceUpdatePayloadQuery extends Query<CarrierServiceUpdatePayloadQuery> {
    CarrierServiceUpdatePayloadQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * The updated carrier service.
    */
    public CarrierServiceUpdatePayloadQuery carrierService(DeliveryCarrierServiceQueryDefinition queryDef) {
        startField("carrierService");

        _queryBuilder.append('{');
        queryDef.define(new DeliveryCarrierServiceQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The list of errors that occurred from executing the mutation.
    */
    public CarrierServiceUpdatePayloadQuery userErrors(CarrierServiceUpdateUserErrorQueryDefinition queryDef) {
        startField("userErrors");

        _queryBuilder.append('{');
        queryDef.define(new CarrierServiceUpdateUserErrorQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }
}
