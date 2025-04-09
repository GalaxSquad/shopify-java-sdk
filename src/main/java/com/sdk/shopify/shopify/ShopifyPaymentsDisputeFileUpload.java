// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.shopify.graphql.support.AbstractResponse;
import com.shopify.graphql.support.ID;
import com.shopify.graphql.support.SchemaViolationError;
import java.util.Map;

/**
* The file upload associated with the dispute evidence.
*/
public class ShopifyPaymentsDisputeFileUpload extends AbstractResponse<ShopifyPaymentsDisputeFileUpload> implements Node {
    public ShopifyPaymentsDisputeFileUpload() {
    }

    public ShopifyPaymentsDisputeFileUpload(JsonObject fields) throws SchemaViolationError {
        for (Map.Entry<String, JsonElement> field : fields.entrySet()) {
            String key = field.getKey();
            String fieldName = getFieldName(key);
            switch (fieldName) {
                case "disputeEvidenceType": {
                    ShopifyPaymentsDisputeEvidenceFileType optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = ShopifyPaymentsDisputeEvidenceFileType.fromGraphQl(jsonAsString(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "fileSize": {
                    responseData.put(key, jsonAsInteger(field.getValue(), key));

                    break;
                }

                case "fileType": {
                    responseData.put(key, jsonAsString(field.getValue(), key));

                    break;
                }

                case "id": {
                    responseData.put(key, new ID(jsonAsString(field.getValue(), key)));

                    break;
                }

                case "originalFileName": {
                    String optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = jsonAsString(field.getValue(), key);
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "url": {
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

    public ShopifyPaymentsDisputeFileUpload(ID id) {
        this();
        optimisticData.put("id", id);
    }

    public String getGraphQlTypeName() {
        return "ShopifyPaymentsDisputeFileUpload";
    }

    /**
    * The type of the file for the dispute evidence.
    */

    public ShopifyPaymentsDisputeEvidenceFileType getDisputeEvidenceType() {
        return (ShopifyPaymentsDisputeEvidenceFileType) get("disputeEvidenceType");
    }

    public ShopifyPaymentsDisputeFileUpload setDisputeEvidenceType(ShopifyPaymentsDisputeEvidenceFileType arg) {
        optimisticData.put(getKey("disputeEvidenceType"), arg);
        return this;
    }

    /**
    * The file size.
    */

    public Integer getFileSize() {
        return (Integer) get("fileSize");
    }

    public ShopifyPaymentsDisputeFileUpload setFileSize(Integer arg) {
        optimisticData.put(getKey("fileSize"), arg);
        return this;
    }

    /**
    * The file type.
    */

    public String getFileType() {
        return (String) get("fileType");
    }

    public ShopifyPaymentsDisputeFileUpload setFileType(String arg) {
        optimisticData.put(getKey("fileType"), arg);
        return this;
    }

    /**
    * A globally-unique ID.
    */

    public ID getId() {
        return (ID) get("id");
    }

    /**
    * The original file name.
    */

    public String getOriginalFileName() {
        return (String) get("originalFileName");
    }

    public ShopifyPaymentsDisputeFileUpload setOriginalFileName(String arg) {
        optimisticData.put(getKey("originalFileName"), arg);
        return this;
    }

    /**
    * The URL for accessing the file.
    */

    public String getUrl() {
        return (String) get("url");
    }

    public ShopifyPaymentsDisputeFileUpload setUrl(String arg) {
        optimisticData.put(getKey("url"), arg);
        return this;
    }

    public boolean unwrapsToObject(String key) {
        switch (getFieldName(key)) {
            case "disputeEvidenceType": return false;

            case "fileSize": return false;

            case "fileType": return false;

            case "id": return false;

            case "originalFileName": return false;

            case "url": return false;

            default: return false;
        }
    }
}

