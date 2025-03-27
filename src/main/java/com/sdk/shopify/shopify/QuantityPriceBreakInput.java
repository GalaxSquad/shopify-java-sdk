// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.ID;
import com.shopify.graphql.support.Query;
import java.io.Serializable;

public class QuantityPriceBreakInput implements Serializable {
    private ID variantId;

    private MoneyInput price;

    private int minimumQuantity;

    public QuantityPriceBreakInput(ID variantId, MoneyInput price, int minimumQuantity) {
        this.variantId = variantId;

        this.price = price;

        this.minimumQuantity = minimumQuantity;
    }

    public ID getVariantId() {
        return variantId;
    }

    public QuantityPriceBreakInput setVariantId(ID variantId) {
        this.variantId = variantId;
        return this;
    }

    public MoneyInput getPrice() {
        return price;
    }

    public QuantityPriceBreakInput setPrice(MoneyInput price) {
        this.price = price;
        return this;
    }

    public int getMinimumQuantity() {
        return minimumQuantity;
    }

    public QuantityPriceBreakInput setMinimumQuantity(int minimumQuantity) {
        this.minimumQuantity = minimumQuantity;
        return this;
    }

    public void appendTo(StringBuilder _queryBuilder) {
        String separator = "";
        _queryBuilder.append('{');

        _queryBuilder.append(separator);
        separator = ",";
        _queryBuilder.append("variantId:");
        Query.appendQuotedString(_queryBuilder, variantId.toString());

        _queryBuilder.append(separator);
        separator = ",";
        _queryBuilder.append("price:");
        price.appendTo(_queryBuilder);

        _queryBuilder.append(separator);
        separator = ",";
        _queryBuilder.append("minimumQuantity:");
        _queryBuilder.append(minimumQuantity);

        _queryBuilder.append('}');
    }
}
