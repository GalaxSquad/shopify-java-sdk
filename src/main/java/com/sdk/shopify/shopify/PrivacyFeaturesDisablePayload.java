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
* Return type for `privacyFeaturesDisable` mutation.
*/
public class PrivacyFeaturesDisablePayload extends AbstractResponse<PrivacyFeaturesDisablePayload> {
    public PrivacyFeaturesDisablePayload() {
    }

    public PrivacyFeaturesDisablePayload(JsonObject fields) throws SchemaViolationError {
        for (Map.Entry<String, JsonElement> field : fields.entrySet()) {
            String key = field.getKey();
            String fieldName = getFieldName(key);
            switch (fieldName) {
                case "featuresDisabled": {
                    List<PrivacyFeaturesEnum> optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        List<PrivacyFeaturesEnum> list1 = new ArrayList<>();
                        for (JsonElement element1 : jsonAsArray(field.getValue(), key)) {
                            list1.add(PrivacyFeaturesEnum.fromGraphQl(jsonAsString(element1, key)));
                        }

                        optional1 = list1;
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "userErrors": {
                    List<PrivacyFeaturesDisableUserError> list1 = new ArrayList<>();
                    for (JsonElement element1 : jsonAsArray(field.getValue(), key)) {
                        list1.add(new PrivacyFeaturesDisableUserError(jsonAsObject(element1, key)));
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
        return "PrivacyFeaturesDisablePayload";
    }

    /**
    * The privacy features that were disabled.
    */

    public List<PrivacyFeaturesEnum> getFeaturesDisabled() {
        return (List<PrivacyFeaturesEnum>) get("featuresDisabled");
    }

    public PrivacyFeaturesDisablePayload setFeaturesDisabled(List<PrivacyFeaturesEnum> arg) {
        optimisticData.put(getKey("featuresDisabled"), arg);
        return this;
    }

    /**
    * The list of errors that occurred from executing the mutation.
    */

    public List<PrivacyFeaturesDisableUserError> getUserErrors() {
        return (List<PrivacyFeaturesDisableUserError>) get("userErrors");
    }

    public PrivacyFeaturesDisablePayload setUserErrors(List<PrivacyFeaturesDisableUserError> arg) {
        optimisticData.put(getKey("userErrors"), arg);
        return this;
    }

    public boolean unwrapsToObject(String key) {
        switch (getFieldName(key)) {
            case "featuresDisabled": return false;

            case "userErrors": return true;

            default: return false;
        }
    }
}

