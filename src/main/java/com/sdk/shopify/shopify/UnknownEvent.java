// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.shopify.graphql.support.AbstractResponse;
import com.shopify.graphql.support.ID;
import com.shopify.graphql.support.SchemaViolationError;
import java.util.Map;

/**
* Events chronicle resource activities such as the creation of an article, the fulfillment of an
* order, or the
* addition of a product.
*/
public class UnknownEvent extends AbstractResponse<UnknownEvent> implements Event {
    public UnknownEvent() {
    }

    public UnknownEvent(JsonObject fields) throws SchemaViolationError {
        for (Map.Entry<String, JsonElement> field : fields.entrySet()) {
            String key = field.getKey();
            String fieldName = getFieldName(key);
            switch (fieldName) {
                case "action": {
                    responseData.put(key, jsonAsString(field.getValue(), key));

                    break;
                }

                case "appTitle": {
                    String optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = jsonAsString(field.getValue(), key);
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "attributeToApp": {
                    responseData.put(key, jsonAsBoolean(field.getValue(), key));

                    break;
                }

                case "attributeToUser": {
                    responseData.put(key, jsonAsBoolean(field.getValue(), key));

                    break;
                }

                case "createdAt": {
                    responseData.put(key, jsonAsString(field.getValue(), key));

                    break;
                }

                case "criticalAlert": {
                    responseData.put(key, jsonAsBoolean(field.getValue(), key));

                    break;
                }

                case "id": {
                    responseData.put(key, new ID(jsonAsString(field.getValue(), key)));

                    break;
                }

                case "message": {
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

    public static Event create(JsonObject fields) throws SchemaViolationError {
        String typeName = fields.getAsJsonPrimitive("__typename").getAsString();
        switch (typeName) {
            case "BasicEvent": {
                return new BasicEvent(fields);
            }

            case "CommentEvent": {
                return new CommentEvent(fields);
            }

            default: {
                return new UnknownEvent(fields);
            }
        }
    }

    public String getGraphQlTypeName() {
        return (String) get("__typename");
    }

    /**
    * The action that occured.
    */

    public String getAction() {
        return (String) get("action");
    }

    public UnknownEvent setAction(String arg) {
        optimisticData.put(getKey("action"), arg);
        return this;
    }

    /**
    * The name of the app that created the event.
    */

    public String getAppTitle() {
        return (String) get("appTitle");
    }

    public UnknownEvent setAppTitle(String arg) {
        optimisticData.put(getKey("appTitle"), arg);
        return this;
    }

    /**
    * Whether the event was created by an app.
    */

    public Boolean getAttributeToApp() {
        return (Boolean) get("attributeToApp");
    }

    public UnknownEvent setAttributeToApp(Boolean arg) {
        optimisticData.put(getKey("attributeToApp"), arg);
        return this;
    }

    /**
    * Whether the event was caused by an admin user.
    */

    public Boolean getAttributeToUser() {
        return (Boolean) get("attributeToUser");
    }

    public UnknownEvent setAttributeToUser(Boolean arg) {
        optimisticData.put(getKey("attributeToUser"), arg);
        return this;
    }

    /**
    * The date and time when the event was created.
    */

    public String getCreatedAt() {
        return (String) get("createdAt");
    }

    public UnknownEvent setCreatedAt(String arg) {
        optimisticData.put(getKey("createdAt"), arg);
        return this;
    }

    /**
    * Whether the event is critical.
    */

    public Boolean getCriticalAlert() {
        return (Boolean) get("criticalAlert");
    }

    public UnknownEvent setCriticalAlert(Boolean arg) {
        optimisticData.put(getKey("criticalAlert"), arg);
        return this;
    }

    /**
    * A globally-unique ID.
    */

    public ID getId() {
        return (ID) get("id");
    }

    public UnknownEvent setId(ID arg) {
        optimisticData.put(getKey("id"), arg);
        return this;
    }

    /**
    * Human readable text that describes the event.
    */

    public String getMessage() {
        return (String) get("message");
    }

    public UnknownEvent setMessage(String arg) {
        optimisticData.put(getKey("message"), arg);
        return this;
    }

    public boolean unwrapsToObject(String key) {
        switch (getFieldName(key)) {
            case "action": return false;

            case "appTitle": return false;

            case "attributeToApp": return false;

            case "attributeToUser": return false;

            case "createdAt": return false;

            case "criticalAlert": return false;

            case "id": return false;

            case "message": return false;

            default: return false;
        }
    }
}

