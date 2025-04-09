// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* The marketing activity resource represents marketing that a
* merchant created through an app.
*/
public class MarketingActivityQuery extends Query<MarketingActivityQuery> {
    MarketingActivityQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);

        startField("id");
    }

    /**
    * The URL of the marketing activity listing page in the marketing section.
    */
    public MarketingActivityQuery activityListUrl() {
        startField("activityListUrl");

        return this;
    }

    /**
    * The amount spent on the marketing activity.
    */
    public MarketingActivityQuery adSpend(MoneyV2QueryDefinition queryDef) {
        startField("adSpend");

        _queryBuilder.append('{');
        queryDef.define(new MoneyV2Query(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The app which created this marketing activity.
    */
    public MarketingActivityQuery app(AppQueryDefinition queryDef) {
        startField("app");

        _queryBuilder.append('{');
        queryDef.define(new AppQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The errors generated when an app publishes the marketing activity.
    */
    public MarketingActivityQuery appErrors(MarketingActivityExtensionAppErrorsQueryDefinition queryDef) {
        startField("appErrors");

        _queryBuilder.append('{');
        queryDef.define(new MarketingActivityExtensionAppErrorsQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The allocated budget for the marketing activity.
    */
    public MarketingActivityQuery budget(MarketingBudgetQueryDefinition queryDef) {
        startField("budget");

        _queryBuilder.append('{');
        queryDef.define(new MarketingBudgetQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The date and time when the marketing activity was created.
    */
    public MarketingActivityQuery createdAt() {
        startField("createdAt");

        return this;
    }

    /**
    * The completed content in the marketing activity creation form.
    */
    public MarketingActivityQuery formData() {
        startField("formData");

        return this;
    }

    /**
    * The hierarchy level of the marketing activity.
    */
    public MarketingActivityQuery hierarchyLevel() {
        startField("hierarchyLevel");

        return this;
    }

    /**
    * Whether the marketing activity is in the main workflow version of the marketing automation.
    */
    public MarketingActivityQuery inMainWorkflowVersion() {
        startField("inMainWorkflowVersion");

        return this;
    }

    /**
    * The marketing activity represents an external marketing activity.
    */
    public MarketingActivityQuery isExternal() {
        startField("isExternal");

        return this;
    }

    /**
    * The medium through which the marketing activity and event reached consumers. This is used for
    * reporting aggregation.
    */
    public MarketingActivityQuery marketingChannelType() {
        startField("marketingChannelType");

        return this;
    }

    /**
    * Associated marketing event of this marketing activity.
    */
    public MarketingActivityQuery marketingEvent(MarketingEventQueryDefinition queryDef) {
        startField("marketingEvent");

        _queryBuilder.append('{');
        queryDef.define(new MarketingEventQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * ID of the parent activity of this marketing activity.
    */
    public MarketingActivityQuery parentActivityId() {
        startField("parentActivityId");

        return this;
    }

    /**
    * ID of the parent activity of this marketing activity.
    */
    public MarketingActivityQuery parentRemoteId() {
        startField("parentRemoteId");

        return this;
    }

    /**
    * A contextual description of the marketing activity based on the platform and tactic used.
    */
    public MarketingActivityQuery sourceAndMedium() {
        startField("sourceAndMedium");

        return this;
    }

    /**
    * The current state of the marketing activity.
    */
    public MarketingActivityQuery status() {
        startField("status");

        return this;
    }

    /**
    * The severity of the marketing activity's status.
    */
    public MarketingActivityQuery statusBadgeTypeV2() {
        startField("statusBadgeTypeV2");

        return this;
    }

    /**
    * The rendered status of the marketing activity.
    */
    public MarketingActivityQuery statusLabel() {
        startField("statusLabel");

        return this;
    }

    /**
    * The [date and time](
        * https://help.shopify.com/https://en.wikipedia.org/wiki/ISO_8601
        * ) when the activity's status last changed.
        */
        public MarketingActivityQuery statusTransitionedAt() {
            startField("statusTransitionedAt");

            return this;
        }

        /**
        * The method of marketing used for this marketing activity.
        */
        public MarketingActivityQuery tactic() {
            startField("tactic");

            return this;
        }

        /**
        * The status to which the marketing activity is currently transitioning.
        */
        public MarketingActivityQuery targetStatus() {
            startField("targetStatus");

            return this;
        }

        /**
        * The marketing activity's title, which is rendered on the marketing listing page.
        */
        public MarketingActivityQuery title() {
            startField("title");

            return this;
        }

        /**
        * The date and time when the marketing activity was updated.
        */
        public MarketingActivityQuery updatedAt() {
            startField("updatedAt");

            return this;
        }

        /**
        * The value portion of the URL query parameter used in attributing sessions to this activity.
        */
        public MarketingActivityQuery urlParameterValue() {
            startField("urlParameterValue");

            return this;
        }

        /**
        * The set of [Urchin Tracking Module](
            * https://help.shopify.com/https://en.wikipedia.org/wiki/UTM_parameters
            * ) used in the URL for tracking this marketing activity.
            */
            public MarketingActivityQuery utmParameters(UTMParametersQueryDefinition queryDef) {
                startField("utmParameters");

                _queryBuilder.append('{');
                queryDef.define(new UTMParametersQuery(_queryBuilder));
                _queryBuilder.append('}');

                return this;
            }
        }
