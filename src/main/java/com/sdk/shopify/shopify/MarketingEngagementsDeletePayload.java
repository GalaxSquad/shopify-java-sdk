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
* Return type for `marketingEngagementsDelete` mutation.
*/
public class MarketingEngagementsDeletePayload extends AbstractResponse<MarketingEngagementsDeletePayload> {
    public MarketingEngagementsDeletePayload() {
    }

    public MarketingEngagementsDeletePayload(JsonObject fields) throws SchemaViolationError {
        for (Map.Entry<String, JsonElement> field : fields.entrySet()) {
            String key = field.getKey();
            String fieldName = getFieldName(key);
            switch (fieldName) {
                case "result": {
                    String optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = jsonAsString(field.getValue(), key);
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "userErrors": {
                    List<MarketingActivityUserError> list1 = new ArrayList<>();
                    for (JsonElement element1 : jsonAsArray(field.getValue(), key)) {
                        list1.add(new MarketingActivityUserError(jsonAsObject(element1, key)));
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
        return "MarketingEngagementsDeletePayload";
    }

    /**
    * Informational message about the engagement data that has been marked for deletion.
    */

    public String getResult() {
        return (String) get("result");
    }

    public MarketingEngagementsDeletePayload setResult(String arg) {
        optimisticData.put(getKey("result"), arg);
        return this;
    }

    /**
    * The list of errors that occurred from executing the mutation.
    */

    public List<MarketingActivityUserError> getUserErrors() {
        return (List<MarketingActivityUserError>) get("userErrors");
    }

    public MarketingEngagementsDeletePayload setUserErrors(List<MarketingActivityUserError> arg) {
        optimisticData.put(getKey("userErrors"), arg);
        return this;
    }

    public boolean unwrapsToObject(String key) {
        switch (getFieldName(key)) {
            case "result": return false;

            case "userErrors": return true;

            default: return false;
        }
    }
}

