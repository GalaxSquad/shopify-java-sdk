// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.shopify.graphql.support.AbstractResponse;
import com.shopify.graphql.support.SchemaViolationError;
import java.util.Map;

/**
* A product taxonomy attribute interface.
*/
public class UnknownTaxonomyCategoryAttribute extends AbstractResponse<UnknownTaxonomyCategoryAttribute> implements TaxonomyCategoryAttribute {
    public UnknownTaxonomyCategoryAttribute() {
    }

    public UnknownTaxonomyCategoryAttribute(JsonObject fields) throws SchemaViolationError {
        for (Map.Entry<String, JsonElement> field : fields.entrySet()) {
            String key = field.getKey();
            String fieldName = getFieldName(key);
            switch (fieldName) {
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

    public static TaxonomyCategoryAttribute create(JsonObject fields) throws SchemaViolationError {
        String typeName = fields.getAsJsonPrimitive("__typename").getAsString();
        switch (typeName) {
            case "TaxonomyAttribute": {
                return new TaxonomyAttribute(fields);
            }

            case "TaxonomyChoiceListAttribute": {
                return new TaxonomyChoiceListAttribute(fields);
            }

            case "TaxonomyMeasurementAttribute": {
                return new TaxonomyMeasurementAttribute(fields);
            }

            default: {
                return new UnknownTaxonomyCategoryAttribute(fields);
            }
        }
    }

    public String getGraphQlTypeName() {
        return (String) get("__typename");
    }

    public boolean unwrapsToObject(String key) {
        switch (getFieldName(key)) {
            default: return false;
        }
    }
}

