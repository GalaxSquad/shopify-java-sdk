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
* Return type for `draftOrderInvoicePreview` mutation.
*/
public class DraftOrderInvoicePreviewPayload extends AbstractResponse<DraftOrderInvoicePreviewPayload> {
    public DraftOrderInvoicePreviewPayload() {
    }

    public DraftOrderInvoicePreviewPayload(JsonObject fields) throws SchemaViolationError {
        for (Map.Entry<String, JsonElement> field : fields.entrySet()) {
            String key = field.getKey();
            String fieldName = getFieldName(key);
            switch (fieldName) {
                case "previewHtml": {
                    String optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = jsonAsString(field.getValue(), key);
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "previewSubject": {
                    String optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = jsonAsString(field.getValue(), key);
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "userErrors": {
                    List<UserError> list1 = new ArrayList<>();
                    for (JsonElement element1 : jsonAsArray(field.getValue(), key)) {
                        list1.add(new UserError(jsonAsObject(element1, key)));
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
        return "DraftOrderInvoicePreviewPayload";
    }

    /**
    * The draft order invoice email rendered as HTML to allow previewing.
    */

    public String getPreviewHtml() {
        return (String) get("previewHtml");
    }

    public DraftOrderInvoicePreviewPayload setPreviewHtml(String arg) {
        optimisticData.put(getKey("previewHtml"), arg);
        return this;
    }

    /**
    * The subject preview for the draft order invoice email.
    */

    public String getPreviewSubject() {
        return (String) get("previewSubject");
    }

    public DraftOrderInvoicePreviewPayload setPreviewSubject(String arg) {
        optimisticData.put(getKey("previewSubject"), arg);
        return this;
    }

    /**
    * The list of errors that occurred from executing the mutation.
    */

    public List<UserError> getUserErrors() {
        return (List<UserError>) get("userErrors");
    }

    public DraftOrderInvoicePreviewPayload setUserErrors(List<UserError> arg) {
        optimisticData.put(getKey("userErrors"), arg);
        return this;
    }

    public boolean unwrapsToObject(String key) {
        switch (getFieldName(key)) {
            case "previewHtml": return false;

            case "previewSubject": return false;

            case "userErrors": return true;

            default: return false;
        }
    }
}

