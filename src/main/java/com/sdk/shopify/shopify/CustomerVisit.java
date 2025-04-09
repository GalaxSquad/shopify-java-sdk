// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.shopify.graphql.support.AbstractResponse;
import com.shopify.graphql.support.ID;
import com.shopify.graphql.support.SchemaViolationError;
import java.util.Map;

/**
* Represents a customer's session visiting a shop's online store, including information about the
* marketing activity attributed to starting the session.
*/
public class CustomerVisit extends AbstractResponse<CustomerVisit> implements CustomerMoment, Node {
    public CustomerVisit() {
    }

    public CustomerVisit(JsonObject fields) throws SchemaViolationError {
        for (Map.Entry<String, JsonElement> field : fields.entrySet()) {
            String key = field.getKey();
            String fieldName = getFieldName(key);
            switch (fieldName) {
                case "id": {
                    responseData.put(key, new ID(jsonAsString(field.getValue(), key)));

                    break;
                }

                case "landingPage": {
                    String optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = jsonAsString(field.getValue(), key);
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "landingPageHtml": {
                    String optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = jsonAsString(field.getValue(), key);
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "marketingEvent": {
                    MarketingEvent optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new MarketingEvent(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "occurredAt": {
                    responseData.put(key, jsonAsString(field.getValue(), key));

                    break;
                }

                case "referralCode": {
                    String optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = jsonAsString(field.getValue(), key);
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "referralInfoHtml": {
                    responseData.put(key, jsonAsString(field.getValue(), key));

                    break;
                }

                case "referrerUrl": {
                    String optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = jsonAsString(field.getValue(), key);
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "source": {
                    responseData.put(key, jsonAsString(field.getValue(), key));

                    break;
                }

                case "sourceDescription": {
                    String optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = jsonAsString(field.getValue(), key);
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "sourceType": {
                    MarketingTactic optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = MarketingTactic.fromGraphQl(jsonAsString(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "utmParameters": {
                    UTMParameters optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new UTMParameters(jsonAsObject(field.getValue(), key));
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

    public CustomerVisit(ID id) {
        this();
        optimisticData.put("id", id);
    }

    public String getGraphQlTypeName() {
        return "CustomerVisit";
    }

    /**
    * A globally-unique ID.
    */

    public ID getId() {
        return (ID) get("id");
    }

    /**
    * URL of the first page the customer landed on for the session.
    */

    public String getLandingPage() {
        return (String) get("landingPage");
    }

    public CustomerVisit setLandingPage(String arg) {
        optimisticData.put(getKey("landingPage"), arg);
        return this;
    }

    /**
    * Landing page information with URL linked in HTML. For example, the first page the customer visited
    * was store.myshopify.com/products/1.
    */

    public String getLandingPageHtml() {
        return (String) get("landingPageHtml");
    }

    public CustomerVisit setLandingPageHtml(String arg) {
        optimisticData.put(getKey("landingPageHtml"), arg);
        return this;
    }

    /**
    * Represent actions taken by an app, on behalf of a merchant,
    * to market Shopify resources such as products, collections, and discounts.
    */

    public MarketingEvent getMarketingEvent() {
        return (MarketingEvent) get("marketingEvent");
    }

    public CustomerVisit setMarketingEvent(MarketingEvent arg) {
        optimisticData.put(getKey("marketingEvent"), arg);
        return this;
    }

    /**
    * The date and time when the customer's session occurred.
    */

    public String getOccurredAt() {
        return (String) get("occurredAt");
    }

    public CustomerVisit setOccurredAt(String arg) {
        optimisticData.put(getKey("occurredAt"), arg);
        return this;
    }

    /**
    * Marketing referral code from the link that the customer clicked to visit the store.
    * Supports the following URL attributes: _ref_, _source_, or _r_.
    * For example, if the URL is myshopifystore.com/products/slide?ref=j2tj1tn2, then this value is
    * j2tj1tn2.
    */

    public String getReferralCode() {
        return (String) get("referralCode");
    }

    public CustomerVisit setReferralCode(String arg) {
        optimisticData.put(getKey("referralCode"), arg);
        return this;
    }

    /**
    * Referral information with URLs linked in HTML.
    */

    public String getReferralInfoHtml() {
        return (String) get("referralInfoHtml");
    }

    public CustomerVisit setReferralInfoHtml(String arg) {
        optimisticData.put(getKey("referralInfoHtml"), arg);
        return this;
    }

    /**
    * Webpage where the customer clicked a link that sent them to the online store.
    * For example, _https://randomblog.com/page1_ or _android-app://com.google.android.gm_.
    */

    public String getReferrerUrl() {
        return (String) get("referrerUrl");
    }

    public CustomerVisit setReferrerUrl(String arg) {
        optimisticData.put(getKey("referrerUrl"), arg);
        return this;
    }

    /**
    * Source from which the customer visited the store, such as a platform (Facebook, Google), email,
    * direct,
    * a website domain, QR code, or unknown.
    */

    public String getSource() {
        return (String) get("source");
    }

    public CustomerVisit setSource(String arg) {
        optimisticData.put(getKey("source"), arg);
        return this;
    }

    /**
    * Describes the source explicitly for first or last session.
    */

    public String getSourceDescription() {
        return (String) get("sourceDescription");
    }

    public CustomerVisit setSourceDescription(String arg) {
        optimisticData.put(getKey("sourceDescription"), arg);
        return this;
    }

    /**
    * Type of marketing tactic.
    */

    public MarketingTactic getSourceType() {
        return (MarketingTactic) get("sourceType");
    }

    public CustomerVisit setSourceType(MarketingTactic arg) {
        optimisticData.put(getKey("sourceType"), arg);
        return this;
    }

    /**
    * A set of UTM parameters gathered from the URL parameters of the referrer.
    */

    public UTMParameters getUtmParameters() {
        return (UTMParameters) get("utmParameters");
    }

    public CustomerVisit setUtmParameters(UTMParameters arg) {
        optimisticData.put(getKey("utmParameters"), arg);
        return this;
    }

    public boolean unwrapsToObject(String key) {
        switch (getFieldName(key)) {
            case "id": return false;

            case "landingPage": return false;

            case "landingPageHtml": return false;

            case "marketingEvent": return true;

            case "occurredAt": return false;

            case "referralCode": return false;

            case "referralInfoHtml": return false;

            case "referrerUrl": return false;

            case "source": return false;

            case "sourceDescription": return false;

            case "sourceType": return false;

            case "utmParameters": return true;

            default: return false;
        }
    }
}

