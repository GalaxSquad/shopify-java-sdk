// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.ID;
import com.shopify.graphql.support.Input;
import com.shopify.graphql.support.Query;
import java.io.Serializable;

public class CustomerSmsMarketingConsentInput implements Serializable {
    private CustomerSmsMarketingState marketingState;

    private Input<CustomerMarketingOptInLevel> marketingOptInLevel = Input.undefined();

    private Input<String> consentUpdatedAt = Input.undefined();

    private Input<ID> sourceLocationId = Input.undefined();

    public CustomerSmsMarketingConsentInput(CustomerSmsMarketingState marketingState) {
        this.marketingState = marketingState;
    }

    public CustomerSmsMarketingState getMarketingState() {
        return marketingState;
    }

    public CustomerSmsMarketingConsentInput setMarketingState(CustomerSmsMarketingState marketingState) {
        this.marketingState = marketingState;
        return this;
    }

    public CustomerMarketingOptInLevel getMarketingOptInLevel() {
        return marketingOptInLevel.getValue();
    }

    public Input<CustomerMarketingOptInLevel> getMarketingOptInLevelInput() {
        return marketingOptInLevel;
    }

    public CustomerSmsMarketingConsentInput setMarketingOptInLevel(CustomerMarketingOptInLevel marketingOptInLevel) {
        this.marketingOptInLevel = Input.optional(marketingOptInLevel);
        return this;
    }

    public CustomerSmsMarketingConsentInput setMarketingOptInLevelInput(Input<CustomerMarketingOptInLevel> marketingOptInLevel) {
        if (marketingOptInLevel == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.marketingOptInLevel = marketingOptInLevel;
        return this;
    }

    public String getConsentUpdatedAt() {
        return consentUpdatedAt.getValue();
    }

    public Input<String> getConsentUpdatedAtInput() {
        return consentUpdatedAt;
    }

    public CustomerSmsMarketingConsentInput setConsentUpdatedAt(String consentUpdatedAt) {
        this.consentUpdatedAt = Input.optional(consentUpdatedAt);
        return this;
    }

    public CustomerSmsMarketingConsentInput setConsentUpdatedAtInput(Input<String> consentUpdatedAt) {
        if (consentUpdatedAt == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.consentUpdatedAt = consentUpdatedAt;
        return this;
    }

    public ID getSourceLocationId() {
        return sourceLocationId.getValue();
    }

    public Input<ID> getSourceLocationIdInput() {
        return sourceLocationId;
    }

    public CustomerSmsMarketingConsentInput setSourceLocationId(ID sourceLocationId) {
        this.sourceLocationId = Input.optional(sourceLocationId);
        return this;
    }

    public CustomerSmsMarketingConsentInput setSourceLocationIdInput(Input<ID> sourceLocationId) {
        if (sourceLocationId == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.sourceLocationId = sourceLocationId;
        return this;
    }

    public void appendTo(StringBuilder _queryBuilder) {
        String separator = "";
        _queryBuilder.append('{');

        _queryBuilder.append(separator);
        separator = ",";
        _queryBuilder.append("marketingState:");
        _queryBuilder.append(marketingState.toString());

        if (this.marketingOptInLevel.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("marketingOptInLevel:");
            if (marketingOptInLevel.getValue() != null) {
                _queryBuilder.append(marketingOptInLevel.getValue().toString());
            } else {
                _queryBuilder.append("null");
            }
        }

        if (this.consentUpdatedAt.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("consentUpdatedAt:");
            if (consentUpdatedAt.getValue() != null) {
                Query.appendQuotedString(_queryBuilder, consentUpdatedAt.getValue().toString());
            } else {
                _queryBuilder.append("null");
            }
        }

        if (this.sourceLocationId.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("sourceLocationId:");
            if (sourceLocationId.getValue() != null) {
                Query.appendQuotedString(_queryBuilder, sourceLocationId.getValue().toString());
            } else {
                _queryBuilder.append("null");
            }
        }

        _queryBuilder.append('}');
    }
}
