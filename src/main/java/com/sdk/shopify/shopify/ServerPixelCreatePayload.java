// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.shopify.graphql.support.AbstractResponse;
import com.shopify.graphql.support.SchemaViolationError;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
* Return type for `serverPixelCreate` mutation.
*/
public class ServerPixelCreatePayload extends AbstractResponse<ServerPixelCreatePayload> {
    public ServerPixelCreatePayload() {
    }

    public ServerPixelCreatePayload(JsonObject fields) throws SchemaViolationError {
        for (Map.Entry<String, JsonElement> field : fields.entrySet()) {
            String key = field.getKey();
            String fieldName = getFieldName(key);
            switch (fieldName) {
                case "serverPixel": {
                    ServerPixel optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new ServerPixel(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "userErrors": {
                    List<ErrorsServerPixelUserError> list1 = new ArrayList<>();
                    for (JsonElement element1 : jsonAsArray(field.getValue(), key)) {
                        list1.add(new ErrorsServerPixelUserError(jsonAsObject(element1, key)));
                    }

                    responseData.put(key, list1);

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
        return "ServerPixelCreatePayload";
    }

    /**
    * The new server pixel.
    */

    public ServerPixel getServerPixel() {
        return (ServerPixel) get("serverPixel");
    }

    public ServerPixelCreatePayload setServerPixel(ServerPixel arg) {
        optimisticData.put(getKey("serverPixel"), arg);
        return this;
    }

    /**
    * The list of errors that occurred from executing the mutation.
    */

    public List<ErrorsServerPixelUserError> getUserErrors() {
        return (List<ErrorsServerPixelUserError>) get("userErrors");
    }

    public ServerPixelCreatePayload setUserErrors(List<ErrorsServerPixelUserError> arg) {
        optimisticData.put(getKey("userErrors"), arg);
        return this;
    }

    public boolean unwrapsToObject(String key) {
        switch (getFieldName(key)) {
            case "serverPixel": return true;

            case "userErrors": return true;

            default: return false;
        }
    }
}

