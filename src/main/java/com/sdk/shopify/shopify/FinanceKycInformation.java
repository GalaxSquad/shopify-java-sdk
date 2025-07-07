// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.shopify.graphql.support.AbstractResponse;
import com.shopify.graphql.support.SchemaViolationError;
import java.util.Map;

/**
* Shopify Payments account information shared with embedded finance applications.
*/
public class FinanceKycInformation extends AbstractResponse<FinanceKycInformation> {
    public FinanceKycInformation() {
    }

    public FinanceKycInformation(JsonObject fields) throws SchemaViolationError {
        for (Map.Entry<String, JsonElement> field : fields.entrySet()) {
            String key = field.getKey();
            String fieldName = getFieldName(key);
            switch (fieldName) {
                case "businessAddress": {
                    ShopifyPaymentsAddressBasic optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new ShopifyPaymentsAddressBasic(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "businessType": {
                    ShopifyPaymentsBusinessType optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = ShopifyPaymentsBusinessType.fromGraphQl(jsonAsString(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "industry": {
                    ShopifyPaymentsMerchantCategoryCode optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new ShopifyPaymentsMerchantCategoryCode(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "legalName": {
                    String optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = jsonAsString(field.getValue(), key);
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "shopOwner": {
                    responseData.put(key, new FinancialKycShopOwner(jsonAsObject(field.getValue(), key)));

                    break;
                }

                case "taxIdentification": {
                    ShopifyPaymentsTaxIdentification optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new ShopifyPaymentsTaxIdentification(jsonAsObject(field.getValue(), key));
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
        return "FinanceKycInformation";
    }

    /**
    * The legal entity business address.
    */

    public ShopifyPaymentsAddressBasic getBusinessAddress() {
        return (ShopifyPaymentsAddressBasic) get("businessAddress");
    }

    public FinanceKycInformation setBusinessAddress(ShopifyPaymentsAddressBasic arg) {
        optimisticData.put(getKey("businessAddress"), arg);
        return this;
    }

    /**
    * The legal entity business type.
    */

    public ShopifyPaymentsBusinessType getBusinessType() {
        return (ShopifyPaymentsBusinessType) get("businessType");
    }

    public FinanceKycInformation setBusinessType(ShopifyPaymentsBusinessType arg) {
        optimisticData.put(getKey("businessType"), arg);
        return this;
    }

    /**
    * Business industry.
    */

    public ShopifyPaymentsMerchantCategoryCode getIndustry() {
        return (ShopifyPaymentsMerchantCategoryCode) get("industry");
    }

    public FinanceKycInformation setIndustry(ShopifyPaymentsMerchantCategoryCode arg) {
        optimisticData.put(getKey("industry"), arg);
        return this;
    }

    /**
    * Returns the business legal name.
    */

    public String getLegalName() {
        return (String) get("legalName");
    }

    public FinanceKycInformation setLegalName(String arg) {
        optimisticData.put(getKey("legalName"), arg);
        return this;
    }

    /**
    * The shop owner information for financial KYC purposes.
    */

    public FinancialKycShopOwner getShopOwner() {
        return (FinancialKycShopOwner) get("shopOwner");
    }

    public FinanceKycInformation setShopOwner(FinancialKycShopOwner arg) {
        optimisticData.put(getKey("shopOwner"), arg);
        return this;
    }

    /**
    * Tax identification information.
    */

    public ShopifyPaymentsTaxIdentification getTaxIdentification() {
        return (ShopifyPaymentsTaxIdentification) get("taxIdentification");
    }

    public FinanceKycInformation setTaxIdentification(ShopifyPaymentsTaxIdentification arg) {
        optimisticData.put(getKey("taxIdentification"), arg);
        return this;
    }

    public boolean unwrapsToObject(String key) {
        switch (getFieldName(key)) {
            case "businessAddress": return true;

            case "businessType": return false;

            case "industry": return true;

            case "legalName": return false;

            case "shopOwner": return true;

            case "taxIdentification": return true;

            default: return false;
        }
    }
}

