// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.shopify.graphql.support.AbstractResponse;
import com.shopify.graphql.support.SchemaViolationError;
import java.util.Map;

/**
* Returns information about pagination in a connection, in accordance with the
* [Relay specification](https://relay.dev/graphql/connections.htm#sec-undefined.PageInfo).
* For more information, please read our [GraphQL Pagination Usage
* Guide](https://shopify.dev/api/usage/pagination-graphql).
*/
public class PageInfo extends AbstractResponse<PageInfo> {
    public PageInfo() {
    }

    public PageInfo(JsonObject fields) throws SchemaViolationError {
        for (Map.Entry<String, JsonElement> field : fields.entrySet()) {
            String key = field.getKey();
            String fieldName = getFieldName(key);
            switch (fieldName) {
                case "endCursor": {
                    String optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = jsonAsString(field.getValue(), key);
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "hasNextPage": {
                    responseData.put(key, jsonAsBoolean(field.getValue(), key));

                    break;
                }

                case "hasPreviousPage": {
                    responseData.put(key, jsonAsBoolean(field.getValue(), key));

                    break;
                }

                case "startCursor": {
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

    public String getGraphQlTypeName() {
        return "PageInfo";
    }

    /**
    * The cursor corresponding to the last node in edges.
    */

    public String getEndCursor() {
        return (String) get("endCursor");
    }

    public PageInfo setEndCursor(String arg) {
        optimisticData.put(getKey("endCursor"), arg);
        return this;
    }

    /**
    * Whether there are more pages to fetch following the current page.
    */

    public Boolean getHasNextPage() {
        return (Boolean) get("hasNextPage");
    }

    public PageInfo setHasNextPage(Boolean arg) {
        optimisticData.put(getKey("hasNextPage"), arg);
        return this;
    }

    /**
    * Whether there are any pages prior to the current page.
    */

    public Boolean getHasPreviousPage() {
        return (Boolean) get("hasPreviousPage");
    }

    public PageInfo setHasPreviousPage(Boolean arg) {
        optimisticData.put(getKey("hasPreviousPage"), arg);
        return this;
    }

    /**
    * The cursor corresponding to the first node in edges.
    */

    public String getStartCursor() {
        return (String) get("startCursor");
    }

    public PageInfo setStartCursor(String arg) {
        optimisticData.put(getKey("startCursor"), arg);
        return this;
    }

    public boolean unwrapsToObject(String key) {
        switch (getFieldName(key)) {
            case "endCursor": return false;

            case "hasNextPage": return false;

            case "hasPreviousPage": return false;

            case "startCursor": return false;

            default: return false;
        }
    }
}

