// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.shopify.graphql.support.AbstractResponse;
import com.shopify.graphql.support.ID;
import com.shopify.graphql.support.SchemaViolationError;
import java.util.Map;

/**
* An unverified return line item.
*/
public class UnverifiedReturnLineItem extends AbstractResponse<UnverifiedReturnLineItem> implements Node, ReturnLineItemType {
    public UnverifiedReturnLineItem() {
    }

    public UnverifiedReturnLineItem(JsonObject fields) throws SchemaViolationError {
        for (Map.Entry<String, JsonElement> field : fields.entrySet()) {
            String key = field.getKey();
            String fieldName = getFieldName(key);
            switch (fieldName) {
                case "customerNote": {
                    String optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = jsonAsString(field.getValue(), key);
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "id": {
                    responseData.put(key, new ID(jsonAsString(field.getValue(), key)));

                    break;
                }

                case "quantity": {
                    responseData.put(key, jsonAsInteger(field.getValue(), key));

                    break;
                }

                case "refundableQuantity": {
                    responseData.put(key, jsonAsInteger(field.getValue(), key));

                    break;
                }

                case "refundedQuantity": {
                    responseData.put(key, jsonAsInteger(field.getValue(), key));

                    break;
                }

                case "returnReason": {
                    responseData.put(key, ReturnReason.fromGraphQl(jsonAsString(field.getValue(), key)));

                    break;
                }

                case "returnReasonNote": {
                    responseData.put(key, jsonAsString(field.getValue(), key));

                    break;
                }

                case "unitPrice": {
                    responseData.put(key, new MoneyV2(jsonAsObject(field.getValue(), key)));

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

    public UnverifiedReturnLineItem(ID id) {
        this();
        optimisticData.put("id", id);
    }

    public String getGraphQlTypeName() {
        return "UnverifiedReturnLineItem";
    }

    /**
    * A note from the customer that describes the item to be returned. Maximum length: 300 characters.
    */

    public String getCustomerNote() {
        return (String) get("customerNote");
    }

    public UnverifiedReturnLineItem setCustomerNote(String arg) {
        optimisticData.put(getKey("customerNote"), arg);
        return this;
    }

    /**
    * A globally-unique ID.
    */

    public ID getId() {
        return (ID) get("id");
    }

    /**
    * The quantity being returned.
    */

    public Integer getQuantity() {
        return (Integer) get("quantity");
    }

    public UnverifiedReturnLineItem setQuantity(Integer arg) {
        optimisticData.put(getKey("quantity"), arg);
        return this;
    }

    /**
    * The quantity that can be refunded.
    */

    public Integer getRefundableQuantity() {
        return (Integer) get("refundableQuantity");
    }

    public UnverifiedReturnLineItem setRefundableQuantity(Integer arg) {
        optimisticData.put(getKey("refundableQuantity"), arg);
        return this;
    }

    /**
    * The quantity that was refunded.
    */

    public Integer getRefundedQuantity() {
        return (Integer) get("refundedQuantity");
    }

    public UnverifiedReturnLineItem setRefundedQuantity(Integer arg) {
        optimisticData.put(getKey("refundedQuantity"), arg);
        return this;
    }

    /**
    * The reason for returning the item.
    */

    public ReturnReason getReturnReason() {
        return (ReturnReason) get("returnReason");
    }

    public UnverifiedReturnLineItem setReturnReason(ReturnReason arg) {
        optimisticData.put(getKey("returnReason"), arg);
        return this;
    }

    /**
    * Additional information about the reason for the return. Maximum length: 255 characters.
    */

    public String getReturnReasonNote() {
        return (String) get("returnReasonNote");
    }

    public UnverifiedReturnLineItem setReturnReasonNote(String arg) {
        optimisticData.put(getKey("returnReasonNote"), arg);
        return this;
    }

    /**
    * The unit price of the unverified return line item.
    */

    public MoneyV2 getUnitPrice() {
        return (MoneyV2) get("unitPrice");
    }

    public UnverifiedReturnLineItem setUnitPrice(MoneyV2 arg) {
        optimisticData.put(getKey("unitPrice"), arg);
        return this;
    }

    public boolean unwrapsToObject(String key) {
        switch (getFieldName(key)) {
            case "customerNote": return false;

            case "id": return false;

            case "quantity": return false;

            case "refundableQuantity": return false;

            case "refundedQuantity": return false;

            case "returnReason": return false;

            case "returnReasonNote": return false;

            case "unitPrice": return true;

            default: return false;
        }
    }
}

