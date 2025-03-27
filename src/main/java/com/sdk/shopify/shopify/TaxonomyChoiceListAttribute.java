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
* A Shopify product taxonomy choice list attribute.
*/
public class TaxonomyChoiceListAttribute extends AbstractResponse<TaxonomyChoiceListAttribute> implements Node, TaxonomyCategoryAttribute {
    public TaxonomyChoiceListAttribute() {
    }

    public TaxonomyChoiceListAttribute(JsonObject fields) throws SchemaViolationError {
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

                case "values": {
                    responseData.put(key, new TaxonomyValueConnection(jsonAsObject(field.getValue(), key)));

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

    public TaxonomyChoiceListAttribute(ID id) {
        this();
        optimisticData.put("id", id);
    }

    public String getGraphQlTypeName() {
        return "TaxonomyChoiceListAttribute";
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

    public TaxonomyChoiceListAttribute setName(String arg) {
        optimisticData.put(getKey("name"), arg);
        return this;
    }

    /**
    * A list of values on the choice list attribute.
    */

    public TaxonomyValueConnection getValues() {
        return (TaxonomyValueConnection) get("values");
    }

    public TaxonomyChoiceListAttribute setValues(TaxonomyValueConnection arg) {
        optimisticData.put(getKey("values"), arg);
        return this;
    }

    public boolean unwrapsToObject(String key) {
        switch (getFieldName(key)) {
            case "id": return false;

            case "name": return false;

            case "values": return true;

            default: return false;
        }
    }
}

