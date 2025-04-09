// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.shopify.graphql.support.AbstractResponse;
import com.shopify.graphql.support.SchemaViolationError;
import java.util.Map;

/**
* Types of resources that may use metafields to reference other resources.
*/
public class UnknownMetafieldReferencer extends AbstractResponse<UnknownMetafieldReferencer> implements MetafieldReferencer {
    public UnknownMetafieldReferencer() {
    }

    public UnknownMetafieldReferencer(JsonObject fields) throws SchemaViolationError {
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

    public static MetafieldReferencer create(JsonObject fields) throws SchemaViolationError {
        String typeName = fields.getAsJsonPrimitive("__typename").getAsString();
        switch (typeName) {
            case "AppInstallation": {
                return new AppInstallation(fields);
            }

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

            case "DraftOrder": {
                return new DraftOrder(fields);
            }

            case "FulfillmentOrder": {
                return new FulfillmentOrder(fields);
            }

            case "Location": {
                return new Location(fields);
            }

            case "Market": {
                return new Market(fields);
            }

            case "Metaobject": {
                return new Metaobject(fields);
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

            case "Shop": {
                return new Shop(fields);
            }

            default: {
                return new UnknownMetafieldReferencer(fields);
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

