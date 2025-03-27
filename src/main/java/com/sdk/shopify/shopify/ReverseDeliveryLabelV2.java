// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.shopify.graphql.support.AbstractResponse;
import com.shopify.graphql.support.SchemaViolationError;
import java.util.Map;

/**
* The return label file information for a reverse delivery.
*/
public class ReverseDeliveryLabelV2 extends AbstractResponse<ReverseDeliveryLabelV2> {
    public ReverseDeliveryLabelV2() {
    }

    public ReverseDeliveryLabelV2(JsonObject fields) throws SchemaViolationError {
        for (Map.Entry<String, JsonElement> field : fields.entrySet()) {
            String key = field.getKey();
            String fieldName = getFieldName(key);
            switch (fieldName) {
                case "createdAt": {
                    responseData.put(key, jsonAsString(field.getValue(), key));

                    break;
                }

                case "publicFileUrl": {
                    String optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = jsonAsString(field.getValue(), key);
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "updatedAt": {
                    responseData.put(key, jsonAsString(field.getValue(), key));

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
        return "ReverseDeliveryLabelV2";
    }

    /**
    * The date and time when the reverse delivery label was created.
    */

    public String getCreatedAt() {
        return (String) get("createdAt");
    }

    public ReverseDeliveryLabelV2 setCreatedAt(String arg) {
        optimisticData.put(getKey("createdAt"), arg);
        return this;
    }

    /**
    * A public link that can be used to download the label image.
    */

    public String getPublicFileUrl() {
        return (String) get("publicFileUrl");
    }

    public ReverseDeliveryLabelV2 setPublicFileUrl(String arg) {
        optimisticData.put(getKey("publicFileUrl"), arg);
        return this;
    }

    /**
    * The date and time when the reverse delivery label was updated.
    */

    public String getUpdatedAt() {
        return (String) get("updatedAt");
    }

    public ReverseDeliveryLabelV2 setUpdatedAt(String arg) {
        optimisticData.put(getKey("updatedAt"), arg);
        return this;
    }

    public boolean unwrapsToObject(String key) {
        switch (getFieldName(key)) {
            case "createdAt": return false;

            case "publicFileUrl": return false;

            case "updatedAt": return false;

            default: return false;
        }
    }
}

