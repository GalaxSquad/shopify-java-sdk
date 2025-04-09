// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.shopify.graphql.support.AbstractResponse;
import com.shopify.graphql.support.SchemaViolationError;
import java.util.Map;

/**
* A default cursor that you can use in queries to paginate your results. Each edge in a connection can
* return a cursor, which is a reference to the edge's position in the connection. You can use an
* edge's cursor as
* the starting point to retrieve the nodes before or after it in a connection.
* To learn more about using cursor-based pagination, refer to
* [Paginating results with GraphQL](https://shopify.dev/api/usage/pagination-graphql).
*/
public class UnknownNavigable extends AbstractResponse<UnknownNavigable> implements Navigable {
    public UnknownNavigable() {
    }

    public UnknownNavigable(JsonObject fields) throws SchemaViolationError {
        for (Map.Entry<String, JsonElement> field : fields.entrySet()) {
            String key = field.getKey();
            String fieldName = getFieldName(key);
            switch (fieldName) {
                case "defaultCursor": {
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

    public static Navigable create(JsonObject fields) throws SchemaViolationError {
        String typeName = fields.getAsJsonPrimitive("__typename").getAsString();
        switch (typeName) {
            case "AbandonedCheckout": {
                return new AbandonedCheckout(fields);
            }

            case "Article": {
                return new Article(fields);
            }

            case "Company": {
                return new Company(fields);
            }

            case "CompanyLocation": {
                return new CompanyLocation(fields);
            }

            case "CustomerAccountAppExtensionPage": {
                return new CustomerAccountAppExtensionPage(fields);
            }

            case "CustomerAccountNativePage": {
                return new CustomerAccountNativePage(fields);
            }

            case "DraftOrder": {
                return new DraftOrder(fields);
            }

            case "Page": {
                return new Page(fields);
            }

            case "Product": {
                return new Product(fields);
            }

            case "ProductVariant": {
                return new ProductVariant(fields);
            }

            default: {
                return new UnknownNavigable(fields);
            }
        }
    }

    public String getGraphQlTypeName() {
        return (String) get("__typename");
    }

    /**
    * A default [cursor](https://shopify.dev/api/usage/pagination-graphql) that returns the single next
    * record, sorted ascending by ID.
    */

    public String getDefaultCursor() {
        return (String) get("defaultCursor");
    }

    public UnknownNavigable setDefaultCursor(String arg) {
        optimisticData.put(getKey("defaultCursor"), arg);
        return this;
    }

    public boolean unwrapsToObject(String key) {
        switch (getFieldName(key)) {
            case "defaultCursor": return false;

            default: return false;
        }
    }
}

