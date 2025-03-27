// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Input;
import java.io.Serializable;

public class MetaobjectFieldDefinitionOperationInput implements Serializable {
    private Input<MetaobjectFieldDefinitionCreateInput> create = Input.undefined();

    private Input<MetaobjectFieldDefinitionUpdateInput> update = Input.undefined();

    private Input<MetaobjectFieldDefinitionDeleteInput> delete = Input.undefined();

    public MetaobjectFieldDefinitionCreateInput getCreate() {
        return create.getValue();
    }

    public Input<MetaobjectFieldDefinitionCreateInput> getCreateInput() {
        return create;
    }

    public MetaobjectFieldDefinitionOperationInput setCreate(MetaobjectFieldDefinitionCreateInput create) {
        this.create = Input.optional(create);
        return this;
    }

    public MetaobjectFieldDefinitionOperationInput setCreateInput(Input<MetaobjectFieldDefinitionCreateInput> create) {
        if (create == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.create = create;
        return this;
    }

    public MetaobjectFieldDefinitionUpdateInput getUpdate() {
        return update.getValue();
    }

    public Input<MetaobjectFieldDefinitionUpdateInput> getUpdateInput() {
        return update;
    }

    public MetaobjectFieldDefinitionOperationInput setUpdate(MetaobjectFieldDefinitionUpdateInput update) {
        this.update = Input.optional(update);
        return this;
    }

    public MetaobjectFieldDefinitionOperationInput setUpdateInput(Input<MetaobjectFieldDefinitionUpdateInput> update) {
        if (update == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.update = update;
        return this;
    }

    public MetaobjectFieldDefinitionDeleteInput getDelete() {
        return delete.getValue();
    }

    public Input<MetaobjectFieldDefinitionDeleteInput> getDeleteInput() {
        return delete;
    }

    public MetaobjectFieldDefinitionOperationInput setDelete(MetaobjectFieldDefinitionDeleteInput delete) {
        this.delete = Input.optional(delete);
        return this;
    }

    public MetaobjectFieldDefinitionOperationInput setDeleteInput(Input<MetaobjectFieldDefinitionDeleteInput> delete) {
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
                create.getValue().appendTo(_queryBuilder);
            } else {
                _queryBuilder.append("null");
            }
        }

        if (this.update.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("update:");
            if (update.getValue() != null) {
                update.getValue().appendTo(_queryBuilder);
            } else {
                _queryBuilder.append("null");
            }
        }

        if (this.delete.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("delete:");
            if (delete.getValue() != null) {
                delete.getValue().appendTo(_queryBuilder);
            } else {
                _queryBuilder.append("null");
            }
        }

        _queryBuilder.append('}');
    }
}
