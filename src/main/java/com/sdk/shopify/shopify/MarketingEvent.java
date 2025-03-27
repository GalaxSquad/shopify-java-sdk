// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.shopify.graphql.support.AbstractResponse;
import com.shopify.graphql.support.ID;
import com.shopify.graphql.support.SchemaViolationError;
import java.util.Map;

/**
* Represents actions that market a merchant's store or products.
*/
public class MarketingEvent extends AbstractResponse<MarketingEvent> implements LegacyInteroperability, Node {
    public MarketingEvent() {
    }

    public MarketingEvent(JsonObject fields) throws SchemaViolationError {
        for (Map.Entry<String, JsonElement> field : fields.entrySet()) {
            String key = field.getKey();
            String fieldName = getFieldName(key);
            switch (fieldName) {
                case "app": {
                    responseData.put(key, new App(jsonAsObject(field.getValue(), key)));

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

                case "description": {
                    String optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = jsonAsString(field.getValue(), key);
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "endedAt": {
                    String optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = jsonAsString(field.getValue(), key);
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "id": {
                    responseData.put(key, new ID(jsonAsString(field.getValue(), key)));

                    break;
                }

                case "legacyResourceId": {
                    responseData.put(key, jsonAsString(field.getValue(), key));

                    break;
                }

                case "manageUrl": {
                    String optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = jsonAsString(field.getValue(), key);
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "marketingChannelType": {
                    MarketingChannel optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = MarketingChannel.fromGraphQl(jsonAsString(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "previewUrl": {
                    String optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = jsonAsString(field.getValue(), key);
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "remoteId": {
                    String optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = jsonAsString(field.getValue(), key);
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "scheduledToEndAt": {
                    String optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = jsonAsString(field.getValue(), key);
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "sourceAndMedium": {
                    responseData.put(key, jsonAsString(field.getValue(), key));

                    break;
                }

                case "startedAt": {
                    responseData.put(key, jsonAsString(field.getValue(), key));

                    break;
                }

                case "type": {
                    responseData.put(key, MarketingTactic.fromGraphQl(jsonAsString(field.getValue(), key)));

                    break;
                }

                case "utmCampaign": {
                    String optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = jsonAsString(field.getValue(), key);
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "utmMedium": {
                    String optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = jsonAsString(field.getValue(), key);
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "utmSource": {
                    String optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = jsonAsString(field.getValue(), key);
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

    public MarketingEvent(ID id) {
        this();
        optimisticData.put("id", id);
    }

    public String getGraphQlTypeName() {
        return "MarketingEvent";
    }

    /**
    * The app that the marketing event is attributed to.
    */

    public App getApp() {
        return (App) get("app");
    }

    public MarketingEvent setApp(App arg) {
        optimisticData.put(getKey("app"), arg);
        return this;
    }

    /**
    * The unique string identifier of the channel to which this activity belongs. For the correct handle
    * for your channel, contact your partner manager.
    */

    public String getChannelHandle() {
        return (String) get("channelHandle");
    }

    public MarketingEvent setChannelHandle(String arg) {
        optimisticData.put(getKey("channelHandle"), arg);
        return this;
    }

    /**
    * A human-readable description of the marketing event.
    */

    public String getDescription() {
        return (String) get("description");
    }

    public MarketingEvent setDescription(String arg) {
        optimisticData.put(getKey("description"), arg);
        return this;
    }

    /**
    * The date and time when the marketing event ended.
    */

    public String getEndedAt() {
        return (String) get("endedAt");
    }

    public MarketingEvent setEndedAt(String arg) {
        optimisticData.put(getKey("endedAt"), arg);
        return this;
    }

    /**
    * A globally-unique ID.
    */

    public ID getId() {
        return (ID) get("id");
    }

    /**
    * The ID of the corresponding resource in the REST Admin API.
    */

    public String getLegacyResourceId() {
        return (String) get("legacyResourceId");
    }

    public MarketingEvent setLegacyResourceId(String arg) {
        optimisticData.put(getKey("legacyResourceId"), arg);
        return this;
    }

    /**
    * The URL where the marketing event can be managed.
    */

    public String getManageUrl() {
        return (String) get("manageUrl");
    }

    public MarketingEvent setManageUrl(String arg) {
        optimisticData.put(getKey("manageUrl"), arg);
        return this;
    }

    /**
    * The medium through which the marketing activity and event reached consumers. This is used for
    * reporting aggregation.
    */

    public MarketingChannel getMarketingChannelType() {
        return (MarketingChannel) get("marketingChannelType");
    }

    public MarketingEvent setMarketingChannelType(MarketingChannel arg) {
        optimisticData.put(getKey("marketingChannelType"), arg);
        return this;
    }

    /**
    * The URL where the marketing event can be previewed.
    */

    public String getPreviewUrl() {
        return (String) get("previewUrl");
    }

    public MarketingEvent setPreviewUrl(String arg) {
        optimisticData.put(getKey("previewUrl"), arg);
        return this;
    }

    /**
    * An optional ID that helps Shopify validate engagement data.
    */

    public String getRemoteId() {
        return (String) get("remoteId");
    }

    public MarketingEvent setRemoteId(String arg) {
        optimisticData.put(getKey("remoteId"), arg);
        return this;
    }

    /**
    * The date and time when the marketing event is scheduled to end.
    */

    public String getScheduledToEndAt() {
        return (String) get("scheduledToEndAt");
    }

    public MarketingEvent setScheduledToEndAt(String arg) {
        optimisticData.put(getKey("scheduledToEndAt"), arg);
        return this;
    }

    /**
    * Where the `MarketingEvent` occurred and what kind of content was used.
    * Because `utmSource` and `utmMedium` are often used interchangeably, this is
    * based on a combination of `marketingChannel`, `referringDomain`, and `type` to
    * provide a consistent representation for any given piece of marketing
    * regardless of the app that created it.
    */

    public String getSourceAndMedium() {
        return (String) get("sourceAndMedium");
    }

    public MarketingEvent setSourceAndMedium(String arg) {
        optimisticData.put(getKey("sourceAndMedium"), arg);
        return this;
    }

    /**
    * The date and time when the marketing event started.
    */

    public String getStartedAt() {
        return (String) get("startedAt");
    }

    public MarketingEvent setStartedAt(String arg) {
        optimisticData.put(getKey("startedAt"), arg);
        return this;
    }

    /**
    * The marketing event type.
    */

    public MarketingTactic getType() {
        return (MarketingTactic) get("type");
    }

    public MarketingEvent setType(MarketingTactic arg) {
        optimisticData.put(getKey("type"), arg);
        return this;
    }

    /**
    * The name of the marketing campaign.
    */

    public String getUtmCampaign() {
        return (String) get("utmCampaign");
    }

    public MarketingEvent setUtmCampaign(String arg) {
        optimisticData.put(getKey("utmCampaign"), arg);
        return this;
    }

    /**
    * The medium that the marketing campaign is using. Example values: `cpc`, `banner`.
    */

    public String getUtmMedium() {
        return (String) get("utmMedium");
    }

    public MarketingEvent setUtmMedium(String arg) {
        optimisticData.put(getKey("utmMedium"), arg);
        return this;
    }

    /**
    * The referrer of the marketing event. Example values: `google`, `newsletter`.
    */

    public String getUtmSource() {
        return (String) get("utmSource");
    }

    public MarketingEvent setUtmSource(String arg) {
        optimisticData.put(getKey("utmSource"), arg);
        return this;
    }

    public boolean unwrapsToObject(String key) {
        switch (getFieldName(key)) {
            case "app": return true;

            case "channelHandle": return false;

            case "description": return false;

            case "endedAt": return false;

            case "id": return false;

            case "legacyResourceId": return false;

            case "manageUrl": return false;

            case "marketingChannelType": return false;

            case "previewUrl": return false;

            case "remoteId": return false;

            case "scheduledToEndAt": return false;

            case "sourceAndMedium": return false;

            case "startedAt": return false;

            case "type": return false;

            case "utmCampaign": return false;

            case "utmMedium": return false;

            case "utmSource": return false;

            default: return false;
        }
    }
}

