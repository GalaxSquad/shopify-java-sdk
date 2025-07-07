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
* A shop's privacy policy settings.
*/
public class PrivacyPolicy extends AbstractResponse<PrivacyPolicy> {
    public PrivacyPolicy() {
    }

    public PrivacyPolicy(JsonObject fields) throws SchemaViolationError {
        for (Map.Entry<String, JsonElement> field : fields.entrySet()) {
            String key = field.getKey();
            String fieldName = getFieldName(key);
            switch (fieldName) {
                case "autoManaged": {
                    responseData.put(key, jsonAsBoolean(field.getValue(), key));

                    break;
                }

                case "supportedLocales": {
                    List<String> list1 = new ArrayList<>();
                    for (JsonElement element1 : jsonAsArray(field.getValue(), key)) {
                        list1.add(jsonAsString(element1, key));
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
        return "PrivacyPolicy";
    }

    /**
    * Whether the policy is auto managed.
    */

    public Boolean getAutoManaged() {
        return (Boolean) get("autoManaged");
    }

    public PrivacyPolicy setAutoManaged(Boolean arg) {
        optimisticData.put(getKey("autoManaged"), arg);
        return this;
    }

    /**
    * Policy template supported locales.
    */

    public List<String> getSupportedLocales() {
        return (List<String>) get("supportedLocales");
    }

    public PrivacyPolicy setSupportedLocales(List<String> arg) {
        optimisticData.put(getKey("supportedLocales"), arg);
        return this;
    }

    public boolean unwrapsToObject(String key) {
        switch (getFieldName(key)) {
            case "autoManaged": return false;

            case "supportedLocales": return false;

            default: return false;
        }
    }
}

