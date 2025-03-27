// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Input;
import com.shopify.graphql.support.Query;
import java.io.Serializable;

public class OrderEditUpdateShippingLineInput implements Serializable {
    private Input<MoneyInput> price = Input.undefined();

    private Input<String> title = Input.undefined();

    public MoneyInput getPrice() {
        return price.getValue();
    }

    public Input<MoneyInput> getPriceInput() {
        return price;
    }

    public OrderEditUpdateShippingLineInput setPrice(MoneyInput price) {
        this.price = Input.optional(price);
        return this;
    }

    public OrderEditUpdateShippingLineInput setPriceInput(Input<MoneyInput> price) {
        if (price == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.price = price;
        return this;
    }

    public String getTitle() {
        return title.getValue();
    }

    public Input<String> getTitleInput() {
        return title;
    }

    public OrderEditUpdateShippingLineInput setTitle(String title) {
        this.title = Input.optional(title);
        return this;
    }

    public OrderEditUpdateShippingLineInput setTitleInput(Input<String> title) {
        if (title == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.title = title;
        return this;
    }

    public void appendTo(StringBuilder _queryBuilder) {
        String separator = "";
        _queryBuilder.append('{');

        if (this.price.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("price:");
            if (price.getValue() != null) {
                price.getValue().appendTo(_queryBuilder);
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
