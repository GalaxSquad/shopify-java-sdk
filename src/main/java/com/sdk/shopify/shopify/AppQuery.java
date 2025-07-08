// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* A Shopify application.
*/
public class AppQuery extends Query<AppQuery> {
    AppQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);

        startField("id");
    }

    /**
    * A unique application API identifier.
    */
    public AppQuery apiKey() {
        startField("apiKey");

        return this;
    }

    /**
    * App store page URL of the app.
    */
    public AppQuery appStoreAppUrl() {
        startField("appStoreAppUrl");

        return this;
    }

    /**
    * App store page URL of the developer who created the app.
    */
    public AppQuery appStoreDeveloperUrl() {
        startField("appStoreDeveloperUrl");

        return this;
    }

    /**
    * All requestable access scopes available to the app.
    */
    public AppQuery availableAccessScopes(AccessScopeQueryDefinition queryDef) {
        startField("availableAccessScopes");

        _queryBuilder.append('{');
        queryDef.define(new AccessScopeQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * Banner image for the app.
    */
    public AppQuery banner(ImageQueryDefinition queryDef) {
        startField("banner");

        _queryBuilder.append('{');
        queryDef.define(new ImageQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * Description of the app.
    */
    public AppQuery description() {
        startField("description");

        return this;
    }

    /**
    * The name of the app developer.
    */
    public AppQuery developerName() {
        startField("developerName");

        return this;
    }

    /**
    * The type of app developer.
    */
    public AppQuery developerType() {
        startField("developerType");

        return this;
    }

    /**
    * Whether the app uses the Embedded App SDK.
    */
    public AppQuery embedded() {
        startField("embedded");

        return this;
    }

    /**
    * Requirements that must be met before the app can be installed.
    */
    public AppQuery failedRequirements(FailedRequirementQueryDefinition queryDef) {
        startField("failedRequirements");

        _queryBuilder.append('{');
        queryDef.define(new FailedRequirementQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * A list of app features that are shown in the Shopify App Store listing.
    */
    public AppQuery features() {
        startField("features");

        return this;
    }

    /**
    * Feedback from this app about the store.
    */
    public AppQuery feedback(AppFeedbackQueryDefinition queryDef) {
        startField("feedback");

        _queryBuilder.append('{');
        queryDef.define(new AppFeedbackQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * Handle of the app.
    */
    public AppQuery handle() {
        startField("handle");

        return this;
    }

    /**
    * Icon that represents the app.
    */
    public AppQuery icon(ImageQueryDefinition queryDef) {
        startField("icon");

        _queryBuilder.append('{');
        queryDef.define(new ImageQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * Webpage where you can install the app.
    */
    public AppQuery installUrl() {
        startField("installUrl");

        return this;
    }

    /**
    * Corresponding AppInstallation for this shop and App.
    * Returns null if the App is not installed.
    */
    public AppQuery installation(AppInstallationQueryDefinition queryDef) {
        startField("installation");

        _queryBuilder.append('{');
        queryDef.define(new AppInstallationQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * Whether the app is the [post purchase](https://shopify.dev/apps/checkout/post-purchase) app in use.
    */
    public AppQuery isPostPurchaseAppInUse() {
        startField("isPostPurchaseAppInUse");

        return this;
    }

    /**
    * The optional scopes requested by the app. Lists the optional access scopes the app has declared in
    * its configuration. These scopes are optionally requested by the app after installation.
    */
    public AppQuery optionalAccessScopes(AccessScopeQueryDefinition queryDef) {
        startField("optionalAccessScopes");

        _queryBuilder.append('{');
        queryDef.define(new AccessScopeQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * Whether the app was previously installed on the current shop.
    */
    public AppQuery previouslyInstalled() {
        startField("previouslyInstalled");

        return this;
    }

    /**
    * Detailed information about the app pricing.
    */
    public AppQuery pricingDetails() {
        startField("pricingDetails");

        return this;
    }

    /**
    * Summary of the app pricing details.
    */
    public AppQuery pricingDetailsSummary() {
        startField("pricingDetailsSummary");

        return this;
    }

    /**
    * Link to app privacy policy.
    */
    public AppQuery privacyPolicyUrl() {
        startField("privacyPolicyUrl");

        return this;
    }

    /**
    * The public category for the app.
    */
    public AppQuery publicCategory() {
        startField("publicCategory");

        return this;
    }

    /**
    * Whether the app is published to the Shopify App Store.
    */
    public AppQuery published() {
        startField("published");

        return this;
    }

    /**
    * The access scopes requested by the app. Lists the access scopes the app has declared in its
    * configuration. Merchant must grant approval to these scopes for the app to be installed.
    */
    public AppQuery requestedAccessScopes(AccessScopeQueryDefinition queryDef) {
        startField("requestedAccessScopes");

        _queryBuilder.append('{');
        queryDef.define(new AccessScopeQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * Screenshots of the app.
    */
    public AppQuery screenshots(ImageQueryDefinition queryDef) {
        startField("screenshots");

        _queryBuilder.append('{');
        queryDef.define(new ImageQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * Whether the app was developed by Shopify.
    */
    public AppQuery shopifyDeveloped() {
        startField("shopifyDeveloped");

        return this;
    }

    /**
    * Name of the app.
    */
    public AppQuery title() {
        startField("title");

        return this;
    }

    /**
    * Message that appears when the app is uninstalled. For example:
    * By removing this app, you will no longer be able to publish products to MySocialSite or view this
    * app in your Shopify admin. You can re-enable this channel at any time.
    */
    public AppQuery uninstallMessage() {
        startField("uninstallMessage");

        return this;
    }

    /**
    * The webhook API version for the app.
    */
    public AppQuery webhookApiVersion() {
        startField("webhookApiVersion");

        return this;
    }
}
