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
* Return type for `giftCardCreate` mutation.
*/
public class GiftCardCreatePayload extends AbstractResponse<GiftCardCreatePayload> {
    public GiftCardCreatePayload() {
    }

    public GiftCardCreatePayload(JsonObject fields) throws SchemaViolationError {
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

                case "giftCardCode": {
                    String optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = jsonAsString(field.getValue(), key);
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "userErrors": {
                    List<GiftCardUserError> list1 = new ArrayList<>();
                    for (JsonElement element1 : jsonAsArray(field.getValue(), key)) {
                        list1.add(new GiftCardUserError(jsonAsObject(element1, key)));
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
        return "GiftCardCreatePayload";
    }

    /**
    * The created gift card.
    */

    public GiftCard getGiftCard() {
        return (GiftCard) get("giftCard");
    }

    public GiftCardCreatePayload setGiftCard(GiftCard arg) {
        optimisticData.put(getKey("giftCard"), arg);
        return this;
    }

    /**
    * The created gift card's code.
    */

    public String getGiftCardCode() {
        return (String) get("giftCardCode");
    }

    public GiftCardCreatePayload setGiftCardCode(String arg) {
        optimisticData.put(getKey("giftCardCode"), arg);
        return this;
    }

    /**
    * The list of errors that occurred from executing the mutation.
    */

    public List<GiftCardUserError> getUserErrors() {
        return (List<GiftCardUserError>) get("userErrors");
    }

    public GiftCardCreatePayload setUserErrors(List<GiftCardUserError> arg) {
        optimisticData.put(getKey("userErrors"), arg);
        return this;
    }

    public boolean unwrapsToObject(String key) {
        switch (getFieldName(key)) {
            case "giftCard": return true;

            case "giftCardCode": return false;

            case "userErrors": return true;

            default: return false;
        }
    }
}

