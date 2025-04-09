// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* Return type for `locationLocalPickupEnable` mutation.
*/
public class LocationLocalPickupEnablePayloadQuery extends Query<LocationLocalPickupEnablePayloadQuery> {
    LocationLocalPickupEnablePayloadQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * The local pickup settings that were enabled.
    */
    public LocationLocalPickupEnablePayloadQuery localPickupSettings(DeliveryLocalPickupSettingsQueryDefinition queryDef) {
        startField("localPickupSettings");

        _queryBuilder.append('{');
        queryDef.define(new DeliveryLocalPickupSettingsQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The list of errors that occurred from executing the mutation.
    */
    public LocationLocalPickupEnablePayloadQuery userErrors(DeliveryLocationLocalPickupSettingsErrorQueryDefinition queryDef) {
        startField("userErrors");

        _queryBuilder.append('{');
        queryDef.define(new DeliveryLocationLocalPickupSettingsErrorQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }
}
