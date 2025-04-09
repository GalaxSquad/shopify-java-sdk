// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.shopify.graphql.support.AbstractResponse;
import com.shopify.graphql.support.SchemaViolationError;
import java.util.Map;

/**
* Provides attributes for visual representation.
*/
public class MetaobjectThumbnail extends AbstractResponse<MetaobjectThumbnail> {
    public MetaobjectThumbnail() {
    }

    public MetaobjectThumbnail(JsonObject fields) throws SchemaViolationError {
        for (Map.Entry<String, JsonElement> field : fields.entrySet()) {
            String key = field.getKey();
            String fieldName = getFieldName(key);
            switch (fieldName) {
                case "file": {
                    File optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = UnknownFile.create(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "hex": {
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
        return "MetaobjectThumbnail";
    }

    /**
    * The file to be used for visual representation of this metaobject.
    */

    public File getFile() {
        return (File) get("file");
    }

    public MetaobjectThumbnail setFile(File arg) {
        optimisticData.put(getKey("file"), arg);
        return this;
    }

    /**
    * The hexadecimal color code to be used for respresenting this metaobject.
    */

    public String getHex() {
        return (String) get("hex");
    }

    public MetaobjectThumbnail setHex(String arg) {
        optimisticData.put(getKey("hex"), arg);
        return this;
    }

    public boolean unwrapsToObject(String key) {
        switch (getFieldName(key)) {
            case "file": return false;

            case "hex": return false;

            default: return false;
        }
    }
}

