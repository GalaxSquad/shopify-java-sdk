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
* A result of a discount redeem code creation operation created by a bulk creation.
*/
public class DiscountRedeemCodeBulkCreationCode extends AbstractResponse<DiscountRedeemCodeBulkCreationCode> {
    public DiscountRedeemCodeBulkCreationCode() {
    }

    public DiscountRedeemCodeBulkCreationCode(JsonObject fields) throws SchemaViolationError {
        for (Map.Entry<String, JsonElement> field : fields.entrySet()) {
            String key = field.getKey();
            String fieldName = getFieldName(key);
            switch (fieldName) {
                case "code": {
                    responseData.put(key, jsonAsString(field.getValue(), key));

                    break;
                }

                case "discountRedeemCode": {
                    DiscountRedeemCode optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new DiscountRedeemCode(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "errors": {
                    List<DiscountUserError> list1 = new ArrayList<>();
                    for (JsonElement element1 : jsonAsArray(field.getValue(), key)) {
                        list1.add(new DiscountUserError(jsonAsObject(element1, key)));
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
        return "DiscountRedeemCodeBulkCreationCode";
    }

    /**
    * The code to use in the discount redeem code creation operation.
    */

    public String getCode() {
        return (String) get("code");
    }

    public DiscountRedeemCodeBulkCreationCode setCode(String arg) {
        optimisticData.put(getKey("code"), arg);
        return this;
    }

    /**
    * The successfully created discount redeem code.
    * If the discount redeem code couldn't be created, then this field is `null``.
    */

    public DiscountRedeemCode getDiscountRedeemCode() {
        return (DiscountRedeemCode) get("discountRedeemCode");
    }

    public DiscountRedeemCodeBulkCreationCode setDiscountRedeemCode(DiscountRedeemCode arg) {
        optimisticData.put(getKey("discountRedeemCode"), arg);
        return this;
    }

    /**
    * A list of errors that occurred during the creation operation of the discount redeem code.
    */

    public List<DiscountUserError> getErrors() {
        return (List<DiscountUserError>) get("errors");
    }

    public DiscountRedeemCodeBulkCreationCode setErrors(List<DiscountUserError> arg) {
        optimisticData.put(getKey("errors"), arg);
        return this;
    }

    public boolean unwrapsToObject(String key) {
        switch (getFieldName(key)) {
            case "code": return false;

            case "discountRedeemCode": return true;

            case "errors": return true;

            default: return false;
        }
    }
}

