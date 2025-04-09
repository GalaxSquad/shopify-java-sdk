// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* A carrier service and the associated list of shop locations.
*/
public class DeliveryCarrierServiceAndLocationsQuery extends Query<DeliveryCarrierServiceAndLocationsQuery> {
    DeliveryCarrierServiceAndLocationsQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * The carrier service.
    */
    public DeliveryCarrierServiceAndLocationsQuery carrierService(DeliveryCarrierServiceQueryDefinition queryDef) {
        startField("carrierService");

        _queryBuilder.append('{');
        queryDef.define(new DeliveryCarrierServiceQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The list of locations that support this carrier service.
    */
    public DeliveryCarrierServiceAndLocationsQuery locations(LocationQueryDefinition queryDef) {
        startField("locations");

        _queryBuilder.append('{');
        queryDef.define(new LocationQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }
}
