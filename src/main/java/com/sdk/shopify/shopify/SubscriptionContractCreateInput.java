// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.ID;
import com.shopify.graphql.support.Query;
import java.io.Serializable;

public class SubscriptionContractCreateInput implements Serializable {
    private ID customerId;

    private String nextBillingDate;

    private CurrencyCode currencyCode;

    private SubscriptionDraftInput contract;

    public SubscriptionContractCreateInput(ID customerId, String nextBillingDate, CurrencyCode currencyCode, SubscriptionDraftInput contract) {
        this.customerId = customerId;

        this.nextBillingDate = nextBillingDate;

        this.currencyCode = currencyCode;

        this.contract = contract;
    }

    public ID getCustomerId() {
        return customerId;
    }

    public SubscriptionContractCreateInput setCustomerId(ID customerId) {
        this.customerId = customerId;
        return this;
    }

    public String getNextBillingDate() {
        return nextBillingDate;
    }

    public SubscriptionContractCreateInput setNextBillingDate(String nextBillingDate) {
        this.nextBillingDate = nextBillingDate;
        return this;
    }

    public CurrencyCode getCurrencyCode() {
        return currencyCode;
    }

    public SubscriptionContractCreateInput setCurrencyCode(CurrencyCode currencyCode) {
        this.currencyCode = currencyCode;
        return this;
    }

    public SubscriptionDraftInput getContract() {
        return contract;
    }

    public SubscriptionContractCreateInput setContract(SubscriptionDraftInput contract) {
        this.contract = contract;
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
        _queryBuilder.append("nextBillingDate:");
        Query.appendQuotedString(_queryBuilder, nextBillingDate.toString());

        _queryBuilder.append(separator);
        separator = ",";
        _queryBuilder.append("currencyCode:");
        _queryBuilder.append(currencyCode.toString());

        _queryBuilder.append(separator);
        separator = ",";
        _queryBuilder.append("contract:");
        contract.appendTo(_queryBuilder);

        _queryBuilder.append('}');
    }
}
