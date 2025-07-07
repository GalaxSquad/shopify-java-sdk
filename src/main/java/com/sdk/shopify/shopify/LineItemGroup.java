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
* A line item group (bundle) to which a line item belongs to.
*/
public class LineItemGroup extends AbstractResponse<LineItemGroup> implements Node {
    public LineItemGroup() {
    }

    public LineItemGroup(JsonObject fields) throws SchemaViolationError {
        for (Map.Entry<String, JsonElement> field : fields.entrySet()) {
            String key = field.getKey();
            String fieldName = getFieldName(key);
            switch (fieldName) {
                case "customAttributes": {
                    List<Attribute> list1 = new ArrayList<>();
                    for (JsonElement element1 : jsonAsArray(field.getValue(), key)) {
                        list1.add(new Attribute(jsonAsObject(element1, key)));
                    }

                    responseData.put(key, list1);

                    break;
                }

                case "id": {
                    responseData.put(key, new ID(jsonAsString(field.getValue(), key)));

                    break;
                }

                case "productId": {
                    ID optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new ID(jsonAsString(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "quantity": {
                    responseData.put(key, jsonAsInteger(field.getValue(), key));

                    break;
                }

                case "title": {
                    responseData.put(key, jsonAsString(field.getValue(), key));

                    break;
                }

                case "variantId": {
                    ID optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new ID(jsonAsString(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "variantSku": {
                    String optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = jsonAsString(field.getValue(), key);
                    }

                    responseData.put(key, optional1);

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

    public LineItemGroup(ID id) {
        this();
        optimisticData.put("id", id);
    }

    public String getGraphQlTypeName() {
        return "LineItemGroup";
    }

    /**
    * A list of attributes that represent custom features or special requests.
    */

    public List<Attribute> getCustomAttributes() {
        return (List<Attribute>) get("customAttributes");
    }

    public LineItemGroup setCustomAttributes(List<Attribute> arg) {
        optimisticData.put(getKey("customAttributes"), arg);
        return this;
    }

    /**
    * A globally-unique ID.
    */

    public ID getId() {
        return (ID) get("id");
    }

    /**
    * ID of the product of the line item group.
    */

    public ID getProductId() {
        return (ID) get("productId");
    }

    public LineItemGroup setProductId(ID arg) {
        optimisticData.put(getKey("productId"), arg);
        return this;
    }

    /**
    * Quantity of the line item group on the order.
    */

    public Integer getQuantity() {
        return (Integer) get("quantity");
    }

    public LineItemGroup setQuantity(Integer arg) {
        optimisticData.put(getKey("quantity"), arg);
        return this;
    }

    /**
    * Title of the line item group.
    */

    public String getTitle() {
        return (String) get("title");
    }

    public LineItemGroup setTitle(String arg) {
        optimisticData.put(getKey("title"), arg);
        return this;
    }

    /**
    * ID of the variant of the line item group.
    */

    public ID getVariantId() {
        return (ID) get("variantId");
    }

    public LineItemGroup setVariantId(ID arg) {
        optimisticData.put(getKey("variantId"), arg);
        return this;
    }

    /**
    * SKU of the variant of the line item group.
    */

    public String getVariantSku() {
        return (String) get("variantSku");
    }

    public LineItemGroup setVariantSku(String arg) {
        optimisticData.put(getKey("variantSku"), arg);
        return this;
    }

    public boolean unwrapsToObject(String key) {
        switch (getFieldName(key)) {
            case "customAttributes": return true;

            case "id": return false;

            case "productId": return false;

            case "quantity": return false;

            case "title": return false;

            case "variantId": return false;

            case "variantSku": return false;

            default: return false;
        }
    }
}

