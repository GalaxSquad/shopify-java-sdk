// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* A location for in-store pickup.
*/
public class PickupInStoreLocationQuery extends Query<PickupInStoreLocationQuery> {
    PickupInStoreLocationQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * The code of the pickup location.
    */
    public PickupInStoreLocationQuery code() {
        startField("code");

        return this;
    }

    /**
    * Distance from the buyer to the pickup location.
    */
    public PickupInStoreLocationQuery distanceFromBuyer(DistanceQueryDefinition queryDef) {
        startField("distanceFromBuyer");

        _queryBuilder.append('{');
        queryDef.define(new DistanceQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * A unique identifier for this pickup location.
    */
    public PickupInStoreLocationQuery handle() {
        startField("handle");

        return this;
    }

    /**
    * Pickup instructions.
    */
    public PickupInStoreLocationQuery instructions() {
        startField("instructions");

        return this;
    }

    /**
    * The location ID of the pickup location.
    */
    public PickupInStoreLocationQuery locationId() {
        startField("locationId");

        return this;
    }

    /**
    * The source of the pickup location.
    */
    public PickupInStoreLocationQuery source() {
        startField("source");

        return this;
    }

    /**
    * Title of the pickup location.
    */
    public PickupInStoreLocationQuery title() {
        startField("title");

        return this;
    }
}
