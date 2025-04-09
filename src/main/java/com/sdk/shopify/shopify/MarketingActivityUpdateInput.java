// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.ID;
import com.shopify.graphql.support.Input;
import com.shopify.graphql.support.Query;
import java.io.Serializable;
import java.util.List;

public class MarketingActivityUpdateInput implements Serializable {
    private ID id;

    private Input<ID> marketingRecommendationId = Input.undefined();

    private Input<String> title = Input.undefined();

    private Input<MarketingActivityBudgetInput> budget = Input.undefined();

    private Input<MarketingActivityStatus> status = Input.undefined();

    private Input<MarketingActivityStatus> targetStatus = Input.undefined();

    private Input<String> formData = Input.undefined();

    private Input<UTMInput> utm = Input.undefined();

    private Input<String> urlParameterValue = Input.undefined();

    private Input<List<ID>> marketedResources = Input.undefined();

    private Input<String> errors = Input.undefined();

    public MarketingActivityUpdateInput(ID id) {
        this.id = id;
    }

    public ID getId() {
        return id;
    }

    public MarketingActivityUpdateInput setId(ID id) {
        this.id = id;
        return this;
    }

    public ID getMarketingRecommendationId() {
        return marketingRecommendationId.getValue();
    }

    public Input<ID> getMarketingRecommendationIdInput() {
        return marketingRecommendationId;
    }

    public MarketingActivityUpdateInput setMarketingRecommendationId(ID marketingRecommendationId) {
        this.marketingRecommendationId = Input.optional(marketingRecommendationId);
        return this;
    }

    public MarketingActivityUpdateInput setMarketingRecommendationIdInput(Input<ID> marketingRecommendationId) {
        if (marketingRecommendationId == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.marketingRecommendationId = marketingRecommendationId;
        return this;
    }

    public String getTitle() {
        return title.getValue();
    }

    public Input<String> getTitleInput() {
        return title;
    }

    public MarketingActivityUpdateInput setTitle(String title) {
        this.title = Input.optional(title);
        return this;
    }

    public MarketingActivityUpdateInput setTitleInput(Input<String> title) {
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

    public MarketingActivityUpdateInput setBudget(MarketingActivityBudgetInput budget) {
        this.budget = Input.optional(budget);
        return this;
    }

    public MarketingActivityUpdateInput setBudgetInput(Input<MarketingActivityBudgetInput> budget) {
        if (budget == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.budget = budget;
        return this;
    }

    public MarketingActivityStatus getStatus() {
        return status.getValue();
    }

    public Input<MarketingActivityStatus> getStatusInput() {
        return status;
    }

    public MarketingActivityUpdateInput setStatus(MarketingActivityStatus status) {
        this.status = Input.optional(status);
        return this;
    }

    public MarketingActivityUpdateInput setStatusInput(Input<MarketingActivityStatus> status) {
        if (status == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.status = status;
        return this;
    }

    public MarketingActivityStatus getTargetStatus() {
        return targetStatus.getValue();
    }

    public Input<MarketingActivityStatus> getTargetStatusInput() {
        return targetStatus;
    }

    public MarketingActivityUpdateInput setTargetStatus(MarketingActivityStatus targetStatus) {
        this.targetStatus = Input.optional(targetStatus);
        return this;
    }

    public MarketingActivityUpdateInput setTargetStatusInput(Input<MarketingActivityStatus> targetStatus) {
        if (targetStatus == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.targetStatus = targetStatus;
        return this;
    }

    public String getFormData() {
        return formData.getValue();
    }

    public Input<String> getFormDataInput() {
        return formData;
    }

    public MarketingActivityUpdateInput setFormData(String formData) {
        this.formData = Input.optional(formData);
        return this;
    }

    public MarketingActivityUpdateInput setFormDataInput(Input<String> formData) {
        if (formData == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.formData = formData;
        return this;
    }

    public UTMInput getUtm() {
        return utm.getValue();
    }

    public Input<UTMInput> getUtmInput() {
        return utm;
    }

    public MarketingActivityUpdateInput setUtm(UTMInput utm) {
        this.utm = Input.optional(utm);
        return this;
    }

    public MarketingActivityUpdateInput setUtmInput(Input<UTMInput> utm) {
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

    public MarketingActivityUpdateInput setUrlParameterValue(String urlParameterValue) {
        this.urlParameterValue = Input.optional(urlParameterValue);
        return this;
    }

    public MarketingActivityUpdateInput setUrlParameterValueInput(Input<String> urlParameterValue) {
        if (urlParameterValue == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.urlParameterValue = urlParameterValue;
        return this;
    }

    public List<ID> getMarketedResources() {
        return marketedResources.getValue();
    }

    public Input<List<ID>> getMarketedResourcesInput() {
        return marketedResources;
    }

    public MarketingActivityUpdateInput setMarketedResources(List<ID> marketedResources) {
        this.marketedResources = Input.optional(marketedResources);
        return this;
    }

    public MarketingActivityUpdateInput setMarketedResourcesInput(Input<List<ID>> marketedResources) {
        if (marketedResources == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.marketedResources = marketedResources;
        return this;
    }

    public String getErrors() {
        return errors.getValue();
    }

    public Input<String> getErrorsInput() {
        return errors;
    }

    public MarketingActivityUpdateInput setErrors(String errors) {
        this.errors = Input.optional(errors);
        return this;
    }

    public MarketingActivityUpdateInput setErrorsInput(Input<String> errors) {
        if (errors == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.errors = errors;
        return this;
    }

    public void appendTo(StringBuilder _queryBuilder) {
        String separator = "";
        _queryBuilder.append('{');

        _queryBuilder.append(separator);
        separator = ",";
        _queryBuilder.append("id:");
        Query.appendQuotedString(_queryBuilder, id.toString());

        if (this.marketingRecommendationId.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("marketingRecommendationId:");
            if (marketingRecommendationId.getValue() != null) {
                Query.appendQuotedString(_queryBuilder, marketingRecommendationId.getValue().toString());
            } else {
                _queryBuilder.append("null");
            }
        }

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

        if (this.targetStatus.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("targetStatus:");
            if (targetStatus.getValue() != null) {
                _queryBuilder.append(targetStatus.getValue().toString());
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

        if (this.marketedResources.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("marketedResources:");
            if (marketedResources.getValue() != null) {
                _queryBuilder.append('[');
                {
                    String listSeperator1 = "";
                    for (ID item1 : marketedResources.getValue()) {
                        _queryBuilder.append(listSeperator1);
                        listSeperator1 = ",";
                        Query.appendQuotedString(_queryBuilder, item1.toString());
                    }
                }
                _queryBuilder.append(']');
            } else {
                _queryBuilder.append("null");
            }
        }

        if (this.errors.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("errors:");
            if (errors.getValue() != null) {
                Query.appendQuotedString(_queryBuilder, errors.getValue().toString());
            } else {
                _queryBuilder.append("null");
            }
        }

        _queryBuilder.append('}');
    }
}
