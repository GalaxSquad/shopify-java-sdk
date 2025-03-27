// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.shopify.graphql.support.AbstractResponse;
import com.shopify.graphql.support.SchemaViolationError;
import java.math.BigDecimal;
import java.util.Map;

/**
* Marketing engagement represents customer activity taken on a marketing activity or a marketing
* channel.
*/
public class MarketingEngagement extends AbstractResponse<MarketingEngagement> {
    public MarketingEngagement() {
    }

    public MarketingEngagement(JsonObject fields) throws SchemaViolationError {
        for (Map.Entry<String, JsonElement> field : fields.entrySet()) {
            String key = field.getKey();
            String fieldName = getFieldName(key);
            switch (fieldName) {
                case "adSpend": {
                    MoneyV2 optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new MoneyV2(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "channelHandle": {
                    String optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = jsonAsString(field.getValue(), key);
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "clicksCount": {
                    Integer optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = jsonAsInteger(field.getValue(), key);
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "commentsCount": {
                    Integer optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = jsonAsInteger(field.getValue(), key);
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "complaintsCount": {
                    Integer optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = jsonAsInteger(field.getValue(), key);
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "failsCount": {
                    Integer optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = jsonAsInteger(field.getValue(), key);
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "favoritesCount": {
                    Integer optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = jsonAsInteger(field.getValue(), key);
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "firstTimeCustomers": {
                    BigDecimal optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new BigDecimal(jsonAsString(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "impressionsCount": {
                    Integer optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = jsonAsInteger(field.getValue(), key);
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "isCumulative": {
                    responseData.put(key, jsonAsBoolean(field.getValue(), key));

                    break;
                }

                case "marketingActivity": {
                    MarketingActivity optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new MarketingActivity(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "occurredOn": {
                    responseData.put(key, jsonAsString(field.getValue(), key));

                    break;
                }

                case "orders": {
                    BigDecimal optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new BigDecimal(jsonAsString(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "returningCustomers": {
                    BigDecimal optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new BigDecimal(jsonAsString(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "sales": {
                    MoneyV2 optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new MoneyV2(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "sendsCount": {
                    Integer optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = jsonAsInteger(field.getValue(), key);
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "sessionsCount": {
                    Integer optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = jsonAsInteger(field.getValue(), key);
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "sharesCount": {
                    Integer optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = jsonAsInteger(field.getValue(), key);
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "uniqueClicksCount": {
                    Integer optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = jsonAsInteger(field.getValue(), key);
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "uniqueViewsCount": {
                    Integer optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = jsonAsInteger(field.getValue(), key);
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "unsubscribesCount": {
                    Integer optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = jsonAsInteger(field.getValue(), key);
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "utcOffset": {
                    responseData.put(key, jsonAsString(field.getValue(), key));

                    break;
                }

                case "viewsCount": {
                    Integer optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = jsonAsInteger(field.getValue(), key);
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
        return "MarketingEngagement";
    }

    /**
    * The total ad spend for the marketing content. Recurring weekly, monthly, or yearly spend needs to be
    * divided into daily amounts.
    */

    public MoneyV2 getAdSpend() {
        return (MoneyV2) get("adSpend");
    }

    public MarketingEngagement setAdSpend(MoneyV2 arg) {
        optimisticData.put(getKey("adSpend"), arg);
        return this;
    }

    /**
    * The unique string identifier of the channel to which the engagement metrics are being provided. This
    * should be set when and only when providing channel-level engagements. This should be nil when
    * providing activity-level engagements. For the correct handle for your channel, contact your partner
    * manager.
    */

    public String getChannelHandle() {
        return (String) get("channelHandle");
    }

    public MarketingEngagement setChannelHandle(String arg) {
        optimisticData.put(getKey("channelHandle"), arg);
        return this;
    }

    /**
    * The total number of interactions, such as a button press or a screen touch, that occurred on the
    * marketing content.
    */

    public Integer getClicksCount() {
        return (Integer) get("clicksCount");
    }

    public MarketingEngagement setClicksCount(Integer arg) {
        optimisticData.put(getKey("clicksCount"), arg);
        return this;
    }

    /**
    * The total number of comments on the marketing content.
    */

    public Integer getCommentsCount() {
        return (Integer) get("commentsCount");
    }

    public MarketingEngagement setCommentsCount(Integer arg) {
        optimisticData.put(getKey("commentsCount"), arg);
        return this;
    }

    /**
    * The total number of complaints on the marketing content. For message-based platforms such as email
    * or SMS, this represents the number of marketing emails or messages that were marked as spam. For
    * social media platforms, this represents the number of dislikes or the number of times marketing
    * content was reported.
    */

    public Integer getComplaintsCount() {
        return (Integer) get("complaintsCount");
    }

    public MarketingEngagement setComplaintsCount(Integer arg) {
        optimisticData.put(getKey("complaintsCount"), arg);
        return this;
    }

    /**
    * The total number of fails for the marketing content. For message-based platforms such as email or
    * SMS, this represents the number of bounced marketing emails or messages.
    */

    public Integer getFailsCount() {
        return (Integer) get("failsCount");
    }

    public MarketingEngagement setFailsCount(Integer arg) {
        optimisticData.put(getKey("failsCount"), arg);
        return this;
    }

    /**
    * The total number of favorites, likes, saves, or bookmarks on the marketing content.
    */

    public Integer getFavoritesCount() {
        return (Integer) get("favoritesCount");
    }

    public MarketingEngagement setFavoritesCount(Integer arg) {
        optimisticData.put(getKey("favoritesCount"), arg);
        return this;
    }

    /**
    * The number of customers that have placed their first order. Doesn't include adjustments such as
    * edits, exchanges, or returns.
    */

    public BigDecimal getFirstTimeCustomers() {
        return (BigDecimal) get("firstTimeCustomers");
    }

    public MarketingEngagement setFirstTimeCustomers(BigDecimal arg) {
        optimisticData.put(getKey("firstTimeCustomers"), arg);
        return this;
    }

    /**
    * The total number of times marketing content was displayed to users, whether or not an interaction
    * occurred. For message-based platforms such as email or SMS, this represents the number of marketing
    * emails or messages that were delivered.
    */

    public Integer getImpressionsCount() {
        return (Integer) get("impressionsCount");
    }

    public MarketingEngagement setImpressionsCount(Integer arg) {
        optimisticData.put(getKey("impressionsCount"), arg);
        return this;
    }

    /**
    * Specifies how the provided metrics have been aggregated. Cumulative metrics are aggregated from the
    * first day of reporting up to and including `occuredOn`. Non-cumulative metrics are aggregated over
    * the single day indicated in `occuredOn`. Cumulative metrics will monotonically increase in time as
    * each record includes the previous day's values, and so on. Non-cumulative is strongly preferred, and
    * support for cumulative metrics may be deprecated in the future.
    */

    public Boolean getIsCumulative() {
        return (Boolean) get("isCumulative");
    }

    public MarketingEngagement setIsCumulative(Boolean arg) {
        optimisticData.put(getKey("isCumulative"), arg);
        return this;
    }

    /**
    * The marketing activity object related to this engagement. This corresponds to the
    * marketingActivityId passed in on creation of the engagement.
    */

    public MarketingActivity getMarketingActivity() {
        return (MarketingActivity) get("marketingActivity");
    }

    public MarketingEngagement setMarketingActivity(MarketingActivity arg) {
        optimisticData.put(getKey("marketingActivity"), arg);
        return this;
    }

    /**
    * The calendar date (in the time zone offset specified by the utcOffset field) for which the metrics
    * are being reported. For example, a shop in UTC-5 would set utcOffset="-05:00" and aggregate all
    * engagements from 05:00:00Z up to 29:00:00Z (5am UTC next day) for each call.
    */

    public String getOccurredOn() {
        return (String) get("occurredOn");
    }

    public MarketingEngagement setOccurredOn(String arg) {
        optimisticData.put(getKey("occurredOn"), arg);
        return this;
    }

    /**
    * The number of orders generated from the marketing content.
    */

    public BigDecimal getOrders() {
        return (BigDecimal) get("orders");
    }

    public MarketingEngagement setOrders(BigDecimal arg) {
        optimisticData.put(getKey("orders"), arg);
        return this;
    }

    /**
    * The number of returning customers that have placed an order. Doesn't include adjustments such as
    * edits, exchanges, or returns.
    */

    public BigDecimal getReturningCustomers() {
        return (BigDecimal) get("returningCustomers");
    }

    public MarketingEngagement setReturningCustomers(BigDecimal arg) {
        optimisticData.put(getKey("returningCustomers"), arg);
        return this;
    }

    /**
    * The amount of sales generated from the marketing content.
    */

    public MoneyV2 getSales() {
        return (MoneyV2) get("sales");
    }

    public MarketingEngagement setSales(MoneyV2 arg) {
        optimisticData.put(getKey("sales"), arg);
        return this;
    }

    /**
    * The total number of marketing emails or messages that were sent.
    */

    public Integer getSendsCount() {
        return (Integer) get("sendsCount");
    }

    public MarketingEngagement setSendsCount(Integer arg) {
        optimisticData.put(getKey("sendsCount"), arg);
        return this;
    }

    /**
    * The number of online store sessions generated from the marketing content.
    */

    public Integer getSessionsCount() {
        return (Integer) get("sessionsCount");
    }

    public MarketingEngagement setSessionsCount(Integer arg) {
        optimisticData.put(getKey("sessionsCount"), arg);
        return this;
    }

    /**
    * The total number of times marketing content was distributed or reposted to either one's own network
    * of followers through a social media platform or other digital channels. For message-based platforms
    * such as email or SMS, this represents the number of times marketing emails or messages were
    * forwarded.
    */

    public Integer getSharesCount() {
        return (Integer) get("sharesCount");
    }

    public MarketingEngagement setSharesCount(Integer arg) {
        optimisticData.put(getKey("sharesCount"), arg);
        return this;
    }

    /**
    * The total number of unique clicks on the marketing content.
    */

    public Integer getUniqueClicksCount() {
        return (Integer) get("uniqueClicksCount");
    }

    public MarketingEngagement setUniqueClicksCount(Integer arg) {
        optimisticData.put(getKey("uniqueClicksCount"), arg);
        return this;
    }

    /**
    * The total number of all users who saw marketing content since it was published. For  message-based
    * platforms such as email or SMS, this represents the number of unique users that opened a  marketing
    * email or message. For video-based content, this represents the number of unique users that  played
    * video content.
    */

    public Integer getUniqueViewsCount() {
        return (Integer) get("uniqueViewsCount");
    }

    public MarketingEngagement setUniqueViewsCount(Integer arg) {
        optimisticData.put(getKey("uniqueViewsCount"), arg);
        return this;
    }

    /**
    * The total number of unsubscribes on the marketing content. For social media platforms, this
    * represents the number of unfollows.
    */

    public Integer getUnsubscribesCount() {
        return (Integer) get("unsubscribesCount");
    }

    public MarketingEngagement setUnsubscribesCount(Integer arg) {
        optimisticData.put(getKey("unsubscribesCount"), arg);
        return this;
    }

    /**
    * The UTC offset for the time zone in which the metrics are being reported, in the format `"+HH:MM"`
    * or `"-HH:MM"`. Used in combination with occurredOn when aggregating daily metrics. Must match the
    * account settings for the shop to minimize eventual discrepancies in reporting.
    */

    public String getUtcOffset() {
        return (String) get("utcOffset");
    }

    public MarketingEngagement setUtcOffset(String arg) {
        optimisticData.put(getKey("utcOffset"), arg);
        return this;
    }

    /**
    * The total number of views on the marketing content. For message-based platforms such as email or
    * SMS, this represents the number of times marketing emails or messages were opened. For video-based
    * content, this represents the number of times videos were played.
    */

    public Integer getViewsCount() {
        return (Integer) get("viewsCount");
    }

    public MarketingEngagement setViewsCount(Integer arg) {
        optimisticData.put(getKey("viewsCount"), arg);
        return this;
    }

    public boolean unwrapsToObject(String key) {
        switch (getFieldName(key)) {
            case "adSpend": return true;

            case "channelHandle": return false;

            case "clicksCount": return false;

            case "commentsCount": return false;

            case "complaintsCount": return false;

            case "failsCount": return false;

            case "favoritesCount": return false;

            case "firstTimeCustomers": return false;

            case "impressionsCount": return false;

            case "isCumulative": return false;

            case "marketingActivity": return true;

            case "occurredOn": return false;

            case "orders": return false;

            case "returningCustomers": return false;

            case "sales": return true;

            case "sendsCount": return false;

            case "sessionsCount": return false;

            case "sharesCount": return false;

            case "uniqueClicksCount": return false;

            case "uniqueViewsCount": return false;

            case "unsubscribesCount": return false;

            case "utcOffset": return false;

            case "viewsCount": return false;

            default: return false;
        }
    }
}

