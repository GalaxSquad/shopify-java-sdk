// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.shopify.graphql.support.AbstractResponse;
import com.shopify.graphql.support.ID;
import com.shopify.graphql.support.SchemaViolationError;
import java.util.Map;

/**
* The properties and status of a bulk discount redeem code creation operation.
*/
public class DiscountRedeemCodeBulkCreation extends AbstractResponse<DiscountRedeemCodeBulkCreation> implements Node {
    public DiscountRedeemCodeBulkCreation() {
    }

    public DiscountRedeemCodeBulkCreation(JsonObject fields) throws SchemaViolationError {
        for (Map.Entry<String, JsonElement> field : fields.entrySet()) {
            String key = field.getKey();
            String fieldName = getFieldName(key);
            switch (fieldName) {
                case "codes": {
                    responseData.put(key, new DiscountRedeemCodeBulkCreationCodeConnection(jsonAsObject(field.getValue(), key)));

                    break;
                }

                case "codesCount": {
                    responseData.put(key, jsonAsInteger(field.getValue(), key));

                    break;
                }

                case "createdAt": {
                    responseData.put(key, jsonAsString(field.getValue(), key));

                    break;
                }

                case "discountCode": {
                    DiscountCodeNode optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new DiscountCodeNode(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "done": {
                    responseData.put(key, jsonAsBoolean(field.getValue(), key));

                    break;
                }

                case "failedCount": {
                    responseData.put(key, jsonAsInteger(field.getValue(), key));

                    break;
                }

                case "id": {
                    responseData.put(key, new ID(jsonAsString(field.getValue(), key)));

                    break;
                }

                case "importedCount": {
                    responseData.put(key, jsonAsInteger(field.getValue(), key));

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

    public DiscountRedeemCodeBulkCreation(ID id) {
        this();
        optimisticData.put("id", id);
    }

    public String getGraphQlTypeName() {
        return "DiscountRedeemCodeBulkCreation";
    }

    /**
    * The result of each code creation operation associated with the bulk creation operation including any
    * errors that might have occurred during the operation.
    */

    public DiscountRedeemCodeBulkCreationCodeConnection getCodes() {
        return (DiscountRedeemCodeBulkCreationCodeConnection) get("codes");
    }

    public DiscountRedeemCodeBulkCreation setCodes(DiscountRedeemCodeBulkCreationCodeConnection arg) {
        optimisticData.put(getKey("codes"), arg);
        return this;
    }

    /**
    * The number of codes to create.
    */

    public Integer getCodesCount() {
        return (Integer) get("codesCount");
    }

    public DiscountRedeemCodeBulkCreation setCodesCount(Integer arg) {
        optimisticData.put(getKey("codesCount"), arg);
        return this;
    }

    /**
    * The date and time when the bulk creation was created.
    */

    public String getCreatedAt() {
        return (String) get("createdAt");
    }

    public DiscountRedeemCodeBulkCreation setCreatedAt(String arg) {
        optimisticData.put(getKey("createdAt"), arg);
        return this;
    }

    /**
    * The code discount associated with the created codes.
    */

    public DiscountCodeNode getDiscountCode() {
        return (DiscountCodeNode) get("discountCode");
    }

    public DiscountRedeemCodeBulkCreation setDiscountCode(DiscountCodeNode arg) {
        optimisticData.put(getKey("discountCode"), arg);
        return this;
    }

    /**
    * Whether the bulk creation is still queued (`false`) or has been run (`true`).
    */

    public Boolean getDone() {
        return (Boolean) get("done");
    }

    public DiscountRedeemCodeBulkCreation setDone(Boolean arg) {
        optimisticData.put(getKey("done"), arg);
        return this;
    }

    /**
    * The number of codes that weren't created successfully.
    */

    public Integer getFailedCount() {
        return (Integer) get("failedCount");
    }

    public DiscountRedeemCodeBulkCreation setFailedCount(Integer arg) {
        optimisticData.put(getKey("failedCount"), arg);
        return this;
    }

    /**
    * A globally-unique ID.
    */

    public ID getId() {
        return (ID) get("id");
    }

    /**
    * The number of codes created successfully.
    */

    public Integer getImportedCount() {
        return (Integer) get("importedCount");
    }

    public DiscountRedeemCodeBulkCreation setImportedCount(Integer arg) {
        optimisticData.put(getKey("importedCount"), arg);
        return this;
    }

    public boolean unwrapsToObject(String key) {
        switch (getFieldName(key)) {
            case "codes": return true;

            case "codesCount": return false;

            case "createdAt": return false;

            case "discountCode": return true;

            case "done": return false;

            case "failedCount": return false;

            case "id": return false;

            case "importedCount": return false;

            default: return false;
        }
    }
}

