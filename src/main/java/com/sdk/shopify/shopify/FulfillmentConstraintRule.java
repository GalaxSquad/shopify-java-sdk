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
* A fulfillment constraint rule.
*/
public class FulfillmentConstraintRule extends AbstractResponse<FulfillmentConstraintRule> implements HasMetafields, Node {
    public FulfillmentConstraintRule() {
    }

    public FulfillmentConstraintRule(JsonObject fields) throws SchemaViolationError {
        for (Map.Entry<String, JsonElement> field : fields.entrySet()) {
            String key = field.getKey();
            String fieldName = getFieldName(key);
            switch (fieldName) {
                case "deliveryMethodTypes": {
                    List<DeliveryMethodType> list1 = new ArrayList<>();
                    for (JsonElement element1 : jsonAsArray(field.getValue(), key)) {
                        list1.add(DeliveryMethodType.fromGraphQl(jsonAsString(element1, key)));
                    }

                    responseData.put(key, list1);

                    break;
                }

                case "function": {
                    responseData.put(key, new ShopifyFunction(jsonAsObject(field.getValue(), key)));

                    break;
                }

                case "id": {
                    responseData.put(key, new ID(jsonAsString(field.getValue(), key)));

                    break;
                }

                case "metafield": {
                    Metafield optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new Metafield(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "metafields": {
                    responseData.put(key, new MetafieldConnection(jsonAsObject(field.getValue(), key)));

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

    public FulfillmentConstraintRule(ID id) {
        this();
        optimisticData.put("id", id);
    }

    public String getGraphQlTypeName() {
        return "FulfillmentConstraintRule";
    }

    /**
    * Delivery method types that the function is associated with.
    */

    public List<DeliveryMethodType> getDeliveryMethodTypes() {
        return (List<DeliveryMethodType>) get("deliveryMethodTypes");
    }

    public FulfillmentConstraintRule setDeliveryMethodTypes(List<DeliveryMethodType> arg) {
        optimisticData.put(getKey("deliveryMethodTypes"), arg);
        return this;
    }

    /**
    * The ID for the fulfillment constraint function.
    */

    public ShopifyFunction getFunction() {
        return (ShopifyFunction) get("function");
    }

    public FulfillmentConstraintRule setFunction(ShopifyFunction arg) {
        optimisticData.put(getKey("function"), arg);
        return this;
    }

    /**
    * A globally-unique ID.
    */

    public ID getId() {
        return (ID) get("id");
    }

    /**
    * A [custom field](https://shopify.dev/docs/apps/build/custom-data),
    * including its `namespace` and `key`, that's associated with a Shopify resource
    * for the purposes of adding and storing additional information.
    */

    public Metafield getMetafield() {
        return (Metafield) get("metafield");
    }

    public FulfillmentConstraintRule setMetafield(Metafield arg) {
        optimisticData.put(getKey("metafield"), arg);
        return this;
    }

    /**
    * A list of [custom fields](https://shopify.dev/docs/apps/build/custom-data)
    * that a merchant associates with a Shopify resource.
    */

    public MetafieldConnection getMetafields() {
        return (MetafieldConnection) get("metafields");
    }

    public FulfillmentConstraintRule setMetafields(MetafieldConnection arg) {
        optimisticData.put(getKey("metafields"), arg);
        return this;
    }

    public boolean unwrapsToObject(String key) {
        switch (getFieldName(key)) {
            case "deliveryMethodTypes": return false;

            case "function": return true;

            case "id": return false;

            case "metafield": return true;

            case "metafields": return true;

            default: return false;
        }
    }
}

