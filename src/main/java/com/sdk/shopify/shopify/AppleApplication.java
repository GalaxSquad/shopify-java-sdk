// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.shopify.graphql.support.AbstractResponse;
import com.shopify.graphql.support.ID;
import com.shopify.graphql.support.SchemaViolationError;
import java.util.Map;

/**
* The Apple mobile platform application.
*/
public class AppleApplication extends AbstractResponse<AppleApplication> implements MobilePlatformApplication {
    public AppleApplication() {
    }

    public AppleApplication(JsonObject fields) throws SchemaViolationError {
        for (Map.Entry<String, JsonElement> field : fields.entrySet()) {
            String key = field.getKey();
            String fieldName = getFieldName(key);
            switch (fieldName) {
                case "appClipApplicationId": {
                    String optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = jsonAsString(field.getValue(), key);
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "appClipsEnabled": {
                    responseData.put(key, jsonAsBoolean(field.getValue(), key));

                    break;
                }

                case "appId": {
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

                case "sharedWebCredentialsEnabled": {
                    responseData.put(key, jsonAsBoolean(field.getValue(), key));

                    break;
                }

                case "universalLinksEnabled": {
                    responseData.put(key, jsonAsBoolean(field.getValue(), key));

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
        return "AppleApplication";
    }

    /**
    * The iOS App Clip application ID.
    */

    public String getAppClipApplicationId() {
        return (String) get("appClipApplicationId");
    }

    public AppleApplication setAppClipApplicationId(String arg) {
        optimisticData.put(getKey("appClipApplicationId"), arg);
        return this;
    }

    /**
    * Whether iOS App Clips are enabled for this app.
    */

    public Boolean getAppClipsEnabled() {
        return (Boolean) get("appClipsEnabled");
    }

    public AppleApplication setAppClipsEnabled(Boolean arg) {
        optimisticData.put(getKey("appClipsEnabled"), arg);
        return this;
    }

    /**
    * The iOS App ID.
    */

    public String getAppId() {
        return (String) get("appId");
    }

    public AppleApplication setAppId(String arg) {
        optimisticData.put(getKey("appId"), arg);
        return this;
    }

    /**
    * A globally-unique ID.
    */

    public ID getId() {
        return (ID) get("id");
    }

    public AppleApplication setId(ID arg) {
        optimisticData.put(getKey("id"), arg);
        return this;
    }

    /**
    * Whether iOS shared web credentials are enabled for this app.
    */

    public Boolean getSharedWebCredentialsEnabled() {
        return (Boolean) get("sharedWebCredentialsEnabled");
    }

    public AppleApplication setSharedWebCredentialsEnabled(Boolean arg) {
        optimisticData.put(getKey("sharedWebCredentialsEnabled"), arg);
        return this;
    }

    /**
    * Whether iOS Universal Links are supported by this app.
    */

    public Boolean getUniversalLinksEnabled() {
        return (Boolean) get("universalLinksEnabled");
    }

    public AppleApplication setUniversalLinksEnabled(Boolean arg) {
        optimisticData.put(getKey("universalLinksEnabled"), arg);
        return this;
    }

    public boolean unwrapsToObject(String key) {
        switch (getFieldName(key)) {
            case "appClipApplicationId": return false;

            case "appClipsEnabled": return false;

            case "appId": return false;

            case "id": return false;

            case "sharedWebCredentialsEnabled": return false;

            case "universalLinksEnabled": return false;

            default: return false;
        }
    }
}

