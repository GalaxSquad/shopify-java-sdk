// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.shopify.graphql.support.AbstractResponse;
import com.shopify.graphql.support.Arguments;
import com.shopify.graphql.support.Error;
import com.shopify.graphql.support.Query;
import com.shopify.graphql.support.SchemaViolationError;
import com.shopify.graphql.support.TopLevelResponse;
import com.shopify.graphql.support.Input;

import com.shopify.graphql.support.ID;

/**
* Represents actions that market a merchant's store or products.
*/
public class MarketingEventQuery extends Query<MarketingEventQuery> {
    MarketingEventQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);

        startField("id");
    }

    /**
    * The app that the marketing event is attributed to.
    */
    public MarketingEventQuery app(AppQueryDefinition queryDef) {
        startField("app");

        _queryBuilder.append('{');
        queryDef.define(new AppQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The unique string identifier of the channel to which this activity belongs. For the correct handle
    * for your channel, contact your partner manager.
    */
    public MarketingEventQuery channelHandle() {
        startField("channelHandle");

        return this;
    }

    /**
    * A human-readable description of the marketing event.
    */
    public MarketingEventQuery description() {
        startField("description");

        return this;
    }

    /**
    * The date and time when the marketing event ended.
    */
    public MarketingEventQuery endedAt() {
        startField("endedAt");

        return this;
    }

    /**
    * The ID of the corresponding resource in the REST Admin API.
    */
    public MarketingEventQuery legacyResourceId() {
        startField("legacyResourceId");

        return this;
    }

    /**
    * The URL where the marketing event can be managed.
    */
    public MarketingEventQuery manageUrl() {
        startField("manageUrl");

        return this;
    }

    /**
    * The medium through which the marketing activity and event reached consumers. This is used for
    * reporting aggregation.
    */
    public MarketingEventQuery marketingChannelType() {
        startField("marketingChannelType");

        return this;
    }

    /**
    * The URL where the marketing event can be previewed.
    */
    public MarketingEventQuery previewUrl() {
        startField("previewUrl");

        return this;
    }

    /**
    * An optional ID that helps Shopify validate engagement data.
    */
    public MarketingEventQuery remoteId() {
        startField("remoteId");

        return this;
    }

    /**
    * The date and time when the marketing event is scheduled to end.
    */
    public MarketingEventQuery scheduledToEndAt() {
        startField("scheduledToEndAt");

        return this;
    }

    /**
    * Where the `MarketingEvent` occurred and what kind of content was used.
    * Because `utmSource` and `utmMedium` are often used interchangeably, this is
    * based on a combination of `marketingChannel`, `referringDomain`, and `type` to
    * provide a consistent representation for any given piece of marketing
    * regardless of the app that created it.
    */
    public MarketingEventQuery sourceAndMedium() {
        startField("sourceAndMedium");

        return this;
    }

    /**
    * The date and time when the marketing event started.
    */
    public MarketingEventQuery startedAt() {
        startField("startedAt");

        return this;
    }

    /**
    * The marketing event type.
    */
    public MarketingEventQuery type() {
        startField("type");

        return this;
    }

    /**
    * The name of the marketing campaign.
    */
    public MarketingEventQuery utmCampaign() {
        startField("utmCampaign");

        return this;
    }

    /**
    * The medium that the marketing campaign is using. Example values: `cpc`, `banner`.
    */
    public MarketingEventQuery utmMedium() {
        startField("utmMedium");

        return this;
    }

    /**
    * The referrer of the marketing event. Example values: `google`, `newsletter`.
    */
    public MarketingEventQuery utmSource() {
        startField("utmSource");

        return this;
    }
}
