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
* Return type for `mobilePlatformApplicationCreate` mutation.
*/
public class MobilePlatformApplicationCreatePayload extends AbstractResponse<MobilePlatformApplicationCreatePayload> {
    public MobilePlatformApplicationCreatePayload() {
    }

    public MobilePlatformApplicationCreatePayload(JsonObject fields) throws SchemaViolationError {
        for (Map.Entry<String, JsonElement> field : fields.entrySet()) {
            String key = field.getKey();
            String fieldName = getFieldName(key);
            switch (fieldName) {
                case "mobilePlatformApplication": {
                    MobilePlatformApplication optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = UnknownMobilePlatformApplication.create(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "userErrors": {
                    List<MobilePlatformApplicationUserError> list1 = new ArrayList<>();
                    for (JsonElement element1 : jsonAsArray(field.getValue(), key)) {
                        list1.add(new MobilePlatformApplicationUserError(jsonAsObject(element1, key)));
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
        return "MobilePlatformApplicationCreatePayload";
    }

    /**
    * Created mobile platform application.
    */

    public MobilePlatformApplication getMobilePlatformApplication() {
        return (MobilePlatformApplication) get("mobilePlatformApplication");
    }

    public MobilePlatformApplicationCreatePayload setMobilePlatformApplication(MobilePlatformApplication arg) {
        optimisticData.put(getKey("mobilePlatformApplication"), arg);
        return this;
    }

    /**
    * The list of errors that occurred from executing the mutation.
    */

    public List<MobilePlatformApplicationUserError> getUserErrors() {
        return (List<MobilePlatformApplicationUserError>) get("userErrors");
    }

    public MobilePlatformApplicationCreatePayload setUserErrors(List<MobilePlatformApplicationUserError> arg) {
        optimisticData.put(getKey("userErrors"), arg);
        return this;
    }

    public boolean unwrapsToObject(String key) {
        switch (getFieldName(key)) {
            case "mobilePlatformApplication": return false;

            case "userErrors": return true;

            default: return false;
        }
    }
}

