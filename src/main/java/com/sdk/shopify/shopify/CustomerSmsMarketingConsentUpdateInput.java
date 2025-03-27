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
