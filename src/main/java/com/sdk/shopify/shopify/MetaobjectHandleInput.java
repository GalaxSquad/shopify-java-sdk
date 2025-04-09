// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;
import java.io.Serializable;

public class MetaobjectHandleInput implements Serializable {
    private String type;

    private String handle;

    public MetaobjectHandleInput(String type, String handle) {
        this.type = type;

        this.handle = handle;
    }

    public String getType() {
        return type;
    }

    public MetaobjectHandleInput setType(String type) {
        this.type = type;
        return this;
    }

    public String getHandle() {
        return handle;
    }

    public MetaobjectHandleInput setHandle(String handle) {
        this.handle = handle;
        return this;
    }

    public void appendTo(StringBuilder _queryBuilder) {
        String separator = "";
        _queryBuilder.append('{');

        _queryBuilder.append(separator);
        separator = ",";
        _queryBuilder.append("type:");
        Query.appendQuotedString(_queryBuilder, type.toString());

        _queryBuilder.append(separator);
        separator = ",";
        _queryBuilder.append("handle:");
        Query.appendQuotedString(_queryBuilder, handle.toString());

        _queryBuilder.append('}');
    }
}
