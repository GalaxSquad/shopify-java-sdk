// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Input;
import com.shopify.graphql.support.Query;
import java.io.Serializable;

public class CustomerEmailMarketingConsentInput implements Serializable {
    private CustomerEmailMarketingState marketingState;

    private Input<CustomerMarketingOptInLevel> marketingOptInLevel = Input.undefined();

    private Input<String> consentUpdatedAt = Input.undefined();

    public CustomerEmailMarketingConsentInput(CustomerEmailMarketingState marketingState) {
        this.marketingState = marketingState;
    }

    public CustomerEmailMarketingState getMarketingState() {
        return marketingState;
    }

    public CustomerEmailMarketingConsentInput setMarketingState(CustomerEmailMarketingState marketingState) {
        this.marketingState = marketingState;
        return this;
    }

    public CustomerMarketingOptInLevel getMarketingOptInLevel() {
        return marketingOptInLevel.getValue();
    }

    public Input<CustomerMarketingOptInLevel> getMarketingOptInLevelInput() {
        return marketingOptInLevel;
    }

    public CustomerEmailMarketingConsentInput setMarketingOptInLevel(CustomerMarketingOptInLevel marketingOptInLevel) {
        this.marketingOptInLevel = Input.optional(marketingOptInLevel);
        return this;
    }

    public CustomerEmailMarketingConsentInput setMarketingOptInLevelInput(Input<CustomerMarketingOptInLevel> marketingOptInLevel) {
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

    public CustomerEmailMarketingConsentInput setConsentUpdatedAt(String consentUpdatedAt) {
        this.consentUpdatedAt = Input.optional(consentUpdatedAt);
        return this;
    }

    public CustomerEmailMarketingConsentInput setConsentUpdatedAtInput(Input<String> consentUpdatedAt) {
        if (consentUpdatedAt == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.consentUpdatedAt = consentUpdatedAt;
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

        _queryBuilder.append('}');
    }
}
