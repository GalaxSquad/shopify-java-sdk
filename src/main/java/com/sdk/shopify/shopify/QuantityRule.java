// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.shopify.graphql.support.AbstractResponse;
import com.shopify.graphql.support.SchemaViolationError;
import java.util.Map;

/**
* The quantity rule for the product variant in a given context.
*/
public class QuantityRule extends AbstractResponse<QuantityRule> {
    public QuantityRule() {
    }

    public QuantityRule(JsonObject fields) throws SchemaViolationError {
        for (Map.Entry<String, JsonElement> field : fields.entrySet()) {
            String key = field.getKey();
            String fieldName = getFieldName(key);
            switch (fieldName) {
                case "increment": {
                    responseData.put(key, jsonAsInteger(field.getValue(), key));

                    break;
                }

                case "isDefault": {
                    responseData.put(key, jsonAsBoolean(field.getValue(), key));

                    break;
                }

                case "maximum": {
                    Integer optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = jsonAsInteger(field.getValue(), key);
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "minimum": {
                    responseData.put(key, jsonAsInteger(field.getValue(), key));

                    break;
                }

                case "originType": {
                    responseData.put(key, QuantityRuleOriginType.fromGraphQl(jsonAsString(field.getValue(), key)));

                    break;
                }

                case "productVariant": {
                    responseData.put(key, new ProductVariant(jsonAsObject(field.getValue(), key)));

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
        return "QuantityRule";
    }

    /**
    * The value that specifies the quantity increment between minimum and maximum of the rule.
    * Only quantities divisible by this value will be considered valid.
    * The increment must be lower than or equal to the minimum and the maximum, and both minimum and
    * maximum
    * must be divisible by this value.
    */

    public Integer getIncrement() {
        return (Integer) get("increment");
    }

    public QuantityRule setIncrement(Integer arg) {
        optimisticData.put(getKey("increment"), arg);
        return this;
    }

    /**
    * Whether the quantity rule fields match one increment, one minimum and no maximum.
    */

    public Boolean getIsDefault() {
        return (Boolean) get("isDefault");
    }

    public QuantityRule setIsDefault(Boolean arg) {
        optimisticData.put(getKey("isDefault"), arg);
        return this;
    }

    /**
    * An optional value that defines the highest allowed quantity purchased by the customer.
    * If defined, maximum must be lower than or equal to the minimum and must be a multiple of the
    * increment.
    */

    public Integer getMaximum() {
        return (Integer) get("maximum");
    }

    public QuantityRule setMaximum(Integer arg) {
        optimisticData.put(getKey("maximum"), arg);
        return this;
    }

    /**
    * The value that defines the lowest allowed quantity purchased by the customer.
    * The minimum must be a multiple of the quantity rule's increment.
    */

    public Integer getMinimum() {
        return (Integer) get("minimum");
    }

    public QuantityRule setMinimum(Integer arg) {
        optimisticData.put(getKey("minimum"), arg);
        return this;
    }

    /**
    * Whether the values of the quantity rule were explicitly set.
    */

    public QuantityRuleOriginType getOriginType() {
        return (QuantityRuleOriginType) get("originType");
    }

    public QuantityRule setOriginType(QuantityRuleOriginType arg) {
        optimisticData.put(getKey("originType"), arg);
        return this;
    }

    /**
    * The product variant for which the quantity rule is applied.
    */

    public ProductVariant getProductVariant() {
        return (ProductVariant) get("productVariant");
    }

    public QuantityRule setProductVariant(ProductVariant arg) {
        optimisticData.put(getKey("productVariant"), arg);
        return this;
    }

    public boolean unwrapsToObject(String key) {
        switch (getFieldName(key)) {
            case "increment": return false;

            case "isDefault": return false;

            case "maximum": return false;

            case "minimum": return false;

            case "originType": return false;

            case "productVariant": return true;

            default: return false;
        }
    }
}

