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
* A product feed.
*/
public class ProductFeed extends AbstractResponse<ProductFeed> implements Node {
    public ProductFeed() {
    }

    public ProductFeed(JsonObject fields) throws SchemaViolationError {
        for (Map.Entry<String, JsonElement> field : fields.entrySet()) {
            String key = field.getKey();
            String fieldName = getFieldName(key);
            switch (fieldName) {
                case "country": {
                    CountryCode optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = CountryCode.fromGraphQl(jsonAsString(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "id": {
                    responseData.put(key, new ID(jsonAsString(field.getValue(), key)));

                    break;
                }

                case "language": {
                    LanguageCode optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = LanguageCode.fromGraphQl(jsonAsString(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "status": {
                    responseData.put(key, ProductFeedStatus.fromGraphQl(jsonAsString(field.getValue(), key)));

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

    public ProductFeed(ID id) {
        this();
        optimisticData.put("id", id);
    }

    public String getGraphQlTypeName() {
        return "ProductFeed";
    }

    /**
    * The country of the product feed.
    */

    public CountryCode getCountry() {
        return (CountryCode) get("country");
    }

    public ProductFeed setCountry(CountryCode arg) {
        optimisticData.put(getKey("country"), arg);
        return this;
    }

    /**
    * A globally-unique ID.
    */

    public ID getId() {
        return (ID) get("id");
    }

    /**
    * The language of the product feed.
    */

    public LanguageCode getLanguage() {
        return (LanguageCode) get("language");
    }

    public ProductFeed setLanguage(LanguageCode arg) {
        optimisticData.put(getKey("language"), arg);
        return this;
    }

    /**
    * The status of the product feed.
    */

    public ProductFeedStatus getStatus() {
        return (ProductFeedStatus) get("status");
    }

    public ProductFeed setStatus(ProductFeedStatus arg) {
        optimisticData.put(getKey("status"), arg);
        return this;
    }

    public boolean unwrapsToObject(String key) {
        switch (getFieldName(key)) {
            case "country": return false;

            case "id": return false;

            case "language": return false;

            case "status": return false;

            default: return false;
        }
    }
}

