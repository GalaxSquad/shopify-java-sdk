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
* FeedBurner provider details. Any blogs that aren't already integrated with FeedBurner can't use the
* service.
*/
public class BlogFeed extends AbstractResponse<BlogFeed> {
    public BlogFeed() {
    }

    public BlogFeed(JsonObject fields) throws SchemaViolationError {
        for (Map.Entry<String, JsonElement> field : fields.entrySet()) {
            String key = field.getKey();
            String fieldName = getFieldName(key);
            switch (fieldName) {
                case "location": {
                    responseData.put(key, jsonAsString(field.getValue(), key));

                    break;
                }

                case "path": {
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
        return "BlogFeed";
    }

    /**
    * Blog feed provider url.
    */

    public String getLocation() {
        return (String) get("location");
    }

    public BlogFeed setLocation(String arg) {
        optimisticData.put(getKey("location"), arg);
        return this;
    }

    /**
    * Blog feed provider path.
    */

    public String getPath() {
        return (String) get("path");
    }

    public BlogFeed setPath(String arg) {
        optimisticData.put(getKey("path"), arg);
        return this;
    }

    public boolean unwrapsToObject(String key) {
        switch (getFieldName(key)) {
            case "location": return false;

            case "path": return false;

            default: return false;
        }
    }
}

