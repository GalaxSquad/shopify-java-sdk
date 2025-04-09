// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.ID;
import com.shopify.graphql.support.Query;
import java.io.Serializable;

public class ProductVariantPositionInput implements Serializable {
    private ID id;

    private int position;

    public ProductVariantPositionInput(ID id, int position) {
        this.id = id;

        this.position = position;
    }

    public ID getId() {
        return id;
    }

    public ProductVariantPositionInput setId(ID id) {
        this.id = id;
        return this;
    }

    public int getPosition() {
        return position;
    }

    public ProductVariantPositionInput setPosition(int position) {
        this.position = position;
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
        _queryBuilder.append("position:");
        _queryBuilder.append(position);

        _queryBuilder.append('}');
    }
}
