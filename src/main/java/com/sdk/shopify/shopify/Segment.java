// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.shopify.graphql.support.AbstractResponse;
import com.shopify.graphql.support.ID;
import com.shopify.graphql.support.SchemaViolationError;
import java.util.Map;

/**
* A dynamic collection of customers based on specific criteria.
*/
public class Segment extends AbstractResponse<Segment> implements Node {
    public Segment() {
    }

    public Segment(JsonObject fields) throws SchemaViolationError {
        for (Map.Entry<String, JsonElement> field : fields.entrySet()) {
            String key = field.getKey();
            String fieldName = getFieldName(key);
            switch (fieldName) {
                case "creationDate": {
                    responseData.put(key, jsonAsString(field.getValue(), key));

                    break;
                }

                case "id": {
                    responseData.put(key, new ID(jsonAsString(field.getValue(), key)));

                    break;
                }

                case "lastEditDate": {
                    responseData.put(key, jsonAsString(field.getValue(), key));

                    break;
                }

                case "name": {
                    responseData.put(key, jsonAsString(field.getValue(), key));

                    break;
                }

                case "query": {
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

    public Segment(ID id) {
        this();
        optimisticData.put("id", id);
    }

    public String getGraphQlTypeName() {
        return "Segment";
    }

    /**
    * The date and time when the segment was added to the store.
    */

    public String getCreationDate() {
        return (String) get("creationDate");
    }

    public Segment setCreationDate(String arg) {
        optimisticData.put(getKey("creationDate"), arg);
        return this;
    }

    /**
    * A globally-unique ID.
    */

    public ID getId() {
        return (ID) get("id");
    }

    /**
    * The date and time when the segment was last updated.
    */

    public String getLastEditDate() {
        return (String) get("lastEditDate");
    }

    public Segment setLastEditDate(String arg) {
        optimisticData.put(getKey("lastEditDate"), arg);
        return this;
    }

    /**
    * The name of the segment.
    */

    public String getName() {
        return (String) get("name");
    }

    public Segment setName(String arg) {
        optimisticData.put(getKey("name"), arg);
        return this;
    }

    /**
    * A precise definition of the segment. The definition is composed of a combination of conditions on
    * facts about customers.
    */

    public String getQuery() {
        return (String) get("query");
    }

    public Segment setQuery(String arg) {
        optimisticData.put(getKey("query"), arg);
        return this;
    }

    public boolean unwrapsToObject(String key) {
        switch (getFieldName(key)) {
            case "creationDate": return false;

            case "id": return false;

            case "lastEditDate": return false;

            case "name": return false;

            case "query": return false;

            default: return false;
        }
    }
}

