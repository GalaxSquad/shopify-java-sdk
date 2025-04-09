// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.shopify.graphql.support.AbstractResponse;
import com.shopify.graphql.support.SchemaViolationError;
import java.util.Map;

/**
* Represents the data used to customize the Shopify admin experience for a logged-in staff member.
*/
public class StaffMemberPrivateData extends AbstractResponse<StaffMemberPrivateData> {
    public StaffMemberPrivateData() {
    }

    public StaffMemberPrivateData(JsonObject fields) throws SchemaViolationError {
        for (Map.Entry<String, JsonElement> field : fields.entrySet()) {
            String key = field.getKey();
            String fieldName = getFieldName(key);
            switch (fieldName) {
                case "accountSettingsUrl": {
                    responseData.put(key, jsonAsString(field.getValue(), key));

                    break;
                }

                case "createdAt": {
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
        return "StaffMemberPrivateData";
    }

    /**
    * The URL to the staff member's account settings page.
    */

    public String getAccountSettingsUrl() {
        return (String) get("accountSettingsUrl");
    }

    public StaffMemberPrivateData setAccountSettingsUrl(String arg) {
        optimisticData.put(getKey("accountSettingsUrl"), arg);
        return this;
    }

    /**
    * The date and time when the staff member was created.
    */

    public String getCreatedAt() {
        return (String) get("createdAt");
    }

    public StaffMemberPrivateData setCreatedAt(String arg) {
        optimisticData.put(getKey("createdAt"), arg);
        return this;
    }

    public boolean unwrapsToObject(String key) {
        switch (getFieldName(key)) {
            case "accountSettingsUrl": return false;

            case "createdAt": return false;

            default: return false;
        }
    }
}

