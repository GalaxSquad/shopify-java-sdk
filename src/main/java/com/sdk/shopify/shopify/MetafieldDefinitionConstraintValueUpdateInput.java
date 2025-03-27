// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Input;
import com.shopify.graphql.support.Query;
import java.io.Serializable;

public class MetafieldDefinitionConstraintValueUpdateInput implements Serializable {
    private Input<String> create = Input.undefined();

    private Input<String> delete = Input.undefined();

    public String getCreate() {
        return create.getValue();
    }

    public Input<String> getCreateInput() {
        return create;
    }

    public MetafieldDefinitionConstraintValueUpdateInput setCreate(String create) {
        this.create = Input.optional(create);
        return this;
    }

    public MetafieldDefinitionConstraintValueUpdateInput setCreateInput(Input<String> create) {
        if (create == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.create = create;
        return this;
    }

    public String getDelete() {
        return delete.getValue();
    }

    public Input<String> getDeleteInput() {
        return delete;
    }

    public MetafieldDefinitionConstraintValueUpdateInput setDelete(String delete) {
        this.delete = Input.optional(delete);
        return this;
    }

    public MetafieldDefinitionConstraintValueUpdateInput setDeleteInput(Input<String> delete) {
        if (delete == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.delete = delete;
        return this;
    }

    public void appendTo(StringBuilder _queryBuilder) {
        String separator = "";
        _queryBuilder.append('{');

        if (this.create.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("create:");
            if (create.getValue() != null) {
                Query.appendQuotedString(_queryBuilder, create.getValue().toString());
            } else {
                _queryBuilder.append("null");
            }
        }

        if (this.delete.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("delete:");
            if (delete.getValue() != null) {
                Query.appendQuotedString(_queryBuilder, delete.getValue().toString());
            } else {
                _queryBuilder.append("null");
            }
        }

        _queryBuilder.append('}');
    }
}
