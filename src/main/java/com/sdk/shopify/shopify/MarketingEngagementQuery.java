// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* Marketing engagement represents customer activity taken on a marketing activity or a marketing
* channel.
*/
public class MarketingEngagementQuery extends Query<MarketingEngagementQuery> {
    MarketingEngagementQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * The total ad spend for the marketing content. Recurring weekly, monthly, or yearly spend needs to be
    * divided into daily amounts.
    */
    public MarketingEngagementQuery adSpend(MoneyV2QueryDefinition queryDef) {
        startField("adSpend");

        _queryBuilder.append('{');
        queryDef.define(new MoneyV2Query(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The unique string identifier of the channel to which the engagement metrics are being provided. This
    * should be set when and only when providing channel-level engagements. This should be nil when
    * providing activity-level engagements. For the correct handle for your channel, contact your partner
    * manager.
    */
    public MarketingEngagementQuery channelHandle() {
        startField("channelHandle");

        return this;
    }

    /**
    * The total number of interactions, such as a button press or a screen touch, that occurred on the
    * marketing content.
    */
    public MarketingEngagementQuery clicksCount() {
        startField("clicksCount");

        return this;
    }

    /**
    * The total number of comments on the marketing content.
    */
    public MarketingEngagementQuery commentsCount() {
        startField("commentsCount");

        return this;
    }

    /**
    * The total number of complaints on the marketing content. For message-based platforms such as email
    * or SMS, this represents the number of marketing emails or messages that were marked as spam. For
    * social media platforms, this represents the number of dislikes or the number of times marketing
    * content was reported.
    */
    public MarketingEngagementQuery complaintsCount() {
        startField("complaintsCount");

        return this;
    }

    /**
    * The total number of fails for the marketing content. For message-based platforms such as email or
    * SMS, this represents the number of bounced marketing emails or messages.
    */
    public MarketingEngagementQuery failsCount() {
        startField("failsCount");

        return this;
    }

    /**
    * The total number of favorites, likes, saves, or bookmarks on the marketing content.
    */
    public MarketingEngagementQuery favoritesCount() {
        startField("favoritesCount");

        return this;
    }

    /**
    * The number of customers that have placed their first order. Doesn't include adjustments such as
    * edits, exchanges, or returns.
    */
    public MarketingEngagementQuery firstTimeCustomers() {
        startField("firstTimeCustomers");

        return this;
    }

    /**
    * The total number of times marketing content was displayed to users, whether or not an interaction
    * occurred. For message-based platforms such as email or SMS, this represents the number of marketing
    * emails or messages that were delivered.
    */
    public MarketingEngagementQuery impressionsCount() {
        startField("impressionsCount");

        return this;
    }

    /**
    * Specifies how the provided metrics have been aggregated. Cumulative metrics are aggregated from the
    * first day of reporting up to and including `occuredOn`. Non-cumulative metrics are aggregated over
    * the single day indicated in `occuredOn`. Cumulative metrics will monotonically increase in time as
    * each record includes the previous day's values, and so on. Non-cumulative is strongly preferred, and
    * support for cumulative metrics may be deprecated in the future.
    */
    public MarketingEngagementQuery isCumulative() {
        startField("isCumulative");

        return this;
    }

    /**
    * The marketing activity object related to this engagement. This corresponds to the
    * marketingActivityId passed in on creation of the engagement.
    */
    public MarketingEngagementQuery marketingActivity(MarketingActivityQueryDefinition queryDef) {
        startField("marketingActivity");

        _queryBuilder.append('{');
        queryDef.define(new MarketingActivityQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The calendar date (in the time zone offset specified by the utcOffset field) for which the metrics
    * are being reported. For example, a shop in UTC-5 would set utcOffset="-05:00" and aggregate all
    * engagements from 05:00:00Z up to 29:00:00Z (5am UTC next day) for each call.
    */
    public MarketingEngagementQuery occurredOn() {
        startField("occurredOn");

        return this;
    }

    /**
    * The number of orders generated from the marketing content.
    */
    public MarketingEngagementQuery orders() {
        startField("orders");

        return this;
    }

    /**
    * The number of returning customers that have placed an order. Doesn't include adjustments such as
    * edits, exchanges, or returns.
    */
    public MarketingEngagementQuery returningCustomers() {
        startField("returningCustomers");

        return this;
    }

    /**
    * The amount of sales generated from the marketing content.
    */
    public MarketingEngagementQuery sales(MoneyV2QueryDefinition queryDef) {
        startField("sales");

        _queryBuilder.append('{');
        queryDef.define(new MoneyV2Query(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The total number of marketing emails or messages that were sent.
    */
    public MarketingEngagementQuery sendsCount() {
        startField("sendsCount");

        return this;
    }

    /**
    * The number of online store sessions generated from the marketing content.
    */
    public MarketingEngagementQuery sessionsCount() {
        startField("sessionsCount");

        return this;
    }

    /**
    * The total number of times marketing content was distributed or reposted to either one's own network
    * of followers through a social media platform or other digital channels. For message-based platforms
    * such as email or SMS, this represents the number of times marketing emails or messages were
    * forwarded.
    */
    public MarketingEngagementQuery sharesCount() {
        startField("sharesCount");

        return this;
    }

    /**
    * The total number of unique clicks on the marketing content.
    */
    public MarketingEngagementQuery uniqueClicksCount() {
        startField("uniqueClicksCount");

        return this;
    }

    /**
    * The total number of all users who saw marketing content since it was published. For  message-based
    * platforms such as email or SMS, this represents the number of unique users that opened a  marketing
    * email or message. For video-based content, this represents the number of unique users that  played
    * video content.
    */
    public MarketingEngagementQuery uniqueViewsCount() {
        startField("uniqueViewsCount");

        return this;
    }

    /**
    * The total number of unsubscribes on the marketing content. For social media platforms, this
    * represents the number of unfollows.
    */
    public MarketingEngagementQuery unsubscribesCount() {
        startField("unsubscribesCount");

        return this;
    }

    /**
    * The UTC offset for the time zone in which the metrics are being reported, in the format `"+HH:MM"`
    * or `"-HH:MM"`. Used in combination with occurredOn when aggregating daily metrics. Must match the
    * account settings for the shop to minimize eventual discrepancies in reporting.
    */
    public MarketingEngagementQuery utcOffset() {
        startField("utcOffset");

        return this;
    }

    /**
    * The total number of views on the marketing content. For message-based platforms such as email or
    * SMS, this represents the number of times marketing emails or messages were opened. For video-based
    * content, this represents the number of times videos were played.
    */
    public MarketingEngagementQuery viewsCount() {
        startField("viewsCount");

        return this;
    }
}
