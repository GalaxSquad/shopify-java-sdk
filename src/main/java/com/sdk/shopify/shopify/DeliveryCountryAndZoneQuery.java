// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* The country details and the associated shipping zone.
*/
public class DeliveryCountryAndZoneQuery extends Query<DeliveryCountryAndZoneQuery> {
    DeliveryCountryAndZoneQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * The country details.
    */
    public DeliveryCountryAndZoneQuery country(DeliveryCountryQueryDefinition queryDef) {
        startField("country");

        _queryBuilder.append('{');
        queryDef.define(new DeliveryCountryQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The name of the shipping zone.
    */
    public DeliveryCountryAndZoneQuery zone() {
        startField("zone");

        return this;
    }
}
