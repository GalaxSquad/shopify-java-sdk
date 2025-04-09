// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.shopify.graphql.support.AbstractResponse;
import com.shopify.graphql.support.ID;
import com.shopify.graphql.support.SchemaViolationError;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
* A saved search is a representation of a search query saved in the admin.
*/
public class SavedSearch extends AbstractResponse<SavedSearch> implements LegacyInteroperability, Node {
    public SavedSearch() {
    }

    public SavedSearch(JsonObject fields) throws SchemaViolationError {
        for (Map.Entry<String, JsonElement> field : fields.entrySet()) {
            String key = field.getKey();
            String fieldName = getFieldName(key);
            switch (fieldName) {
                case "filters": {
                    List<SearchFilter> list1 = new ArrayList<>();
                    for (JsonElement element1 : jsonAsArray(field.getValue(), key)) {
                        list1.add(new SearchFilter(jsonAsObject(element1, key)));
                    }

                    responseData.put(key, list1);

                    break;
                }

                case "id": {
                    responseData.put(key, new ID(jsonAsString(field.getValue(), key)));

                    break;
                }

                case "legacyResourceId": {
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

                case "resourceType": {
                    responseData.put(key, SearchResultType.fromGraphQl(jsonAsString(field.getValue(), key)));

                    break;
                }

                case "searchTerms": {
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

    public SavedSearch(ID id) {
        this();
        optimisticData.put("id", id);
    }

    public String getGraphQlTypeName() {
        return "SavedSearch";
    }

    /**
    * The filters of a saved search.
    */

    public List<SearchFilter> getFilters() {
        return (List<SearchFilter>) get("filters");
    }

    public SavedSearch setFilters(List<SearchFilter> arg) {
        optimisticData.put(getKey("filters"), arg);
        return this;
    }

    /**
    * A globally-unique ID.
    */

    public ID getId() {
        return (ID) get("id");
    }

    /**
    * The ID of the corresponding resource in the REST Admin API.
    */

    public String getLegacyResourceId() {
        return (String) get("legacyResourceId");
    }

    public SavedSearch setLegacyResourceId(String arg) {
        optimisticData.put(getKey("legacyResourceId"), arg);
        return this;
    }

    /**
    * The name of a saved search.
    */

    public String getName() {
        return (String) get("name");
    }

    public SavedSearch setName(String arg) {
        optimisticData.put(getKey("name"), arg);
        return this;
    }

    /**
    * The query string of a saved search. This includes search terms and filters.
    */

    public String getQuery() {
        return (String) get("query");
    }

    public SavedSearch setQuery(String arg) {
        optimisticData.put(getKey("query"), arg);
        return this;
    }

    /**
    * The type of resource this saved search is searching in.
    */

    public SearchResultType getResourceType() {
        return (SearchResultType) get("resourceType");
    }

    public SavedSearch setResourceType(SearchResultType arg) {
        optimisticData.put(getKey("resourceType"), arg);
        return this;
    }

    /**
    * The search terms of a saved search.
    */

    public String getSearchTerms() {
        return (String) get("searchTerms");
    }

    public SavedSearch setSearchTerms(String arg) {
        optimisticData.put(getKey("searchTerms"), arg);
        return this;
    }

    public boolean unwrapsToObject(String key) {
        switch (getFieldName(key)) {
            case "filters": return true;

            case "id": return false;

            case "legacyResourceId": return false;

            case "name": return false;

            case "query": return false;

            case "resourceType": return false;

            case "searchTerms": return false;

            default: return false;
        }
    }
}

