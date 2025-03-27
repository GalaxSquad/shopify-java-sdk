// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.shopify.graphql.support.AbstractResponse;
import com.shopify.graphql.support.SchemaViolationError;
import java.util.Map;

/**
* Represents the publications where a collection is published.
*/
public class CollectionPublication extends AbstractResponse<CollectionPublication> {
    public CollectionPublication() {
    }

    public CollectionPublication(JsonObject fields) throws SchemaViolationError {
        for (Map.Entry<String, JsonElement> field : fields.entrySet()) {
            String key = field.getKey();
            String fieldName = getFieldName(key);
            switch (fieldName) {
                case "collection": {
                    responseData.put(key, new Collection(jsonAsObject(field.getValue(), key)));

                    break;
                }

                case "isPublished": {
                    responseData.put(key, jsonAsBoolean(field.getValue(), key));

                    break;
                }

                case "publication": {
                    responseData.put(key, new Publication(jsonAsObject(field.getValue(), key)));

                    break;
                }

                case "publishDate": {
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
        return "CollectionPublication";
    }

    /**
    * The collection to be published on the publication.
    */

    public Collection getCollection() {
        return (Collection) get("collection");
    }

    public CollectionPublication setCollection(Collection arg) {
        optimisticData.put(getKey("collection"), arg);
        return this;
    }

    /**
    * Whether the publication is published or not.
    */

    public Boolean getIsPublished() {
        return (Boolean) get("isPublished");
    }

    public CollectionPublication setIsPublished(Boolean arg) {
        optimisticData.put(getKey("isPublished"), arg);
        return this;
    }

    /**
    * The publication where the collection will be published.
    */

    public Publication getPublication() {
        return (Publication) get("publication");
    }

    public CollectionPublication setPublication(Publication arg) {
        optimisticData.put(getKey("publication"), arg);
        return this;
    }

    /**
    * The date that the publication was or is going to be published.
    */

    public String getPublishDate() {
        return (String) get("publishDate");
    }

    public CollectionPublication setPublishDate(String arg) {
        optimisticData.put(getKey("publishDate"), arg);
        return this;
    }

    public boolean unwrapsToObject(String key) {
        switch (getFieldName(key)) {
            case "collection": return true;

            case "isPublished": return false;

            case "publication": return true;

            case "publishDate": return false;

            default: return false;
        }
    }
}

