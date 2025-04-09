// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.ID;
import com.shopify.graphql.support.Query;
import java.io.Serializable;

public class CustomerEmailMarketingConsentUpdateInput implements Serializable {
    private ID customerId;

    private CustomerEmailMarketingConsentInput emailMarketingConsent;

    public CustomerEmailMarketingConsentUpdateInput(ID customerId, CustomerEmailMarketingConsentInput emailMarketingConsent) {
        this.customerId = customerId;

        this.emailMarketingConsent = emailMarketingConsent;
    }

    public ID getCustomerId() {
        return customerId;
    }

    public CustomerEmailMarketingConsentUpdateInput setCustomerId(ID customerId) {
        this.customerId = customerId;
        return this;
    }

    public CustomerEmailMarketingConsentInput getEmailMarketingConsent() {
        return emailMarketingConsent;
    }

    public CustomerEmailMarketingConsentUpdateInput setEmailMarketingConsent(CustomerEmailMarketingConsentInput emailMarketingConsent) {
        this.emailMarketingConsent = emailMarketingConsent;
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
        _queryBuilder.append("emailMarketingConsent:");
        emailMarketingConsent.appendTo(_queryBuilder);

        _queryBuilder.append('}');
    }
}
