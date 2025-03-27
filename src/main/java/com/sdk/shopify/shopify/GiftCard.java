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

import java.util.Map;

/**
* Represents an issued gift card.
*/
public class GiftCard extends AbstractResponse<GiftCard> implements Node {
    public GiftCard() {
    }

    public GiftCard(JsonObject fields) throws SchemaViolationError {
        for (Map.Entry<String, JsonElement> field : fields.entrySet()) {
            String key = field.getKey();
            String fieldName = getFieldName(key);
            switch (fieldName) {
                case "balance": {
                    responseData.put(key, new MoneyV2(jsonAsObject(field.getValue(), key)));

                    break;
                }

                case "createdAt": {
                    responseData.put(key, jsonAsString(field.getValue(), key));

                    break;
                }

                case "customer": {
                    Customer optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new Customer(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "deactivatedAt": {
                    String optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = jsonAsString(field.getValue(), key);
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "enabled": {
                    responseData.put(key, jsonAsBoolean(field.getValue(), key));

                    break;
                }

                case "expiresOn": {
                    String optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = jsonAsString(field.getValue(), key);
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "id": {
                    responseData.put(key, new ID(jsonAsString(field.getValue(), key)));

                    break;
                }

                case "initialValue": {
                    responseData.put(key, new MoneyV2(jsonAsObject(field.getValue(), key)));

                    break;
                }

                case "lastCharacters": {
                    responseData.put(key, jsonAsString(field.getValue(), key));

                    break;
                }

                case "maskedCode": {
                    responseData.put(key, jsonAsString(field.getValue(), key));

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

                case "order": {
                    Order optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new Order(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "recipientAttributes": {
                    GiftCardRecipient optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new GiftCardRecipient(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "templateSuffix": {
                    String optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = jsonAsString(field.getValue(), key);
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "transactions": {
                    GiftCardTransactionConnection optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new GiftCardTransactionConnection(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

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

    public GiftCard(ID id) {
        this();
        optimisticData.put("id", id);
    }

    public String getGraphQlTypeName() {
        return "GiftCard";
    }

    /**
    * The gift card's remaining balance.
    */

    public MoneyV2 getBalance() {
        return (MoneyV2) get("balance");
    }

    public GiftCard setBalance(MoneyV2 arg) {
        optimisticData.put(getKey("balance"), arg);
        return this;
    }

    /**
    * The date and time at which the gift card was created.
    */

    public String getCreatedAt() {
        return (String) get("createdAt");
    }

    public GiftCard setCreatedAt(String arg) {
        optimisticData.put(getKey("createdAt"), arg);
        return this;
    }

    /**
    * The customer who will receive the gift card.
    */

    public Customer getCustomer() {
        return (Customer) get("customer");
    }

    public GiftCard setCustomer(Customer arg) {
        optimisticData.put(getKey("customer"), arg);
        return this;
    }

    /**
    * The date and time at which the gift card was deactivated.
    */

    public String getDeactivatedAt() {
        return (String) get("deactivatedAt");
    }

    public GiftCard setDeactivatedAt(String arg) {
        optimisticData.put(getKey("deactivatedAt"), arg);
        return this;
    }

    /**
    * Whether the gift card is enabled.
    */

    public Boolean getEnabled() {
        return (Boolean) get("enabled");
    }

    public GiftCard setEnabled(Boolean arg) {
        optimisticData.put(getKey("enabled"), arg);
        return this;
    }

    /**
    * The date at which the gift card will expire.
    */

    public String getExpiresOn() {
        return (String) get("expiresOn");
    }

    public GiftCard setExpiresOn(String arg) {
        optimisticData.put(getKey("expiresOn"), arg);
        return this;
    }

    /**
    * A globally-unique ID.
    */

    public ID getId() {
        return (ID) get("id");
    }

    /**
    * The initial value of the gift card.
    */

    public MoneyV2 getInitialValue() {
        return (MoneyV2) get("initialValue");
    }

    public GiftCard setInitialValue(MoneyV2 arg) {
        optimisticData.put(getKey("initialValue"), arg);
        return this;
    }

    /**
    * The final four characters of the gift card code.
    */

    public String getLastCharacters() {
        return (String) get("lastCharacters");
    }

    public GiftCard setLastCharacters(String arg) {
        optimisticData.put(getKey("lastCharacters"), arg);
        return this;
    }

    /**
    * The gift card code. Everything but the final four characters is masked.
    */

    public String getMaskedCode() {
        return (String) get("maskedCode");
    }

    public GiftCard setMaskedCode(String arg) {
        optimisticData.put(getKey("maskedCode"), arg);
        return this;
    }

    /**
    * The note associated with the gift card, which isn't visible to the customer.
    */

    public String getNote() {
        return (String) get("note");
    }

    public GiftCard setNote(String arg) {
        optimisticData.put(getKey("note"), arg);
        return this;
    }

    /**
    * The order associated with the gift card. This value is `null` if the gift card was issued manually.
    */

    public Order getOrder() {
        return (Order) get("order");
    }

    public GiftCard setOrder(Order arg) {
        optimisticData.put(getKey("order"), arg);
        return this;
    }

    /**
    * The recipient who will receive the gift card.
    */

    public GiftCardRecipient getRecipientAttributes() {
        return (GiftCardRecipient) get("recipientAttributes");
    }

    public GiftCard setRecipientAttributes(GiftCardRecipient arg) {
        optimisticData.put(getKey("recipientAttributes"), arg);
        return this;
    }

    /**
    * The theme template used to render the gift card online.
    */

    public String getTemplateSuffix() {
        return (String) get("templateSuffix");
    }

    public GiftCard setTemplateSuffix(String arg) {
        optimisticData.put(getKey("templateSuffix"), arg);
        return this;
    }

    /**
    * The transaction history of the gift card.
    */

    public GiftCardTransactionConnection getTransactions() {
        return (GiftCardTransactionConnection) get("transactions");
    }

    public GiftCard setTransactions(GiftCardTransactionConnection arg) {
        optimisticData.put(getKey("transactions"), arg);
        return this;
    }

    /**
    * The date and time at which the gift card was updated.
    */

    public String getUpdatedAt() {
        return (String) get("updatedAt");
    }

    public GiftCard setUpdatedAt(String arg) {
        optimisticData.put(getKey("updatedAt"), arg);
        return this;
    }

    public boolean unwrapsToObject(String key) {
        switch (getFieldName(key)) {
            case "balance": return true;

            case "createdAt": return false;

            case "customer": return true;

            case "deactivatedAt": return false;

            case "enabled": return false;

            case "expiresOn": return false;

            case "id": return false;

            case "initialValue": return true;

            case "lastCharacters": return false;

            case "maskedCode": return false;

            case "note": return false;

            case "order": return true;

            case "recipientAttributes": return true;

            case "templateSuffix": return false;

            case "transactions": return true;

            case "updatedAt": return false;

            default: return false;
        }
    }
}

