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

import java.util.Map;

/**
* A shareable URL for a discount code.
*/
public class DiscountShareableUrl extends AbstractResponse<DiscountShareableUrl> {
    public DiscountShareableUrl() {
    }

    public DiscountShareableUrl(JsonObject fields) throws SchemaViolationError {
        for (Map.Entry<String, JsonElement> field : fields.entrySet()) {
            String key = field.getKey();
            String fieldName = getFieldName(key);
            switch (fieldName) {
                case "targetItemImage": {
                    Image optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new Image(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "targetType": {
                    responseData.put(key, DiscountShareableUrlTargetType.fromGraphQl(jsonAsString(field.getValue(), key)));

                    break;
                }

                case "title": {
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
        return "DiscountShareableUrl";
    }

    /**
    * The image URL of the item (product or collection) to which the discount applies.
    */

    public Image getTargetItemImage() {
        return (Image) get("targetItemImage");
    }

    public DiscountShareableUrl setTargetItemImage(Image arg) {
        optimisticData.put(getKey("targetItemImage"), arg);
        return this;
    }

    /**
    * The type of page that's associated with the URL.
    */

    public DiscountShareableUrlTargetType getTargetType() {
        return (DiscountShareableUrlTargetType) get("targetType");
    }

    public DiscountShareableUrl setTargetType(DiscountShareableUrlTargetType arg) {
        optimisticData.put(getKey("targetType"), arg);
        return this;
    }

    /**
    * The title of the page that's associated with the URL.
    */

    public String getTitle() {
        return (String) get("title");
    }

    public DiscountShareableUrl setTitle(String arg) {
        optimisticData.put(getKey("title"), arg);
        return this;
    }

    /**
    * The URL for the discount code.
    */

    public String getUrl() {
        return (String) get("url");
    }

    public DiscountShareableUrl setUrl(String arg) {
        optimisticData.put(getKey("url"), arg);
        return this;
    }

    public boolean unwrapsToObject(String key) {
        switch (getFieldName(key)) {
            case "targetItemImage": return true;

            case "targetType": return false;

            case "title": return false;

            case "url": return false;

            default: return false;
        }
    }
}

