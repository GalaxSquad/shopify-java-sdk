// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.shopify.graphql.support.AbstractResponse;
import com.shopify.graphql.support.SchemaViolationError;
import java.util.Map;

/**
* A condition checking the company location a visitor is purchasing for.
*/
public class CompanyLocationsCondition extends AbstractResponse<CompanyLocationsCondition> {
    public CompanyLocationsCondition() {
    }

    public CompanyLocationsCondition(JsonObject fields) throws SchemaViolationError {
        for (Map.Entry<String, JsonElement> field : fields.entrySet()) {
            String key = field.getKey();
            String fieldName = getFieldName(key);
            switch (fieldName) {
                case "applicationLevel": {
                    MarketConditionApplicationType optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = MarketConditionApplicationType.fromGraphQl(jsonAsString(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "companyLocations": {
                    responseData.put(key, new CompanyLocationConnection(jsonAsObject(field.getValue(), key)));

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
        return "CompanyLocationsCondition";
    }

    /**
    * The application level for the condition.
    */

    public MarketConditionApplicationType getApplicationLevel() {
        return (MarketConditionApplicationType) get("applicationLevel");
    }

    public CompanyLocationsCondition setApplicationLevel(MarketConditionApplicationType arg) {
        optimisticData.put(getKey("applicationLevel"), arg);
        return this;
    }

    /**
    * The company locations that comprise the market.
    */

    public CompanyLocationConnection getCompanyLocations() {
        return (CompanyLocationConnection) get("companyLocations");
    }

    public CompanyLocationsCondition setCompanyLocations(CompanyLocationConnection arg) {
        optimisticData.put(getKey("companyLocations"), arg);
        return this;
    }

    public boolean unwrapsToObject(String key) {
        switch (getFieldName(key)) {
            case "applicationLevel": return false;

            case "companyLocations": return true;

            default: return false;
        }
    }
}

