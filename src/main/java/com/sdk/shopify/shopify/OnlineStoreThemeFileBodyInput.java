// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;
import java.io.Serializable;

public class OnlineStoreThemeFileBodyInput implements Serializable {
    private OnlineStoreThemeFileBodyInputType type;

    private String value;

    public OnlineStoreThemeFileBodyInput(OnlineStoreThemeFileBodyInputType type, String value) {
        this.type = type;

        this.value = value;
    }

    public OnlineStoreThemeFileBodyInputType getType() {
        return type;
    }

    public OnlineStoreThemeFileBodyInput setType(OnlineStoreThemeFileBodyInputType type) {
        this.type = type;
        return this;
    }

    public String getValue() {
        return value;
    }

    public OnlineStoreThemeFileBodyInput setValue(String value) {
        this.value = value;
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
        _queryBuilder.append("value:");
        Query.appendQuotedString(_queryBuilder, value.toString());

        _queryBuilder.append('}');
    }
}
