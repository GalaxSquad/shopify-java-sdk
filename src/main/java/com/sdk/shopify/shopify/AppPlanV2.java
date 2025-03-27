// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.shopify.graphql.support.AbstractResponse;
import com.shopify.graphql.support.SchemaViolationError;
import java.util.Map;

/**
* The app plan that the merchant is subscribed to.
*/
public class AppPlanV2 extends AbstractResponse<AppPlanV2> {
    public AppPlanV2() {
    }

    public AppPlanV2(JsonObject fields) throws SchemaViolationError {
        for (Map.Entry<String, JsonElement> field : fields.entrySet()) {
            String key = field.getKey();
            String fieldName = getFieldName(key);
            switch (fieldName) {
                case "pricingDetails": {
                    responseData.put(key, UnknownAppPricingDetails.create(jsonAsObject(field.getValue(), key)));

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
        return "AppPlanV2";
    }

    /**
    * The plan billed to a shop on a recurring basis.
    */

    public AppPricingDetails getPricingDetails() {
        return (AppPricingDetails) get("pricingDetails");
    }

    public AppPlanV2 setPricingDetails(AppPricingDetails arg) {
        optimisticData.put(getKey("pricingDetails"), arg);
        return this;
    }

    public boolean unwrapsToObject(String key) {
        switch (getFieldName(key)) {
            case "pricingDetails": return false;

            default: return false;
        }
    }
}

