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
* A transaction that contributes to a Shopify Payments account balance.
*/
public class ShopifyPaymentsBalanceTransaction extends AbstractResponse<ShopifyPaymentsBalanceTransaction> implements Node {
    public ShopifyPaymentsBalanceTransaction() {
    }

    public ShopifyPaymentsBalanceTransaction(JsonObject fields) throws SchemaViolationError {
        for (Map.Entry<String, JsonElement> field : fields.entrySet()) {
            String key = field.getKey();
            String fieldName = getFieldName(key);
            switch (fieldName) {
                case "adjustmentReason": {
                    String optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = jsonAsString(field.getValue(), key);
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "adjustmentsOrders": {
                    List<ShopifyPaymentsAdjustmentOrder> list1 = new ArrayList<>();
                    for (JsonElement element1 : jsonAsArray(field.getValue(), key)) {
                        list1.add(new ShopifyPaymentsAdjustmentOrder(jsonAsObject(element1, key)));
                    }

                    responseData.put(key, list1);

                    break;
                }

                case "amount": {
                    responseData.put(key, new MoneyV2(jsonAsObject(field.getValue(), key)));

                    break;
                }

                case "associatedOrder": {
                    ShopifyPaymentsAssociatedOrder optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new ShopifyPaymentsAssociatedOrder(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "associatedPayout": {
                    responseData.put(key, new ShopifyPaymentsBalanceTransactionAssociatedPayout(jsonAsObject(field.getValue(), key)));

                    break;
                }

                case "fee": {
                    responseData.put(key, new MoneyV2(jsonAsObject(field.getValue(), key)));

                    break;
                }

                case "id": {
                    responseData.put(key, new ID(jsonAsString(field.getValue(), key)));

                    break;
                }

                case "net": {
                    responseData.put(key, new MoneyV2(jsonAsObject(field.getValue(), key)));

                    break;
                }

                case "sourceId": {
                    String optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = jsonAsString(field.getValue(), key);
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "sourceOrderTransactionId": {
                    String optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = jsonAsString(field.getValue(), key);
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "sourceType": {
                    ShopifyPaymentsSourceType optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = ShopifyPaymentsSourceType.fromGraphQl(jsonAsString(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "test": {
                    responseData.put(key, jsonAsBoolean(field.getValue(), key));

                    break;
                }

                case "transactionDate": {
                    responseData.put(key, jsonAsString(field.getValue(), key));

                    break;
                }

                case "type": {
                    responseData.put(key, ShopifyPaymentsTransactionType.fromGraphQl(jsonAsString(field.getValue(), key)));

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

    public ShopifyPaymentsBalanceTransaction(ID id) {
        this();
        optimisticData.put("id", id);
    }

    public String getGraphQlTypeName() {
        return "ShopifyPaymentsBalanceTransaction";
    }

    /**
    * The reason for the adjustment that's associated with the transaction.
    * If the source_type isn't an adjustment, the value will be null.
    */

    public String getAdjustmentReason() {
        return (String) get("adjustmentReason");
    }

    public ShopifyPaymentsBalanceTransaction setAdjustmentReason(String arg) {
        optimisticData.put(getKey("adjustmentReason"), arg);
        return this;
    }

    /**
    * The adjustment orders associated to the transaction.
    */

    public List<ShopifyPaymentsAdjustmentOrder> getAdjustmentsOrders() {
        return (List<ShopifyPaymentsAdjustmentOrder>) get("adjustmentsOrders");
    }

    public ShopifyPaymentsBalanceTransaction setAdjustmentsOrders(List<ShopifyPaymentsAdjustmentOrder> arg) {
        optimisticData.put(getKey("adjustmentsOrders"), arg);
        return this;
    }

    /**
    * The amount contributing to the balance transaction.
    */

    public MoneyV2 getAmount() {
        return (MoneyV2) get("amount");
    }

    public ShopifyPaymentsBalanceTransaction setAmount(MoneyV2 arg) {
        optimisticData.put(getKey("amount"), arg);
        return this;
    }

    /**
    * The associated order for the balance transaction.
    */

    public ShopifyPaymentsAssociatedOrder getAssociatedOrder() {
        return (ShopifyPaymentsAssociatedOrder) get("associatedOrder");
    }

    public ShopifyPaymentsBalanceTransaction setAssociatedOrder(ShopifyPaymentsAssociatedOrder arg) {
        optimisticData.put(getKey("associatedOrder"), arg);
        return this;
    }

    /**
    * Payout assoicated with the transaction.
    */

    public ShopifyPaymentsBalanceTransactionAssociatedPayout getAssociatedPayout() {
        return (ShopifyPaymentsBalanceTransactionAssociatedPayout) get("associatedPayout");
    }

    public ShopifyPaymentsBalanceTransaction setAssociatedPayout(ShopifyPaymentsBalanceTransactionAssociatedPayout arg) {
        optimisticData.put(getKey("associatedPayout"), arg);
        return this;
    }

    /**
    * The fee amount contributing to the balance transaction.
    */

    public MoneyV2 getFee() {
        return (MoneyV2) get("fee");
    }

    public ShopifyPaymentsBalanceTransaction setFee(MoneyV2 arg) {
        optimisticData.put(getKey("fee"), arg);
        return this;
    }

    /**
    * A globally-unique ID.
    */

    public ID getId() {
        return (ID) get("id");
    }

    /**
    * The net amount contributing to the merchant's balance.
    */

    public MoneyV2 getNet() {
        return (MoneyV2) get("net");
    }

    public ShopifyPaymentsBalanceTransaction setNet(MoneyV2 arg) {
        optimisticData.put(getKey("net"), arg);
        return this;
    }

    /**
    * The ID of the resource leading to the transaction.
    */

    public String getSourceId() {
        return (String) get("sourceId");
    }

    public ShopifyPaymentsBalanceTransaction setSourceId(String arg) {
        optimisticData.put(getKey("sourceId"), arg);
        return this;
    }

    /**
    * The id of the
    * [Order Transaction](https://shopify.dev/docs/admin-api/rest/reference/orders/transaction)
    * that resulted in this balance transaction.
    */

    public String getSourceOrderTransactionId() {
        return (String) get("sourceOrderTransactionId");
    }

    public ShopifyPaymentsBalanceTransaction setSourceOrderTransactionId(String arg) {
        optimisticData.put(getKey("sourceOrderTransactionId"), arg);
        return this;
    }

    /**
    * The source type of the balance transaction.
    */

    public ShopifyPaymentsSourceType getSourceType() {
        return (ShopifyPaymentsSourceType) get("sourceType");
    }

    public ShopifyPaymentsBalanceTransaction setSourceType(ShopifyPaymentsSourceType arg) {
        optimisticData.put(getKey("sourceType"), arg);
        return this;
    }

    /**
    * Wether the tranaction was created in test mode.
    */

    public Boolean getTest() {
        return (Boolean) get("test");
    }

    public ShopifyPaymentsBalanceTransaction setTest(Boolean arg) {
        optimisticData.put(getKey("test"), arg);
        return this;
    }

    /**
    * The date and time when the balance transaction was processed.
    */

    public String getTransactionDate() {
        return (String) get("transactionDate");
    }

    public ShopifyPaymentsBalanceTransaction setTransactionDate(String arg) {
        optimisticData.put(getKey("transactionDate"), arg);
        return this;
    }

    /**
    * The type of transaction.
    */

    public ShopifyPaymentsTransactionType getType() {
        return (ShopifyPaymentsTransactionType) get("type");
    }

    public ShopifyPaymentsBalanceTransaction setType(ShopifyPaymentsTransactionType arg) {
        optimisticData.put(getKey("type"), arg);
        return this;
    }

    public boolean unwrapsToObject(String key) {
        switch (getFieldName(key)) {
            case "adjustmentReason": return false;

            case "adjustmentsOrders": return true;

            case "amount": return true;

            case "associatedOrder": return true;

            case "associatedPayout": return true;

            case "fee": return true;

            case "id": return false;

            case "net": return true;

            case "sourceId": return false;

            case "sourceOrderTransactionId": return false;

            case "sourceType": return false;

            case "test": return false;

            case "transactionDate": return false;

            case "type": return false;

            default: return false;
        }
    }
}

