// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* Return type for `carrierServiceCreate` mutation.
*/
public class CarrierServiceCreatePayloadQuery extends Query<CarrierServiceCreatePayloadQuery> {
    CarrierServiceCreatePayloadQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * The created carrier service.
    */
    public CarrierServiceCreatePayloadQuery carrierService(DeliveryCarrierServiceQueryDefinition queryDef) {
        startField("carrierService");

        _queryBuilder.append('{');
        queryDef.define(new DeliveryCarrierServiceQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The list of errors that occurred from executing the mutation.
    */
    public CarrierServiceCreatePayloadQuery userErrors(CarrierServiceCreateUserErrorQueryDefinition queryDef) {
        startField("userErrors");

        _queryBuilder.append('{');
        queryDef.define(new CarrierServiceCreateUserErrorQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }
}
