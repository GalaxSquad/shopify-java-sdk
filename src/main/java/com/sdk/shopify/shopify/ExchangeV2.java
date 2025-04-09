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
* An exchange where existing items on an order are returned and new items are added to the order.
*/
public class ExchangeV2 extends AbstractResponse<ExchangeV2> implements Node {
    public ExchangeV2() {
    }

    public ExchangeV2(JsonObject fields) throws SchemaViolationError {
        for (Map.Entry<String, JsonElement> field : fields.entrySet()) {
            String key = field.getKey();
            String fieldName = getFieldName(key);
            switch (fieldName) {
                case "additions": {
                    responseData.put(key, new ExchangeV2Additions(jsonAsObject(field.getValue(), key)));

                    break;
                }

                case "completedAt": {
                    String optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = jsonAsString(field.getValue(), key);
                    }

                    responseData.put(key, optional1);

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

                case "location": {
                    Location optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new Location(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

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

                case "refunds": {
                    List<Refund> list1 = new ArrayList<>();
                    for (JsonElement element1 : jsonAsArray(field.getValue(), key)) {
                        list1.add(new Refund(jsonAsObject(element1, key)));
                    }

                    responseData.put(key, list1);

                    break;
                }

                case "returns": {
                    responseData.put(key, new ExchangeV2Returns(jsonAsObject(field.getValue(), key)));

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

                case "totalAmountProcessedSet": {
                    responseData.put(key, new MoneyBag(jsonAsObject(field.getValue(), key)));

                    break;
                }

                case "totalPriceSet": {
                    responseData.put(key, new MoneyBag(jsonAsObject(field.getValue(), key)));

                    break;
                }

                case "transactions": {
                    List<OrderTransaction> list1 = new ArrayList<>();
                    for (JsonElement element1 : jsonAsArray(field.getValue(), key)) {
                        list1.add(new OrderTransaction(jsonAsObject(element1, key)));
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

    public ExchangeV2(ID id) {
        this();
        optimisticData.put("id", id);
    }

    public String getGraphQlTypeName() {
        return "ExchangeV2";
    }

    /**
    * The details of the new items in the exchange.
    */

    public ExchangeV2Additions getAdditions() {
        return (ExchangeV2Additions) get("additions");
    }

    public ExchangeV2 setAdditions(ExchangeV2Additions arg) {
        optimisticData.put(getKey("additions"), arg);
        return this;
    }

    /**
    * The date and time when the exchange was completed.
    */

    public String getCompletedAt() {
        return (String) get("completedAt");
    }

    public ExchangeV2 setCompletedAt(String arg) {
        optimisticData.put(getKey("completedAt"), arg);
        return this;
    }

    /**
    * The date and time when the exchange was created.
    */

    public String getCreatedAt() {
        return (String) get("createdAt");
    }

    public ExchangeV2 setCreatedAt(String arg) {
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
    * The location where the exchange happened.
    */

    public Location getLocation() {
        return (Location) get("location");
    }

    public ExchangeV2 setLocation(Location arg) {
        optimisticData.put(getKey("location"), arg);
        return this;
    }

    /**
    * The text of an optional note that a shop owner can attach to the exchange.
    */

    public String getNote() {
        return (String) get("note");
    }

    public ExchangeV2 setNote(String arg) {
        optimisticData.put(getKey("note"), arg);
        return this;
    }

    /**
    * The refunds processed during the exchange.
    */

    public List<Refund> getRefunds() {
        return (List<Refund>) get("refunds");
    }

    public ExchangeV2 setRefunds(List<Refund> arg) {
        optimisticData.put(getKey("refunds"), arg);
        return this;
    }

    /**
    * The details of the returned items in the exchange.
    */

    public ExchangeV2Returns getReturns() {
        return (ExchangeV2Returns) get("returns");
    }

    public ExchangeV2 setReturns(ExchangeV2Returns arg) {
        optimisticData.put(getKey("returns"), arg);
        return this;
    }

    /**
    * The staff member associated with the exchange.
    */

    public StaffMember getStaffMember() {
        return (StaffMember) get("staffMember");
    }

    public ExchangeV2 setStaffMember(StaffMember arg) {
        optimisticData.put(getKey("staffMember"), arg);
        return this;
    }

    /**
    * The amount of money that was paid or refunded as part of the exchange.
    */

    public MoneyBag getTotalAmountProcessedSet() {
        return (MoneyBag) get("totalAmountProcessedSet");
    }

    public ExchangeV2 setTotalAmountProcessedSet(MoneyBag arg) {
        optimisticData.put(getKey("totalAmountProcessedSet"), arg);
        return this;
    }

    /**
    * The difference in values of the items that were exchanged.
    */

    public MoneyBag getTotalPriceSet() {
        return (MoneyBag) get("totalPriceSet");
    }

    public ExchangeV2 setTotalPriceSet(MoneyBag arg) {
        optimisticData.put(getKey("totalPriceSet"), arg);
        return this;
    }

    /**
    * The order transactions related to the exchange.
    */

    public List<OrderTransaction> getTransactions() {
        return (List<OrderTransaction>) get("transactions");
    }

    public ExchangeV2 setTransactions(List<OrderTransaction> arg) {
        optimisticData.put(getKey("transactions"), arg);
        return this;
    }

    public boolean unwrapsToObject(String key) {
        switch (getFieldName(key)) {
            case "additions": return true;

            case "completedAt": return false;

            case "createdAt": return false;

            case "id": return false;

            case "location": return true;

            case "note": return false;

            case "refunds": return true;

            case "returns": return true;

            case "staffMember": return true;

            case "totalAmountProcessedSet": return true;

            case "totalPriceSet": return true;

            case "transactions": return true;

            default: return false;
        }
    }
}

