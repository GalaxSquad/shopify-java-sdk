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

import java.math.BigDecimal;

import java.io.Serializable;

public class MoneyInput implements Serializable {
    private BigDecimal amount;

    private CurrencyCode currencyCode;

    public MoneyInput(BigDecimal amount, CurrencyCode currencyCode) {
        this.amount = amount;

        this.currencyCode = currencyCode;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public MoneyInput setAmount(BigDecimal amount) {
        this.amount = amount;
        return this;
    }

    public CurrencyCode getCurrencyCode() {
        return currencyCode;
    }

    public MoneyInput setCurrencyCode(CurrencyCode currencyCode) {
        this.currencyCode = currencyCode;
        return this;
    }

    public void appendTo(StringBuilder _queryBuilder) {
        String separator = "";
        _queryBuilder.append('{');

        _queryBuilder.append(separator);
        separator = ",";
        _queryBuilder.append("amount:");
        Query.appendQuotedString(_queryBuilder, amount.toString());

        _queryBuilder.append(separator);
        separator = ",";
        _queryBuilder.append("currencyCode:");
        _queryBuilder.append(currencyCode.toString());

        _queryBuilder.append('}');
    }
}
