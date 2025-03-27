// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.ID;
import com.shopify.graphql.support.Query;
import java.io.Serializable;

public class PriceListProductPriceInput implements Serializable {
    private ID productId;

    private MoneyInput price;

    public PriceListProductPriceInput(ID productId, MoneyInput price) {
        this.productId = productId;

        this.price = price;
    }

    public ID getProductId() {
        return productId;
    }

    public PriceListProductPriceInput setProductId(ID productId) {
        this.productId = productId;
        return this;
    }

    public MoneyInput getPrice() {
        return price;
    }

    public PriceListProductPriceInput setPrice(MoneyInput price) {
        this.price = price;
        return this;
    }

    public void appendTo(StringBuilder _queryBuilder) {
        String separator = "";
        _queryBuilder.append('{');

        _queryBuilder.append(separator);
        separator = ",";
        _queryBuilder.append("productId:");
        Query.appendQuotedString(_queryBuilder, productId.toString());

        _queryBuilder.append(separator);
        separator = ",";
        _queryBuilder.append("price:");
        price.appendTo(_queryBuilder);

        _queryBuilder.append('}');
    }
}
