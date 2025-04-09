// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.ID;
import com.shopify.graphql.support.Input;
import com.shopify.graphql.support.Query;
import java.io.Serializable;

public class OrderCaptureInput implements Serializable {
    private ID id;

    private ID parentTransactionId;

    private String amount;

    private Input<CurrencyCode> currency = Input.undefined();

    private Input<Boolean> finalCapture = Input.undefined();

    public OrderCaptureInput(ID id, ID parentTransactionId, String amount) {
        this.id = id;

        this.parentTransactionId = parentTransactionId;

        this.amount = amount;
    }

    public ID getId() {
        return id;
    }

    public OrderCaptureInput setId(ID id) {
        this.id = id;
        return this;
    }

    public ID getParentTransactionId() {
        return parentTransactionId;
    }

    public OrderCaptureInput setParentTransactionId(ID parentTransactionId) {
        this.parentTransactionId = parentTransactionId;
        return this;
    }

    public String getAmount() {
        return amount;
    }

    public OrderCaptureInput setAmount(String amount) {
        this.amount = amount;
        return this;
    }

    public CurrencyCode getCurrency() {
        return currency.getValue();
    }

    public Input<CurrencyCode> getCurrencyInput() {
        return currency;
    }

    public OrderCaptureInput setCurrency(CurrencyCode currency) {
        this.currency = Input.optional(currency);
        return this;
    }

    public OrderCaptureInput setCurrencyInput(Input<CurrencyCode> currency) {
        if (currency == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.currency = currency;
        return this;
    }

    public Boolean getFinalCapture() {
        return finalCapture.getValue();
    }

    public Input<Boolean> getFinalCaptureInput() {
        return finalCapture;
    }

    public OrderCaptureInput setFinalCapture(Boolean finalCapture) {
        this.finalCapture = Input.optional(finalCapture);
        return this;
    }

    public OrderCaptureInput setFinalCaptureInput(Input<Boolean> finalCapture) {
        if (finalCapture == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.finalCapture = finalCapture;
        return this;
    }

    public void appendTo(StringBuilder _queryBuilder) {
        String separator = "";
        _queryBuilder.append('{');

        _queryBuilder.append(separator);
        separator = ",";
        _queryBuilder.append("id:");
        Query.appendQuotedString(_queryBuilder, id.toString());

        _queryBuilder.append(separator);
        separator = ",";
        _queryBuilder.append("parentTransactionId:");
        Query.appendQuotedString(_queryBuilder, parentTransactionId.toString());

        _queryBuilder.append(separator);
        separator = ",";
        _queryBuilder.append("amount:");
        Query.appendQuotedString(_queryBuilder, amount.toString());

        if (this.currency.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("currency:");
            if (currency.getValue() != null) {
                _queryBuilder.append(currency.getValue().toString());
            } else {
                _queryBuilder.append("null");
            }
        }

        if (this.finalCapture.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("finalCapture:");
            if (finalCapture.getValue() != null) {
                _queryBuilder.append(finalCapture.getValue());
            } else {
                _queryBuilder.append("null");
            }
        }

        _queryBuilder.append('}');
    }
}
