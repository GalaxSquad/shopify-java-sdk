// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.shopify.graphql.support.AbstractResponse;
import com.shopify.graphql.support.ID;
import com.shopify.graphql.support.SchemaViolationError;
import java.util.Map;

/**
* A fulfillment hold currently applied on a fulfillment order.
*/
public class FulfillmentHold extends AbstractResponse<FulfillmentHold> implements Node {
    public FulfillmentHold() {
    }

    public FulfillmentHold(JsonObject fields) throws SchemaViolationError {
        for (Map.Entry<String, JsonElement> field : fields.entrySet()) {
            String key = field.getKey();
            String fieldName = getFieldName(key);
            switch (fieldName) {
                case "displayReason": {
                    responseData.put(key, jsonAsString(field.getValue(), key));

                    break;
                }

                case "handle": {
                    String optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = jsonAsString(field.getValue(), key);
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "heldByApp": {
                    App optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new App(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "heldByRequestingApp": {
                    responseData.put(key, jsonAsBoolean(field.getValue(), key));

                    break;
                }

                case "id": {
                    responseData.put(key, new ID(jsonAsString(field.getValue(), key)));

                    break;
                }

                case "reason": {
                    responseData.put(key, FulfillmentHoldReason.fromGraphQl(jsonAsString(field.getValue(), key)));

                    break;
                }

                case "reasonNotes": {
                    String optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = jsonAsString(field.getValue(), key);
                    }

                    responseData.put(key, optional1);

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

    public FulfillmentHold(ID id) {
        this();
        optimisticData.put("id", id);
    }

    public String getGraphQlTypeName() {
        return "FulfillmentHold";
    }

    /**
    * The localized reason for the fulfillment hold for display purposes.
    */

    public String getDisplayReason() {
        return (String) get("displayReason");
    }

    public FulfillmentHold setDisplayReason(String arg) {
        optimisticData.put(getKey("displayReason"), arg);
        return this;
    }

    /**
    * An identifier an app can use to reference one of many holds it applied to a fulfillment order.
    * This field must be unique among the holds that a single app applies to a single fulfillment order.
    */

    public String getHandle() {
        return (String) get("handle");
    }

    public FulfillmentHold setHandle(String arg) {
        optimisticData.put(getKey("handle"), arg);
        return this;
    }

    /**
    * The app that created the fulfillment hold.
    */

    public App getHeldByApp() {
        return (App) get("heldByApp");
    }

    public FulfillmentHold setHeldByApp(App arg) {
        optimisticData.put(getKey("heldByApp"), arg);
        return this;
    }

    /**
    * A boolean value that indicates whether the requesting app created the fulfillment hold.
    */

    public Boolean getHeldByRequestingApp() {
        return (Boolean) get("heldByRequestingApp");
    }

    public FulfillmentHold setHeldByRequestingApp(Boolean arg) {
        optimisticData.put(getKey("heldByRequestingApp"), arg);
        return this;
    }

    /**
    * A globally-unique ID.
    */

    public ID getId() {
        return (ID) get("id");
    }

    /**
    * The reason for the fulfillment hold.
    */

    public FulfillmentHoldReason getReason() {
        return (FulfillmentHoldReason) get("reason");
    }

    public FulfillmentHold setReason(FulfillmentHoldReason arg) {
        optimisticData.put(getKey("reason"), arg);
        return this;
    }

    /**
    * Additional information about the fulfillment hold reason.
    */

    public String getReasonNotes() {
        return (String) get("reasonNotes");
    }

    public FulfillmentHold setReasonNotes(String arg) {
        optimisticData.put(getKey("reasonNotes"), arg);
        return this;
    }

    public boolean unwrapsToObject(String key) {
        switch (getFieldName(key)) {
            case "displayReason": return false;

            case "handle": return false;

            case "heldByApp": return true;

            case "heldByRequestingApp": return false;

            case "id": return false;

            case "reason": return false;

            case "reasonNotes": return false;

            default: return false;
        }
    }
}

