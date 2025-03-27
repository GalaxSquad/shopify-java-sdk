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
* Represents the channels where a product is published.
*/
public class ProductPublication extends AbstractResponse<ProductPublication> {
    public ProductPublication() {
    }

    public ProductPublication(JsonObject fields) throws SchemaViolationError {
        for (Map.Entry<String, JsonElement> field : fields.entrySet()) {
            String key = field.getKey();
            String fieldName = getFieldName(key);
            switch (fieldName) {
                case "channel": {
                    responseData.put(key, new Channel(jsonAsObject(field.getValue(), key)));

                    break;
                }

                case "isPublished": {
                    responseData.put(key, jsonAsBoolean(field.getValue(), key));

                    break;
                }

                case "product": {
                    responseData.put(key, new Product(jsonAsObject(field.getValue(), key)));

                    break;
                }

                case "publishDate": {
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
        return "ProductPublication";
    }

    /**
    * The channel where the product was or is published.
    */

    public Channel getChannel() {
        return (Channel) get("channel");
    }

    public ProductPublication setChannel(Channel arg) {
        optimisticData.put(getKey("channel"), arg);
        return this;
    }

    /**
    * Whether the publication is published or not.
    */

    public Boolean getIsPublished() {
        return (Boolean) get("isPublished");
    }

    public ProductPublication setIsPublished(Boolean arg) {
        optimisticData.put(getKey("isPublished"), arg);
        return this;
    }

    /**
    * The product that was or is going to be published on the channel.
    */

    public Product getProduct() {
        return (Product) get("product");
    }

    public ProductPublication setProduct(Product arg) {
        optimisticData.put(getKey("product"), arg);
        return this;
    }

    /**
    * The date that the product was or is going to be published on the channel.
    */

    public String getPublishDate() {
        return (String) get("publishDate");
    }

    public ProductPublication setPublishDate(String arg) {
        optimisticData.put(getKey("publishDate"), arg);
        return this;
    }

    public boolean unwrapsToObject(String key) {
        switch (getFieldName(key)) {
            case "channel": return true;

            case "isPublished": return false;

            case "product": return true;

            case "publishDate": return false;

            default: return false;
        }
    }
}

