// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.shopify.graphql.support.AbstractResponse;
import com.shopify.graphql.support.SchemaViolationError;
import java.util.Map;

/**
* A source for a Shopify-hosted 3d model.
* Types of sources include GLB and USDZ formatted 3d models, where the former
* is an original 3d model and the latter has been converted from the original.
* If the original source is in GLB format and over 15 MBs in size, then both the
* original and the USDZ formatted source are optimized to reduce the file size.
*/
public class Model3dSource extends AbstractResponse<Model3dSource> {
    public Model3dSource() {
    }

    public Model3dSource(JsonObject fields) throws SchemaViolationError {
        for (Map.Entry<String, JsonElement> field : fields.entrySet()) {
            String key = field.getKey();
            String fieldName = getFieldName(key);
            switch (fieldName) {
                case "filesize": {
                    responseData.put(key, jsonAsInteger(field.getValue(), key));

                    break;
                }

                case "format": {
                    responseData.put(key, jsonAsString(field.getValue(), key));

                    break;
                }

                case "mimeType": {
                    responseData.put(key, jsonAsString(field.getValue(), key));

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

    public String getGraphQlTypeName() {
        return "Model3dSource";
    }

    /**
    * The 3d model source's filesize.
    */

    public Integer getFilesize() {
        return (Integer) get("filesize");
    }

    public Model3dSource setFilesize(Integer arg) {
        optimisticData.put(getKey("filesize"), arg);
        return this;
    }

    /**
    * The 3d model source's format.
    */

    public String getFormat() {
        return (String) get("format");
    }

    public Model3dSource setFormat(String arg) {
        optimisticData.put(getKey("format"), arg);
        return this;
    }

    /**
    * The 3d model source's MIME type.
    */

    public String getMimeType() {
        return (String) get("mimeType");
    }

    public Model3dSource setMimeType(String arg) {
        optimisticData.put(getKey("mimeType"), arg);
        return this;
    }

    /**
    * The 3d model source's URL.
    */

    public String getUrl() {
        return (String) get("url");
    }

    public Model3dSource setUrl(String arg) {
        optimisticData.put(getKey("url"), arg);
        return this;
    }

    public boolean unwrapsToObject(String key) {
        switch (getFieldName(key)) {
            case "filesize": return false;

            case "format": return false;

            case "mimeType": return false;

            case "url": return false;

            default: return false;
        }
    }
}

