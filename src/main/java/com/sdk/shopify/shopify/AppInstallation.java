// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.shopify.graphql.support.AbstractResponse;
import com.shopify.graphql.support.ID;
import com.shopify.graphql.support.SchemaViolationError;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
* Represents an installed application on a shop.
*/
public class AppInstallation extends AbstractResponse<AppInstallation> implements HasMetafields, MetafieldReferencer, Node {
    public AppInstallation() {
    }

    public AppInstallation(JsonObject fields) throws SchemaViolationError {
        for (Map.Entry<String, JsonElement> field : fields.entrySet()) {
            String key = field.getKey();
            String fieldName = getFieldName(key);
            switch (fieldName) {
                case "accessScopes": {
                    List<AccessScope> list1 = new ArrayList<>();
                    for (JsonElement element1 : jsonAsArray(field.getValue(), key)) {
                        list1.add(new AccessScope(jsonAsObject(element1, key)));
                    }

                    responseData.put(key, list1);

                    break;
                }

                case "activeSubscriptions": {
                    List<AppSubscription> list1 = new ArrayList<>();
                    for (JsonElement element1 : jsonAsArray(field.getValue(), key)) {
                        list1.add(new AppSubscription(jsonAsObject(element1, key)));
                    }

                    responseData.put(key, list1);

                    break;
                }

                case "allSubscriptions": {
                    responseData.put(key, new AppSubscriptionConnection(jsonAsObject(field.getValue(), key)));

                    break;
                }

                case "app": {
                    responseData.put(key, new App(jsonAsObject(field.getValue(), key)));

                    break;
                }

                case "credits": {
                    responseData.put(key, new AppCreditConnection(jsonAsObject(field.getValue(), key)));

                    break;
                }

                case "id": {
                    responseData.put(key, new ID(jsonAsString(field.getValue(), key)));

                    break;
                }

                case "launchUrl": {
                    responseData.put(key, jsonAsString(field.getValue(), key));

                    break;
                }

                case "metafield": {
                    Metafield optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new Metafield(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "metafields": {
                    responseData.put(key, new MetafieldConnection(jsonAsObject(field.getValue(), key)));

                    break;
                }

                case "oneTimePurchases": {
                    responseData.put(key, new AppPurchaseOneTimeConnection(jsonAsObject(field.getValue(), key)));

                    break;
                }

                case "publication": {
                    Publication optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new Publication(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "revenueAttributionRecords": {
                    responseData.put(key, new AppRevenueAttributionRecordConnection(jsonAsObject(field.getValue(), key)));

                    break;
                }

                case "uninstallUrl": {
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

    public AppInstallation(ID id) {
        this();
        optimisticData.put("id", id);
    }

    public String getGraphQlTypeName() {
        return "AppInstallation";
    }

    /**
    * The access scopes granted to the application by a merchant during installation.
    */

    public List<AccessScope> getAccessScopes() {
        return (List<AccessScope>) get("accessScopes");
    }

    public AppInstallation setAccessScopes(List<AccessScope> arg) {
        optimisticData.put(getKey("accessScopes"), arg);
        return this;
    }

    /**
    * The active application subscriptions billed to the shop on a recurring basis.
    */

    public List<AppSubscription> getActiveSubscriptions() {
        return (List<AppSubscription>) get("activeSubscriptions");
    }

    public AppInstallation setActiveSubscriptions(List<AppSubscription> arg) {
        optimisticData.put(getKey("activeSubscriptions"), arg);
        return this;
    }

    /**
    * All subscriptions created for a shop.
    */

    public AppSubscriptionConnection getAllSubscriptions() {
        return (AppSubscriptionConnection) get("allSubscriptions");
    }

    public AppInstallation setAllSubscriptions(AppSubscriptionConnection arg) {
        optimisticData.put(getKey("allSubscriptions"), arg);
        return this;
    }

    /**
    * Application which is installed.
    */

    public App getApp() {
        return (App) get("app");
    }

    public AppInstallation setApp(App arg) {
        optimisticData.put(getKey("app"), arg);
        return this;
    }

    /**
    * Credits that can be used towards future app purchases.
    */

    public AppCreditConnection getCredits() {
        return (AppCreditConnection) get("credits");
    }

    public AppInstallation setCredits(AppCreditConnection arg) {
        optimisticData.put(getKey("credits"), arg);
        return this;
    }

    /**
    * A globally-unique ID.
    */

    public ID getId() {
        return (ID) get("id");
    }

    /**
    * The URL to launch the application.
    */

    public String getLaunchUrl() {
        return (String) get("launchUrl");
    }

    public AppInstallation setLaunchUrl(String arg) {
        optimisticData.put(getKey("launchUrl"), arg);
        return this;
    }

    /**
    * A [custom field](https://shopify.dev/docs/apps/build/custom-data),
    * including its `namespace` and `key`, that's associated with a Shopify resource
    * for the purposes of adding and storing additional information.
    */

    public Metafield getMetafield() {
        return (Metafield) get("metafield");
    }

    public AppInstallation setMetafield(Metafield arg) {
        optimisticData.put(getKey("metafield"), arg);
        return this;
    }

    /**
    * A list of [custom fields](https://shopify.dev/docs/apps/build/custom-data)
    * that a merchant associates with a Shopify resource.
    */

    public MetafieldConnection getMetafields() {
        return (MetafieldConnection) get("metafields");
    }

    public AppInstallation setMetafields(MetafieldConnection arg) {
        optimisticData.put(getKey("metafields"), arg);
        return this;
    }

    /**
    * One-time purchases to a shop.
    */

    public AppPurchaseOneTimeConnection getOneTimePurchases() {
        return (AppPurchaseOneTimeConnection) get("oneTimePurchases");
    }

    public AppInstallation setOneTimePurchases(AppPurchaseOneTimeConnection arg) {
        optimisticData.put(getKey("oneTimePurchases"), arg);
        return this;
    }

    /**
    * The publication associated with the installed application.
    */

    public Publication getPublication() {
        return (Publication) get("publication");
    }

    public AppInstallation setPublication(Publication arg) {
        optimisticData.put(getKey("publication"), arg);
        return this;
    }

    /**
    * The records that track the externally-captured revenue for the app. The records are used for revenue
    * attribution purposes.
    */

    public AppRevenueAttributionRecordConnection getRevenueAttributionRecords() {
        return (AppRevenueAttributionRecordConnection) get("revenueAttributionRecords");
    }

    public AppInstallation setRevenueAttributionRecords(AppRevenueAttributionRecordConnection arg) {
        optimisticData.put(getKey("revenueAttributionRecords"), arg);
        return this;
    }

    /**
    * The URL to uninstall the application.
    */

    public String getUninstallUrl() {
        return (String) get("uninstallUrl");
    }

    public AppInstallation setUninstallUrl(String arg) {
        optimisticData.put(getKey("uninstallUrl"), arg);
        return this;
    }

    public boolean unwrapsToObject(String key) {
        switch (getFieldName(key)) {
            case "accessScopes": return true;

            case "activeSubscriptions": return true;

            case "allSubscriptions": return true;

            case "app": return true;

            case "credits": return true;

            case "id": return false;

            case "launchUrl": return false;

            case "metafield": return true;

            case "metafields": return true;

            case "oneTimePurchases": return true;

            case "publication": return true;

            case "revenueAttributionRecords": return true;

            case "uninstallUrl": return false;

            default: return false;
        }
    }
}

