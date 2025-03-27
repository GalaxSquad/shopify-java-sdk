// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.shopify.graphql.support.AbstractResponse;
import com.shopify.graphql.support.ID;
import com.shopify.graphql.support.SchemaViolationError;
import java.util.Map;

/**
* Tracks an adjustment to the cash in a cash tracking session for a point of sale device over the
* course of a shift.
*/
public class CashTrackingAdjustment extends AbstractResponse<CashTrackingAdjustment> implements Node {
    public CashTrackingAdjustment() {
    }

    public CashTrackingAdjustment(JsonObject fields) throws SchemaViolationError {
        for (Map.Entry<String, JsonElement> field : fields.entrySet()) {
            String key = field.getKey();
            String fieldName = getFieldName(key);
            switch (fieldName) {
                case "cash": {
                    responseData.put(key, new MoneyV2(jsonAsObject(field.getValue(), key)));

                    break;
                }

                case "id": {
                    responseData.put(key, new ID(jsonAsString(field.getValue(), key)));

                    break;
                }

                case "note": {
                    String optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = jsonAsString(field.getValue(), key);
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "staffMember": {
                    responseData.put(key, new StaffMember(jsonAsObject(field.getValue(), key)));

                    break;
                }

                case "time": {
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

    public CashTrackingAdjustment(ID id) {
        this();
        optimisticData.put("id", id);
    }

    public String getGraphQlTypeName() {
        return "CashTrackingAdjustment";
    }

    /**
    * The amount of cash being added or removed.
    */

    public MoneyV2 getCash() {
        return (MoneyV2) get("cash");
    }

    public CashTrackingAdjustment setCash(MoneyV2 arg) {
        optimisticData.put(getKey("cash"), arg);
        return this;
    }

    /**
    * A globally-unique ID.
    */

    public ID getId() {
        return (ID) get("id");
    }

    /**
    * The note entered when the adjustment was made.
    */

    public String getNote() {
        return (String) get("note");
    }

    public CashTrackingAdjustment setNote(String arg) {
        optimisticData.put(getKey("note"), arg);
        return this;
    }

    /**
    * The staff member who made the adjustment.
    */

    public StaffMember getStaffMember() {
        return (StaffMember) get("staffMember");
    }

    public CashTrackingAdjustment setStaffMember(StaffMember arg) {
        optimisticData.put(getKey("staffMember"), arg);
        return this;
    }

    /**
    * The time when the adjustment was made.
    */

    public String getTime() {
        return (String) get("time");
    }

    public CashTrackingAdjustment setTime(String arg) {
        optimisticData.put(getKey("time"), arg);
        return this;
    }

    public boolean unwrapsToObject(String key) {
        switch (getFieldName(key)) {
            case "cash": return true;

            case "id": return false;

            case "note": return false;

            case "staffMember": return true;

            case "time": return false;

            default: return false;
        }
    }
}

