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

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
* A Shopify product taxonomy measurement attribute.
*/
public class TaxonomyMeasurementAttribute extends AbstractResponse<TaxonomyMeasurementAttribute> implements Node, TaxonomyCategoryAttribute {
    public TaxonomyMeasurementAttribute() {
    }

    public TaxonomyMeasurementAttribute(JsonObject fields) throws SchemaViolationError {
        for (Map.Entry<String, JsonElement> field : fields.entrySet()) {
            String key = field.getKey();
            String fieldName = getFieldName(key);
            switch (fieldName) {
                case "id": {
                    responseData.put(key, new ID(jsonAsString(field.getValue(), key)));

                    break;
                }

                case "name": {
                    responseData.put(key, jsonAsString(field.getValue(), key));

                    break;
                }

                case "options": {
                    List<Attribute> list1 = new ArrayList<>();
                    for (JsonElement element1 : jsonAsArray(field.getValue(), key)) {
                        list1.add(new Attribute(jsonAsObject(element1, key)));
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

    public TaxonomyMeasurementAttribute(ID id) {
        this();
        optimisticData.put("id", id);
    }

    public String getGraphQlTypeName() {
        return "TaxonomyMeasurementAttribute";
    }

    /**
    * The unique ID of the TaxonomyAttribute.
    */

    public ID getId() {
        return (ID) get("id");
    }

    /**
    * The name of the product taxonomy attribute. For example, Color.
    */

    public String getName() {
        return (String) get("name");
    }

    public TaxonomyMeasurementAttribute setName(String arg) {
        optimisticData.put(getKey("name"), arg);
        return this;
    }

    /**
    * The product taxonomy attribute options.
    */

    public List<Attribute> getOptions() {
        return (List<Attribute>) get("options");
    }

    public TaxonomyMeasurementAttribute setOptions(List<Attribute> arg) {
        optimisticData.put(getKey("options"), arg);
        return this;
    }

    public boolean unwrapsToObject(String key) {
        switch (getFieldName(key)) {
            case "id": return false;

            case "name": return false;

            case "options": return true;

            default: return false;
        }
    }
}

