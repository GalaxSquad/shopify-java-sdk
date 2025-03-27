// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.shopify.graphql.support.AbstractResponse;
import com.shopify.graphql.support.SchemaViolationError;
import java.util.Map;

/**
* Interoperability metadata for types that directly correspond to a REST Admin API resource.
* For example, on the Product type, LegacyInteroperability returns metadata for the corresponding
* [Product object](https://shopify.dev/api/admin-graphql/latest/objects/product) in the REST Admin
* API.
*/
public class UnknownLegacyInteroperability extends AbstractResponse<UnknownLegacyInteroperability> implements LegacyInteroperability {
    public UnknownLegacyInteroperability() {
    }

    public UnknownLegacyInteroperability(JsonObject fields) throws SchemaViolationError {
        for (Map.Entry<String, JsonElement> field : fields.entrySet()) {
            String key = field.getKey();
            String fieldName = getFieldName(key);
            switch (fieldName) {
                case "legacyResourceId": {
                    responseData.put(key, jsonAsString(field.getValue(), key));

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

    public static LegacyInteroperability create(JsonObject fields) throws SchemaViolationError {
        String typeName = fields.getAsJsonPrimitive("__typename").getAsString();
        switch (typeName) {
            case "Customer": {
                return new Customer(fields);
            }

            case "DraftOrder": {
                return new DraftOrder(fields);
            }

            case "Fulfillment": {
                return new Fulfillment(fields);
            }

            case "InventoryItem": {
                return new InventoryItem(fields);
            }

            case "Location": {
                return new Location(fields);
            }

            case "MarketingEvent": {
                return new MarketingEvent(fields);
            }

            case "Metafield": {
                return new Metafield(fields);
            }

            case "Order": {
                return new Order(fields);
            }

            case "PriceRule": {
                return new PriceRule(fields);
            }

            case "Product": {
                return new Product(fields);
            }

            case "ProductVariant": {
                return new ProductVariant(fields);
            }

            case "Refund": {
                return new Refund(fields);
            }

            case "SavedSearch": {
                return new SavedSearch(fields);
            }

            case "ScriptTag": {
                return new ScriptTag(fields);
            }

            case "ShopifyPaymentsDispute": {
                return new ShopifyPaymentsDispute(fields);
            }

            case "ShopifyPaymentsPayout": {
                return new ShopifyPaymentsPayout(fields);
            }

            case "WebhookSubscription": {
                return new WebhookSubscription(fields);
            }

            default: {
                return new UnknownLegacyInteroperability(fields);
            }
        }
    }

    public String getGraphQlTypeName() {
        return (String) get("__typename");
    }

    /**
    * The ID of the corresponding resource in the REST Admin API.
    */

    public String getLegacyResourceId() {
        return (String) get("legacyResourceId");
    }

    public UnknownLegacyInteroperability setLegacyResourceId(String arg) {
        optimisticData.put(getKey("legacyResourceId"), arg);
        return this;
    }

    public boolean unwrapsToObject(String key) {
        switch (getFieldName(key)) {
            case "legacyResourceId": return false;

            default: return false;
        }
    }
}

