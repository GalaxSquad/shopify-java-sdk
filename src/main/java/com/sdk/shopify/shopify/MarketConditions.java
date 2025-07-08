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
* The conditions that determine whether a visitor is in a market.
*/
public class MarketConditions extends AbstractResponse<MarketConditions> {
    public MarketConditions() {
    }

    public MarketConditions(JsonObject fields) throws SchemaViolationError {
        for (Map.Entry<String, JsonElement> field : fields.entrySet()) {
            String key = field.getKey();
            String fieldName = getFieldName(key);
            switch (fieldName) {
                case "companyLocationsCondition": {
                    CompanyLocationsCondition optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new CompanyLocationsCondition(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "conditionTypes": {
                    List<MarketConditionType> list1 = new ArrayList<>();
                    for (JsonElement element1 : jsonAsArray(field.getValue(), key)) {
                        list1.add(MarketConditionType.fromGraphQl(jsonAsString(element1, key)));
                    }

                    responseData.put(key, list1);

                    break;
                }

                case "locationsCondition": {
                    LocationsCondition optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new LocationsCondition(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "regionsCondition": {
                    RegionsCondition optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new RegionsCondition(jsonAsObject(field.getValue(), key));
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
        return "MarketConditions";
    }

    /**
    * The company location conditions that determine whether a visitor is in the market.
    */

    public CompanyLocationsCondition getCompanyLocationsCondition() {
        return (CompanyLocationsCondition) get("companyLocationsCondition");
    }

    public MarketConditions setCompanyLocationsCondition(CompanyLocationsCondition arg) {
        optimisticData.put(getKey("companyLocationsCondition"), arg);
        return this;
    }

    /**
    * The set of condition types that are defined for the market.
    */

    public List<MarketConditionType> getConditionTypes() {
        return (List<MarketConditionType>) get("conditionTypes");
    }

    public MarketConditions setConditionTypes(List<MarketConditionType> arg) {
        optimisticData.put(getKey("conditionTypes"), arg);
        return this;
    }

    /**
    * The retail location conditions that determine whether a visitor is in the market.
    */

    public LocationsCondition getLocationsCondition() {
        return (LocationsCondition) get("locationsCondition");
    }

    public MarketConditions setLocationsCondition(LocationsCondition arg) {
        optimisticData.put(getKey("locationsCondition"), arg);
        return this;
    }

    /**
    * The region conditions that determine whether a visitor is in the market.
    */

    public RegionsCondition getRegionsCondition() {
        return (RegionsCondition) get("regionsCondition");
    }

    public MarketConditions setRegionsCondition(RegionsCondition arg) {
        optimisticData.put(getKey("regionsCondition"), arg);
        return this;
    }

    public boolean unwrapsToObject(String key) {
        switch (getFieldName(key)) {
            case "companyLocationsCondition": return true;

            case "conditionTypes": return false;

            case "locationsCondition": return true;

            case "regionsCondition": return true;

            default: return false;
        }
    }
}

