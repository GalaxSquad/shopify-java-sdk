// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.shopify.graphql.support.AbstractResponse;
import com.shopify.graphql.support.Arguments;
import com.shopify.graphql.support.Error;
import com.shopify.graphql.support.Query;
import com.shopify.graphql.support.SchemaViolationError;
import com.shopify.graphql.support.TopLevelResponse;
import com.shopify.graphql.support.Input;

import com.shopify.graphql.support.ID;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
* A request to import a
* [`URLRedirect`](https://shopify.dev/api/admin-graphql/latest/objects/UrlRedirect) object
* into the Online Store channel. Apps can use this to query the state of an `UrlRedirectImport`
* request.
* For more information, see
* [`url-redirect`](https://help.shopify.com/en/manual/online-store/menus-and-links/url-redirect)s.
*/
public class UrlRedirectImport extends AbstractResponse<UrlRedirectImport> implements Node {
    public UrlRedirectImport() {
    }

    public UrlRedirectImport(JsonObject fields) throws SchemaViolationError {
        for (Map.Entry<String, JsonElement> field : fields.entrySet()) {
            String key = field.getKey();
            String fieldName = getFieldName(key);
            switch (fieldName) {
                case "count": {
                    Integer optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = jsonAsInteger(field.getValue(), key);
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "createdCount": {
                    Integer optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = jsonAsInteger(field.getValue(), key);
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "failedCount": {
                    Integer optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = jsonAsInteger(field.getValue(), key);
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "finished": {
                    responseData.put(key, jsonAsBoolean(field.getValue(), key));

                    break;
                }

                case "finishedAt": {
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

                case "previewRedirects": {
                    List<UrlRedirectImportPreview> list1 = new ArrayList<>();
                    for (JsonElement element1 : jsonAsArray(field.getValue(), key)) {
                        list1.add(new UrlRedirectImportPreview(jsonAsObject(element1, key)));
                    }

                    responseData.put(key, list1);

                    break;
                }

                case "updatedCount": {
                    Integer optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = jsonAsInteger(field.getValue(), key);
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

    public UrlRedirectImport(ID id) {
        this();
        optimisticData.put("id", id);
    }

    public String getGraphQlTypeName() {
        return "UrlRedirectImport";
    }

    /**
    * The number of rows in the file.
    */

    public Integer getCount() {
        return (Integer) get("count");
    }

    public UrlRedirectImport setCount(Integer arg) {
        optimisticData.put(getKey("count"), arg);
        return this;
    }

    /**
    * The number of redirects created from the import.
    */

    public Integer getCreatedCount() {
        return (Integer) get("createdCount");
    }

    public UrlRedirectImport setCreatedCount(Integer arg) {
        optimisticData.put(getKey("createdCount"), arg);
        return this;
    }

    /**
    * The number of redirects that failed to be imported.
    */

    public Integer getFailedCount() {
        return (Integer) get("failedCount");
    }

    public UrlRedirectImport setFailedCount(Integer arg) {
        optimisticData.put(getKey("failedCount"), arg);
        return this;
    }

    /**
    * Whether the import is finished.
    */

    public Boolean getFinished() {
        return (Boolean) get("finished");
    }

    public UrlRedirectImport setFinished(Boolean arg) {
        optimisticData.put(getKey("finished"), arg);
        return this;
    }

    /**
    * The date and time when the import finished.
    */

    public String getFinishedAt() {
        return (String) get("finishedAt");
    }

    public UrlRedirectImport setFinishedAt(String arg) {
        optimisticData.put(getKey("finishedAt"), arg);
        return this;
    }

    /**
    * The ID of the `UrlRedirectImport` object.
    */

    public ID getId() {
        return (ID) get("id");
    }

    /**
    * A list of up to three previews of the URL redirects to be imported.
    */

    public List<UrlRedirectImportPreview> getPreviewRedirects() {
        return (List<UrlRedirectImportPreview>) get("previewRedirects");
    }

    public UrlRedirectImport setPreviewRedirects(List<UrlRedirectImportPreview> arg) {
        optimisticData.put(getKey("previewRedirects"), arg);
        return this;
    }

    /**
    * The number of redirects updated during the import.
    */

    public Integer getUpdatedCount() {
        return (Integer) get("updatedCount");
    }

    public UrlRedirectImport setUpdatedCount(Integer arg) {
        optimisticData.put(getKey("updatedCount"), arg);
        return this;
    }

    public boolean unwrapsToObject(String key) {
        switch (getFieldName(key)) {
            case "count": return false;

            case "createdCount": return false;

            case "failedCount": return false;

            case "finished": return false;

            case "finishedAt": return false;

            case "id": return false;

            case "previewRedirects": return true;

            case "updatedCount": return false;

            default: return false;
        }
    }
}

