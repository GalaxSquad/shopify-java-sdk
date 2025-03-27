// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.shopify.graphql.support.AbstractResponse;
import com.shopify.graphql.support.SchemaViolationError;
import java.util.Map;

/**
* A warning indicating that a discount cannot be applied to a draft order.
*/
public class DraftOrderDiscountNotAppliedWarning extends AbstractResponse<DraftOrderDiscountNotAppliedWarning> implements DraftOrderWarning {
    public DraftOrderDiscountNotAppliedWarning() {
    }

    public DraftOrderDiscountNotAppliedWarning(JsonObject fields) throws SchemaViolationError {
        for (Map.Entry<String, JsonElement> field : fields.entrySet()) {
            String key = field.getKey();
            String fieldName = getFieldName(key);
            switch (fieldName) {
                case "discountCode": {
                    String optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = jsonAsString(field.getValue(), key);
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "discountTitle": {
                    String optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = jsonAsString(field.getValue(), key);
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "errorCode": {
                    responseData.put(key, jsonAsString(field.getValue(), key));

                    break;
                }

                case "field": {
                    responseData.put(key, jsonAsString(field.getValue(), key));

                    break;
                }

                case "message": {
                    responseData.put(key, jsonAsString(field.getValue(), key));

                    break;
                }

                case "priceRule": {
                    PriceRule optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new PriceRule(jsonAsObject(field.getValue(), key));
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
        return "DraftOrderDiscountNotAppliedWarning";
    }

    /**
    * The code of the discount that can't be applied.
    */

    public String getDiscountCode() {
        return (String) get("discountCode");
    }

    public DraftOrderDiscountNotAppliedWarning setDiscountCode(String arg) {
        optimisticData.put(getKey("discountCode"), arg);
        return this;
    }

    /**
    * The title of the discount that can't be applied.
    */

    public String getDiscountTitle() {
        return (String) get("discountTitle");
    }

    public DraftOrderDiscountNotAppliedWarning setDiscountTitle(String arg) {
        optimisticData.put(getKey("discountTitle"), arg);
        return this;
    }

    /**
    * The error code.
    */

    public String getErrorCode() {
        return (String) get("errorCode");
    }

    public DraftOrderDiscountNotAppliedWarning setErrorCode(String arg) {
        optimisticData.put(getKey("errorCode"), arg);
        return this;
    }

    /**
    * The input field that the warning applies to.
    */

    public String getField() {
        return (String) get("field");
    }

    public DraftOrderDiscountNotAppliedWarning setField(String arg) {
        optimisticData.put(getKey("field"), arg);
        return this;
    }

    /**
    * The warning message.
    */

    public String getMessage() {
        return (String) get("message");
    }

    public DraftOrderDiscountNotAppliedWarning setMessage(String arg) {
        optimisticData.put(getKey("message"), arg);
        return this;
    }

    /**
    * The price rule that can't be applied.
    */

    public PriceRule getPriceRule() {
        return (PriceRule) get("priceRule");
    }

    public DraftOrderDiscountNotAppliedWarning setPriceRule(PriceRule arg) {
        optimisticData.put(getKey("priceRule"), arg);
        return this;
    }

    public boolean unwrapsToObject(String key) {
        switch (getFieldName(key)) {
            case "discountCode": return false;

            case "discountTitle": return false;

            case "errorCode": return false;

            case "field": return false;

            case "message": return false;

            case "priceRule": return true;

            default: return false;
        }
    }
}

