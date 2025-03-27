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
* Represents a customer's session visiting a shop's online store, including information about the
* marketing activity attributed to starting the session.
*/
public class CustomerVisitQuery extends Query<CustomerVisitQuery> {
    CustomerVisitQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);

        startField("id");
    }

    /**
    * URL of the first page the customer landed on for the session.
    */
    public CustomerVisitQuery landingPage() {
        startField("landingPage");

        return this;
    }

    /**
    * Landing page information with URL linked in HTML. For example, the first page the customer visited
    * was store.myshopify.com/products/1.
    */
    public CustomerVisitQuery landingPageHtml() {
        startField("landingPageHtml");

        return this;
    }

    /**
    * Represent actions taken by an app, on behalf of a merchant,
    * to market Shopify resources such as products, collections, and discounts.
    */
    public CustomerVisitQuery marketingEvent(MarketingEventQueryDefinition queryDef) {
        startField("marketingEvent");

        _queryBuilder.append('{');
        queryDef.define(new MarketingEventQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The date and time when the customer's session occurred.
    */
    public CustomerVisitQuery occurredAt() {
        startField("occurredAt");

        return this;
    }

    /**
    * Marketing referral code from the link that the customer clicked to visit the store.
    * Supports the following URL attributes: _ref_, _source_, or _r_.
    * For example, if the URL is myshopifystore.com/products/slide?ref=j2tj1tn2, then this value is
    * j2tj1tn2.
    */
    public CustomerVisitQuery referralCode() {
        startField("referralCode");

        return this;
    }

    /**
    * Referral information with URLs linked in HTML.
    */
    public CustomerVisitQuery referralInfoHtml() {
        startField("referralInfoHtml");

        return this;
    }

    /**
    * Webpage where the customer clicked a link that sent them to the online store.
    * For example, _https://randomblog.com/page1_ or _android-app://com.google.android.gm_.
    */
    public CustomerVisitQuery referrerUrl() {
        startField("referrerUrl");

        return this;
    }

    /**
    * Source from which the customer visited the store, such as a platform (Facebook, Google), email,
    * direct,
    * a website domain, QR code, or unknown.
    */
    public CustomerVisitQuery source() {
        startField("source");

        return this;
    }

    /**
    * Describes the source explicitly for first or last session.
    */
    public CustomerVisitQuery sourceDescription() {
        startField("sourceDescription");

        return this;
    }

    /**
    * Type of marketing tactic.
    */
    public CustomerVisitQuery sourceType() {
        startField("sourceType");

        return this;
    }

    /**
    * A set of UTM parameters gathered from the URL parameters of the referrer.
    */
    public CustomerVisitQuery utmParameters(UTMParametersQueryDefinition queryDef) {
        startField("utmParameters");

        _queryBuilder.append('{');
        queryDef.define(new UTMParametersQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }
}
