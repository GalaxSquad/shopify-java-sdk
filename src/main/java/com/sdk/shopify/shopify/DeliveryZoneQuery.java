// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* A zone is a group of countries that have the same shipping rates. Customers can order products from
* a store only if they choose a shipping destination that's included in one of the store's zones.
*/
public class DeliveryZoneQuery extends Query<DeliveryZoneQuery> {
    DeliveryZoneQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);

        startField("id");
    }

    /**
    * The list of countries within the zone.
    */
    public DeliveryZoneQuery countries(DeliveryCountryQueryDefinition queryDef) {
        startField("countries");

        _queryBuilder.append('{');
        queryDef.define(new DeliveryCountryQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The name of the zone.
    */
    public DeliveryZoneQuery name() {
        startField("name");

        return this;
    }
}
