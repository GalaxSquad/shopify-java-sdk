// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Input;
import com.shopify.graphql.support.Query;
import java.io.Serializable;

public class ExchangeLineItemAppliedDiscountInput implements Serializable {
    private ExchangeLineItemAppliedDiscountValueInput value;

    private Input<String> description = Input.undefined();

    public ExchangeLineItemAppliedDiscountInput(ExchangeLineItemAppliedDiscountValueInput value) {
        this.value = value;
    }

    public ExchangeLineItemAppliedDiscountValueInput getValue() {
        return value;
    }

    public ExchangeLineItemAppliedDiscountInput setValue(ExchangeLineItemAppliedDiscountValueInput value) {
        this.value = value;
        return this;
    }

    public String getDescription() {
        return description.getValue();
    }

    public Input<String> getDescriptionInput() {
        return description;
    }

    public ExchangeLineItemAppliedDiscountInput setDescription(String description) {
        this.description = Input.optional(description);
        return this;
    }

    public ExchangeLineItemAppliedDiscountInput setDescriptionInput(Input<String> description) {
        if (description == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.description = description;
        return this;
    }

    public void appendTo(StringBuilder _queryBuilder) {
        String separator = "";
        _queryBuilder.append('{');

        _queryBuilder.append(separator);
        separator = ",";
        _queryBuilder.append("value:");
        value.appendTo(_queryBuilder);

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

        _queryBuilder.append('}');
    }
}
