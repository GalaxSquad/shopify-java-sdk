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
* Represents an object that has a list of events.
*/
public class UnknownHasEvents extends AbstractResponse<UnknownHasEvents> implements HasEvents {
    public UnknownHasEvents() {
    }

    public UnknownHasEvents(JsonObject fields) throws SchemaViolationError {
        for (Map.Entry<String, JsonElement> field : fields.entrySet()) {
            String key = field.getKey();
            String fieldName = getFieldName(key);
            switch (fieldName) {
                case "events": {
                    responseData.put(key, new EventConnection(jsonAsObject(field.getValue(), key)));

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

    public static HasEvents create(JsonObject fields) throws SchemaViolationError {
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

            case "Comment": {
                return new Comment(fields);
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

            case "DiscountAutomaticBxgy": {
                return new DiscountAutomaticBxgy(fields);
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

            case "Order": {
                return new Order(fields);
            }

            case "Page": {
                return new Page(fields);
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

            default: {
                return new UnknownHasEvents(fields);
            }
        }
    }

    public String getGraphQlTypeName() {
        return (String) get("__typename");
    }

    /**
    * The paginated list of events associated with the host subject.
    */

    public EventConnection getEvents() {
        return (EventConnection) get("events");
    }

    public UnknownHasEvents setEvents(EventConnection arg) {
        optimisticData.put(getKey("events"), arg);
        return this;
    }

    public boolean unwrapsToObject(String key) {
        switch (getFieldName(key)) {
            case "events": return true;

            default: return false;
        }
    }
}

