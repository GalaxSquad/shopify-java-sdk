// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.shopify.graphql.support.AbstractResponse;
import com.shopify.graphql.support.SchemaViolationError;
import java.util.Map;

/**
* The Taxonomy resource lets you access the categories, attributes and values of a taxonomy tree.
*/
public class Taxonomy extends AbstractResponse<Taxonomy> {
    public Taxonomy() {
    }

    public Taxonomy(JsonObject fields) throws SchemaViolationError {
        for (Map.Entry<String, JsonElement> field : fields.entrySet()) {
            String key = field.getKey();
            String fieldName = getFieldName(key);
            switch (fieldName) {
                case "categories": {
                    responseData.put(key, new TaxonomyCategoryConnection(jsonAsObject(field.getValue(), key)));

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
        return "Taxonomy";
    }

    /**
    * Returns the categories of the product taxonomy based on the arguments provided.
    * If a `search` argument is provided, then all categories that match the search query globally are
    * returned.
    * If a `children_of` argument is provided, then all children of the specified category are returned.
    * If a `siblings_of` argument is provided, then all siblings of the specified category are returned.
    * If a `decendents_of` argument is provided, then all descendents of the specified category are
    * returned.
    * If no arguments are provided, then all the top-level categories of the taxonomy are returned.
    */

    public TaxonomyCategoryConnection getCategories() {
        return (TaxonomyCategoryConnection) get("categories");
    }

    public Taxonomy setCategories(TaxonomyCategoryConnection arg) {
        optimisticData.put(getKey("categories"), arg);
        return this;
    }

    public boolean unwrapsToObject(String key) {
        switch (getFieldName(key)) {
            case "categories": return true;

            default: return false;
        }
    }
}

