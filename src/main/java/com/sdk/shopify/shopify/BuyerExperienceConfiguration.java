// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.shopify.graphql.support.AbstractResponse;
import com.shopify.graphql.support.SchemaViolationError;
import java.util.Map;

/**
* Settings describing the behavior of checkout for a B2B buyer.
*/
public class BuyerExperienceConfiguration extends AbstractResponse<BuyerExperienceConfiguration> {
    public BuyerExperienceConfiguration() {
    }

    public BuyerExperienceConfiguration(JsonObject fields) throws SchemaViolationError {
        for (Map.Entry<String, JsonElement> field : fields.entrySet()) {
            String key = field.getKey();
            String fieldName = getFieldName(key);
            switch (fieldName) {
                case "checkoutToDraft": {
                    responseData.put(key, jsonAsBoolean(field.getValue(), key));

                    break;
                }

                case "deposit": {
                    DepositConfiguration optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = UnknownDepositConfiguration.create(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "editableShippingAddress": {
                    responseData.put(key, jsonAsBoolean(field.getValue(), key));

                    break;
                }

                case "paymentTermsTemplate": {
                    PaymentTermsTemplate optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new PaymentTermsTemplate(jsonAsObject(field.getValue(), key));
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
        return "BuyerExperienceConfiguration";
    }

    /**
    * Whether to checkout to draft order for merchant review.
    */

    public Boolean getCheckoutToDraft() {
        return (Boolean) get("checkoutToDraft");
    }

    public BuyerExperienceConfiguration setCheckoutToDraft(Boolean arg) {
        optimisticData.put(getKey("checkoutToDraft"), arg);
        return this;
    }

    /**
    * The portion required to be paid at checkout.
    */

    public DepositConfiguration getDeposit() {
        return (DepositConfiguration) get("deposit");
    }

    public BuyerExperienceConfiguration setDeposit(DepositConfiguration arg) {
        optimisticData.put(getKey("deposit"), arg);
        return this;
    }

    /**
    * Whether to allow customers to use editable shipping addresses.
    */

    public Boolean getEditableShippingAddress() {
        return (Boolean) get("editableShippingAddress");
    }

    public BuyerExperienceConfiguration setEditableShippingAddress(Boolean arg) {
        optimisticData.put(getKey("editableShippingAddress"), arg);
        return this;
    }

    /**
    * Represents the merchant configured payment terms.
    */

    public PaymentTermsTemplate getPaymentTermsTemplate() {
        return (PaymentTermsTemplate) get("paymentTermsTemplate");
    }

    public BuyerExperienceConfiguration setPaymentTermsTemplate(PaymentTermsTemplate arg) {
        optimisticData.put(getKey("paymentTermsTemplate"), arg);
        return this;
    }

    public boolean unwrapsToObject(String key) {
        switch (getFieldName(key)) {
            case "checkoutToDraft": return false;

            case "deposit": return false;

            case "editableShippingAddress": return false;

            case "paymentTermsTemplate": return true;

            default: return false;
        }
    }
}

