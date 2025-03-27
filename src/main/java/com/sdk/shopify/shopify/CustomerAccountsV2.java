// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.shopify.graphql.support.AbstractResponse;
import com.shopify.graphql.support.SchemaViolationError;
import java.util.Map;

/**
* Information about the shop's customer accounts.
*/
public class CustomerAccountsV2 extends AbstractResponse<CustomerAccountsV2> {
    public CustomerAccountsV2() {
    }

    public CustomerAccountsV2(JsonObject fields) throws SchemaViolationError {
        for (Map.Entry<String, JsonElement> field : fields.entrySet()) {
            String key = field.getKey();
            String fieldName = getFieldName(key);
            switch (fieldName) {
                case "customerAccountsVersion": {
                    responseData.put(key, CustomerAccountsVersion.fromGraphQl(jsonAsString(field.getValue(), key)));

                    break;
                }

                case "loginLinksVisibleOnStorefrontAndCheckout": {
                    responseData.put(key, jsonAsBoolean(field.getValue(), key));

                    break;
                }

                case "loginRequiredAtCheckout": {
                    responseData.put(key, jsonAsBoolean(field.getValue(), key));

                    break;
                }

                case "url": {
                    String optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = jsonAsString(field.getValue(), key);
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
        return "CustomerAccountsV2";
    }

    /**
    * Indicates which version of customer accounts the merchant is using in online store and checkout.
    */

    public CustomerAccountsVersion getCustomerAccountsVersion() {
        return (CustomerAccountsVersion) get("customerAccountsVersion");
    }

    public CustomerAccountsV2 setCustomerAccountsVersion(CustomerAccountsVersion arg) {
        optimisticData.put(getKey("customerAccountsVersion"), arg);
        return this;
    }

    /**
    * Login links are shown in online store and checkout.
    */

    public Boolean getLoginLinksVisibleOnStorefrontAndCheckout() {
        return (Boolean) get("loginLinksVisibleOnStorefrontAndCheckout");
    }

    public CustomerAccountsV2 setLoginLinksVisibleOnStorefrontAndCheckout(Boolean arg) {
        optimisticData.put(getKey("loginLinksVisibleOnStorefrontAndCheckout"), arg);
        return this;
    }

    /**
    * Customers are required to log in to their account before checkout.
    */

    public Boolean getLoginRequiredAtCheckout() {
        return (Boolean) get("loginRequiredAtCheckout");
    }

    public CustomerAccountsV2 setLoginRequiredAtCheckout(Boolean arg) {
        optimisticData.put(getKey("loginRequiredAtCheckout"), arg);
        return this;
    }

    /**
    * The root url for the customer accounts pages.
    */

    public String getUrl() {
        return (String) get("url");
    }

    public CustomerAccountsV2 setUrl(String arg) {
        optimisticData.put(getKey("url"), arg);
        return this;
    }

    public boolean unwrapsToObject(String key) {
        switch (getFieldName(key)) {
            case "customerAccountsVersion": return false;

            case "loginLinksVisibleOnStorefrontAndCheckout": return false;

            case "loginRequiredAtCheckout": return false;

            case "url": return false;

            default: return false;
        }
    }
}

