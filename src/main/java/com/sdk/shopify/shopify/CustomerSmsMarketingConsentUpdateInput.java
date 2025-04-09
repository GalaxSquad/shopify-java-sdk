// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.ID;
import com.shopify.graphql.support.Query;
import java.io.Serializable;

public class CustomerSmsMarketingConsentUpdateInput implements Serializable {
    private ID customerId;

    private CustomerSmsMarketingConsentInput smsMarketingConsent;

    public CustomerSmsMarketingConsentUpdateInput(ID customerId, CustomerSmsMarketingConsentInput smsMarketingConsent) {
        this.customerId = customerId;

        this.smsMarketingConsent = smsMarketingConsent;
    }

    public ID getCustomerId() {
        return customerId;
    }

    public CustomerSmsMarketingConsentUpdateInput setCustomerId(ID customerId) {
        this.customerId = customerId;
        return this;
    }

    public CustomerSmsMarketingConsentInput getSmsMarketingConsent() {
        return smsMarketingConsent;
    }

    public CustomerSmsMarketingConsentUpdateInput setSmsMarketingConsent(CustomerSmsMarketingConsentInput smsMarketingConsent) {
        this.smsMarketingConsent = smsMarketingConsent;
        return this;
    }

    public void appendTo(StringBuilder _queryBuilder) {
        String separator = "";
        _queryBuilder.append('{');

        _queryBuilder.append(separator);
        separator = ",";
        _queryBuilder.append("customerId:");
        Query.appendQuotedString(_queryBuilder, customerId.toString());

        _queryBuilder.append(separator);
        separator = ",";
        _queryBuilder.append("smsMarketingConsent:");
        smsMarketingConsent.appendTo(_queryBuilder);

        _queryBuilder.append('}');
    }
}
