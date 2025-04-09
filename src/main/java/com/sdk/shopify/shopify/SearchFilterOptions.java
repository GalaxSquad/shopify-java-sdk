// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.shopify.graphql.support.AbstractResponse;
import com.shopify.graphql.support.SchemaViolationError;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
* A list of search filters along with their specific options in value and label pair for filtering.
*/
public class SearchFilterOptions extends AbstractResponse<SearchFilterOptions> {
    public SearchFilterOptions() {
    }

    public SearchFilterOptions(JsonObject fields) throws SchemaViolationError {
        for (Map.Entry<String, JsonElement> field : fields.entrySet()) {
            String key = field.getKey();
            String fieldName = getFieldName(key);
            switch (fieldName) {
                case "productAvailability": {
                    List<FilterOption> list1 = new ArrayList<>();
                    for (JsonElement element1 : jsonAsArray(field.getValue(), key)) {
                        list1.add(new FilterOption(jsonAsObject(element1, key)));
                    }

                    responseData.put(key, list1);

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
        return "SearchFilterOptions";
    }

    /**
    * A list of options that can be use to filter product availability.
    */

    public List<FilterOption> getProductAvailability() {
        return (List<FilterOption>) get("productAvailability");
    }

    public SearchFilterOptions setProductAvailability(List<FilterOption> arg) {
        optimisticData.put(getKey("productAvailability"), arg);
        return this;
    }

    public boolean unwrapsToObject(String key) {
        switch (getFieldName(key)) {
            case "productAvailability": return true;

            default: return false;
        }
    }
}

