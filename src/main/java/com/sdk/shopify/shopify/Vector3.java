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
* Representation of 3d vectors and points. It can represent
* either the coordinates of a point in space, a direction, or
* size. Presented as an object with three floating-point values.
*/
public class Vector3 extends AbstractResponse<Vector3> {
    public Vector3() {
    }

    public Vector3(JsonObject fields) throws SchemaViolationError {
        for (Map.Entry<String, JsonElement> field : fields.entrySet()) {
            String key = field.getKey();
            String fieldName = getFieldName(key);
            switch (fieldName) {
                case "x": {
                    responseData.put(key, jsonAsDouble(field.getValue(), key));

                    break;
                }

                case "y": {
                    responseData.put(key, jsonAsDouble(field.getValue(), key));

                    break;
                }

                case "z": {
                    responseData.put(key, jsonAsDouble(field.getValue(), key));

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
        return "Vector3";
    }

    /**
    * The x coordinate of Vector3.
    */

    public Double getX() {
        return (Double) get("x");
    }

    public Vector3 setX(Double arg) {
        optimisticData.put(getKey("x"), arg);
        return this;
    }

    /**
    * The y coordinate of Vector3.
    */

    public Double getY() {
        return (Double) get("y");
    }

    public Vector3 setY(Double arg) {
        optimisticData.put(getKey("y"), arg);
        return this;
    }

    /**
    * The z coordinate of Vector3.
    */

    public Double getZ() {
        return (Double) get("z");
    }

    public Vector3 setZ(Double arg) {
        optimisticData.put(getKey("z"), arg);
        return this;
    }

    public boolean unwrapsToObject(String key) {
        switch (getFieldName(key)) {
            case "x": return false;

            case "y": return false;

            case "z": return false;

            default: return false;
        }
    }
}

