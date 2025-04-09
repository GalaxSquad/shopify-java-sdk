// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.shopify.graphql.support.AbstractResponse;
import com.shopify.graphql.support.SchemaViolationError;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
* Return type for `giftCardCredit` mutation.
*/
public class GiftCardCreditPayload extends AbstractResponse<GiftCardCreditPayload> {
    public GiftCardCreditPayload() {
    }

    public GiftCardCreditPayload(JsonObject fields) throws SchemaViolationError {
        for (Map.Entry<String, JsonElement> field : fields.entrySet()) {
            String key = field.getKey();
            String fieldName = getFieldName(key);
            switch (fieldName) {
                case "giftCardCreditTransaction": {
                    GiftCardCreditTransaction optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new GiftCardCreditTransaction(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "userErrors": {
                    List<GiftCardTransactionUserError> list1 = new ArrayList<>();
                    for (JsonElement element1 : jsonAsArray(field.getValue(), key)) {
                        list1.add(new GiftCardTransactionUserError(jsonAsObject(element1, key)));
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

    public String getGraphQlTypeName() {
        return "GiftCardCreditPayload";
    }

    /**
    * The gift card credit transaction that was created.
    */

    public GiftCardCreditTransaction getGiftCardCreditTransaction() {
        return (GiftCardCreditTransaction) get("giftCardCreditTransaction");
    }

    public GiftCardCreditPayload setGiftCardCreditTransaction(GiftCardCreditTransaction arg) {
        optimisticData.put(getKey("giftCardCreditTransaction"), arg);
        return this;
    }

    /**
    * The list of errors that occurred from executing the mutation.
    */

    public List<GiftCardTransactionUserError> getUserErrors() {
        return (List<GiftCardTransactionUserError>) get("userErrors");
    }

    public GiftCardCreditPayload setUserErrors(List<GiftCardTransactionUserError> arg) {
        optimisticData.put(getKey("userErrors"), arg);
        return this;
    }

    public boolean unwrapsToObject(String key) {
        switch (getFieldName(key)) {
            case "giftCardCreditTransaction": return true;

            case "userErrors": return true;

            default: return false;
        }
    }
}

