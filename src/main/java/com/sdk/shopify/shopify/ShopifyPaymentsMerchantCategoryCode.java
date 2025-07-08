// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.shopify.graphql.support.AbstractResponse;
import com.shopify.graphql.support.SchemaViolationError;
import java.util.Map;

/**
* A MerchantCategoryCode (MCC) is a four-digit number listed in ISO 18245 for retail financial
* services and used to classify the business by the type of goods or services it provides.
*/
public class ShopifyPaymentsMerchantCategoryCode extends AbstractResponse<ShopifyPaymentsMerchantCategoryCode> {
    public ShopifyPaymentsMerchantCategoryCode() {
    }

    public ShopifyPaymentsMerchantCategoryCode(JsonObject fields) throws SchemaViolationError {
        for (Map.Entry<String, JsonElement> field : fields.entrySet()) {
            String key = field.getKey();
            String fieldName = getFieldName(key);
            switch (fieldName) {
                case "category": {
                    responseData.put(key, jsonAsString(field.getValue(), key));

                    break;
                }

                case "categoryLabel": {
                    responseData.put(key, jsonAsString(field.getValue(), key));

                    break;
                }

                case "code": {
                    responseData.put(key, jsonAsInteger(field.getValue(), key));

                    break;
                }

                case "id": {
                    responseData.put(key, jsonAsInteger(field.getValue(), key));

                    break;
                }

                case "subcategoryLabel": {
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
        return "ShopifyPaymentsMerchantCategoryCode";
    }

    /**
    * The category of the MCC.
    */

    public String getCategory() {
        return (String) get("category");
    }

    public ShopifyPaymentsMerchantCategoryCode setCategory(String arg) {
        optimisticData.put(getKey("category"), arg);
        return this;
    }

    /**
    * The category label of the MCC.
    */

    public String getCategoryLabel() {
        return (String) get("categoryLabel");
    }

    public ShopifyPaymentsMerchantCategoryCode setCategoryLabel(String arg) {
        optimisticData.put(getKey("categoryLabel"), arg);
        return this;
    }

    /**
    * A four-digit number listed in ISO 18245.
    */

    public Integer getCode() {
        return (Integer) get("code");
    }

    public ShopifyPaymentsMerchantCategoryCode setCode(Integer arg) {
        optimisticData.put(getKey("code"), arg);
        return this;
    }

    /**
    * The ID of the MCC.
    */

    public Integer getId() {
        return (Integer) get("id");
    }

    public ShopifyPaymentsMerchantCategoryCode setId(Integer arg) {
        optimisticData.put(getKey("id"), arg);
        return this;
    }

    /**
    * The subcategory label of the MCC.
    */

    public String getSubcategoryLabel() {
        return (String) get("subcategoryLabel");
    }

    public ShopifyPaymentsMerchantCategoryCode setSubcategoryLabel(String arg) {
        optimisticData.put(getKey("subcategoryLabel"), arg);
        return this;
    }

    public boolean unwrapsToObject(String key) {
        switch (getFieldName(key)) {
            case "category": return false;

            case "categoryLabel": return false;

            case "code": return false;

            case "id": return false;

            case "subcategoryLabel": return false;

            default: return false;
        }
    }
}

