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

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
* A Shopify application.
*/
public class App extends AbstractResponse<App> implements Node {
    public App() {
    }

    public App(JsonObject fields) throws SchemaViolationError {
        for (Map.Entry<String, JsonElement> field : fields.entrySet()) {
            String key = field.getKey();
            String fieldName = getFieldName(key);
            switch (fieldName) {
                case "apiKey": {
                    responseData.put(key, jsonAsString(field.getValue(), key));

                    break;
                }

                case "appStoreAppUrl": {
                    String optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = jsonAsString(field.getValue(), key);
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "appStoreDeveloperUrl": {
                    String optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = jsonAsString(field.getValue(), key);
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "availableAccessScopes": {
                    List<AccessScope> list1 = new ArrayList<>();
                    for (JsonElement element1 : jsonAsArray(field.getValue(), key)) {
                        list1.add(new AccessScope(jsonAsObject(element1, key)));
                    }

                    responseData.put(key, list1);

                    break;
                }

                case "banner": {
                    responseData.put(key, new Image(jsonAsObject(field.getValue(), key)));

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

                case "developerName": {
                    String optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = jsonAsString(field.getValue(), key);
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "developerType": {
                    responseData.put(key, AppDeveloperType.fromGraphQl(jsonAsString(field.getValue(), key)));

                    break;
                }

                case "embedded": {
                    responseData.put(key, jsonAsBoolean(field.getValue(), key));

                    break;
                }

                case "failedRequirements": {
                    List<FailedRequirement> list1 = new ArrayList<>();
                    for (JsonElement element1 : jsonAsArray(field.getValue(), key)) {
                        list1.add(new FailedRequirement(jsonAsObject(element1, key)));
                    }

                    responseData.put(key, list1);

                    break;
                }

                case "features": {
                    List<String> list1 = new ArrayList<>();
                    for (JsonElement element1 : jsonAsArray(field.getValue(), key)) {
                        list1.add(jsonAsString(element1, key));
                    }

                    responseData.put(key, list1);

                    break;
                }

                case "feedback": {
                    AppFeedback optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new AppFeedback(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "handle": {
                    String optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = jsonAsString(field.getValue(), key);
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "icon": {
                    responseData.put(key, new Image(jsonAsObject(field.getValue(), key)));

                    break;
                }

                case "id": {
                    responseData.put(key, new ID(jsonAsString(field.getValue(), key)));

                    break;
                }

                case "installUrl": {
                    String optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = jsonAsString(field.getValue(), key);
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "installation": {
                    AppInstallation optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new AppInstallation(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "isPostPurchaseAppInUse": {
                    responseData.put(key, jsonAsBoolean(field.getValue(), key));

                    break;
                }

                case "optionalAccessScopes": {
                    List<AccessScope> list1 = new ArrayList<>();
                    for (JsonElement element1 : jsonAsArray(field.getValue(), key)) {
                        list1.add(new AccessScope(jsonAsObject(element1, key)));
                    }

                    responseData.put(key, list1);

                    break;
                }

                case "previouslyInstalled": {
                    responseData.put(key, jsonAsBoolean(field.getValue(), key));

                    break;
                }

                case "pricingDetails": {
                    String optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = jsonAsString(field.getValue(), key);
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "pricingDetailsSummary": {
                    responseData.put(key, jsonAsString(field.getValue(), key));

                    break;
                }

                case "privacyPolicyUrl": {
                    String optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = jsonAsString(field.getValue(), key);
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "publicCategory": {
                    responseData.put(key, AppPublicCategory.fromGraphQl(jsonAsString(field.getValue(), key)));

                    break;
                }

                case "published": {
                    responseData.put(key, jsonAsBoolean(field.getValue(), key));

                    break;
                }

                case "requestedAccessScopes": {
                    List<AccessScope> list1 = new ArrayList<>();
                    for (JsonElement element1 : jsonAsArray(field.getValue(), key)) {
                        list1.add(new AccessScope(jsonAsObject(element1, key)));
                    }

                    responseData.put(key, list1);

                    break;
                }

                case "screenshots": {
                    List<Image> list1 = new ArrayList<>();
                    for (JsonElement element1 : jsonAsArray(field.getValue(), key)) {
                        list1.add(new Image(jsonAsObject(element1, key)));
                    }

                    responseData.put(key, list1);

                    break;
                }

                case "shopifyDeveloped": {
                    responseData.put(key, jsonAsBoolean(field.getValue(), key));

                    break;
                }

                case "title": {
                    responseData.put(key, jsonAsString(field.getValue(), key));

                    break;
                }

                case "uninstallMessage": {
                    responseData.put(key, jsonAsString(field.getValue(), key));

                    break;
                }

                case "webhookApiVersion": {
                    responseData.put(key, jsonAsString(field.getValue(), key));

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

    public App(ID id) {
        this();
        optimisticData.put("id", id);
    }

    public String getGraphQlTypeName() {
        return "App";
    }

    /**
    * A unique application API identifier.
    */

    public String getApiKey() {
        return (String) get("apiKey");
    }

    public App setApiKey(String arg) {
        optimisticData.put(getKey("apiKey"), arg);
        return this;
    }

    /**
    * App store page URL of the app.
    */

    public String getAppStoreAppUrl() {
        return (String) get("appStoreAppUrl");
    }

    public App setAppStoreAppUrl(String arg) {
        optimisticData.put(getKey("appStoreAppUrl"), arg);
        return this;
    }

    /**
    * App store page URL of the developer who created the app.
    */

    public String getAppStoreDeveloperUrl() {
        return (String) get("appStoreDeveloperUrl");
    }

    public App setAppStoreDeveloperUrl(String arg) {
        optimisticData.put(getKey("appStoreDeveloperUrl"), arg);
        return this;
    }

    /**
    * All requestable access scopes available to the app.
    */

    public List<AccessScope> getAvailableAccessScopes() {
        return (List<AccessScope>) get("availableAccessScopes");
    }

    public App setAvailableAccessScopes(List<AccessScope> arg) {
        optimisticData.put(getKey("availableAccessScopes"), arg);
        return this;
    }

    /**
    * Banner image for the app.
    */

    public Image getBanner() {
        return (Image) get("banner");
    }

    public App setBanner(Image arg) {
        optimisticData.put(getKey("banner"), arg);
        return this;
    }

    /**
    * Description of the app.
    */

    public String getDescription() {
        return (String) get("description");
    }

    public App setDescription(String arg) {
        optimisticData.put(getKey("description"), arg);
        return this;
    }

    /**
    * The name of the app developer.
    */

    public String getDeveloperName() {
        return (String) get("developerName");
    }

    public App setDeveloperName(String arg) {
        optimisticData.put(getKey("developerName"), arg);
        return this;
    }

    /**
    * The type of app developer.
    */

    public AppDeveloperType getDeveloperType() {
        return (AppDeveloperType) get("developerType");
    }

    public App setDeveloperType(AppDeveloperType arg) {
        optimisticData.put(getKey("developerType"), arg);
        return this;
    }

    /**
    * Whether the app uses the Embedded App SDK.
    */

    public Boolean getEmbedded() {
        return (Boolean) get("embedded");
    }

    public App setEmbedded(Boolean arg) {
        optimisticData.put(getKey("embedded"), arg);
        return this;
    }

    /**
    * Requirements that must be met before the app can be installed.
    */

    public List<FailedRequirement> getFailedRequirements() {
        return (List<FailedRequirement>) get("failedRequirements");
    }

    public App setFailedRequirements(List<FailedRequirement> arg) {
        optimisticData.put(getKey("failedRequirements"), arg);
        return this;
    }

    /**
    * A list of app features that are shown in the Shopify App Store listing.
    */

    public List<String> getFeatures() {
        return (List<String>) get("features");
    }

    public App setFeatures(List<String> arg) {
        optimisticData.put(getKey("features"), arg);
        return this;
    }

    /**
    * Feedback from this app about the store.
    */

    public AppFeedback getFeedback() {
        return (AppFeedback) get("feedback");
    }

    public App setFeedback(AppFeedback arg) {
        optimisticData.put(getKey("feedback"), arg);
        return this;
    }

    /**
    * Handle of the app.
    */

    public String getHandle() {
        return (String) get("handle");
    }

    public App setHandle(String arg) {
        optimisticData.put(getKey("handle"), arg);
        return this;
    }

    /**
    * Icon that represents the app.
    */

    public Image getIcon() {
        return (Image) get("icon");
    }

    public App setIcon(Image arg) {
        optimisticData.put(getKey("icon"), arg);
        return this;
    }

    /**
    * A globally-unique ID.
    */

    public ID getId() {
        return (ID) get("id");
    }

    /**
    * Webpage where you can install the app.
    */

    public String getInstallUrl() {
        return (String) get("installUrl");
    }

    public App setInstallUrl(String arg) {
        optimisticData.put(getKey("installUrl"), arg);
        return this;
    }

    /**
    * Corresponding AppInstallation for this shop and App.
    * Returns null if the App is not installed.
    */

    public AppInstallation getInstallation() {
        return (AppInstallation) get("installation");
    }

    public App setInstallation(AppInstallation arg) {
        optimisticData.put(getKey("installation"), arg);
        return this;
    }

    /**
    * Whether the app is the [post purchase](https://shopify.dev/apps/checkout/post-purchase) app in use.
    */

    public Boolean getIsPostPurchaseAppInUse() {
        return (Boolean) get("isPostPurchaseAppInUse");
    }

    public App setIsPostPurchaseAppInUse(Boolean arg) {
        optimisticData.put(getKey("isPostPurchaseAppInUse"), arg);
        return this;
    }

    /**
    * The optional scopes requested by the app. Lists the optional access scopes the app has declared in
    * its configuration. These scopes are optionally requested by the app after installation.
    */

    public List<AccessScope> getOptionalAccessScopes() {
        return (List<AccessScope>) get("optionalAccessScopes");
    }

    public App setOptionalAccessScopes(List<AccessScope> arg) {
        optimisticData.put(getKey("optionalAccessScopes"), arg);
        return this;
    }

    /**
    * Whether the app was previously installed on the current shop.
    */

    public Boolean getPreviouslyInstalled() {
        return (Boolean) get("previouslyInstalled");
    }

    public App setPreviouslyInstalled(Boolean arg) {
        optimisticData.put(getKey("previouslyInstalled"), arg);
        return this;
    }

    /**
    * Detailed information about the app pricing.
    */

    public String getPricingDetails() {
        return (String) get("pricingDetails");
    }

    public App setPricingDetails(String arg) {
        optimisticData.put(getKey("pricingDetails"), arg);
        return this;
    }

    /**
    * Summary of the app pricing details.
    */

    public String getPricingDetailsSummary() {
        return (String) get("pricingDetailsSummary");
    }

    public App setPricingDetailsSummary(String arg) {
        optimisticData.put(getKey("pricingDetailsSummary"), arg);
        return this;
    }

    /**
    * Link to app privacy policy.
    */

    public String getPrivacyPolicyUrl() {
        return (String) get("privacyPolicyUrl");
    }

    public App setPrivacyPolicyUrl(String arg) {
        optimisticData.put(getKey("privacyPolicyUrl"), arg);
        return this;
    }

    /**
    * The public category for the app.
    */

    public AppPublicCategory getPublicCategory() {
        return (AppPublicCategory) get("publicCategory");
    }

    public App setPublicCategory(AppPublicCategory arg) {
        optimisticData.put(getKey("publicCategory"), arg);
        return this;
    }

    /**
    * Whether the app is published to the Shopify App Store.
    */

    public Boolean getPublished() {
        return (Boolean) get("published");
    }

    public App setPublished(Boolean arg) {
        optimisticData.put(getKey("published"), arg);
        return this;
    }

    /**
    * The access scopes requested by the app. Lists the access scopes the app has declared in its
    * configuration. Merchant must grant approval to these scopes for the app to be installed.
    */

    public List<AccessScope> getRequestedAccessScopes() {
        return (List<AccessScope>) get("requestedAccessScopes");
    }

    public App setRequestedAccessScopes(List<AccessScope> arg) {
        optimisticData.put(getKey("requestedAccessScopes"), arg);
        return this;
    }

    /**
    * Screenshots of the app.
    */

    public List<Image> getScreenshots() {
        return (List<Image>) get("screenshots");
    }

    public App setScreenshots(List<Image> arg) {
        optimisticData.put(getKey("screenshots"), arg);
        return this;
    }

    /**
    * Whether the app was developed by Shopify.
    */

    public Boolean getShopifyDeveloped() {
        return (Boolean) get("shopifyDeveloped");
    }

    public App setShopifyDeveloped(Boolean arg) {
        optimisticData.put(getKey("shopifyDeveloped"), arg);
        return this;
    }

    /**
    * Name of the app.
    */

    public String getTitle() {
        return (String) get("title");
    }

    public App setTitle(String arg) {
        optimisticData.put(getKey("title"), arg);
        return this;
    }

    /**
    * Message that appears when the app is uninstalled. For example:
    * By removing this app, you will no longer be able to publish products to MySocialSite or view this
    * app in your Shopify admin. You can re-enable this channel at any time.
    */

    public String getUninstallMessage() {
        return (String) get("uninstallMessage");
    }

    public App setUninstallMessage(String arg) {
        optimisticData.put(getKey("uninstallMessage"), arg);
        return this;
    }

    /**
    * The webhook API version for the app.
    */

    public String getWebhookApiVersion() {
        return (String) get("webhookApiVersion");
    }

    public App setWebhookApiVersion(String arg) {
        optimisticData.put(getKey("webhookApiVersion"), arg);
        return this;
    }

    public boolean unwrapsToObject(String key) {
        switch (getFieldName(key)) {
            case "apiKey": return false;

            case "appStoreAppUrl": return false;

            case "appStoreDeveloperUrl": return false;

            case "availableAccessScopes": return true;

            case "banner": return true;

            case "description": return false;

            case "developerName": return false;

            case "developerType": return false;

            case "embedded": return false;

            case "failedRequirements": return true;

            case "features": return false;

            case "feedback": return true;

            case "handle": return false;

            case "icon": return true;

            case "id": return false;

            case "installUrl": return false;

            case "installation": return true;

            case "isPostPurchaseAppInUse": return false;

            case "optionalAccessScopes": return true;

            case "previouslyInstalled": return false;

            case "pricingDetails": return false;

            case "pricingDetailsSummary": return false;

            case "privacyPolicyUrl": return false;

            case "publicCategory": return false;

            case "published": return false;

            case "requestedAccessScopes": return true;

            case "screenshots": return true;

            case "shopifyDeveloped": return false;

            case "title": return false;

            case "uninstallMessage": return false;

            case "webhookApiVersion": return false;

            default: return false;
        }
    }
}

