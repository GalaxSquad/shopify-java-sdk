// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;
import java.io.Serializable;

public class ShopPolicyInput implements Serializable {
    private ShopPolicyType type;

    private String body;

    public ShopPolicyInput(ShopPolicyType type, String body) {
        this.type = type;

        this.body = body;
    }

    public ShopPolicyType getType() {
        return type;
    }

    public ShopPolicyInput setType(ShopPolicyType type) {
        this.type = type;
        return this;
    }

    public String getBody() {
        return body;
    }

    public ShopPolicyInput setBody(String body) {
        this.body = body;
        return this;
    }

    public void appendTo(StringBuilder _queryBuilder) {
        String separator = "";
        _queryBuilder.append('{');

        _queryBuilder.append(separator);
        separator = ",";
        _queryBuilder.append("type:");
        _queryBuilder.append(type.toString());

        _queryBuilder.append(separator);
        separator = ",";
        _queryBuilder.append("body:");
        Query.appendQuotedString(_queryBuilder, body.toString());

        _queryBuilder.append('}');
    }
}
