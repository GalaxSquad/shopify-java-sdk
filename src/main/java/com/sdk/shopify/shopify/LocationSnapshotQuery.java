// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* A snapshot of location details including name and address captured at a specific point in time.
* Refer to the parent model to know the lifecycle.
*/
public class LocationSnapshotQuery extends Query<LocationSnapshotQuery> {
    LocationSnapshotQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * The address details of the location as they were when the snapshot was recorded.
    */
    public LocationSnapshotQuery address(LocationAddressQueryDefinition queryDef) {
        startField("address");

        _queryBuilder.append('{');
        queryDef.define(new LocationAddressQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * A reference to the live Location object, if it still exists and is accessible. This provides current
    * details of the location, which may differ from the snapshotted name and address.
    */
    public LocationSnapshotQuery location(LocationQueryDefinition queryDef) {
        startField("location");

        _queryBuilder.append('{');
        queryDef.define(new LocationQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The name of the location as it was when the snapshot was recorded.
    */
    public LocationSnapshotQuery name() {
        startField("name");

        return this;
    }

    /**
    * The date and time when these snapshot details (name and address) were recorded.
    */
    public LocationSnapshotQuery snapshottedAt() {
        startField("snapshottedAt");

        return this;
    }
}
