// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* The measurement used to calculate a unit price for a product variant (e.g. $9.99 / 100ml).
*/
public class UnitPriceMeasurementQuery extends Query<UnitPriceMeasurementQuery> {
    UnitPriceMeasurementQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * The type of unit of measurement for the unit price measurement.
    */
    public UnitPriceMeasurementQuery measuredType() {
        startField("measuredType");

        return this;
    }

    /**
    * The quantity unit for the unit price measurement.
    */
    public UnitPriceMeasurementQuery quantityUnit() {
        startField("quantityUnit");

        return this;
    }

    /**
    * The quantity value for the unit price measurement.
    */
    public UnitPriceMeasurementQuery quantityValue() {
        startField("quantityValue");

        return this;
    }

    /**
    * The reference unit for the unit price measurement.
    */
    public UnitPriceMeasurementQuery referenceUnit() {
        startField("referenceUnit");

        return this;
    }

    /**
    * The reference value for the unit price measurement.
    */
    public UnitPriceMeasurementQuery referenceValue() {
        startField("referenceValue");

        return this;
    }
}
