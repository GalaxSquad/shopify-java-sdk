// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;
import java.io.Serializable;

public class WebPixelInput implements Serializable {
    private String settings;

    public WebPixelInput(String settings) {
        this.settings = settings;
    }

    public String getSettings() {
        return settings;
    }

    public WebPixelInput setSettings(String settings) {
        this.settings = settings;
        return this;
    }

    public void appendTo(StringBuilder _queryBuilder) {
        String separator = "";
        _queryBuilder.append('{');

        _queryBuilder.append(separator);
        separator = ",";
        _queryBuilder.append("settings:");
        Query.appendQuotedString(_queryBuilder, settings.toString());

        _queryBuilder.append('}');
    }
}
