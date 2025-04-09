// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.ID;
import com.shopify.graphql.support.Input;
import com.shopify.graphql.support.Query;
import java.io.Serializable;

public class MarketingActivityCreateInput implements Serializable {
    private ID marketingActivityExtensionId;

    private MarketingActivityStatus status;

    private Input<String> marketingActivityTitle = Input.undefined();

    private Input<String> formData = Input.undefined();

    private Input<String> context = Input.undefined();

    private Input<UTMInput> utm = Input.undefined();

    private Input<String> urlParameterValue = Input.undefined();

    private Input<MarketingActivityBudgetInput> budget = Input.undefined();

    public MarketingActivityCreateInput(ID marketingActivityExtensionId, MarketingActivityStatus status) {
        this.marketingActivityExtensionId = marketingActivityExtensionId;

        this.status = status;
    }

    public ID getMarketingActivityExtensionId() {
        return marketingActivityExtensionId;
    }

    public MarketingActivityCreateInput setMarketingActivityExtensionId(ID marketingActivityExtensionId) {
        this.marketingActivityExtensionId = marketingActivityExtensionId;
        return this;
    }

    public MarketingActivityStatus getStatus() {
        return status;
    }

    public MarketingActivityCreateInput setStatus(MarketingActivityStatus status) {
        this.status = status;
        return this;
    }

    public String getMarketingActivityTitle() {
        return marketingActivityTitle.getValue();
    }

    public Input<String> getMarketingActivityTitleInput() {
        return marketingActivityTitle;
    }

    public MarketingActivityCreateInput setMarketingActivityTitle(String marketingActivityTitle) {
        this.marketingActivityTitle = Input.optional(marketingActivityTitle);
        return this;
    }

    public MarketingActivityCreateInput setMarketingActivityTitleInput(Input<String> marketingActivityTitle) {
        if (marketingActivityTitle == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.marketingActivityTitle = marketingActivityTitle;
        return this;
    }

    public String getFormData() {
        return formData.getValue();
    }

    public Input<String> getFormDataInput() {
        return formData;
    }

    public MarketingActivityCreateInput setFormData(String formData) {
        this.formData = Input.optional(formData);
        return this;
    }

    public MarketingActivityCreateInput setFormDataInput(Input<String> formData) {
        if (formData == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.formData = formData;
        return this;
    }

    public String getContext() {
        return context.getValue();
    }

    public Input<String> getContextInput() {
        return context;
    }

    public MarketingActivityCreateInput setContext(String context) {
        this.context = Input.optional(context);
        return this;
    }

    public MarketingActivityCreateInput setContextInput(Input<String> context) {
        if (context == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.context = context;
        return this;
    }

    public UTMInput getUtm() {
        return utm.getValue();
    }

    public Input<UTMInput> getUtmInput() {
        return utm;
    }

    public MarketingActivityCreateInput setUtm(UTMInput utm) {
        this.utm = Input.optional(utm);
        return this;
    }

    public MarketingActivityCreateInput setUtmInput(Input<UTMInput> utm) {
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

    public MarketingActivityCreateInput setUrlParameterValue(String urlParameterValue) {
        this.urlParameterValue = Input.optional(urlParameterValue);
        return this;
    }

    public MarketingActivityCreateInput setUrlParameterValueInput(Input<String> urlParameterValue) {
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

    public MarketingActivityCreateInput setBudget(MarketingActivityBudgetInput budget) {
        this.budget = Input.optional(budget);
        return this;
    }

    public MarketingActivityCreateInput setBudgetInput(Input<MarketingActivityBudgetInput> budget) {
        if (budget == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.budget = budget;
        return this;
    }

    public void appendTo(StringBuilder _queryBuilder) {
        String separator = "";
        _queryBuilder.append('{');

        _queryBuilder.append(separator);
        separator = ",";
        _queryBuilder.append("marketingActivityExtensionId:");
        Query.appendQuotedString(_queryBuilder, marketingActivityExtensionId.toString());

        _queryBuilder.append(separator);
        separator = ",";
        _queryBuilder.append("status:");
        _queryBuilder.append(status.toString());

        if (this.marketingActivityTitle.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("marketingActivityTitle:");
            if (marketingActivityTitle.getValue() != null) {
                Query.appendQuotedString(_queryBuilder, marketingActivityTitle.getValue().toString());
            } else {
                _queryBuilder.append("null");
            }
        }

        if (this.formData.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("formData:");
            if (formData.getValue() != null) {
                Query.appendQuotedString(_queryBuilder, formData.getValue().toString());
            } else {
                _queryBuilder.append("null");
            }
        }

        if (this.context.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("context:");
            if (context.getValue() != null) {
                Query.appendQuotedString(_queryBuilder, context.getValue().toString());
            } else {
                _queryBuilder.append("null");
            }
        }

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

        _queryBuilder.append('}');
    }
}
