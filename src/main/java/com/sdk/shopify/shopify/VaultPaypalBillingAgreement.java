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
* Represents a paypal billing agreement payment instrument.
*/
public class VaultPaypalBillingAgreement extends AbstractResponse<VaultPaypalBillingAgreement> implements PaymentInstrument {
    public VaultPaypalBillingAgreement() {
    }

    public VaultPaypalBillingAgreement(JsonObject fields) throws SchemaViolationError {
        for (Map.Entry<String, JsonElement> field : fields.entrySet()) {
            String key = field.getKey();
            String fieldName = getFieldName(key);
            switch (fieldName) {
                case "inactive": {
                    responseData.put(key, jsonAsBoolean(field.getValue(), key));

                    break;
                }

                case "name": {
                    responseData.put(key, jsonAsString(field.getValue(), key));

                    break;
                }

                case "paypalAccountEmail": {
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

    public String getGraphQlTypeName() {
        return "VaultPaypalBillingAgreement";
    }

    /**
    * Whether the paypal billing agreement is inactive.
    */

    public Boolean getInactive() {
        return (Boolean) get("inactive");
    }

    public VaultPaypalBillingAgreement setInactive(Boolean arg) {
        optimisticData.put(getKey("inactive"), arg);
        return this;
    }

    /**
    * The paypal account name.
    */

    public String getName() {
        return (String) get("name");
    }

    public VaultPaypalBillingAgreement setName(String arg) {
        optimisticData.put(getKey("name"), arg);
        return this;
    }

    /**
    * The paypal account email address.
    */

    public String getPaypalAccountEmail() {
        return (String) get("paypalAccountEmail");
    }

    public VaultPaypalBillingAgreement setPaypalAccountEmail(String arg) {
        optimisticData.put(getKey("paypalAccountEmail"), arg);
        return this;
    }

    public boolean unwrapsToObject(String key) {
        switch (getFieldName(key)) {
            case "inactive": return false;

            case "name": return false;

            case "paypalAccountEmail": return false;

            default: return false;
        }
    }
}

