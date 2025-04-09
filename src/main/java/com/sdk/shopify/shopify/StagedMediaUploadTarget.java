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
* Information about a staged upload target, which should be used to send a request to upload
* the file.
* For more information on the upload process, refer to
* [Upload media to
* Shopify](https://shopify.dev/apps/online-store/media/products#step-1-upload-media-to-shopify).
*/
public class StagedMediaUploadTarget extends AbstractResponse<StagedMediaUploadTarget> {
    public StagedMediaUploadTarget() {
    }

    public StagedMediaUploadTarget(JsonObject fields) throws SchemaViolationError {
        for (Map.Entry<String, JsonElement> field : fields.entrySet()) {
            String key = field.getKey();
            String fieldName = getFieldName(key);
            switch (fieldName) {
                case "parameters": {
                    List<StagedUploadParameter> list1 = new ArrayList<>();
                    for (JsonElement element1 : jsonAsArray(field.getValue(), key)) {
                        list1.add(new StagedUploadParameter(jsonAsObject(element1, key)));
                    }

                    responseData.put(key, list1);

                    break;
                }

                case "resourceUrl": {
                    String optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = jsonAsString(field.getValue(), key);
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "url": {
                    String optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = jsonAsString(field.getValue(), key);
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
        return "StagedMediaUploadTarget";
    }

    /**
    * Parameters needed to authenticate a request to upload the file.
    */

    public List<StagedUploadParameter> getParameters() {
        return (List<StagedUploadParameter>) get("parameters");
    }

    public StagedMediaUploadTarget setParameters(List<StagedUploadParameter> arg) {
        optimisticData.put(getKey("parameters"), arg);
        return this;
    }

    /**
    * The URL to be passed as `originalSource` in
    * [CreateMediaInput](https://shopify.dev/api/admin-graphql/latest/input-objects/CreateMediaInput)
    * and [FileCreateInput](https://shopify.dev/api/admin-graphql/2022-04/input-objects/FileCreateInput)
    * for the
    * [productCreateMedia](https://shopify.dev/api/admin-graphql/2022-04/mutations/productCreateMedia)
    * and [fileCreate](https://shopify.dev/api/admin-graphql/2022-04/mutations/fileCreate)
    * mutations.
    */

    public String getResourceUrl() {
        return (String) get("resourceUrl");
    }

    public StagedMediaUploadTarget setResourceUrl(String arg) {
        optimisticData.put(getKey("resourceUrl"), arg);
        return this;
    }

    /**
    * The URL to use when sending an request to upload the file. Should be used in conjunction with
    * the parameters field.
    */

    public String getUrl() {
        return (String) get("url");
    }

    public StagedMediaUploadTarget setUrl(String arg) {
        optimisticData.put(getKey("url"), arg);
        return this;
    }

    public boolean unwrapsToObject(String key) {
        switch (getFieldName(key)) {
            case "parameters": return true;

            case "resourceUrl": return false;

            case "url": return false;

            default: return false;
        }
    }
}

