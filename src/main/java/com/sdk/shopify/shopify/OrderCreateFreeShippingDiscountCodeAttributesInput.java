// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;
import java.io.Serializable;

public class OrderCreateFreeShippingDiscountCodeAttributesInput implements Serializable {
    private String code;

    public OrderCreateFreeShippingDiscountCodeAttributesInput(String code) {
        this.code = code;
    }

    public String getCode() {
        return code;
    }

    public OrderCreateFreeShippingDiscountCodeAttributesInput setCode(String code) {
        this.code = code;
        return this;
    }

    public void appendTo(StringBuilder _queryBuilder) {
        String separator = "";
        _queryBuilder.append('{');

        _queryBuilder.append(separator);
        separator = ",";
        _queryBuilder.append("code:");
        Query.appendQuotedString(_queryBuilder, code.toString());

        _queryBuilder.append('}');
    }
}
