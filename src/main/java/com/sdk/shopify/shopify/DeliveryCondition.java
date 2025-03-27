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
* A condition that must pass for a delivery method definition to be applied to an order.
*/
public class DeliveryCondition extends AbstractResponse<DeliveryCondition> implements Node {
    public DeliveryCondition() {
    }

    public DeliveryCondition(JsonObject fields) throws SchemaViolationError {
        for (Map.Entry<String, JsonElement> field : fields.entrySet()) {
            String key = field.getKey();
            String fieldName = getFieldName(key);
            switch (fieldName) {
                case "conditionCriteria": {
                    responseData.put(key, UnknownDeliveryConditionCriteria.create(jsonAsObject(field.getValue(), key)));

                    break;
                }

                case "field": {
                    responseData.put(key, DeliveryConditionField.fromGraphQl(jsonAsString(field.getValue(), key)));

                    break;
                }

                case "id": {
                    responseData.put(key, new ID(jsonAsString(field.getValue(), key)));

                    break;
                }

                case "operator": {
                    responseData.put(key, DeliveryConditionOperator.fromGraphQl(jsonAsString(field.getValue(), key)));

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

    public DeliveryCondition(ID id) {
        this();
        optimisticData.put("id", id);
    }

    public String getGraphQlTypeName() {
        return "DeliveryCondition";
    }

    /**
    * The value (weight or price) that the condition field is compared to.
    */

    public DeliveryConditionCriteria getConditionCriteria() {
        return (DeliveryConditionCriteria) get("conditionCriteria");
    }

    public DeliveryCondition setConditionCriteria(DeliveryConditionCriteria arg) {
        optimisticData.put(getKey("conditionCriteria"), arg);
        return this;
    }

    /**
    * The field to compare the criterion value against, using the operator.
    */

    public DeliveryConditionField getField() {
        return (DeliveryConditionField) get("field");
    }

    public DeliveryCondition setField(DeliveryConditionField arg) {
        optimisticData.put(getKey("field"), arg);
        return this;
    }

    /**
    * A globally-unique ID.
    */

    public ID getId() {
        return (ID) get("id");
    }

    /**
    * The operator to compare the field and criterion value.
    */

    public DeliveryConditionOperator getOperator() {
        return (DeliveryConditionOperator) get("operator");
    }

    public DeliveryCondition setOperator(DeliveryConditionOperator arg) {
        optimisticData.put(getKey("operator"), arg);
        return this;
    }

    public boolean unwrapsToObject(String key) {
        switch (getFieldName(key)) {
            case "conditionCriteria": return false;

            case "field": return false;

            case "id": return false;

            case "operator": return false;

            default: return false;
        }
    }
}

