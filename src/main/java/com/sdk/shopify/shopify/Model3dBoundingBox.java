// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.shopify.graphql.support.AbstractResponse;
import com.shopify.graphql.support.SchemaViolationError;
import java.util.Map;

/**
* Bounding box information of a 3d model.
*/
public class Model3dBoundingBox extends AbstractResponse<Model3dBoundingBox> {
    public Model3dBoundingBox() {
    }

    public Model3dBoundingBox(JsonObject fields) throws SchemaViolationError {
        for (Map.Entry<String, JsonElement> field : fields.entrySet()) {
            String key = field.getKey();
            String fieldName = getFieldName(key);
            switch (fieldName) {
                case "size": {
                    responseData.put(key, new Vector3(jsonAsObject(field.getValue(), key)));

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
        return "Model3dBoundingBox";
    }

    /**
    * Size in meters of the smallest volume which contains the 3d model.
    */

    public Vector3 getSize() {
        return (Vector3) get("size");
    }

    public Model3dBoundingBox setSize(Vector3 arg) {
        optimisticData.put(getKey("size"), arg);
        return this;
    }

    public boolean unwrapsToObject(String key) {
        switch (getFieldName(key)) {
            case "size": return true;

            default: return false;
        }
    }
}

