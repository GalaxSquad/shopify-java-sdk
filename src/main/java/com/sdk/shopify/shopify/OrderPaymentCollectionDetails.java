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
* The payment collection details for an order that requires additional payment following an edit to
* the order.
*/
public class OrderPaymentCollectionDetails extends AbstractResponse<OrderPaymentCollectionDetails> {
    public OrderPaymentCollectionDetails() {
    }

    public OrderPaymentCollectionDetails(JsonObject fields) throws SchemaViolationError {
        for (Map.Entry<String, JsonElement> field : fields.entrySet()) {
            String key = field.getKey();
            String fieldName = getFieldName(key);
            switch (fieldName) {
                case "additionalPaymentCollectionUrl": {
                    String optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = jsonAsString(field.getValue(), key);
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "vaultedPaymentMethods": {
                    List<PaymentMandate> optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        List<PaymentMandate> list1 = new ArrayList<>();
                        for (JsonElement element1 : jsonAsArray(field.getValue(), key)) {
                            list1.add(new PaymentMandate(jsonAsObject(element1, key)));
                        }

                        optional1 = list1;
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

    public String getGraphQlTypeName() {
        return "OrderPaymentCollectionDetails";
    }

    /**
    * The URL to use for collecting an additional payment on the order.
    */

    public String getAdditionalPaymentCollectionUrl() {
        return (String) get("additionalPaymentCollectionUrl");
    }

    public OrderPaymentCollectionDetails setAdditionalPaymentCollectionUrl(String arg) {
        optimisticData.put(getKey("additionalPaymentCollectionUrl"), arg);
        return this;
    }

    /**
    * The list of vaulted payment methods for the order with their permissions.
    */

    public List<PaymentMandate> getVaultedPaymentMethods() {
        return (List<PaymentMandate>) get("vaultedPaymentMethods");
    }

    public OrderPaymentCollectionDetails setVaultedPaymentMethods(List<PaymentMandate> arg) {
        optimisticData.put(getKey("vaultedPaymentMethods"), arg);
        return this;
    }

    public boolean unwrapsToObject(String key) {
        switch (getFieldName(key)) {
            case "additionalPaymentCollectionUrl": return false;

            case "vaultedPaymentMethods": return true;

            default: return false;
        }
    }
}

