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
import java.util.List;

public class SubscriptionContractAtomicCreateInput implements Serializable {
    private ID customerId;

    private String nextBillingDate;

    private CurrencyCode currencyCode;

    private SubscriptionDraftInput contract;

    private List<SubscriptionAtomicLineInput> lines;

    private Input<List<String>> discountCodes = Input.undefined();

    public SubscriptionContractAtomicCreateInput(ID customerId, String nextBillingDate, CurrencyCode currencyCode, SubscriptionDraftInput contract, List<SubscriptionAtomicLineInput> lines) {
        this.customerId = customerId;

        this.nextBillingDate = nextBillingDate;

        this.currencyCode = currencyCode;

        this.contract = contract;

        this.lines = lines;
    }

    public ID getCustomerId() {
        return customerId;
    }

    public SubscriptionContractAtomicCreateInput setCustomerId(ID customerId) {
        this.customerId = customerId;
        return this;
    }

    public String getNextBillingDate() {
        return nextBillingDate;
    }

    public SubscriptionContractAtomicCreateInput setNextBillingDate(String nextBillingDate) {
        this.nextBillingDate = nextBillingDate;
        return this;
    }

    public CurrencyCode getCurrencyCode() {
        return currencyCode;
    }

    public SubscriptionContractAtomicCreateInput setCurrencyCode(CurrencyCode currencyCode) {
        this.currencyCode = currencyCode;
        return this;
    }

    public SubscriptionDraftInput getContract() {
        return contract;
    }

    public SubscriptionContractAtomicCreateInput setContract(SubscriptionDraftInput contract) {
        this.contract = contract;
        return this;
    }

    public List<SubscriptionAtomicLineInput> getLines() {
        return lines;
    }

    public SubscriptionContractAtomicCreateInput setLines(List<SubscriptionAtomicLineInput> lines) {
        this.lines = lines;
        return this;
    }

    public List<String> getDiscountCodes() {
        return discountCodes.getValue();
    }

    public Input<List<String>> getDiscountCodesInput() {
        return discountCodes;
    }

    public SubscriptionContractAtomicCreateInput setDiscountCodes(List<String> discountCodes) {
        this.discountCodes = Input.optional(discountCodes);
        return this;
    }

    public SubscriptionContractAtomicCreateInput setDiscountCodesInput(Input<List<String>> discountCodes) {
        if (discountCodes == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.discountCodes = discountCodes;
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

        _queryBuilder.append(separator);
        separator = ",";
        _queryBuilder.append("lines:");
        _queryBuilder.append('[');
        {
            String listSeperator1 = "";
            for (SubscriptionAtomicLineInput item1 : lines) {
                _queryBuilder.append(listSeperator1);
                listSeperator1 = ",";
                item1.appendTo(_queryBuilder);
            }
        }
        _queryBuilder.append(']');

        if (this.discountCodes.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("discountCodes:");
            if (discountCodes.getValue() != null) {
                _queryBuilder.append('[');
                {
                    String listSeperator1 = "";
                    for (String item1 : discountCodes.getValue()) {
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

        _queryBuilder.append('}');
    }
}
