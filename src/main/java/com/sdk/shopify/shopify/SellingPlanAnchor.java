// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.shopify.graphql.support.AbstractResponse;
import com.shopify.graphql.support.SchemaViolationError;
import java.util.Map;

/**
* Specifies the date when delivery or fulfillment is completed by a merchant for a given time cycle.
* You can also
* define a cutoff for which customers are eligible to enter this cycle and the desired behavior for
* customers who
* start their subscription inside the cutoff period.
* Some example scenarios where anchors can be useful to implement advanced delivery behavior:
* - A merchant starts fulfillment on a specific date every month.
* - A merchant wants to bill the 1st of every quarter.
* - A customer expects their delivery every Tuesday.
* For more details, see [About Selling
* Plans](https://shopify.dev/docs/apps/build/purchase-options/subscriptions/selling-plans#anchors).
*/
public class SellingPlanAnchor extends AbstractResponse<SellingPlanAnchor> {
    public SellingPlanAnchor() {
    }

    public SellingPlanAnchor(JsonObject fields) throws SchemaViolationError {
        for (Map.Entry<String, JsonElement> field : fields.entrySet()) {
            String key = field.getKey();
            String fieldName = getFieldName(key);
            switch (fieldName) {
                case "cutoffDay": {
                    Integer optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = jsonAsInteger(field.getValue(), key);
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "day": {
                    responseData.put(key, jsonAsInteger(field.getValue(), key));

                    break;
                }

                case "month": {
                    Integer optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = jsonAsInteger(field.getValue(), key);
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "type": {
                    responseData.put(key, SellingPlanAnchorType.fromGraphQl(jsonAsString(field.getValue(), key)));

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
        return "SellingPlanAnchor";
    }

    /**
    * The cutoff day for the anchor. Specifies a buffer period before the anchor date for orders to be
    * included in a
    * delivery or fulfillment cycle.
    * If `type` is WEEKDAY, then the value must be between 1-7. Shopify interprets
    * the days of the week according to ISO 8601, where 1 is Monday.
    * If `type` is MONTHDAY, then the value must be between 1-31.
    * If `type` is YEARDAY, then the value must be `null`.
    */

    public Integer getCutoffDay() {
        return (Integer) get("cutoffDay");
    }

    public SellingPlanAnchor setCutoffDay(Integer arg) {
        optimisticData.put(getKey("cutoffDay"), arg);
        return this;
    }

    /**
    * The day of the anchor.
    * If `type` is WEEKDAY, then the value must be between 1-7. Shopify interprets
    * the days of the week according to ISO 8601, where 1 is Monday.
    * If `type` isn't WEEKDAY, then the value must be between 1-31.
    */

    public Integer getDay() {
        return (Integer) get("day");
    }

    public SellingPlanAnchor setDay(Integer arg) {
        optimisticData.put(getKey("day"), arg);
        return this;
    }

    /**
    * The month of the anchor. If type is different than YEARDAY, then the value must
    * be `null` or between 1-12.
    */

    public Integer getMonth() {
        return (Integer) get("month");
    }

    public SellingPlanAnchor setMonth(Integer arg) {
        optimisticData.put(getKey("month"), arg);
        return this;
    }

    /**
    * Represents the anchor type, it can be one one of WEEKDAY, MONTHDAY, YEARDAY.
    */

    public SellingPlanAnchorType getType() {
        return (SellingPlanAnchorType) get("type");
    }

    public SellingPlanAnchor setType(SellingPlanAnchorType arg) {
        optimisticData.put(getKey("type"), arg);
        return this;
    }

    public boolean unwrapsToObject(String key) {
        switch (getFieldName(key)) {
            case "cutoffDay": return false;

            case "day": return false;

            case "month": return false;

            case "type": return false;

            default: return false;
        }
    }
}

