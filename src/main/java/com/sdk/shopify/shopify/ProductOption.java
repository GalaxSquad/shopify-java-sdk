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
* The product property names. For example, "Size", "Color", and "Material".
* Variants are selected based on permutations of these options.
* The limit for each product property name is 255 characters.
*/
public class ProductOption extends AbstractResponse<ProductOption> implements HasPublishedTranslations, Node {
    public ProductOption() {
    }

    public ProductOption(JsonObject fields) throws SchemaViolationError {
        for (Map.Entry<String, JsonElement> field : fields.entrySet()) {
            String key = field.getKey();
            String fieldName = getFieldName(key);
            switch (fieldName) {
                case "id": {
                    responseData.put(key, new ID(jsonAsString(field.getValue(), key)));

                    break;
                }

                case "linkedMetafield": {
                    LinkedMetafield optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new LinkedMetafield(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "name": {
                    responseData.put(key, jsonAsString(field.getValue(), key));

                    break;
                }

                case "optionValues": {
                    List<ProductOptionValue> list1 = new ArrayList<>();
                    for (JsonElement element1 : jsonAsArray(field.getValue(), key)) {
                        list1.add(new ProductOptionValue(jsonAsObject(element1, key)));
                    }

                    responseData.put(key, list1);

                    break;
                }

                case "position": {
                    responseData.put(key, jsonAsInteger(field.getValue(), key));

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

                case "values": {
                    List<String> list1 = new ArrayList<>();
                    for (JsonElement element1 : jsonAsArray(field.getValue(), key)) {
                        list1.add(jsonAsString(element1, key));
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

    public ProductOption(ID id) {
        this();
        optimisticData.put("id", id);
    }

    public String getGraphQlTypeName() {
        return "ProductOption";
    }

    /**
    * A globally-unique ID.
    */

    public ID getId() {
        return (ID) get("id");
    }

    /**
    * The metafield identifier linked to this option.
    */

    public LinkedMetafield getLinkedMetafield() {
        return (LinkedMetafield) get("linkedMetafield");
    }

    public ProductOption setLinkedMetafield(LinkedMetafield arg) {
        optimisticData.put(getKey("linkedMetafield"), arg);
        return this;
    }

    /**
    * The product option’s name.
    */

    public String getName() {
        return (String) get("name");
    }

    public ProductOption setName(String arg) {
        optimisticData.put(getKey("name"), arg);
        return this;
    }

    /**
    * Similar to values, option_values returns all the corresponding option value objects to the product
    * option, including values not assigned to any variants.
    */

    public List<ProductOptionValue> getOptionValues() {
        return (List<ProductOptionValue>) get("optionValues");
    }

    public ProductOption setOptionValues(List<ProductOptionValue> arg) {
        optimisticData.put(getKey("optionValues"), arg);
        return this;
    }

    /**
    * The product option's position.
    */

    public Integer getPosition() {
        return (Integer) get("position");
    }

    public ProductOption setPosition(Integer arg) {
        optimisticData.put(getKey("position"), arg);
        return this;
    }

    /**
    * The published translations associated with the resource.
    */

    public List<Translation> getTranslations() {
        return (List<Translation>) get("translations");
    }

    public ProductOption setTranslations(List<Translation> arg) {
        optimisticData.put(getKey("translations"), arg);
        return this;
    }

    /**
    * The corresponding value to the product option name.
    */

    public List<String> getValues() {
        return (List<String>) get("values");
    }

    public ProductOption setValues(List<String> arg) {
        optimisticData.put(getKey("values"), arg);
        return this;
    }

    public boolean unwrapsToObject(String key) {
        switch (getFieldName(key)) {
            case "id": return false;

            case "linkedMetafield": return true;

            case "name": return false;

            case "optionValues": return true;

            case "position": return false;

            case "translations": return true;

            case "values": return false;

            default: return false;
        }
    }
}

