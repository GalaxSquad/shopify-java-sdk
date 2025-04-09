// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Input;
import com.shopify.graphql.support.Query;
import java.io.Serializable;
import java.util.List;

public class MetaobjectCreateInput implements Serializable {
    private String type;

    private Input<String> handle = Input.undefined();

    private Input<List<MetaobjectFieldInput>> fields = Input.undefined();

    private Input<MetaobjectCapabilityDataInput> capabilities = Input.undefined();

    public MetaobjectCreateInput(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public MetaobjectCreateInput setType(String type) {
        this.type = type;
        return this;
    }

    public String getHandle() {
        return handle.getValue();
    }

    public Input<String> getHandleInput() {
        return handle;
    }

    public MetaobjectCreateInput setHandle(String handle) {
        this.handle = Input.optional(handle);
        return this;
    }

    public MetaobjectCreateInput setHandleInput(Input<String> handle) {
        if (handle == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.handle = handle;
        return this;
    }

    public List<MetaobjectFieldInput> getFields() {
        return fields.getValue();
    }

    public Input<List<MetaobjectFieldInput>> getFieldsInput() {
        return fields;
    }

    public MetaobjectCreateInput setFields(List<MetaobjectFieldInput> fields) {
        this.fields = Input.optional(fields);
        return this;
    }

    public MetaobjectCreateInput setFieldsInput(Input<List<MetaobjectFieldInput>> fields) {
        if (fields == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.fields = fields;
        return this;
    }

    public MetaobjectCapabilityDataInput getCapabilities() {
        return capabilities.getValue();
    }

    public Input<MetaobjectCapabilityDataInput> getCapabilitiesInput() {
        return capabilities;
    }

    public MetaobjectCreateInput setCapabilities(MetaobjectCapabilityDataInput capabilities) {
        this.capabilities = Input.optional(capabilities);
        return this;
    }

    public MetaobjectCreateInput setCapabilitiesInput(Input<MetaobjectCapabilityDataInput> capabilities) {
        if (capabilities == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.capabilities = capabilities;
        return this;
    }

    public void appendTo(StringBuilder _queryBuilder) {
        String separator = "";
        _queryBuilder.append('{');

        _queryBuilder.append(separator);
        separator = ",";
        _queryBuilder.append("type:");
        Query.appendQuotedString(_queryBuilder, type.toString());

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

        if (this.fields.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("fields:");
            if (fields.getValue() != null) {
                _queryBuilder.append('[');
                {
                    String listSeperator1 = "";
                    for (MetaobjectFieldInput item1 : fields.getValue()) {
                        _queryBuilder.append(listSeperator1);
                        listSeperator1 = ",";
                        item1.appendTo(_queryBuilder);
                    }
                }
                _queryBuilder.append(']');
            } else {
                _queryBuilder.append("null");
            }
        }

        if (this.capabilities.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("capabilities:");
            if (capabilities.getValue() != null) {
                capabilities.getValue().appendTo(_queryBuilder);
            } else {
                _queryBuilder.append("null");
            }
        }

        _queryBuilder.append('}');
    }
}
