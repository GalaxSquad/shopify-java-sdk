// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.shopify.graphql.support.AbstractResponse;
import com.shopify.graphql.support.ID;
import com.shopify.graphql.support.SchemaViolationError;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
* The Android mobile platform application.
*/
public class AndroidApplication extends AbstractResponse<AndroidApplication> implements MobilePlatformApplication {
    public AndroidApplication() {
    }

    public AndroidApplication(JsonObject fields) throws SchemaViolationError {
        for (Map.Entry<String, JsonElement> field : fields.entrySet()) {
            String key = field.getKey();
            String fieldName = getFieldName(key);
            switch (fieldName) {
                case "appLinksEnabled": {
                    responseData.put(key, jsonAsBoolean(field.getValue(), key));

                    break;
                }

                case "applicationId": {
                    String optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = jsonAsString(field.getValue(), key);
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "id": {
                    responseData.put(key, new ID(jsonAsString(field.getValue(), key)));

                    break;
                }

                case "sha256CertFingerprints": {
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
        return "AndroidApplication";
    }

    /**
    * Whether Android App Links are supported by this app.
    */

    public Boolean getAppLinksEnabled() {
        return (Boolean) get("appLinksEnabled");
    }

    public AndroidApplication setAppLinksEnabled(Boolean arg) {
        optimisticData.put(getKey("appLinksEnabled"), arg);
        return this;
    }

    /**
    * The Android application ID.
    */

    public String getApplicationId() {
        return (String) get("applicationId");
    }

    public AndroidApplication setApplicationId(String arg) {
        optimisticData.put(getKey("applicationId"), arg);
        return this;
    }

    /**
    * A globally-unique ID.
    */

    public ID getId() {
        return (ID) get("id");
    }

    public AndroidApplication setId(ID arg) {
        optimisticData.put(getKey("id"), arg);
        return this;
    }

    /**
    * The SHA256 fingerprints of the app's signing certificate.
    */

    public List<String> getSha256certFingerprints() {
        return (List<String>) get("sha256CertFingerprints");
    }

    public AndroidApplication setSha256certFingerprints(List<String> arg) {
        optimisticData.put(getKey("sha256CertFingerprints"), arg);
        return this;
    }

    public boolean unwrapsToObject(String key) {
        switch (getFieldName(key)) {
            case "appLinksEnabled": return false;

            case "applicationId": return false;

            case "id": return false;

            case "sha256CertFingerprints": return false;

            default: return false;
        }
    }
}

