// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Input;
import com.shopify.graphql.support.Query;
import java.io.Serializable;

public class MarketingActivityUpdateExternalInput implements Serializable {
    private Input<String> title = Input.undefined();

    private Input<MarketingActivityBudgetInput> budget = Input.undefined();

    private Input<MoneyInput> adSpend = Input.undefined();

    private Input<String> remoteUrl = Input.undefined();

    private Input<String> remotePreviewImageUrl = Input.undefined();

    private Input<MarketingTactic> tactic = Input.undefined();

    private Input<MarketingChannel> marketingChannelType = Input.undefined();

    private Input<String> referringDomain = Input.undefined();

    private Input<String> scheduledStart = Input.undefined();

    private Input<String> scheduledEnd = Input.undefined();

    private Input<String> start = Input.undefined();

    private Input<String> end = Input.undefined();

    private Input<MarketingActivityExternalStatus> status = Input.undefined();

    public String getTitle() {
        return title.getValue();
    }

    public Input<String> getTitleInput() {
        return title;
    }

    public MarketingActivityUpdateExternalInput setTitle(String title) {
        this.title = Input.optional(title);
        return this;
    }

    public MarketingActivityUpdateExternalInput setTitleInput(Input<String> title) {
        if (title == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.title = title;
        return this;
    }

    public MarketingActivityBudgetInput getBudget() {
        return budget.getValue();
    }

    public Input<MarketingActivityBudgetInput> getBudgetInput() {
        return budget;
    }

    public MarketingActivityUpdateExternalInput setBudget(MarketingActivityBudgetInput budget) {
        this.budget = Input.optional(budget);
        return this;
    }

    public MarketingActivityUpdateExternalInput setBudgetInput(Input<MarketingActivityBudgetInput> budget) {
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

    public MarketingActivityUpdateExternalInput setAdSpend(MoneyInput adSpend) {
        this.adSpend = Input.optional(adSpend);
        return this;
    }

    public MarketingActivityUpdateExternalInput setAdSpendInput(Input<MoneyInput> adSpend) {
        if (adSpend == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.adSpend = adSpend;
        return this;
    }

    public String getRemoteUrl() {
        return remoteUrl.getValue();
    }

    public Input<String> getRemoteUrlInput() {
        return remoteUrl;
    }

    public MarketingActivityUpdateExternalInput setRemoteUrl(String remoteUrl) {
        this.remoteUrl = Input.optional(remoteUrl);
        return this;
    }

    public MarketingActivityUpdateExternalInput setRemoteUrlInput(Input<String> remoteUrl) {
        if (remoteUrl == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.remoteUrl = remoteUrl;
        return this;
    }

    public String getRemotePreviewImageUrl() {
        return remotePreviewImageUrl.getValue();
    }

    public Input<String> getRemotePreviewImageUrlInput() {
        return remotePreviewImageUrl;
    }

    public MarketingActivityUpdateExternalInput setRemotePreviewImageUrl(String remotePreviewImageUrl) {
        this.remotePreviewImageUrl = Input.optional(remotePreviewImageUrl);
        return this;
    }

    public MarketingActivityUpdateExternalInput setRemotePreviewImageUrlInput(Input<String> remotePreviewImageUrl) {
        if (remotePreviewImageUrl == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.remotePreviewImageUrl = remotePreviewImageUrl;
        return this;
    }

    public MarketingTactic getTactic() {
        return tactic.getValue();
    }

    public Input<MarketingTactic> getTacticInput() {
        return tactic;
    }

    public MarketingActivityUpdateExternalInput setTactic(MarketingTactic tactic) {
        this.tactic = Input.optional(tactic);
        return this;
    }

    public MarketingActivityUpdateExternalInput setTacticInput(Input<MarketingTactic> tactic) {
        if (tactic == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.tactic = tactic;
        return this;
    }

    public MarketingChannel getMarketingChannelType() {
        return marketingChannelType.getValue();
    }

    public Input<MarketingChannel> getMarketingChannelTypeInput() {
        return marketingChannelType;
    }

    public MarketingActivityUpdateExternalInput setMarketingChannelType(MarketingChannel marketingChannelType) {
        this.marketingChannelType = Input.optional(marketingChannelType);
        return this;
    }

    public MarketingActivityUpdateExternalInput setMarketingChannelTypeInput(Input<MarketingChannel> marketingChannelType) {
        if (marketingChannelType == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.marketingChannelType = marketingChannelType;
        return this;
    }

    public String getReferringDomain() {
        return referringDomain.getValue();
    }

    public Input<String> getReferringDomainInput() {
        return referringDomain;
    }

    public MarketingActivityUpdateExternalInput setReferringDomain(String referringDomain) {
        this.referringDomain = Input.optional(referringDomain);
        return this;
    }

    public MarketingActivityUpdateExternalInput setReferringDomainInput(Input<String> referringDomain) {
        if (referringDomain == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.referringDomain = referringDomain;
        return this;
    }

    public String getScheduledStart() {
        return scheduledStart.getValue();
    }

    public Input<String> getScheduledStartInput() {
        return scheduledStart;
    }

    public MarketingActivityUpdateExternalInput setScheduledStart(String scheduledStart) {
        this.scheduledStart = Input.optional(scheduledStart);
        return this;
    }

    public MarketingActivityUpdateExternalInput setScheduledStartInput(Input<String> scheduledStart) {
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

    public MarketingActivityUpdateExternalInput setScheduledEnd(String scheduledEnd) {
        this.scheduledEnd = Input.optional(scheduledEnd);
        return this;
    }

    public MarketingActivityUpdateExternalInput setScheduledEndInput(Input<String> scheduledEnd) {
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

    public MarketingActivityUpdateExternalInput setStart(String start) {
        this.start = Input.optional(start);
        return this;
    }

    public MarketingActivityUpdateExternalInput setStartInput(Input<String> start) {
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

    public MarketingActivityUpdateExternalInput setEnd(String end) {
        this.end = Input.optional(end);
        return this;
    }

    public MarketingActivityUpdateExternalInput setEndInput(Input<String> end) {
        if (end == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.end = end;
        return this;
    }

    public MarketingActivityExternalStatus getStatus() {
        return status.getValue();
    }

    public Input<MarketingActivityExternalStatus> getStatusInput() {
        return status;
    }

    public MarketingActivityUpdateExternalInput setStatus(MarketingActivityExternalStatus status) {
        this.status = Input.optional(status);
        return this;
    }

    public MarketingActivityUpdateExternalInput setStatusInput(Input<MarketingActivityExternalStatus> status) {
        if (status == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.status = status;
        return this;
    }

    public void appendTo(StringBuilder _queryBuilder) {
        String separator = "";
        _queryBuilder.append('{');

        if (this.title.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("title:");
            if (title.getValue() != null) {
                Query.appendQuotedString(_queryBuilder, title.getValue().toString());
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

        if (this.remoteUrl.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("remoteUrl:");
            if (remoteUrl.getValue() != null) {
                Query.appendQuotedString(_queryBuilder, remoteUrl.getValue().toString());
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

        if (this.tactic.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("tactic:");
            if (tactic.getValue() != null) {
                _queryBuilder.append(tactic.getValue().toString());
            } else {
                _queryBuilder.append("null");
            }
        }

        if (this.marketingChannelType.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("marketingChannelType:");
            if (marketingChannelType.getValue() != null) {
                _queryBuilder.append(marketingChannelType.getValue().toString());
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

        _queryBuilder.append('}');
    }
}
