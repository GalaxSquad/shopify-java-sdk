// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* A region that is used to define a shipping zone.
*/
public class DeliveryProvinceQuery extends Query<DeliveryProvinceQuery> {
    DeliveryProvinceQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);

        startField("id");
    }

    /**
    * The code of the region.
    */
    public DeliveryProvinceQuery code() {
        startField("code");

        return this;
    }

    /**
    * The full name of the region.
    */
    public DeliveryProvinceQuery name() {
        startField("name");

        return this;
    }

    /**
    * The translated name of the region. The translation returned is based on the system's locale.
    */
    public DeliveryProvinceQuery translatedName() {
        startField("translatedName");

        return this;
    }
}
