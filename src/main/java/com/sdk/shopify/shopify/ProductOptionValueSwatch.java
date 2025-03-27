// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.shopify.graphql.support.AbstractResponse;
import com.shopify.graphql.support.SchemaViolationError;
import java.util.Map;

/**
* A swatch associated with a product option value.
*/
public class ProductOptionValueSwatch extends AbstractResponse<ProductOptionValueSwatch> {
    public ProductOptionValueSwatch() {
    }

    public ProductOptionValueSwatch(JsonObject fields) throws SchemaViolationError {
        for (Map.Entry<String, JsonElement> field : fields.entrySet()) {
            String key = field.getKey();
            String fieldName = getFieldName(key);
            switch (fieldName) {
                case "color": {
                    String optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = jsonAsString(field.getValue(), key);
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "image": {
                    MediaImage optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new MediaImage(jsonAsObject(field.getValue(), key));
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
        return "ProductOptionValueSwatch";
    }

    /**
    * The color representation of the swatch.
    */

    public String getColor() {
        return (String) get("color");
    }

    public ProductOptionValueSwatch setColor(String arg) {
        optimisticData.put(getKey("color"), arg);
        return this;
    }

    /**
    * An image representation of the swatch.
    */

    public MediaImage getImage() {
        return (MediaImage) get("image");
    }

    public ProductOptionValueSwatch setImage(MediaImage arg) {
        optimisticData.put(getKey("image"), arg);
        return this;
    }

    public boolean unwrapsToObject(String key) {
        switch (getFieldName(key)) {
            case "color": return false;

            case "image": return true;

            default: return false;
        }
    }
}

