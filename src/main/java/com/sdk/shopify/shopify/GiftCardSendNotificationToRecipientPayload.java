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
* Return type for `giftCardSendNotificationToRecipient` mutation.
*/
public class GiftCardSendNotificationToRecipientPayload extends AbstractResponse<GiftCardSendNotificationToRecipientPayload> {
    public GiftCardSendNotificationToRecipientPayload() {
    }

    public GiftCardSendNotificationToRecipientPayload(JsonObject fields) throws SchemaViolationError {
        for (Map.Entry<String, JsonElement> field : fields.entrySet()) {
            String key = field.getKey();
            String fieldName = getFieldName(key);
            switch (fieldName) {
                case "giftCard": {
                    GiftCard optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new GiftCard(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "userErrors": {
                    List<GiftCardSendNotificationToRecipientUserError> list1 = new ArrayList<>();
                    for (JsonElement element1 : jsonAsArray(field.getValue(), key)) {
                        list1.add(new GiftCardSendNotificationToRecipientUserError(jsonAsObject(element1, key)));
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
        return "GiftCardSendNotificationToRecipientPayload";
    }

    /**
    * The gift card that was sent.
    */

    public GiftCard getGiftCard() {
        return (GiftCard) get("giftCard");
    }

    public GiftCardSendNotificationToRecipientPayload setGiftCard(GiftCard arg) {
        optimisticData.put(getKey("giftCard"), arg);
        return this;
    }

    /**
    * The list of errors that occurred from executing the mutation.
    */

    public List<GiftCardSendNotificationToRecipientUserError> getUserErrors() {
        return (List<GiftCardSendNotificationToRecipientUserError>) get("userErrors");
    }

    public GiftCardSendNotificationToRecipientPayload setUserErrors(List<GiftCardSendNotificationToRecipientUserError> arg) {
        optimisticData.put(getKey("userErrors"), arg);
        return this;
    }

    public boolean unwrapsToObject(String key) {
        switch (getFieldName(key)) {
            case "giftCard": return true;

            case "userErrors": return true;

            default: return false;
        }
    }
}

