// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;
import java.io.Serializable;

public class OrderEditAddShippingLineInput implements Serializable {
    private MoneyInput price;

    private String title;

    public OrderEditAddShippingLineInput(MoneyInput price, String title) {
        this.price = price;

        this.title = title;
    }

    public MoneyInput getPrice() {
        return price;
    }

    public OrderEditAddShippingLineInput setPrice(MoneyInput price) {
        this.price = price;
        return this;
    }

    public String getTitle() {
        return title;
    }

    public OrderEditAddShippingLineInput setTitle(String title) {
        this.title = title;
        return this;
    }

    public void appendTo(StringBuilder _queryBuilder) {
        String separator = "";
        _queryBuilder.append('{');

        _queryBuilder.append(separator);
        separator = ",";
        _queryBuilder.append("price:");
        price.appendTo(_queryBuilder);

        _queryBuilder.append(separator);
        separator = ",";
        _queryBuilder.append("title:");
        Query.appendQuotedString(_queryBuilder, title.toString());

        _queryBuilder.append('}');
    }
}
