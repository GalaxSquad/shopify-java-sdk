// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.ID;
import com.shopify.graphql.support.Query;
import java.io.Serializable;

public class MoveInput implements Serializable {
    private ID id;

    private String newPosition;

    public MoveInput(ID id, String newPosition) {
        this.id = id;

        this.newPosition = newPosition;
    }

    public ID getId() {
        return id;
    }

    public MoveInput setId(ID id) {
        this.id = id;
        return this;
    }

    public String getNewPosition() {
        return newPosition;
    }

    public MoveInput setNewPosition(String newPosition) {
        this.newPosition = newPosition;
        return this;
    }

    public void appendTo(StringBuilder _queryBuilder) {
        String separator = "";
        _queryBuilder.append('{');

        _queryBuilder.append(separator);
        separator = ",";
        _queryBuilder.append("id:");
        Query.appendQuotedString(_queryBuilder, id.toString());

        _queryBuilder.append(separator);
        separator = ",";
        _queryBuilder.append("newPosition:");
        Query.appendQuotedString(_queryBuilder, newPosition.toString());

        _queryBuilder.append('}');
    }
}
