// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.ID;
import com.shopify.graphql.support.Query;
import java.io.Serializable;

public class CustomerDeleteInput implements Serializable {
    private ID id;

    public CustomerDeleteInput(ID id) {
        this.id = id;
    }

    public ID getId() {
        return id;
    }

    public CustomerDeleteInput setId(ID id) {
        this.id = id;
        return this;
    }

    public void appendTo(StringBuilder _queryBuilder) {
        String separator = "";
        _queryBuilder.append('{');

        _queryBuilder.append(separator);
        separator = ",";
        _queryBuilder.append("id:");
        Query.appendQuotedString(_queryBuilder, id.toString());

        _queryBuilder.append('}');
    }
}
