// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Input;
import com.shopify.graphql.support.Query;
import java.io.Serializable;

public class DraftOrderAppliedDiscountInput implements Serializable {
    private double value;

    private DraftOrderAppliedDiscountType valueType;

    private Input<MoneyInput> amountWithCurrency = Input.undefined();

    private Input<String> description = Input.undefined();

    private Input<String> title = Input.undefined();

    public DraftOrderAppliedDiscountInput(double value, DraftOrderAppliedDiscountType valueType) {
        this.value = value;

        this.valueType = valueType;
    }

    public double getValue() {
        return value;
    }

    public DraftOrderAppliedDiscountInput setValue(double value) {
        this.value = value;
        return this;
    }

    public DraftOrderAppliedDiscountType getValueType() {
        return valueType;
    }

    public DraftOrderAppliedDiscountInput setValueType(DraftOrderAppliedDiscountType valueType) {
        this.valueType = valueType;
        return this;
    }

    public MoneyInput getAmountWithCurrency() {
        return amountWithCurrency.getValue();
    }

    public Input<MoneyInput> getAmountWithCurrencyInput() {
        return amountWithCurrency;
    }

    public DraftOrderAppliedDiscountInput setAmountWithCurrency(MoneyInput amountWithCurrency) {
        this.amountWithCurrency = Input.optional(amountWithCurrency);
        return this;
    }

    public DraftOrderAppliedDiscountInput setAmountWithCurrencyInput(Input<MoneyInput> amountWithCurrency) {
        if (amountWithCurrency == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.amountWithCurrency = amountWithCurrency;
        return this;
    }

    public String getDescription() {
        return description.getValue();
    }

    public Input<String> getDescriptionInput() {
        return description;
    }

    public DraftOrderAppliedDiscountInput setDescription(String description) {
        this.description = Input.optional(description);
        return this;
    }

    public DraftOrderAppliedDiscountInput setDescriptionInput(Input<String> description) {
        if (description == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.description = description;
        return this;
    }

    public String getTitle() {
        return title.getValue();
    }

    public Input<String> getTitleInput() {
        return title;
    }

    public DraftOrderAppliedDiscountInput setTitle(String title) {
        this.title = Input.optional(title);
        return this;
    }

    public DraftOrderAppliedDiscountInput setTitleInput(Input<String> title) {
        if (title == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.title = title;
        return this;
    }

    public void appendTo(StringBuilder _queryBuilder) {
        String separator = "";
        _queryBuilder.append('{');

        _queryBuilder.append(separator);
        separator = ",";
        _queryBuilder.append("value:");
        _queryBuilder.append(value);

        _queryBuilder.append(separator);
        separator = ",";
        _queryBuilder.append("valueType:");
        _queryBuilder.append(valueType.toString());

        if (this.amountWithCurrency.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("amountWithCurrency:");
            if (amountWithCurrency.getValue() != null) {
                amountWithCurrency.getValue().appendTo(_queryBuilder);
            } else {
                _queryBuilder.append("null");
            }
        }

        if (this.description.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("description:");
            if (description.getValue() != null) {
                Query.appendQuotedString(_queryBuilder, description.getValue().toString());
            } else {
                _queryBuilder.append("null");
            }
        }

        if (this.title.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("title:");
            if (title.getValue() != null) {
                Query.appendQuotedString(_queryBuilder, title.getValue().toString());
            } else {
                _queryBuilder.append("null");
            }
        }

        _queryBuilder.append('}');
    }
}
