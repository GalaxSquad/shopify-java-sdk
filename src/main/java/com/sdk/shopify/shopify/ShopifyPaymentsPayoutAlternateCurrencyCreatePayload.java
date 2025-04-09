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
* Return type for `shopifyPaymentsPayoutAlternateCurrencyCreate` mutation.
*/
public class ShopifyPaymentsPayoutAlternateCurrencyCreatePayload extends AbstractResponse<ShopifyPaymentsPayoutAlternateCurrencyCreatePayload> {
    public ShopifyPaymentsPayoutAlternateCurrencyCreatePayload() {
    }

    public ShopifyPaymentsPayoutAlternateCurrencyCreatePayload(JsonObject fields) throws SchemaViolationError {
        for (Map.Entry<String, JsonElement> field : fields.entrySet()) {
            String key = field.getKey();
            String fieldName = getFieldName(key);
            switch (fieldName) {
                case "payout": {
                    ShopifyPaymentsToolingProviderPayout optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new ShopifyPaymentsToolingProviderPayout(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "success": {
                    Boolean optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = jsonAsBoolean(field.getValue(), key);
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "userErrors": {
                    List<ShopifyPaymentsPayoutAlternateCurrencyCreateUserError> list1 = new ArrayList<>();
                    for (JsonElement element1 : jsonAsArray(field.getValue(), key)) {
                        list1.add(new ShopifyPaymentsPayoutAlternateCurrencyCreateUserError(jsonAsObject(element1, key)));
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
        return "ShopifyPaymentsPayoutAlternateCurrencyCreatePayload";
    }

    /**
    * The resulting alternate currency payout created.
    */

    public ShopifyPaymentsToolingProviderPayout getPayout() {
        return (ShopifyPaymentsToolingProviderPayout) get("payout");
    }

    public ShopifyPaymentsPayoutAlternateCurrencyCreatePayload setPayout(ShopifyPaymentsToolingProviderPayout arg) {
        optimisticData.put(getKey("payout"), arg);
        return this;
    }

    /**
    * Whether the alternate currency payout was created successfully.
    */

    public Boolean getSuccess() {
        return (Boolean) get("success");
    }

    public ShopifyPaymentsPayoutAlternateCurrencyCreatePayload setSuccess(Boolean arg) {
        optimisticData.put(getKey("success"), arg);
        return this;
    }

    /**
    * The list of errors that occurred from executing the mutation.
    */

    public List<ShopifyPaymentsPayoutAlternateCurrencyCreateUserError> getUserErrors() {
        return (List<ShopifyPaymentsPayoutAlternateCurrencyCreateUserError>) get("userErrors");
    }

    public ShopifyPaymentsPayoutAlternateCurrencyCreatePayload setUserErrors(List<ShopifyPaymentsPayoutAlternateCurrencyCreateUserError> arg) {
        optimisticData.put(getKey("userErrors"), arg);
        return this;
    }

    public boolean unwrapsToObject(String key) {
        switch (getFieldName(key)) {
            case "payout": return true;

            case "success": return false;

            case "userErrors": return true;

            default: return false;
        }
    }
}

