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
* The product option value names. For example, "Red", "Blue", and "Green" for a "Color" option.
*/
public class ProductOptionValue extends AbstractResponse<ProductOptionValue> implements HasPublishedTranslations, Node {
    public ProductOptionValue() {
    }

    public ProductOptionValue(JsonObject fields) throws SchemaViolationError {
        for (Map.Entry<String, JsonElement> field : fields.entrySet()) {
            String key = field.getKey();
            String fieldName = getFieldName(key);
            switch (fieldName) {
                case "hasVariants": {
                    responseData.put(key, jsonAsBoolean(field.getValue(), key));

                    break;
                }

                case "id": {
                    responseData.put(key, new ID(jsonAsString(field.getValue(), key)));

                    break;
                }

                case "linkedMetafieldValue": {
                    String optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = jsonAsString(field.getValue(), key);
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "name": {
                    responseData.put(key, jsonAsString(field.getValue(), key));

                    break;
                }

                case "swatch": {
                    ProductOptionValueSwatch optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new ProductOptionValueSwatch(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "translations": {
                    List<Translation> list1 = new ArrayList<>();
                    for (JsonElement element1 : jsonAsArray(field.getValue(), key)) {
                        list1.add(new Translation(jsonAsObject(element1, key)));
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

    public ProductOptionValue(ID id) {
        this();
        optimisticData.put("id", id);
    }

    public String getGraphQlTypeName() {
        return "ProductOptionValue";
    }

    /**
    * Whether the product option value has any linked variants.
    */

    public Boolean getHasVariants() {
        return (Boolean) get("hasVariants");
    }

    public ProductOptionValue setHasVariants(Boolean arg) {
        optimisticData.put(getKey("hasVariants"), arg);
        return this;
    }

    /**
    * A globally-unique ID.
    */

    public ID getId() {
        return (ID) get("id");
    }

    /**
    * The value of the linked metafield.
    */

    public String getLinkedMetafieldValue() {
        return (String) get("linkedMetafieldValue");
    }

    public ProductOptionValue setLinkedMetafieldValue(String arg) {
        optimisticData.put(getKey("linkedMetafieldValue"), arg);
        return this;
    }

    /**
    * The name of the product option value.
    */

    public String getName() {
        return (String) get("name");
    }

    public ProductOptionValue setName(String arg) {
        optimisticData.put(getKey("name"), arg);
        return this;
    }

    /**
    * The swatch associated with the product option value.
    */

    public ProductOptionValueSwatch getSwatch() {
        return (ProductOptionValueSwatch) get("swatch");
    }

    public ProductOptionValue setSwatch(ProductOptionValueSwatch arg) {
        optimisticData.put(getKey("swatch"), arg);
        return this;
    }

    /**
    * The published translations associated with the resource.
    */

    public List<Translation> getTranslations() {
        return (List<Translation>) get("translations");
    }

    public ProductOptionValue setTranslations(List<Translation> arg) {
        optimisticData.put(getKey("translations"), arg);
        return this;
    }

    public boolean unwrapsToObject(String key) {
        switch (getFieldName(key)) {
            case "hasVariants": return false;

            case "id": return false;

            case "linkedMetafieldValue": return false;

            case "name": return false;

            case "swatch": return true;

            case "translations": return true;

            default: return false;
        }
    }
}

