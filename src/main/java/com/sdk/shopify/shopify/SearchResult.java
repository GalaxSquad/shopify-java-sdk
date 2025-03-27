// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.shopify.graphql.support.AbstractResponse;
import com.shopify.graphql.support.SchemaViolationError;
import java.util.Map;

/**
* Represents an individual result returned from a search.
*/
public class SearchResult extends AbstractResponse<SearchResult> {
    public SearchResult() {
    }

    public SearchResult(JsonObject fields) throws SchemaViolationError {
        for (Map.Entry<String, JsonElement> field : fields.entrySet()) {
            String key = field.getKey();
            String fieldName = getFieldName(key);
            switch (fieldName) {
                case "description": {
                    String optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = jsonAsString(field.getValue(), key);
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "image": {
                    Image optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new Image(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "reference": {
                    responseData.put(key, UnknownNode.create(jsonAsObject(field.getValue(), key)));

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
        return "SearchResult";
    }

    /**
    * Returns the search result description text.
    */

    public String getDescription() {
        return (String) get("description");
    }

    public SearchResult setDescription(String arg) {
        optimisticData.put(getKey("description"), arg);
        return this;
    }

    /**
    * Returns the Image resource presented to accompany a search result.
    */

    public Image getImage() {
        return (Image) get("image");
    }

    public SearchResult setImage(Image arg) {
        optimisticData.put(getKey("image"), arg);
        return this;
    }

    /**
    * Returns the ID of the resource returned in the search result.
    */

    public Node getReference() {
        return (Node) get("reference");
    }

    public SearchResult setReference(Node arg) {
        optimisticData.put(getKey("reference"), arg);
        return this;
    }

    /**
    * Returns the resource title.
    */

    public String getTitle() {
        return (String) get("title");
    }

    public SearchResult setTitle(String arg) {
        optimisticData.put(getKey("title"), arg);
        return this;
    }

    /**
    * Returns the absolute URL to the resource in the search result.
    */

    public String getUrl() {
        return (String) get("url");
    }

    public SearchResult setUrl(String arg) {
        optimisticData.put(getKey("url"), arg);
        return this;
    }

    public boolean unwrapsToObject(String key) {
        switch (getFieldName(key)) {
            case "description": return false;

            case "image": return true;

            case "reference": return false;

            case "title": return false;

            case "url": return false;

            default: return false;
        }
    }
}

