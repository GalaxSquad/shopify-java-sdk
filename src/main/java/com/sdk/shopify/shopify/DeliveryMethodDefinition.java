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
* A method definition contains the delivery rate and the conditions that must be met for the method to
* be
* applied.
*/
public class DeliveryMethodDefinition extends AbstractResponse<DeliveryMethodDefinition> implements Node {
    public DeliveryMethodDefinition() {
    }

    public DeliveryMethodDefinition(JsonObject fields) throws SchemaViolationError {
        for (Map.Entry<String, JsonElement> field : fields.entrySet()) {
            String key = field.getKey();
            String fieldName = getFieldName(key);
            switch (fieldName) {
                case "active": {
                    responseData.put(key, jsonAsBoolean(field.getValue(), key));

                    break;
                }

                case "description": {
                    String optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = jsonAsString(field.getValue(), key);
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "id": {
                    responseData.put(key, new ID(jsonAsString(field.getValue(), key)));

                    break;
                }

                case "methodConditions": {
                    List<DeliveryCondition> list1 = new ArrayList<>();
                    for (JsonElement element1 : jsonAsArray(field.getValue(), key)) {
                        list1.add(new DeliveryCondition(jsonAsObject(element1, key)));
                    }

                    responseData.put(key, list1);

                    break;
                }

                case "name": {
                    responseData.put(key, jsonAsString(field.getValue(), key));

                    break;
                }

                case "rateProvider": {
                    responseData.put(key, UnknownDeliveryRateProvider.create(jsonAsObject(field.getValue(), key)));

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

    public DeliveryMethodDefinition(ID id) {
        this();
        optimisticData.put("id", id);
    }

    public String getGraphQlTypeName() {
        return "DeliveryMethodDefinition";
    }

    /**
    * Whether this method definition is active.
    */

    public Boolean getActive() {
        return (Boolean) get("active");
    }

    public DeliveryMethodDefinition setActive(Boolean arg) {
        optimisticData.put(getKey("active"), arg);
        return this;
    }

    /**
    * The description of the method definition. Only available on shipping rates that are custom.
    */

    public String getDescription() {
        return (String) get("description");
    }

    public DeliveryMethodDefinition setDescription(String arg) {
        optimisticData.put(getKey("description"), arg);
        return this;
    }

    /**
    * A globally-unique ID.
    */

    public ID getId() {
        return (ID) get("id");
    }

    /**
    * The method conditions that must pass for this method definition to be applied to an order.
    */

    public List<DeliveryCondition> getMethodConditions() {
        return (List<DeliveryCondition>) get("methodConditions");
    }

    public DeliveryMethodDefinition setMethodConditions(List<DeliveryCondition> arg) {
        optimisticData.put(getKey("methodConditions"), arg);
        return this;
    }

    /**
    * The name of the method definition.
    */

    public String getName() {
        return (String) get("name");
    }

    public DeliveryMethodDefinition setName(String arg) {
        optimisticData.put(getKey("name"), arg);
        return this;
    }

    /**
    * The provided rate for this method definition, from a rate definition or participant.
    */

    public DeliveryRateProvider getRateProvider() {
        return (DeliveryRateProvider) get("rateProvider");
    }

    public DeliveryMethodDefinition setRateProvider(DeliveryRateProvider arg) {
        optimisticData.put(getKey("rateProvider"), arg);
        return this;
    }

    public boolean unwrapsToObject(String key) {
        switch (getFieldName(key)) {
            case "active": return false;

            case "description": return false;

            case "id": return false;

            case "methodConditions": return true;

            case "name": return false;

            case "rateProvider": return false;

            default: return false;
        }
    }
}

