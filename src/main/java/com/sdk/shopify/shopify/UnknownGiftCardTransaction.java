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
* Interface for a gift card transaction.
*/
public class UnknownGiftCardTransaction extends AbstractResponse<UnknownGiftCardTransaction> implements GiftCardTransaction {
    public UnknownGiftCardTransaction() {
    }

    public UnknownGiftCardTransaction(JsonObject fields) throws SchemaViolationError {
        for (Map.Entry<String, JsonElement> field : fields.entrySet()) {
            String key = field.getKey();
            String fieldName = getFieldName(key);
            switch (fieldName) {
                case "amount": {
                    responseData.put(key, new MoneyV2(jsonAsObject(field.getValue(), key)));

                    break;
                }

                case "giftCard": {
                    responseData.put(key, new GiftCard(jsonAsObject(field.getValue(), key)));

                    break;
                }

                case "id": {
                    responseData.put(key, new ID(jsonAsString(field.getValue(), key)));

                    break;
                }

                case "metafield": {
                    Metafield optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new Metafield(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "metafields": {
                    responseData.put(key, new MetafieldConnection(jsonAsObject(field.getValue(), key)));

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

                case "processedAt": {
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

    public static GiftCardTransaction create(JsonObject fields) throws SchemaViolationError {
        String typeName = fields.getAsJsonPrimitive("__typename").getAsString();
        switch (typeName) {
            case "GiftCardCreditTransaction": {
                return new GiftCardCreditTransaction(fields);
            }

            case "GiftCardDebitTransaction": {
                return new GiftCardDebitTransaction(fields);
            }

            default: {
                return new UnknownGiftCardTransaction(fields);
            }
        }
    }

    public String getGraphQlTypeName() {
        return (String) get("__typename");
    }

    /**
    * The amount of the transaction.
    */

    public MoneyV2 getAmount() {
        return (MoneyV2) get("amount");
    }

    public UnknownGiftCardTransaction setAmount(MoneyV2 arg) {
        optimisticData.put(getKey("amount"), arg);
        return this;
    }

    /**
    * The gift card that the transaction belongs to.
    */

    public GiftCard getGiftCard() {
        return (GiftCard) get("giftCard");
    }

    public UnknownGiftCardTransaction setGiftCard(GiftCard arg) {
        optimisticData.put(getKey("giftCard"), arg);
        return this;
    }

    /**
    * The unique ID for the transaction.
    */

    public ID getId() {
        return (ID) get("id");
    }

    public UnknownGiftCardTransaction setId(ID arg) {
        optimisticData.put(getKey("id"), arg);
        return this;
    }

    /**
    * A [custom field](https://shopify.dev/docs/apps/build/custom-data),
    * including its `namespace` and `key`, that's associated with a Shopify resource
    * for the purposes of adding and storing additional information.
    */

    public Metafield getMetafield() {
        return (Metafield) get("metafield");
    }

    public UnknownGiftCardTransaction setMetafield(Metafield arg) {
        optimisticData.put(getKey("metafield"), arg);
        return this;
    }

    /**
    * A list of [custom fields](https://shopify.dev/docs/apps/build/custom-data)
    * that a merchant associates with a Shopify resource.
    */

    public MetafieldConnection getMetafields() {
        return (MetafieldConnection) get("metafields");
    }

    public UnknownGiftCardTransaction setMetafields(MetafieldConnection arg) {
        optimisticData.put(getKey("metafields"), arg);
        return this;
    }

    /**
    * A note about the transaction.
    */

    public String getNote() {
        return (String) get("note");
    }

    public UnknownGiftCardTransaction setNote(String arg) {
        optimisticData.put(getKey("note"), arg);
        return this;
    }

    /**
    * The date and time when the transaction was processed.
    */

    public String getProcessedAt() {
        return (String) get("processedAt");
    }

    public UnknownGiftCardTransaction setProcessedAt(String arg) {
        optimisticData.put(getKey("processedAt"), arg);
        return this;
    }

    public boolean unwrapsToObject(String key) {
        switch (getFieldName(key)) {
            case "amount": return true;

            case "giftCard": return true;

            case "id": return false;

            case "metafield": return true;

            case "metafields": return true;

            case "note": return false;

            case "processedAt": return false;

            default: return false;
        }
    }
}

