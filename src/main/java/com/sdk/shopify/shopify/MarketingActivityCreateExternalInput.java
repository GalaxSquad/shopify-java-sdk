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

import java.io.Serializable;

public class MarketingActivityCreateExternalInput implements Serializable {
    private String title;

    private String remoteUrl;

    private MarketingTactic tactic;

    private MarketingChannel marketingChannelType;

    private Input<UTMInput> utm = Input.undefined();

    private Input<String> urlParameterValue = Input.undefined();

    private Input<MarketingActivityBudgetInput> budget = Input.undefined();

    private Input<MoneyInput> adSpend = Input.undefined();

    private Input<String> remoteId = Input.undefined();

    private Input<MarketingActivityExternalStatus> status = Input.undefined();

    private Input<String> remotePreviewImageUrl = Input.undefined();

    private Input<String> referringDomain = Input.undefined();

    private Input<String> channelHandle = Input.undefined();

    private Input<String> scheduledStart = Input.undefined();

    private Input<String> scheduledEnd = Input.undefined();

    private Input<String> start = Input.undefined();

    private Input<String> end = Input.undefined();

    private Input<ID> parentActivityId = Input.undefined();

    private Input<String> parentRemoteId = Input.undefined();

    private Input<MarketingActivityHierarchyLevel> hierarchyLevel = Input.undefined();

    public MarketingActivityCreateExternalInput(String title, String remoteUrl, MarketingTactic tactic, MarketingChannel marketingChannelType) {
        this.title = title;

        this.remoteUrl = remoteUrl;

        this.tactic = tactic;

        this.marketingChannelType = marketingChannelType;
    }

    public String getTitle() {
        return title;
    }

    public MarketingActivityCreateExternalInput setTitle(String title) {
        this.title = title;
        return this;
    }

    public String getRemoteUrl() {
        return remoteUrl;
    }

    public MarketingActivityCreateExternalInput setRemoteUrl(String remoteUrl) {
        this.remoteUrl = remoteUrl;
        return this;
    }

    public MarketingTactic getTactic() {
        return tactic;
    }

    public MarketingActivityCreateExternalInput setTactic(MarketingTactic tactic) {
        this.tactic = tactic;
        return this;
    }

    public MarketingChannel getMarketingChannelType() {
        return marketingChannelType;
    }

    public MarketingActivityCreateExternalInput setMarketingChannelType(MarketingChannel marketingChannelType) {
        this.marketingChannelType = marketingChannelType;
        return this;
    }

    public UTMInput getUtm() {
        return utm.getValue();
    }

    public Input<UTMInput> getUtmInput() {
        return utm;
    }

    public MarketingActivityCreateExternalInput setUtm(UTMInput utm) {
        this.utm = Input.optional(utm);
        return this;
    }

    public MarketingActivityCreateExternalInput setUtmInput(Input<UTMInput> utm) {
        if (utm == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.utm = utm;
        return this;
    }

    public String getUrlParameterValue() {
        return urlParameterValue.getValue();
    }

    public Input<String> getUrlParameterValueInput() {
        return urlParameterValue;
    }

    public MarketingActivityCreateExternalInput setUrlParameterValue(String urlParameterValue) {
        this.urlParameterValue = Input.optional(urlParameterValue);
        return this;
    }

    public MarketingActivityCreateExternalInput setUrlParameterValueInput(Input<String> urlParameterValue) {
        if (urlParameterValue == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.urlParameterValue = urlParameterValue;
        return this;
    }

    public MarketingActivityBudgetInput getBudget() {
        return budget.getValue();
    }

    public Input<MarketingActivityBudgetInput> getBudgetInput() {
        return budget;
    }

    public MarketingActivityCreateExternalInput setBudget(MarketingActivityBudgetInput budget) {
        this.budget = Input.optional(budget);
        return this;
    }

    public MarketingActivityCreateExternalInput setBudgetInput(Input<MarketingActivityBudgetInput> budget) {
        if (budget == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.budget = budget;
        return this;
    }

    public MoneyInput getAdSpend() {
        return adSpend.getValue();
    }

    public Input<MoneyInput> getAdSpendInput() {
        return adSpend;
    }

    public MarketingActivityCreateExternalInput setAdSpend(MoneyInput adSpend) {
        this.adSpend = Input.optional(adSpend);
        return this;
    }

    public MarketingActivityCreateExternalInput setAdSpendInput(Input<MoneyInput> adSpend) {
        if (adSpend == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.adSpend = adSpend;
        return this;
    }

    public String getRemoteId() {
        return remoteId.getValue();
    }

    public Input<String> getRemoteIdInput() {
        return remoteId;
    }

    public MarketingActivityCreateExternalInput setRemoteId(String remoteId) {
        this.remoteId = Input.optional(remoteId);
        return this;
    }

    public MarketingActivityCreateExternalInput setRemoteIdInput(Input<String> remoteId) {
        if (remoteId == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.remoteId = remoteId;
        return this;
    }

    public MarketingActivityExternalStatus getStatus() {
        return status.getValue();
    }

    public Input<MarketingActivityExternalStatus> getStatusInput() {
        return status;
    }

    public MarketingActivityCreateExternalInput setStatus(MarketingActivityExternalStatus status) {
        this.status = Input.optional(status);
        return this;
    }

    public MarketingActivityCreateExternalInput setStatusInput(Input<MarketingActivityExternalStatus> status) {
        if (status == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.status = status;
        return this;
    }

    public String getRemotePreviewImageUrl() {
        return remotePreviewImageUrl.getValue();
    }

    public Input<String> getRemotePreviewImageUrlInput() {
        return remotePreviewImageUrl;
    }

    public MarketingActivityCreateExternalInput setRemotePreviewImageUrl(String remotePreviewImageUrl) {
        this.remotePreviewImageUrl = Input.optional(remotePreviewImageUrl);
        return this;
    }

    public MarketingActivityCreateExternalInput setRemotePreviewImageUrlInput(Input<String> remotePreviewImageUrl) {
        if (remotePreviewImageUrl == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.remotePreviewImageUrl = remotePreviewImageUrl;
        return this;
    }

    public String getReferringDomain() {
        return referringDomain.getValue();
    }

    public Input<String> getReferringDomainInput() {
        return referringDomain;
    }

    public MarketingActivityCreateExternalInput setReferringDomain(String referringDomain) {
        this.referringDomain = Input.optional(referringDomain);
        return this;
    }

    public MarketingActivityCreateExternalInput setReferringDomainInput(Input<String> referringDomain) {
        if (referringDomain == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.referringDomain = referringDomain;
        return this;
    }

    public String getChannelHandle() {
        return channelHandle.getValue();
    }

    public Input<String> getChannelHandleInput() {
        return channelHandle;
    }

    public MarketingActivityCreateExternalInput setChannelHandle(String channelHandle) {
        this.channelHandle = Input.optional(channelHandle);
        return this;
    }

    public MarketingActivityCreateExternalInput setChannelHandleInput(Input<String> channelHandle) {
        if (channelHandle == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.channelHandle = channelHandle;
        return this;
    }

    public String getScheduledStart() {
        return scheduledStart.getValue();
    }

    public Input<String> getScheduledStartInput() {
        return scheduledStart;
    }

    public MarketingActivityCreateExternalInput setScheduledStart(String scheduledStart) {
        this.scheduledStart = Input.optional(scheduledStart);
        return this;
    }

    public MarketingActivityCreateExternalInput setScheduledStartInput(Input<String> scheduledStart) {
        if (scheduledStart == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.scheduledStart = scheduledStart;
        return this;
    }

    public String getScheduledEnd() {
        return scheduledEnd.getValue();
    }

    public Input<String> getScheduledEndInput() {
        return scheduledEnd;
    }

    public MarketingActivityCreateExternalInput setScheduledEnd(String scheduledEnd) {
        this.scheduledEnd = Input.optional(scheduledEnd);
        return this;
    }

    public MarketingActivityCreateExternalInput setScheduledEndInput(Input<String> scheduledEnd) {
        if (scheduledEnd == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.scheduledEnd = scheduledEnd;
        return this;
    }

    public String getStart() {
        return start.getValue();
    }

    public Input<String> getStartInput() {
        return start;
    }

    public MarketingActivityCreateExternalInput setStart(String start) {
        this.start = Input.optional(start);
        return this;
    }

    public MarketingActivityCreateExternalInput setStartInput(Input<String> start) {
        if (start == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.start = start;
        return this;
    }

    public String getEnd() {
        return end.getValue();
    }

    public Input<String> getEndInput() {
        return end;
    }

    public MarketingActivityCreateExternalInput setEnd(String end) {
        this.end = Input.optional(end);
        return this;
    }

    public MarketingActivityCreateExternalInput setEndInput(Input<String> end) {
        if (end == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.end = end;
        return this;
    }

    public ID getParentActivityId() {
        return parentActivityId.getValue();
    }

    public Input<ID> getParentActivityIdInput() {
        return parentActivityId;
    }

    public MarketingActivityCreateExternalInput setParentActivityId(ID parentActivityId) {
        this.parentActivityId = Input.optional(parentActivityId);
        return this;
    }

    public MarketingActivityCreateExternalInput setParentActivityIdInput(Input<ID> parentActivityId) {
        if (parentActivityId == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.parentActivityId = parentActivityId;
        return this;
    }

    public String getParentRemoteId() {
        return parentRemoteId.getValue();
    }

    public Input<String> getParentRemoteIdInput() {
        return parentRemoteId;
    }

    public MarketingActivityCreateExternalInput setParentRemoteId(String parentRemoteId) {
        this.parentRemoteId = Input.optional(parentRemoteId);
        return this;
    }

    public MarketingActivityCreateExternalInput setParentRemoteIdInput(Input<String> parentRemoteId) {
        if (parentRemoteId == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.parentRemoteId = parentRemoteId;
        return this;
    }

    public MarketingActivityHierarchyLevel getHierarchyLevel() {
        return hierarchyLevel.getValue();
    }

    public Input<MarketingActivityHierarchyLevel> getHierarchyLevelInput() {
        return hierarchyLevel;
    }

    public MarketingActivityCreateExternalInput setHierarchyLevel(MarketingActivityHierarchyLevel hierarchyLevel) {
        this.hierarchyLevel = Input.optional(hierarchyLevel);
        return this;
    }

    public MarketingActivityCreateExternalInput setHierarchyLevelInput(Input<MarketingActivityHierarchyLevel> hierarchyLevel) {
        if (hierarchyLevel == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.hierarchyLevel = hierarchyLevel;
        return this;
    }

    public void appendTo(StringBuilder _queryBuilder) {
        String separator = "";
        _queryBuilder.append('{');

        _queryBuilder.append(separator);
        separator = ",";
        _queryBuilder.append("title:");
        Query.appendQuotedString(_queryBuilder, title.toString());

        _queryBuilder.append(separator);
        separator = ",";
        _queryBuilder.append("remoteUrl:");
        Query.appendQuotedString(_queryBuilder, remoteUrl.toString());

        _queryBuilder.append(separator);
        separator = ",";
        _queryBuilder.append("tactic:");
        _queryBuilder.append(tactic.toString());

        _queryBuilder.append(separator);
        separator = ",";
        _queryBuilder.append("marketingChannelType:");
        _queryBuilder.append(marketingChannelType.toString());

        if (this.utm.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("utm:");
            if (utm.getValue() != null) {
                utm.getValue().appendTo(_queryBuilder);
            } else {
                _queryBuilder.append("null");
            }
        }

        if (this.urlParameterValue.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("urlParameterValue:");
            if (urlParameterValue.getValue() != null) {
                Query.appendQuotedString(_queryBuilder, urlParameterValue.getValue().toString());
            } else {
                _queryBuilder.append("null");
            }
        }

        if (this.budget.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("budget:");
            if (budget.getValue() != null) {
                budget.getValue().appendTo(_queryBuilder);
            } else {
                _queryBuilder.append("null");
            }
        }

        if (this.adSpend.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("adSpend:");
            if (adSpend.getValue() != null) {
                adSpend.getValue().appendTo(_queryBuilder);
            } else {
                _queryBuilder.append("null");
            }
        }

        if (this.remoteId.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("remoteId:");
            if (remoteId.getValue() != null) {
                Query.appendQuotedString(_queryBuilder, remoteId.getValue().toString());
            } else {
                _queryBuilder.append("null");
            }
        }

        if (this.status.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("status:");
            if (status.getValue() != null) {
                _queryBuilder.append(status.getValue().toString());
            } else {
                _queryBuilder.append("null");
            }
        }

        if (this.remotePreviewImageUrl.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("remotePreviewImageUrl:");
            if (remotePreviewImageUrl.getValue() != null) {
                Query.appendQuotedString(_queryBuilder, remotePreviewImageUrl.getValue().toString());
            } else {
                _queryBuilder.append("null");
            }
        }

        if (this.referringDomain.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("referringDomain:");
            if (referringDomain.getValue() != null) {
                Query.appendQuotedString(_queryBuilder, referringDomain.getValue().toString());
            } else {
                _queryBuilder.append("null");
            }
        }

        if (this.channelHandle.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("channelHandle:");
            if (channelHandle.getValue() != null) {
                Query.appendQuotedString(_queryBuilder, channelHandle.getValue().toString());
            } else {
                _queryBuilder.append("null");
            }
        }

        if (this.scheduledStart.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("scheduledStart:");
            if (scheduledStart.getValue() != null) {
                Query.appendQuotedString(_queryBuilder, scheduledStart.getValue().toString());
            } else {
                _queryBuilder.append("null");
            }
        }

        if (this.scheduledEnd.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("scheduledEnd:");
            if (scheduledEnd.getValue() != null) {
                Query.appendQuotedString(_queryBuilder, scheduledEnd.getValue().toString());
            } else {
                _queryBuilder.append("null");
            }
        }

        if (this.start.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("start:");
            if (start.getValue() != null) {
                Query.appendQuotedString(_queryBuilder, start.getValue().toString());
            } else {
                _queryBuilder.append("null");
            }
        }

        if (this.end.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("end:");
            if (end.getValue() != null) {
                Query.appendQuotedString(_queryBuilder, end.getValue().toString());
            } else {
                _queryBuilder.append("null");
            }
        }

        if (this.parentActivityId.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("parentActivityId:");
            if (parentActivityId.getValue() != null) {
                Query.appendQuotedString(_queryBuilder, parentActivityId.getValue().toString());
            } else {
                _queryBuilder.append("null");
            }
        }

        if (this.parentRemoteId.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("parentRemoteId:");
            if (parentRemoteId.getValue() != null) {
                Query.appendQuotedString(_queryBuilder, parentRemoteId.getValue().toString());
            } else {
                _queryBuilder.append("null");
            }
        }

        if (this.hierarchyLevel.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("hierarchyLevel:");
            if (hierarchyLevel.getValue() != null) {
                _queryBuilder.append(hierarchyLevel.getValue().toString());
            } else {
                _queryBuilder.append("null");
            }
        }

        _queryBuilder.append('}');
    }
}
