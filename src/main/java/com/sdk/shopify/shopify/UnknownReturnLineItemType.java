// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.shopify.graphql.support.AbstractResponse;
import com.shopify.graphql.support.ID;
import com.shopify.graphql.support.SchemaViolationError;
import java.util.Map;

/**
* A return line item of any type.
*/
public class UnknownReturnLineItemType extends AbstractResponse<UnknownReturnLineItemType> implements ReturnLineItemType {
    public UnknownReturnLineItemType() {
    }

    public UnknownReturnLineItemType(JsonObject fields) throws SchemaViolationError {
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

    public static ReturnLineItemType create(JsonObject fields) throws SchemaViolationError {
        String typeName = fields.getAsJsonPrimitive("__typename").getAsString();
        switch (typeName) {
            case "ReturnLineItem": {
                return new ReturnLineItem(fields);
            }

            case "UnverifiedReturnLineItem": {
                return new UnverifiedReturnLineItem(fields);
            }

            default: {
                return new UnknownReturnLineItemType(fields);
            }
        }
    }

    public String getGraphQlTypeName() {
        return (String) get("__typename");
    }

    /**
    * A note from the customer that describes the item to be returned. Maximum length: 300 characters.
    */

    public String getCustomerNote() {
        return (String) get("customerNote");
    }

    public UnknownReturnLineItemType setCustomerNote(String arg) {
        optimisticData.put(getKey("customerNote"), arg);
        return this;
    }

    /**
    * A globally-unique ID.
    */

    public ID getId() {
        return (ID) get("id");
    }

    public UnknownReturnLineItemType setId(ID arg) {
        optimisticData.put(getKey("id"), arg);
        return this;
    }

    /**
    * The quantity being returned.
    */

    public Integer getQuantity() {
        return (Integer) get("quantity");
    }

    public UnknownReturnLineItemType setQuantity(Integer arg) {
        optimisticData.put(getKey("quantity"), arg);
        return this;
    }

    /**
    * The quantity that can be refunded.
    */

    public Integer getRefundableQuantity() {
        return (Integer) get("refundableQuantity");
    }

    public UnknownReturnLineItemType setRefundableQuantity(Integer arg) {
        optimisticData.put(getKey("refundableQuantity"), arg);
        return this;
    }

    /**
    * The quantity that was refunded.
    */

    public Integer getRefundedQuantity() {
        return (Integer) get("refundedQuantity");
    }

    public UnknownReturnLineItemType setRefundedQuantity(Integer arg) {
        optimisticData.put(getKey("refundedQuantity"), arg);
        return this;
    }

    /**
    * The reason for returning the item.
    */

    public ReturnReason getReturnReason() {
        return (ReturnReason) get("returnReason");
    }

    public UnknownReturnLineItemType setReturnReason(ReturnReason arg) {
        optimisticData.put(getKey("returnReason"), arg);
        return this;
    }

    /**
    * Additional information about the reason for the return. Maximum length: 255 characters.
    */

    public String getReturnReasonNote() {
        return (String) get("returnReasonNote");
    }

    public UnknownReturnLineItemType setReturnReasonNote(String arg) {
        optimisticData.put(getKey("returnReasonNote"), arg);
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

            default: return false;
        }
    }
}

