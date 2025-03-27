// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.shopify.graphql.support.AbstractResponse;
import com.shopify.graphql.support.Arguments;
import com.shopify.graphql.support.Error;
import com.shopify.graphql.support.Query;
import com.shopify.graphql.support.SchemaViolationError;
import com.shopify.graphql.support.TopLevelResponse;
import com.shopify.graphql.support.Input;

import com.shopify.graphql.support.ID;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
* Represents a group of adjustments made as part of the same operation.
*/
public class InventoryAdjustmentGroup extends AbstractResponse<InventoryAdjustmentGroup> implements Node {
    public InventoryAdjustmentGroup() {
    }

    public InventoryAdjustmentGroup(JsonObject fields) throws SchemaViolationError {
        for (Map.Entry<String, JsonElement> field : fields.entrySet()) {
            String key = field.getKey();
            String fieldName = getFieldName(key);
            switch (fieldName) {
                case "app": {
                    App optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new App(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "changes": {
                    List<InventoryChange> list1 = new ArrayList<>();
                    for (JsonElement element1 : jsonAsArray(field.getValue(), key)) {
                        list1.add(new InventoryChange(jsonAsObject(element1, key)));
                    }

                    responseData.put(key, list1);

                    break;
                }

                case "createdAt": {
                    responseData.put(key, jsonAsString(field.getValue(), key));

                    break;
                }

                case "id": {
                    responseData.put(key, new ID(jsonAsString(field.getValue(), key)));

                    break;
                }

                case "reason": {
                    responseData.put(key, jsonAsString(field.getValue(), key));

                    break;
                }

                case "referenceDocumentUri": {
                    String optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = jsonAsString(field.getValue(), key);
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "staffMember": {
                    StaffMember optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new StaffMember(jsonAsObject(field.getValue(), key));
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

    public InventoryAdjustmentGroup(ID id) {
        this();
        optimisticData.put("id", id);
    }

    public String getGraphQlTypeName() {
        return "InventoryAdjustmentGroup";
    }

    /**
    * The app that triggered the inventory event, if one exists.
    */

    public App getApp() {
        return (App) get("app");
    }

    public InventoryAdjustmentGroup setApp(App arg) {
        optimisticData.put(getKey("app"), arg);
        return this;
    }

    /**
    * The set of inventory quantity changes that occurred in the inventory event.
    */

    public List<InventoryChange> getChanges() {
        return (List<InventoryChange>) get("changes");
    }

    public InventoryAdjustmentGroup setChanges(List<InventoryChange> arg) {
        optimisticData.put(getKey("changes"), arg);
        return this;
    }

    /**
    * The date and time the inventory adjustment group was created.
    */

    public String getCreatedAt() {
        return (String) get("createdAt");
    }

    public InventoryAdjustmentGroup setCreatedAt(String arg) {
        optimisticData.put(getKey("createdAt"), arg);
        return this;
    }

    /**
    * A globally-unique ID.
    */

    public ID getId() {
        return (ID) get("id");
    }

    /**
    * The reason for the group of adjustments.
    */

    public String getReason() {
        return (String) get("reason");
    }

    public InventoryAdjustmentGroup setReason(String arg) {
        optimisticData.put(getKey("reason"), arg);
        return this;
    }

    /**
    * A freeform URI that represents why the inventory change happened. This can be the entity adjusting
    * inventory
    * quantities or the Shopify resource that's associated with the inventory adjustment. For example, a
    * unit in a
    * draft order might have been previously reserved, and a merchant later creates an order from the
    * draft order.
    * In this case, the `referenceDocumentUri` for the inventory adjustment is a URI referencing the order
    * ID.
    */

    public String getReferenceDocumentUri() {
        return (String) get("referenceDocumentUri");
    }

    public InventoryAdjustmentGroup setReferenceDocumentUri(String arg) {
        optimisticData.put(getKey("referenceDocumentUri"), arg);
        return this;
    }

    /**
    * The staff member associated with the inventory event.
    */

    public StaffMember getStaffMember() {
        return (StaffMember) get("staffMember");
    }

    public InventoryAdjustmentGroup setStaffMember(StaffMember arg) {
        optimisticData.put(getKey("staffMember"), arg);
        return this;
    }

    public boolean unwrapsToObject(String key) {
        switch (getFieldName(key)) {
            case "app": return true;

            case "changes": return true;

            case "createdAt": return false;

            case "id": return false;

            case "reason": return false;

            case "referenceDocumentUri": return false;

            case "staffMember": return true;

            default: return false;
        }
    }
}

