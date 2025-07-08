// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.shopify.graphql.support.AbstractResponse;
import com.shopify.graphql.support.ID;
import com.shopify.graphql.support.SchemaViolationError;
import java.util.Map;

/**
* Represents a merchant's Business Entity.
*/
public class BusinessEntity extends AbstractResponse<BusinessEntity> implements Node {
    public BusinessEntity() {
    }

    public BusinessEntity(JsonObject fields) throws SchemaViolationError {
        for (Map.Entry<String, JsonElement> field : fields.entrySet()) {
            String key = field.getKey();
            String fieldName = getFieldName(key);
            switch (fieldName) {
                case "address": {
                    responseData.put(key, new BusinessEntityAddress(jsonAsObject(field.getValue(), key)));

                    break;
                }

                case "archived": {
                    responseData.put(key, jsonAsBoolean(field.getValue(), key));

                    break;
                }

                case "companyName": {
                    String optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = jsonAsString(field.getValue(), key);
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "displayName": {
                    responseData.put(key, jsonAsString(field.getValue(), key));

                    break;
                }

                case "id": {
                    responseData.put(key, new ID(jsonAsString(field.getValue(), key)));

                    break;
                }

                case "primary": {
                    responseData.put(key, jsonAsBoolean(field.getValue(), key));

                    break;
                }

                case "shopifyPaymentsAccount": {
                    ShopifyPaymentsAccount optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new ShopifyPaymentsAccount(jsonAsObject(field.getValue(), key));
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

    public BusinessEntity(ID id) {
        this();
        optimisticData.put("id", id);
    }

    public String getGraphQlTypeName() {
        return "BusinessEntity";
    }

    /**
    * The address of the merchant's Business Entity.
    */

    public BusinessEntityAddress getAddress() {
        return (BusinessEntityAddress) get("address");
    }

    public BusinessEntity setAddress(BusinessEntityAddress arg) {
        optimisticData.put(getKey("address"), arg);
        return this;
    }

    /**
    * Whether the Business Entity is archived from the shop.
    */

    public Boolean getArchived() {
        return (Boolean) get("archived");
    }

    public BusinessEntity setArchived(Boolean arg) {
        optimisticData.put(getKey("archived"), arg);
        return this;
    }

    /**
    * The name of the company associated with the merchant's Business Entity.
    */

    public String getCompanyName() {
        return (String) get("companyName");
    }

    public BusinessEntity setCompanyName(String arg) {
        optimisticData.put(getKey("companyName"), arg);
        return this;
    }

    /**
    * The display name of the merchant's Business Entity.
    */

    public String getDisplayName() {
        return (String) get("displayName");
    }

    public BusinessEntity setDisplayName(String arg) {
        optimisticData.put(getKey("displayName"), arg);
        return this;
    }

    /**
    * A globally-unique ID.
    */

    public ID getId() {
        return (ID) get("id");
    }

    /**
    * Whether it's the merchant's primary Business Entity.
    */

    public Boolean getPrimary() {
        return (Boolean) get("primary");
    }

    public BusinessEntity setPrimary(Boolean arg) {
        optimisticData.put(getKey("primary"), arg);
        return this;
    }

    /**
    * Shopify Payments account information, including balances and payouts.
    */

    public ShopifyPaymentsAccount getShopifyPaymentsAccount() {
        return (ShopifyPaymentsAccount) get("shopifyPaymentsAccount");
    }

    public BusinessEntity setShopifyPaymentsAccount(ShopifyPaymentsAccount arg) {
        optimisticData.put(getKey("shopifyPaymentsAccount"), arg);
        return this;
    }

    public boolean unwrapsToObject(String key) {
        switch (getFieldName(key)) {
            case "address": return true;

            case "archived": return false;

            case "companyName": return false;

            case "displayName": return false;

            case "id": return false;

            case "primary": return false;

            case "shopifyPaymentsAccount": return true;

            default: return false;
        }
    }
}

