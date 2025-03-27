// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.shopify.graphql.support.AbstractResponse;
import com.shopify.graphql.support.SchemaViolationError;
import java.util.Map;

/**
* Resources that metafield definitions can be applied to.
*/
public class UnknownHasMetafieldDefinitions extends AbstractResponse<UnknownHasMetafieldDefinitions> implements HasMetafieldDefinitions {
    public UnknownHasMetafieldDefinitions() {
    }

    public UnknownHasMetafieldDefinitions(JsonObject fields) throws SchemaViolationError {
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

    public static HasMetafieldDefinitions create(JsonObject fields) throws SchemaViolationError {
        String typeName = fields.getAsJsonPrimitive("__typename").getAsString();
        switch (typeName) {
            case "Article": {
                return new Article(fields);
            }

            case "Blog": {
                return new Blog(fields);
            }

            case "Collection": {
                return new Collection(fields);
            }

            case "Company": {
                return new Company(fields);
            }

            case "CompanyLocation": {
                return new CompanyLocation(fields);
            }

            case "Customer": {
                return new Customer(fields);
            }

            case "DeliveryCustomization": {
                return new DeliveryCustomization(fields);
            }

            case "DiscountAutomaticNode": {
                return new DiscountAutomaticNode(fields);
            }

            case "DiscountCodeNode": {
                return new DiscountCodeNode(fields);
            }

            case "DiscountNode": {
                return new DiscountNode(fields);
            }

            case "Location": {
                return new Location(fields);
            }

            case "Market": {
                return new Market(fields);
            }

            case "Order": {
                return new Order(fields);
            }

            case "Page": {
                return new Page(fields);
            }

            case "PaymentCustomization": {
                return new PaymentCustomization(fields);
            }

            case "Product": {
                return new Product(fields);
            }

            case "ProductVariant": {
                return new ProductVariant(fields);
            }

            case "SellingPlan": {
                return new SellingPlan(fields);
            }

            case "Validation": {
                return new Validation(fields);
            }

            default: {
                return new UnknownHasMetafieldDefinitions(fields);
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

