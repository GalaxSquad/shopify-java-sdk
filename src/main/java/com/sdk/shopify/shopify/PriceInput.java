// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Input;
import com.shopify.graphql.support.Query;
import java.io.Serializable;

public class PriceInput implements Serializable {
    private Input<PriceCalculationType> calculation = Input.undefined();

    private Input<String> price = Input.undefined();

    public PriceCalculationType getCalculation() {
        return calculation.getValue();
    }

    public Input<PriceCalculationType> getCalculationInput() {
        return calculation;
    }

    public PriceInput setCalculation(PriceCalculationType calculation) {
        this.calculation = Input.optional(calculation);
        return this;
    }

    public PriceInput setCalculationInput(Input<PriceCalculationType> calculation) {
        if (calculation == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.calculation = calculation;
        return this;
    }

    public String getPrice() {
        return price.getValue();
    }

    public Input<String> getPriceInput() {
        return price;
    }

    public PriceInput setPrice(String price) {
        this.price = Input.optional(price);
        return this;
    }

    public PriceInput setPriceInput(Input<String> price) {
        if (price == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.price = price;
        return this;
    }

    public void appendTo(StringBuilder _queryBuilder) {
        String separator = "";
        _queryBuilder.append('{');

        if (this.calculation.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("calculation:");
            if (calculation.getValue() != null) {
                _queryBuilder.append(calculation.getValue().toString());
            } else {
                _queryBuilder.append("null");
            }
        }

        if (this.price.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("price:");
            if (price.getValue() != null) {
                Query.appendQuotedString(_queryBuilder, price.getValue().toString());
            } else {
                _queryBuilder.append("null");
            }
        }

        _queryBuilder.append('}');
    }
}
