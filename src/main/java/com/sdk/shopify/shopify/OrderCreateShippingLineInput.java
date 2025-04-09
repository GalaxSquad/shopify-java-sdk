// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Input;
import com.shopify.graphql.support.Query;
import java.io.Serializable;
import java.util.List;

public class OrderCreateShippingLineInput implements Serializable {
    private MoneyBagInput priceSet;

    private String title;

    private Input<String> code = Input.undefined();

    private Input<String> source = Input.undefined();

    private Input<List<OrderCreateTaxLineInput>> taxLines = Input.undefined();

    public OrderCreateShippingLineInput(MoneyBagInput priceSet, String title) {
        this.priceSet = priceSet;

        this.title = title;
    }

    public MoneyBagInput getPriceSet() {
        return priceSet;
    }

    public OrderCreateShippingLineInput setPriceSet(MoneyBagInput priceSet) {
        this.priceSet = priceSet;
        return this;
    }

    public String getTitle() {
        return title;
    }

    public OrderCreateShippingLineInput setTitle(String title) {
        this.title = title;
        return this;
    }

    public String getCode() {
        return code.getValue();
    }

    public Input<String> getCodeInput() {
        return code;
    }

    public OrderCreateShippingLineInput setCode(String code) {
        this.code = Input.optional(code);
        return this;
    }

    public OrderCreateShippingLineInput setCodeInput(Input<String> code) {
        if (code == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.code = code;
        return this;
    }

    public String getSource() {
        return source.getValue();
    }

    public Input<String> getSourceInput() {
        return source;
    }

    public OrderCreateShippingLineInput setSource(String source) {
        this.source = Input.optional(source);
        return this;
    }

    public OrderCreateShippingLineInput setSourceInput(Input<String> source) {
        if (source == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.source = source;
        return this;
    }

    public List<OrderCreateTaxLineInput> getTaxLines() {
        return taxLines.getValue();
    }

    public Input<List<OrderCreateTaxLineInput>> getTaxLinesInput() {
        return taxLines;
    }

    public OrderCreateShippingLineInput setTaxLines(List<OrderCreateTaxLineInput> taxLines) {
        this.taxLines = Input.optional(taxLines);
        return this;
    }

    public OrderCreateShippingLineInput setTaxLinesInput(Input<List<OrderCreateTaxLineInput>> taxLines) {
        if (taxLines == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.taxLines = taxLines;
        return this;
    }

    public void appendTo(StringBuilder _queryBuilder) {
        String separator = "";
        _queryBuilder.append('{');

        _queryBuilder.append(separator);
        separator = ",";
        _queryBuilder.append("priceSet:");
        priceSet.appendTo(_queryBuilder);

        _queryBuilder.append(separator);
        separator = ",";
        _queryBuilder.append("title:");
        Query.appendQuotedString(_queryBuilder, title.toString());

        if (this.code.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("code:");
            if (code.getValue() != null) {
                Query.appendQuotedString(_queryBuilder, code.getValue().toString());
            } else {
                _queryBuilder.append("null");
            }
        }

        if (this.source.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("source:");
            if (source.getValue() != null) {
                Query.appendQuotedString(_queryBuilder, source.getValue().toString());
            } else {
                _queryBuilder.append("null");
            }
        }

        if (this.taxLines.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("taxLines:");
            if (taxLines.getValue() != null) {
                _queryBuilder.append('[');
                {
                    String listSeperator1 = "";
                    for (OrderCreateTaxLineInput item1 : taxLines.getValue()) {
                        _queryBuilder.append(listSeperator1);
                        listSeperator1 = ",";
                        item1.appendTo(_queryBuilder);
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
