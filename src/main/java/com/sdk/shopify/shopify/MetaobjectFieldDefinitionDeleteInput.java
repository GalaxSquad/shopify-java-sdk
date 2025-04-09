// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;
import java.io.Serializable;

public class MetaobjectFieldDefinitionDeleteInput implements Serializable {
    private String key;

    public MetaobjectFieldDefinitionDeleteInput(String key) {
        this.key = key;
    }

    public String getKey() {
        return key;
    }

    public MetaobjectFieldDefinitionDeleteInput setKey(String key) {
        this.key = key;
        return this;
    }

    public void appendTo(StringBuilder _queryBuilder) {
        String separator = "";
        _queryBuilder.append('{');

        _queryBuilder.append(separator);
        separator = ",";
        _queryBuilder.append("key:");
        Query.appendQuotedString(_queryBuilder, key.toString());

        _queryBuilder.append('}');
    }
}
