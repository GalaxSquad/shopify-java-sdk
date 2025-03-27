// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.shopify.graphql.support.AbstractResponse;
import com.shopify.graphql.support.SchemaViolationError;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
* Return type for `deliveryPromiseProviderUpsert` mutation.
*/
public class DeliveryPromiseProviderUpsertPayload extends AbstractResponse<DeliveryPromiseProviderUpsertPayload> {
    public DeliveryPromiseProviderUpsertPayload() {
    }

    public DeliveryPromiseProviderUpsertPayload(JsonObject fields) throws SchemaViolationError {
        for (Map.Entry<String, JsonElement> field : fields.entrySet()) {
            String key = field.getKey();
            String fieldName = getFieldName(key);
            switch (fieldName) {
                case "deliveryPromiseProvider": {
                    DeliveryPromiseProvider optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new DeliveryPromiseProvider(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "userErrors": {
                    List<DeliveryPromiseProviderUpsertUserError> list1 = new ArrayList<>();
                    for (JsonElement element1 : jsonAsArray(field.getValue(), key)) {
                        list1.add(new DeliveryPromiseProviderUpsertUserError(jsonAsObject(element1, key)));
                    }

                    responseData.put(key, list1);

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
        return "DeliveryPromiseProviderUpsertPayload";
    }

    /**
    * The created or updated delivery promise provider.
    */

    public DeliveryPromiseProvider getDeliveryPromiseProvider() {
        return (DeliveryPromiseProvider) get("deliveryPromiseProvider");
    }

    public DeliveryPromiseProviderUpsertPayload setDeliveryPromiseProvider(DeliveryPromiseProvider arg) {
        optimisticData.put(getKey("deliveryPromiseProvider"), arg);
        return this;
    }

    /**
    * The list of errors that occurred from executing the mutation.
    */

    public List<DeliveryPromiseProviderUpsertUserError> getUserErrors() {
        return (List<DeliveryPromiseProviderUpsertUserError>) get("userErrors");
    }

    public DeliveryPromiseProviderUpsertPayload setUserErrors(List<DeliveryPromiseProviderUpsertUserError> arg) {
        optimisticData.put(getKey("userErrors"), arg);
        return this;
    }

    public boolean unwrapsToObject(String key) {
        switch (getFieldName(key)) {
            case "deliveryPromiseProvider": return true;

            case "userErrors": return true;

            default: return false;
        }
    }
}

