// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* Return type for `locationLocalPickupDisable` mutation.
*/
public class LocationLocalPickupDisablePayloadQuery extends Query<LocationLocalPickupDisablePayloadQuery> {
    LocationLocalPickupDisablePayloadQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * The ID of the location for which local pickup was disabled.
    */
    public LocationLocalPickupDisablePayloadQuery locationId() {
        startField("locationId");

        return this;
    }

    /**
    * The list of errors that occurred from executing the mutation.
    */
    public LocationLocalPickupDisablePayloadQuery userErrors(DeliveryLocationLocalPickupSettingsErrorQueryDefinition queryDef) {
        startField("userErrors");

        _queryBuilder.append('{');
        queryDef.define(new DeliveryLocationLocalPickupSettingsErrorQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }
}
