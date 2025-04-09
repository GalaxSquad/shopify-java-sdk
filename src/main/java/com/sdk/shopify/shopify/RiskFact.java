// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.shopify.graphql.support.AbstractResponse;
import com.shopify.graphql.support.SchemaViolationError;
import java.util.Map;

/**
* A risk fact belongs to a single risk assessment and serves to provide additional context for an
* assessment. Risk facts are not necessarily tied to the result of the recommendation.
*/
public class RiskFact extends AbstractResponse<RiskFact> {
    public RiskFact() {
    }

    public RiskFact(JsonObject fields) throws SchemaViolationError {
        for (Map.Entry<String, JsonElement> field : fields.entrySet()) {
            String key = field.getKey();
            String fieldName = getFieldName(key);
            switch (fieldName) {
                case "description": {
                    responseData.put(key, jsonAsString(field.getValue(), key));

                    break;
                }

                case "sentiment": {
                    responseData.put(key, RiskFactSentiment.fromGraphQl(jsonAsString(field.getValue(), key)));

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
        return "RiskFact";
    }

    /**
    * A description of the fact.
    */

    public String getDescription() {
        return (String) get("description");
    }

    public RiskFact setDescription(String arg) {
        optimisticData.put(getKey("description"), arg);
        return this;
    }

    /**
    * Indicates whether the fact is a negative, neutral or positive contributor with regards to risk.
    */

    public RiskFactSentiment getSentiment() {
        return (RiskFactSentiment) get("sentiment");
    }

    public RiskFact setSentiment(RiskFactSentiment arg) {
        optimisticData.put(getKey("sentiment"), arg);
        return this;
    }

    public boolean unwrapsToObject(String key) {
        switch (getFieldName(key)) {
            case "description": return false;

            case "sentiment": return false;

            default: return false;
        }
    }
}

