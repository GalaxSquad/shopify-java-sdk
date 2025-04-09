// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.ID;
import com.shopify.graphql.support.Input;
import com.shopify.graphql.support.Query;
import java.io.Serializable;

public class ProductIdentifierInput implements Serializable {
    private Input<ID> id = Input.undefined();

    private Input<UniqueMetafieldValueInput> customId = Input.undefined();

    private Input<String> handle = Input.undefined();

    public ID getId() {
        return id.getValue();
    }

    public Input<ID> getIdInput() {
        return id;
    }

    public ProductIdentifierInput setId(ID id) {
        this.id = Input.optional(id);
        return this;
    }

    public ProductIdentifierInput setIdInput(Input<ID> id) {
        if (id == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.id = id;
        return this;
    }

    public UniqueMetafieldValueInput getCustomId() {
        return customId.getValue();
    }

    public Input<UniqueMetafieldValueInput> getCustomIdInput() {
        return customId;
    }

    public ProductIdentifierInput setCustomId(UniqueMetafieldValueInput customId) {
        this.customId = Input.optional(customId);
        return this;
    }

    public ProductIdentifierInput setCustomIdInput(Input<UniqueMetafieldValueInput> customId) {
        if (customId == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.customId = customId;
        return this;
    }

    public String getHandle() {
        return handle.getValue();
    }

    public Input<String> getHandleInput() {
        return handle;
    }

    public ProductIdentifierInput setHandle(String handle) {
        this.handle = Input.optional(handle);
        return this;
    }

    public ProductIdentifierInput setHandleInput(Input<String> handle) {
        if (handle == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.handle = handle;
        return this;
    }

    public void appendTo(StringBuilder _queryBuilder) {
        String separator = "";
        _queryBuilder.append('{');

        if (this.id.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("id:");
            if (id.getValue() != null) {
                Query.appendQuotedString(_queryBuilder, id.getValue().toString());
            } else {
                _queryBuilder.append("null");
            }
        }

        if (this.customId.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("customId:");
            if (customId.getValue() != null) {
                customId.getValue().appendTo(_queryBuilder);
            } else {
                _queryBuilder.append("null");
            }
        }

        if (this.handle.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("handle:");
            if (handle.getValue() != null) {
                Query.appendQuotedString(_queryBuilder, handle.getValue().toString());
            } else {
                _queryBuilder.append("null");
            }
        }

        _queryBuilder.append('}');
    }
}
