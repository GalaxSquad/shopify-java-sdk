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

import java.util.Map;

/**
* The marketing activity resource represents marketing that a
* merchant created through an app.
*/
public class MarketingActivity extends AbstractResponse<MarketingActivity> implements Node {
    public MarketingActivity() {
    }

    public MarketingActivity(JsonObject fields) throws SchemaViolationError {
        for (Map.Entry<String, JsonElement> field : fields.entrySet()) {
            String key = field.getKey();
            String fieldName = getFieldName(key);
            switch (fieldName) {
                case "activityListUrl": {
                    String optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = jsonAsString(field.getValue(), key);
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "adSpend": {
                    MoneyV2 optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new MoneyV2(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "app": {
                    responseData.put(key, new App(jsonAsObject(field.getValue(), key)));

                    break;
                }

                case "appErrors": {
                    MarketingActivityExtensionAppErrors optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new MarketingActivityExtensionAppErrors(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "budget": {
                    MarketingBudget optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new MarketingBudget(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "createdAt": {
                    responseData.put(key, jsonAsString(field.getValue(), key));

                    break;
                }

                case "formData": {
                    String optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = jsonAsString(field.getValue(), key);
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "hierarchyLevel": {
                    MarketingActivityHierarchyLevel optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = MarketingActivityHierarchyLevel.fromGraphQl(jsonAsString(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "id": {
                    responseData.put(key, new ID(jsonAsString(field.getValue(), key)));

                    break;
                }

                case "inMainWorkflowVersion": {
                    responseData.put(key, jsonAsBoolean(field.getValue(), key));

                    break;
                }

                case "isExternal": {
                    responseData.put(key, jsonAsBoolean(field.getValue(), key));

                    break;
                }

                case "marketingChannelType": {
                    responseData.put(key, MarketingChannel.fromGraphQl(jsonAsString(field.getValue(), key)));

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

                case "parentActivityId": {
                    ID optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new ID(jsonAsString(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "parentRemoteId": {
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

                case "status": {
                    responseData.put(key, MarketingActivityStatus.fromGraphQl(jsonAsString(field.getValue(), key)));

                    break;
                }

                case "statusBadgeTypeV2": {
                    BadgeType optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = BadgeType.fromGraphQl(jsonAsString(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "statusLabel": {
                    responseData.put(key, jsonAsString(field.getValue(), key));

                    break;
                }

                case "statusTransitionedAt": {
                    String optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = jsonAsString(field.getValue(), key);
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "tactic": {
                    responseData.put(key, MarketingTactic.fromGraphQl(jsonAsString(field.getValue(), key)));

                    break;
                }

                case "targetStatus": {
                    MarketingActivityStatus optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = MarketingActivityStatus.fromGraphQl(jsonAsString(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "title": {
                    responseData.put(key, jsonAsString(field.getValue(), key));

                    break;
                }

                case "updatedAt": {
                    responseData.put(key, jsonAsString(field.getValue(), key));

                    break;
                }

                case "urlParameterValue": {
                    String optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = jsonAsString(field.getValue(), key);
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

    public MarketingActivity(ID id) {
        this();
        optimisticData.put("id", id);
    }

    public String getGraphQlTypeName() {
        return "MarketingActivity";
    }

    /**
    * The URL of the marketing activity listing page in the marketing section.
    */

    public String getActivityListUrl() {
        return (String) get("activityListUrl");
    }

    public MarketingActivity setActivityListUrl(String arg) {
        optimisticData.put(getKey("activityListUrl"), arg);
        return this;
    }

    /**
    * The amount spent on the marketing activity.
    */

    public MoneyV2 getAdSpend() {
        return (MoneyV2) get("adSpend");
    }

    public MarketingActivity setAdSpend(MoneyV2 arg) {
        optimisticData.put(getKey("adSpend"), arg);
        return this;
    }

    /**
    * The app which created this marketing activity.
    */

    public App getApp() {
        return (App) get("app");
    }

    public MarketingActivity setApp(App arg) {
        optimisticData.put(getKey("app"), arg);
        return this;
    }

    /**
    * The errors generated when an app publishes the marketing activity.
    */

    public MarketingActivityExtensionAppErrors getAppErrors() {
        return (MarketingActivityExtensionAppErrors) get("appErrors");
    }

    public MarketingActivity setAppErrors(MarketingActivityExtensionAppErrors arg) {
        optimisticData.put(getKey("appErrors"), arg);
        return this;
    }

    /**
    * The allocated budget for the marketing activity.
    */

    public MarketingBudget getBudget() {
        return (MarketingBudget) get("budget");
    }

    public MarketingActivity setBudget(MarketingBudget arg) {
        optimisticData.put(getKey("budget"), arg);
        return this;
    }

    /**
    * The date and time when the marketing activity was created.
    */

    public String getCreatedAt() {
        return (String) get("createdAt");
    }

    public MarketingActivity setCreatedAt(String arg) {
        optimisticData.put(getKey("createdAt"), arg);
        return this;
    }

    /**
    * The completed content in the marketing activity creation form.
    */

    public String getFormData() {
        return (String) get("formData");
    }

    public MarketingActivity setFormData(String arg) {
        optimisticData.put(getKey("formData"), arg);
        return this;
    }

    /**
    * The hierarchy level of the marketing activity.
    */

    public MarketingActivityHierarchyLevel getHierarchyLevel() {
        return (MarketingActivityHierarchyLevel) get("hierarchyLevel");
    }

    public MarketingActivity setHierarchyLevel(MarketingActivityHierarchyLevel arg) {
        optimisticData.put(getKey("hierarchyLevel"), arg);
        return this;
    }

    /**
    * A globally-unique ID.
    */

    public ID getId() {
        return (ID) get("id");
    }

    /**
    * Whether the marketing activity is in the main workflow version of the marketing automation.
    */

    public Boolean getInMainWorkflowVersion() {
        return (Boolean) get("inMainWorkflowVersion");
    }

    public MarketingActivity setInMainWorkflowVersion(Boolean arg) {
        optimisticData.put(getKey("inMainWorkflowVersion"), arg);
        return this;
    }

    /**
    * The marketing activity represents an external marketing activity.
    */

    public Boolean getIsExternal() {
        return (Boolean) get("isExternal");
    }

    public MarketingActivity setIsExternal(Boolean arg) {
        optimisticData.put(getKey("isExternal"), arg);
        return this;
    }

    /**
    * The medium through which the marketing activity and event reached consumers. This is used for
    * reporting aggregation.
    */

    public MarketingChannel getMarketingChannelType() {
        return (MarketingChannel) get("marketingChannelType");
    }

    public MarketingActivity setMarketingChannelType(MarketingChannel arg) {
        optimisticData.put(getKey("marketingChannelType"), arg);
        return this;
    }

    /**
    * Associated marketing event of this marketing activity.
    */

    public MarketingEvent getMarketingEvent() {
        return (MarketingEvent) get("marketingEvent");
    }

    public MarketingActivity setMarketingEvent(MarketingEvent arg) {
        optimisticData.put(getKey("marketingEvent"), arg);
        return this;
    }

    /**
    * ID of the parent activity of this marketing activity.
    */

    public ID getParentActivityId() {
        return (ID) get("parentActivityId");
    }

    public MarketingActivity setParentActivityId(ID arg) {
        optimisticData.put(getKey("parentActivityId"), arg);
        return this;
    }

    /**
    * ID of the parent activity of this marketing activity.
    */

    public String getParentRemoteId() {
        return (String) get("parentRemoteId");
    }

    public MarketingActivity setParentRemoteId(String arg) {
        optimisticData.put(getKey("parentRemoteId"), arg);
        return this;
    }

    /**
    * A contextual description of the marketing activity based on the platform and tactic used.
    */

    public String getSourceAndMedium() {
        return (String) get("sourceAndMedium");
    }

    public MarketingActivity setSourceAndMedium(String arg) {
        optimisticData.put(getKey("sourceAndMedium"), arg);
        return this;
    }

    /**
    * The current state of the marketing activity.
    */

    public MarketingActivityStatus getStatus() {
        return (MarketingActivityStatus) get("status");
    }

    public MarketingActivity setStatus(MarketingActivityStatus arg) {
        optimisticData.put(getKey("status"), arg);
        return this;
    }

    /**
    * The severity of the marketing activity's status.
    */

    public BadgeType getStatusBadgeTypeV2() {
        return (BadgeType) get("statusBadgeTypeV2");
    }

    public MarketingActivity setStatusBadgeTypeV2(BadgeType arg) {
        optimisticData.put(getKey("statusBadgeTypeV2"), arg);
        return this;
    }

    /**
    * The rendered status of the marketing activity.
    */

    public String getStatusLabel() {
        return (String) get("statusLabel");
    }

    public MarketingActivity setStatusLabel(String arg) {
        optimisticData.put(getKey("statusLabel"), arg);
        return this;
    }

    /**
    * The [date and time](
        * https://help.shopify.com/https://en.wikipedia.org/wiki/ISO_8601
        * ) when the activity's status last changed.
        */

        public String getStatusTransitionedAt() {
            return (String) get("statusTransitionedAt");
        }

        public MarketingActivity setStatusTransitionedAt(String arg) {
            optimisticData.put(getKey("statusTransitionedAt"), arg);
            return this;
        }

        /**
        * The method of marketing used for this marketing activity.
        */

        public MarketingTactic getTactic() {
            return (MarketingTactic) get("tactic");
        }

        public MarketingActivity setTactic(MarketingTactic arg) {
            optimisticData.put(getKey("tactic"), arg);
            return this;
        }

        /**
        * The status to which the marketing activity is currently transitioning.
        */

        public MarketingActivityStatus getTargetStatus() {
            return (MarketingActivityStatus) get("targetStatus");
        }

        public MarketingActivity setTargetStatus(MarketingActivityStatus arg) {
            optimisticData.put(getKey("targetStatus"), arg);
            return this;
        }

        /**
        * The marketing activity's title, which is rendered on the marketing listing page.
        */

        public String getTitle() {
            return (String) get("title");
        }

        public MarketingActivity setTitle(String arg) {
            optimisticData.put(getKey("title"), arg);
            return this;
        }

        /**
        * The date and time when the marketing activity was updated.
        */

        public String getUpdatedAt() {
            return (String) get("updatedAt");
        }

        public MarketingActivity setUpdatedAt(String arg) {
            optimisticData.put(getKey("updatedAt"), arg);
            return this;
        }

        /**
        * The value portion of the URL query parameter used in attributing sessions to this activity.
        */

        public String getUrlParameterValue() {
            return (String) get("urlParameterValue");
        }

        public MarketingActivity setUrlParameterValue(String arg) {
            optimisticData.put(getKey("urlParameterValue"), arg);
            return this;
        }

        /**
        * The set of [Urchin Tracking Module](
            * https://help.shopify.com/https://en.wikipedia.org/wiki/UTM_parameters
            * ) used in the URL for tracking this marketing activity.
            */

            public UTMParameters getUtmParameters() {
                return (UTMParameters) get("utmParameters");
            }

            public MarketingActivity setUtmParameters(UTMParameters arg) {
                optimisticData.put(getKey("utmParameters"), arg);
                return this;
            }

            public boolean unwrapsToObject(String key) {
                switch (getFieldName(key)) {
                    case "activityListUrl": return false;

                    case "adSpend": return true;

                    case "app": return true;

                    case "appErrors": return true;

                    case "budget": return true;

                    case "createdAt": return false;

                    case "formData": return false;

                    case "hierarchyLevel": return false;

                    case "id": return false;

                    case "inMainWorkflowVersion": return false;

                    case "isExternal": return false;

                    case "marketingChannelType": return false;

                    case "marketingEvent": return true;

                    case "parentActivityId": return false;

                    case "parentRemoteId": return false;

                    case "sourceAndMedium": return false;

                    case "status": return false;

                    case "statusBadgeTypeV2": return false;

                    case "statusLabel": return false;

                    case "statusTransitionedAt": return false;

                    case "tactic": return false;

                    case "targetStatus": return false;

                    case "title": return false;

                    case "updatedAt": return false;

                    case "urlParameterValue": return false;

                    case "utmParameters": return true;

                    default: return false;
                }
            }
        }

