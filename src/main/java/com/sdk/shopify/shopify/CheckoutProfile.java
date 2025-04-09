// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.shopify.graphql.support.AbstractResponse;
import com.shopify.graphql.support.ID;
import com.shopify.graphql.support.SchemaViolationError;
import java.util.Map;

/**
* A checkout profile defines the branding settings and the UI extensions for a store's checkout. A
* checkout profile could be published or draft. A store might have at most one published checkout
* profile, which is used to render their live checkout. The store could also have multiple draft
* profiles that were created, previewed, and published using the admin checkout editor.
*/
public class CheckoutProfile extends AbstractResponse<CheckoutProfile> implements Node {
    public CheckoutProfile() {
    }

    public CheckoutProfile(JsonObject fields) throws SchemaViolationError {
        for (Map.Entry<String, JsonElement> field : fields.entrySet()) {
            String key = field.getKey();
            String fieldName = getFieldName(key);
            switch (fieldName) {
                case "createdAt": {
                    responseData.put(key, jsonAsString(field.getValue(), key));

                    break;
                }

                case "editedAt": {
                    responseData.put(key, jsonAsString(field.getValue(), key));

                    break;
                }

                case "id": {
                    responseData.put(key, new ID(jsonAsString(field.getValue(), key)));

                    break;
                }

                case "isPublished": {
                    responseData.put(key, jsonAsBoolean(field.getValue(), key));

                    break;
                }

                case "name": {
                    responseData.put(key, jsonAsString(field.getValue(), key));

                    break;
                }

                case "typOspPagesActive": {
                    responseData.put(key, jsonAsBoolean(field.getValue(), key));

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

    public CheckoutProfile(ID id) {
        this();
        optimisticData.put("id", id);
    }

    public String getGraphQlTypeName() {
        return "CheckoutProfile";
    }

    /**
    * The date and time when the checkout profile was created.
    */

    public String getCreatedAt() {
        return (String) get("createdAt");
    }

    public CheckoutProfile setCreatedAt(String arg) {
        optimisticData.put(getKey("createdAt"), arg);
        return this;
    }

    /**
    * The date and time when the checkout profile was last edited.
    */

    public String getEditedAt() {
        return (String) get("editedAt");
    }

    public CheckoutProfile setEditedAt(String arg) {
        optimisticData.put(getKey("editedAt"), arg);
        return this;
    }

    /**
    * A globally-unique ID.
    */

    public ID getId() {
        return (ID) get("id");
    }

    /**
    * Whether the checkout profile is published or not.
    */

    public Boolean getIsPublished() {
        return (Boolean) get("isPublished");
    }

    public CheckoutProfile setIsPublished(Boolean arg) {
        optimisticData.put(getKey("isPublished"), arg);
        return this;
    }

    /**
    * The profile name.
    */

    public String getName() {
        return (String) get("name");
    }

    public CheckoutProfile setName(String arg) {
        optimisticData.put(getKey("name"), arg);
        return this;
    }

    /**
    * Whether the checkout profile Thank You Page and Order Status Page are actively using extensibility
    * or not.
    */

    public Boolean getTypOspPagesActive() {
        return (Boolean) get("typOspPagesActive");
    }

    public CheckoutProfile setTypOspPagesActive(Boolean arg) {
        optimisticData.put(getKey("typOspPagesActive"), arg);
        return this;
    }

    /**
    * The date and time when the checkout profile was last updated.
    */

    public String getUpdatedAt() {
        return (String) get("updatedAt");
    }

    public CheckoutProfile setUpdatedAt(String arg) {
        optimisticData.put(getKey("updatedAt"), arg);
        return this;
    }

    public boolean unwrapsToObject(String key) {
        switch (getFieldName(key)) {
            case "createdAt": return false;

            case "editedAt": return false;

            case "id": return false;

            case "isPublished": return false;

            case "name": return false;

            case "typOspPagesActive": return false;

            case "updatedAt": return false;

            default: return false;
        }
    }
}

