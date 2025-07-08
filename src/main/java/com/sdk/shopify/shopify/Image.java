// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.shopify.graphql.support.AbstractResponse;
import com.shopify.graphql.support.ID;
import com.shopify.graphql.support.SchemaViolationError;
import java.util.Map;

/**
* Represents an image resource.
*/
public class Image extends AbstractResponse<Image> implements HasMetafields {
    public Image() {
    }

    public Image(JsonObject fields) throws SchemaViolationError {
        for (Map.Entry<String, JsonElement> field : fields.entrySet()) {
            String key = field.getKey();
            String fieldName = getFieldName(key);
            switch (fieldName) {
                case "altText": {
                    String optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = jsonAsString(field.getValue(), key);
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "height": {
                    Integer optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = jsonAsInteger(field.getValue(), key);
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "id": {
                    ID optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new ID(jsonAsString(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "metafield": {
                    Metafield optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new Metafield(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "metafields": {
                    responseData.put(key, new MetafieldConnection(jsonAsObject(field.getValue(), key)));

                    break;
                }

                case "thumbhash": {
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

                case "width": {
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

    public String getGraphQlTypeName() {
        return "Image";
    }

    /**
    * A word or phrase to share the nature or contents of an image.
    */

    public String getAltText() {
        return (String) get("altText");
    }

    public Image setAltText(String arg) {
        optimisticData.put(getKey("altText"), arg);
        return this;
    }

    /**
    * The original height of the image in pixels. Returns `null` if the image isn't hosted by Shopify.
    */

    public Integer getHeight() {
        return (Integer) get("height");
    }

    public Image setHeight(Integer arg) {
        optimisticData.put(getKey("height"), arg);
        return this;
    }

    /**
    * A unique ID for the image.
    */

    public ID getId() {
        return (ID) get("id");
    }

    public Image setId(ID arg) {
        optimisticData.put(getKey("id"), arg);
        return this;
    }

    /**
    * A [custom field](https://shopify.dev/docs/apps/build/custom-data),
    * including its `namespace` and `key`, that's associated with a Shopify resource
    * for the purposes of adding and storing additional information.
    */

    public Metafield getMetafield() {
        return (Metafield) get("metafield");
    }

    public Image setMetafield(Metafield arg) {
        optimisticData.put(getKey("metafield"), arg);
        return this;
    }

    /**
    * A list of [custom fields](https://shopify.dev/docs/apps/build/custom-data)
    * that a merchant associates with a Shopify resource.
    */

    public MetafieldConnection getMetafields() {
        return (MetafieldConnection) get("metafields");
    }

    public Image setMetafields(MetafieldConnection arg) {
        optimisticData.put(getKey("metafields"), arg);
        return this;
    }

    /**
    * The ThumbHash of the image.
    * Useful to display placeholder images while the original image is loading.
    */

    public String getThumbhash() {
        return (String) get("thumbhash");
    }

    public Image setThumbhash(String arg) {
        optimisticData.put(getKey("thumbhash"), arg);
        return this;
    }

    /**
    * The location of the image as a URL.
    * If no transform options are specified, then the original image will be preserved including any
    * pre-applied transforms.
    * All transformation options are considered "best-effort". Any transformation that the original image
    * type doesn't support will be ignored.
    * If you need multiple variations of the same image, then you can use [GraphQL
    * aliases](https://graphql.org/learn/queries/#aliases).
    */

    public String getUrl() {
        return (String) get("url");
    }

    public Image setUrl(String arg) {
        optimisticData.put(getKey("url"), arg);
        return this;
    }

    /**
    * The original width of the image in pixels. Returns `null` if the image isn't hosted by Shopify.
    */

    public Integer getWidth() {
        return (Integer) get("width");
    }

    public Image setWidth(Integer arg) {
        optimisticData.put(getKey("width"), arg);
        return this;
    }

    public boolean unwrapsToObject(String key) {
        switch (getFieldName(key)) {
            case "altText": return false;

            case "height": return false;

            case "id": return false;

            case "metafield": return true;

            case "metafields": return true;

            case "thumbhash": return false;

            case "url": return false;

            case "width": return false;

            default: return false;
        }
    }
}

