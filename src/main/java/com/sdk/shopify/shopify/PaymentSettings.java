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
* Settings related to payments.
*/
public class PaymentSettings extends AbstractResponse<PaymentSettings> {
    public PaymentSettings() {
    }

    public PaymentSettings(JsonObject fields) throws SchemaViolationError {
        for (Map.Entry<String, JsonElement> field : fields.entrySet()) {
            String key = field.getKey();
            String fieldName = getFieldName(key);
            switch (fieldName) {
                case "supportedDigitalWallets": {
                    List<DigitalWallet> list1 = new ArrayList<>();
                    for (JsonElement element1 : jsonAsArray(field.getValue(), key)) {
                        list1.add(DigitalWallet.fromGraphQl(jsonAsString(element1, key)));
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
        return "PaymentSettings";
    }

    /**
    * List of the digital wallets which the shop supports.
    */

    public List<DigitalWallet> getSupportedDigitalWallets() {
        return (List<DigitalWallet>) get("supportedDigitalWallets");
    }

    public PaymentSettings setSupportedDigitalWallets(List<DigitalWallet> arg) {
        optimisticData.put(getKey("supportedDigitalWallets"), arg);
        return this;
    }

    public boolean unwrapsToObject(String key) {
        switch (getFieldName(key)) {
            case "supportedDigitalWallets": return false;

            default: return false;
        }
    }
}

