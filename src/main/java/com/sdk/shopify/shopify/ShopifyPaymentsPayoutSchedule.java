// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.shopify.graphql.support.AbstractResponse;
import com.shopify.graphql.support.SchemaViolationError;
import java.util.Map;

/**
* The payment schedule for a payments account.
*/
public class ShopifyPaymentsPayoutSchedule extends AbstractResponse<ShopifyPaymentsPayoutSchedule> {
    public ShopifyPaymentsPayoutSchedule() {
    }

    public ShopifyPaymentsPayoutSchedule(JsonObject fields) throws SchemaViolationError {
        for (Map.Entry<String, JsonElement> field : fields.entrySet()) {
            String key = field.getKey();
            String fieldName = getFieldName(key);
            switch (fieldName) {
                case "interval": {
                    responseData.put(key, ShopifyPaymentsPayoutInterval.fromGraphQl(jsonAsString(field.getValue(), key)));

                    break;
                }

                case "monthlyAnchor": {
                    Integer optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = jsonAsInteger(field.getValue(), key);
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "weeklyAnchor": {
                    DayOfTheWeek optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = DayOfTheWeek.fromGraphQl(jsonAsString(field.getValue(), key));
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
        return "ShopifyPaymentsPayoutSchedule";
    }

    /**
    * The interval at which payouts are sent to the connected bank account.
    */

    public ShopifyPaymentsPayoutInterval getInterval() {
        return (ShopifyPaymentsPayoutInterval) get("interval");
    }

    public ShopifyPaymentsPayoutSchedule setInterval(ShopifyPaymentsPayoutInterval arg) {
        optimisticData.put(getKey("interval"), arg);
        return this;
    }

    /**
    * The day of the month funds will be paid out.
    * The value can be any day of the month from the 1st to the 31st.
    * If the payment interval is set to monthly, this value will be used.
    * Payouts scheduled between 29-31st of the month are sent on the last day of shorter months.
    */

    public Integer getMonthlyAnchor() {
        return (Integer) get("monthlyAnchor");
    }

    public ShopifyPaymentsPayoutSchedule setMonthlyAnchor(Integer arg) {
        optimisticData.put(getKey("monthlyAnchor"), arg);
        return this;
    }

    /**
    * The day of the week funds will be paid out.
    * The value can be any weekday from Monday to Friday.
    * If the payment interval is set to weekly, this value will be used.
    */

    public DayOfTheWeek getWeeklyAnchor() {
        return (DayOfTheWeek) get("weeklyAnchor");
    }

    public ShopifyPaymentsPayoutSchedule setWeeklyAnchor(DayOfTheWeek arg) {
        optimisticData.put(getKey("weeklyAnchor"), arg);
        return this;
    }

    public boolean unwrapsToObject(String key) {
        switch (getFieldName(key)) {
            case "interval": return false;

            case "monthlyAnchor": return false;

            case "weeklyAnchor": return false;

            default: return false;
        }
    }
}

