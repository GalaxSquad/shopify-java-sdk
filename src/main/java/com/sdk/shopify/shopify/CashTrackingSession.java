// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.shopify.graphql.support.AbstractResponse;
import com.shopify.graphql.support.ID;
import com.shopify.graphql.support.SchemaViolationError;
import java.util.Map;

/**
* Tracks the balance in a cash drawer for a point of sale device over the course of a shift.
*/
public class CashTrackingSession extends AbstractResponse<CashTrackingSession> implements Node {
    public CashTrackingSession() {
    }

    public CashTrackingSession(JsonObject fields) throws SchemaViolationError {
        for (Map.Entry<String, JsonElement> field : fields.entrySet()) {
            String key = field.getKey();
            String fieldName = getFieldName(key);
            switch (fieldName) {
                case "adjustments": {
                    responseData.put(key, new CashTrackingAdjustmentConnection(jsonAsObject(field.getValue(), key)));

                    break;
                }

                case "cashTrackingEnabled": {
                    responseData.put(key, jsonAsBoolean(field.getValue(), key));

                    break;
                }

                case "cashTransactions": {
                    responseData.put(key, new OrderTransactionConnection(jsonAsObject(field.getValue(), key)));

                    break;
                }

                case "closingBalance": {
                    MoneyV2 optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new MoneyV2(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "closingNote": {
                    String optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = jsonAsString(field.getValue(), key);
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "closingStaffMember": {
                    StaffMember optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new StaffMember(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "closingTime": {
                    String optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = jsonAsString(field.getValue(), key);
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "expectedBalance": {
                    responseData.put(key, new MoneyV2(jsonAsObject(field.getValue(), key)));

                    break;
                }

                case "expectedClosingBalance": {
                    MoneyV2 optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new MoneyV2(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "expectedOpeningBalance": {
                    MoneyV2 optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new MoneyV2(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "id": {
                    responseData.put(key, new ID(jsonAsString(field.getValue(), key)));

                    break;
                }

                case "location": {
                    Location optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new Location(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "netCashSales": {
                    responseData.put(key, new MoneyV2(jsonAsObject(field.getValue(), key)));

                    break;
                }

                case "openingBalance": {
                    responseData.put(key, new MoneyV2(jsonAsObject(field.getValue(), key)));

                    break;
                }

                case "openingNote": {
                    String optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = jsonAsString(field.getValue(), key);
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "openingStaffMember": {
                    StaffMember optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new StaffMember(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "openingTime": {
                    responseData.put(key, jsonAsString(field.getValue(), key));

                    break;
                }

                case "registerName": {
                    responseData.put(key, jsonAsString(field.getValue(), key));

                    break;
                }

                case "totalAdjustments": {
                    MoneyV2 optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new MoneyV2(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "totalCashRefunds": {
                    responseData.put(key, new MoneyV2(jsonAsObject(field.getValue(), key)));

                    break;
                }

                case "totalCashSales": {
                    responseData.put(key, new MoneyV2(jsonAsObject(field.getValue(), key)));

                    break;
                }

                case "totalDiscrepancy": {
                    MoneyV2 optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new MoneyV2(jsonAsObject(field.getValue(), key));
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

    public CashTrackingSession(ID id) {
        this();
        optimisticData.put("id", id);
    }

    public String getGraphQlTypeName() {
        return "CashTrackingSession";
    }

    /**
    * The adjustments made to the cash drawer during this session.
    */

    public CashTrackingAdjustmentConnection getAdjustments() {
        return (CashTrackingAdjustmentConnection) get("adjustments");
    }

    public CashTrackingSession setAdjustments(CashTrackingAdjustmentConnection arg) {
        optimisticData.put(getKey("adjustments"), arg);
        return this;
    }

    /**
    * Whether this session is tracking cash payments.
    */

    public Boolean getCashTrackingEnabled() {
        return (Boolean) get("cashTrackingEnabled");
    }

    public CashTrackingSession setCashTrackingEnabled(Boolean arg) {
        optimisticData.put(getKey("cashTrackingEnabled"), arg);
        return this;
    }

    /**
    * The cash transactions made during this session.
    */

    public OrderTransactionConnection getCashTransactions() {
        return (OrderTransactionConnection) get("cashTransactions");
    }

    public CashTrackingSession setCashTransactions(OrderTransactionConnection arg) {
        optimisticData.put(getKey("cashTransactions"), arg);
        return this;
    }

    /**
    * The counted cash balance when the session was closed.
    */

    public MoneyV2 getClosingBalance() {
        return (MoneyV2) get("closingBalance");
    }

    public CashTrackingSession setClosingBalance(MoneyV2 arg) {
        optimisticData.put(getKey("closingBalance"), arg);
        return this;
    }

    /**
    * The note entered when the session was closed.
    */

    public String getClosingNote() {
        return (String) get("closingNote");
    }

    public CashTrackingSession setClosingNote(String arg) {
        optimisticData.put(getKey("closingNote"), arg);
        return this;
    }

    /**
    * The user who closed the session.
    */

    public StaffMember getClosingStaffMember() {
        return (StaffMember) get("closingStaffMember");
    }

    public CashTrackingSession setClosingStaffMember(StaffMember arg) {
        optimisticData.put(getKey("closingStaffMember"), arg);
        return this;
    }

    /**
    * When the session was closed.
    */

    public String getClosingTime() {
        return (String) get("closingTime");
    }

    public CashTrackingSession setClosingTime(String arg) {
        optimisticData.put(getKey("closingTime"), arg);
        return this;
    }

    /**
    * The expected balance at the end of the session or the expected current balance for sessions that are
    * still open.
    */

    public MoneyV2 getExpectedBalance() {
        return (MoneyV2) get("expectedBalance");
    }

    public CashTrackingSession setExpectedBalance(MoneyV2 arg) {
        optimisticData.put(getKey("expectedBalance"), arg);
        return this;
    }

    /**
    * The amount that was expected to be in the cash drawer at the end of the session, calculated after
    * the session was closed.
    */

    public MoneyV2 getExpectedClosingBalance() {
        return (MoneyV2) get("expectedClosingBalance");
    }

    public CashTrackingSession setExpectedClosingBalance(MoneyV2 arg) {
        optimisticData.put(getKey("expectedClosingBalance"), arg);
        return this;
    }

    /**
    * The amount expected to be in the cash drawer based on the previous session.
    */

    public MoneyV2 getExpectedOpeningBalance() {
        return (MoneyV2) get("expectedOpeningBalance");
    }

    public CashTrackingSession setExpectedOpeningBalance(MoneyV2 arg) {
        optimisticData.put(getKey("expectedOpeningBalance"), arg);
        return this;
    }

    /**
    * A globally-unique ID.
    */

    public ID getId() {
        return (ID) get("id");
    }

    /**
    * The location of the point of sale device during this session.
    */

    public Location getLocation() {
        return (Location) get("location");
    }

    public CashTrackingSession setLocation(Location arg) {
        optimisticData.put(getKey("location"), arg);
        return this;
    }

    /**
    * The net cash sales made for the duration of this cash tracking session.
    */

    public MoneyV2 getNetCashSales() {
        return (MoneyV2) get("netCashSales");
    }

    public CashTrackingSession setNetCashSales(MoneyV2 arg) {
        optimisticData.put(getKey("netCashSales"), arg);
        return this;
    }

    /**
    * The counted cash balance when the session was opened.
    */

    public MoneyV2 getOpeningBalance() {
        return (MoneyV2) get("openingBalance");
    }

    public CashTrackingSession setOpeningBalance(MoneyV2 arg) {
        optimisticData.put(getKey("openingBalance"), arg);
        return this;
    }

    /**
    * The note entered when the session was opened.
    */

    public String getOpeningNote() {
        return (String) get("openingNote");
    }

    public CashTrackingSession setOpeningNote(String arg) {
        optimisticData.put(getKey("openingNote"), arg);
        return this;
    }

    /**
    * The user who opened the session.
    */

    public StaffMember getOpeningStaffMember() {
        return (StaffMember) get("openingStaffMember");
    }

    public CashTrackingSession setOpeningStaffMember(StaffMember arg) {
        optimisticData.put(getKey("openingStaffMember"), arg);
        return this;
    }

    /**
    * When the session was opened.
    */

    public String getOpeningTime() {
        return (String) get("openingTime");
    }

    public CashTrackingSession setOpeningTime(String arg) {
        optimisticData.put(getKey("openingTime"), arg);
        return this;
    }

    /**
    * The register name for the point of sale device that this session is tracking cash for.
    */

    public String getRegisterName() {
        return (String) get("registerName");
    }

    public CashTrackingSession setRegisterName(String arg) {
        optimisticData.put(getKey("registerName"), arg);
        return this;
    }

    /**
    * The sum of all adjustments made during the session, excluding the final adjustment.
    */

    public MoneyV2 getTotalAdjustments() {
        return (MoneyV2) get("totalAdjustments");
    }

    public CashTrackingSession setTotalAdjustments(MoneyV2 arg) {
        optimisticData.put(getKey("totalAdjustments"), arg);
        return this;
    }

    /**
    * The sum of all cash refunds for the duration of this cash tracking session.
    */

    public MoneyV2 getTotalCashRefunds() {
        return (MoneyV2) get("totalCashRefunds");
    }

    public CashTrackingSession setTotalCashRefunds(MoneyV2 arg) {
        optimisticData.put(getKey("totalCashRefunds"), arg);
        return this;
    }

    /**
    * The sum of all cash sales for the duration of this cash tracking session.
    */

    public MoneyV2 getTotalCashSales() {
        return (MoneyV2) get("totalCashSales");
    }

    public CashTrackingSession setTotalCashSales(MoneyV2 arg) {
        optimisticData.put(getKey("totalCashSales"), arg);
        return this;
    }

    /**
    * The total discrepancy for the session including starting and ending.
    */

    public MoneyV2 getTotalDiscrepancy() {
        return (MoneyV2) get("totalDiscrepancy");
    }

    public CashTrackingSession setTotalDiscrepancy(MoneyV2 arg) {
        optimisticData.put(getKey("totalDiscrepancy"), arg);
        return this;
    }

    public boolean unwrapsToObject(String key) {
        switch (getFieldName(key)) {
            case "adjustments": return true;

            case "cashTrackingEnabled": return false;

            case "cashTransactions": return true;

            case "closingBalance": return true;

            case "closingNote": return false;

            case "closingStaffMember": return true;

            case "closingTime": return false;

            case "expectedBalance": return true;

            case "expectedClosingBalance": return true;

            case "expectedOpeningBalance": return true;

            case "id": return false;

            case "location": return true;

            case "netCashSales": return true;

            case "openingBalance": return true;

            case "openingNote": return false;

            case "openingStaffMember": return true;

            case "openingTime": return false;

            case "registerName": return false;

            case "totalAdjustments": return true;

            case "totalCashRefunds": return true;

            case "totalCashSales": return true;

            case "totalDiscrepancy": return true;

            default: return false;
        }
    }
}

