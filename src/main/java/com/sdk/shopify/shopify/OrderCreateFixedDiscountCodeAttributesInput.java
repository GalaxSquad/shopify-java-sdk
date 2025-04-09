// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Input;
import com.shopify.graphql.support.Query;
import java.io.Serializable;

public class OrderCreateFixedDiscountCodeAttributesInput implements Serializable {
    private String code;

    private Input<MoneyBagInput> amountSet = Input.undefined();

    public OrderCreateFixedDiscountCodeAttributesInput(String code) {
        this.code = code;
    }

    public String getCode() {
        return code;
    }

    public OrderCreateFixedDiscountCodeAttributesInput setCode(String code) {
        this.code = code;
        return this;
    }

    public MoneyBagInput getAmountSet() {
        return amountSet.getValue();
    }

    public Input<MoneyBagInput> getAmountSetInput() {
        return amountSet;
    }

    public OrderCreateFixedDiscountCodeAttributesInput setAmountSet(MoneyBagInput amountSet) {
        this.amountSet = Input.optional(amountSet);
        return this;
    }

    public OrderCreateFixedDiscountCodeAttributesInput setAmountSetInput(Input<MoneyBagInput> amountSet) {
        if (amountSet == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.amountSet = amountSet;
        return this;
    }

    public void appendTo(StringBuilder _queryBuilder) {
        String separator = "";
        _queryBuilder.append('{');

        _queryBuilder.append(separator);
        separator = ",";
        _queryBuilder.append("code:");
        Query.appendQuotedString(_queryBuilder, code.toString());

        if (this.amountSet.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("amountSet:");
            if (amountSet.getValue() != null) {
                amountSet.getValue().appendTo(_queryBuilder);
            } else {
                _queryBuilder.append("null");
            }
        }

        _queryBuilder.append('}');
    }
}
