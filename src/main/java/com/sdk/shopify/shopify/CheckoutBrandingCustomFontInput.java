// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.ID;
import com.shopify.graphql.support.Query;
import java.io.Serializable;

public class CheckoutBrandingCustomFontInput implements Serializable {
    private int weight;

    private ID genericFileId;

    public CheckoutBrandingCustomFontInput(int weight, ID genericFileId) {
        this.weight = weight;

        this.genericFileId = genericFileId;
    }

    public int getWeight() {
        return weight;
    }

    public CheckoutBrandingCustomFontInput setWeight(int weight) {
        this.weight = weight;
        return this;
    }

    public ID getGenericFileId() {
        return genericFileId;
    }

    public CheckoutBrandingCustomFontInput setGenericFileId(ID genericFileId) {
        this.genericFileId = genericFileId;
        return this;
    }

    public void appendTo(StringBuilder _queryBuilder) {
        String separator = "";
        _queryBuilder.append('{');

        _queryBuilder.append(separator);
        separator = ",";
        _queryBuilder.append("weight:");
        _queryBuilder.append(weight);

        _queryBuilder.append(separator);
        separator = ",";
        _queryBuilder.append("genericFileId:");
        Query.appendQuotedString(_queryBuilder, genericFileId.toString());

        _queryBuilder.append('}');
    }
}
