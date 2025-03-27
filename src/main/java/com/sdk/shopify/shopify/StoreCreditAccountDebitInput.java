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

public class StoreCreditAccountDebitInput implements Serializable {
    private MoneyInput debitAmount;

    public StoreCreditAccountDebitInput(MoneyInput debitAmount) {
        this.debitAmount = debitAmount;
    }

    public MoneyInput getDebitAmount() {
        return debitAmount;
    }

    public StoreCreditAccountDebitInput setDebitAmount(MoneyInput debitAmount) {
        this.debitAmount = debitAmount;
        return this;
    }

    public void appendTo(StringBuilder _queryBuilder) {
        String separator = "";
        _queryBuilder.append('{');

        _queryBuilder.append(separator);
        separator = ",";
        _queryBuilder.append("debitAmount:");
        debitAmount.appendTo(_queryBuilder);

        _queryBuilder.append('}');
    }
}
