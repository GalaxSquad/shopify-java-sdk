// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Input;
import com.shopify.graphql.support.Query;
import java.io.Serializable;
import java.util.List;

public class MetaobjectUpdateInput implements Serializable {
    private Input<String> handle = Input.undefined();

    private Input<List<MetaobjectFieldInput>> fields = Input.undefined();

    private Input<MetaobjectCapabilityDataInput> capabilities = Input.undefined();

    private Input<Boolean> redirectNewHandle = Input.undefined();

    public String getHandle() {
        return handle.getValue();
    }

    public Input<String> getHandleInput() {
        return handle;
    }

    public MetaobjectUpdateInput setHandle(String handle) {
        this.handle = Input.optional(handle);
        return this;
    }

    public MetaobjectUpdateInput setHandleInput(Input<String> handle) {
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

    public MetaobjectUpdateInput setFields(List<MetaobjectFieldInput> fields) {
        this.fields = Input.optional(fields);
        return this;
    }

    public MetaobjectUpdateInput setFieldsInput(Input<List<MetaobjectFieldInput>> fields) {
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

    public MetaobjectUpdateInput setCapabilities(MetaobjectCapabilityDataInput capabilities) {
        this.capabilities = Input.optional(capabilities);
        return this;
    }

    public MetaobjectUpdateInput setCapabilitiesInput(Input<MetaobjectCapabilityDataInput> capabilities) {
        if (capabilities == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.capabilities = capabilities;
        return this;
    }

    public Boolean getRedirectNewHandle() {
        return redirectNewHandle.getValue();
    }

    public Input<Boolean> getRedirectNewHandleInput() {
        return redirectNewHandle;
    }

    public MetaobjectUpdateInput setRedirectNewHandle(Boolean redirectNewHandle) {
        this.redirectNewHandle = Input.optional(redirectNewHandle);
        return this;
    }

    public MetaobjectUpdateInput setRedirectNewHandleInput(Input<Boolean> redirectNewHandle) {
        if (redirectNewHandle == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.redirectNewHandle = redirectNewHandle;
        return this;
    }

    public void appendTo(StringBuilder _queryBuilder) {
        String separator = "";
        _queryBuilder.append('{');

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

        if (this.redirectNewHandle.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("redirectNewHandle:");
            if (redirectNewHandle.getValue() != null) {
                _queryBuilder.append(redirectNewHandle.getValue());
            } else {
                _queryBuilder.append("null");
            }
        }

        _queryBuilder.append('}');
    }
}
