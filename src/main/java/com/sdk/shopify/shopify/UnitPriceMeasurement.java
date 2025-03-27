// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.shopify.graphql.support.AbstractResponse;
import com.shopify.graphql.support.Arguments;
import com.shopify.graphql.support.Error;
import com.shopify.graphql.support.Query;
import com.shopify.graphql.support.SchemaViolationError;
import com.shopify.graphql.support.TopLevelResponse;
import com.shopify.graphql.support.Input;

import com.shopify.graphql.support.ID;

import java.util.Map;

/**
* The measurement used to calculate a unit price for a product variant (e.g. $9.99 / 100ml).
*/
public class UnitPriceMeasurement extends AbstractResponse<UnitPriceMeasurement> {
    public UnitPriceMeasurement() {
    }

    public UnitPriceMeasurement(JsonObject fields) throws SchemaViolationError {
        for (Map.Entry<String, JsonElement> field : fields.entrySet()) {
            String key = field.getKey();
            String fieldName = getFieldName(key);
            switch (fieldName) {
                case "measuredType": {
                    UnitPriceMeasurementMeasuredType optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = UnitPriceMeasurementMeasuredType.fromGraphQl(jsonAsString(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "quantityUnit": {
                    UnitPriceMeasurementMeasuredUnit optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = UnitPriceMeasurementMeasuredUnit.fromGraphQl(jsonAsString(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "quantityValue": {
                    responseData.put(key, jsonAsDouble(field.getValue(), key));

                    break;
                }

                case "referenceUnit": {
                    UnitPriceMeasurementMeasuredUnit optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = UnitPriceMeasurementMeasuredUnit.fromGraphQl(jsonAsString(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "referenceValue": {
                    responseData.put(key, jsonAsInteger(field.getValue(), key));

                    break;
                }

                case "__typename": {
                    responseData.put(key, jsonAsString(field.getValue(), key));
                    break;
                }
                default: {
                    throw new SchemaViolationError(this, key, field.getValue());
                }
            }
        }
    }

    public String getGraphQlTypeName() {
        return "UnitPriceMeasurement";
    }

    /**
    * The type of unit of measurement for the unit price measurement.
    */

    public UnitPriceMeasurementMeasuredType getMeasuredType() {
        return (UnitPriceMeasurementMeasuredType) get("measuredType");
    }

    public UnitPriceMeasurement setMeasuredType(UnitPriceMeasurementMeasuredType arg) {
        optimisticData.put(getKey("measuredType"), arg);
        return this;
    }

    /**
    * The quantity unit for the unit price measurement.
    */

    public UnitPriceMeasurementMeasuredUnit getQuantityUnit() {
        return (UnitPriceMeasurementMeasuredUnit) get("quantityUnit");
    }

    public UnitPriceMeasurement setQuantityUnit(UnitPriceMeasurementMeasuredUnit arg) {
        optimisticData.put(getKey("quantityUnit"), arg);
        return this;
    }

    /**
    * The quantity value for the unit price measurement.
    */

    public Double getQuantityValue() {
        return (Double) get("quantityValue");
    }

    public UnitPriceMeasurement setQuantityValue(Double arg) {
        optimisticData.put(getKey("quantityValue"), arg);
        return this;
    }

    /**
    * The reference unit for the unit price measurement.
    */

    public UnitPriceMeasurementMeasuredUnit getReferenceUnit() {
        return (UnitPriceMeasurementMeasuredUnit) get("referenceUnit");
    }

    public UnitPriceMeasurement setReferenceUnit(UnitPriceMeasurementMeasuredUnit arg) {
        optimisticData.put(getKey("referenceUnit"), arg);
        return this;
    }

    /**
    * The reference value for the unit price measurement.
    */

    public Integer getReferenceValue() {
        return (Integer) get("referenceValue");
    }

    public UnitPriceMeasurement setReferenceValue(Integer arg) {
        optimisticData.put(getKey("referenceValue"), arg);
        return this;
    }

    public boolean unwrapsToObject(String key) {
        switch (getFieldName(key)) {
            case "measuredType": return false;

            case "quantityUnit": return false;

            case "quantityValue": return false;

            case "referenceUnit": return false;

            case "referenceValue": return false;

            default: return false;
        }
    }
}

