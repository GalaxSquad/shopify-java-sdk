// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Input;
import java.io.Serializable;

public class MetaobjectCapabilityOnlineStoreInput implements Serializable {
    private boolean enabled;

    private Input<MetaobjectCapabilityDefinitionDataOnlineStoreInput> data = Input.undefined();

    public MetaobjectCapabilityOnlineStoreInput(boolean enabled) {
        this.enabled = enabled;
    }

    public boolean getEnabled() {
        return enabled;
    }

    public MetaobjectCapabilityOnlineStoreInput setEnabled(boolean enabled) {
        this.enabled = enabled;
        return this;
    }

    public MetaobjectCapabilityDefinitionDataOnlineStoreInput getData() {
        return data.getValue();
    }

    public Input<MetaobjectCapabilityDefinitionDataOnlineStoreInput> getDataInput() {
        return data;
    }

    public MetaobjectCapabilityOnlineStoreInput setData(MetaobjectCapabilityDefinitionDataOnlineStoreInput data) {
        this.data = Input.optional(data);
        return this;
    }

    public MetaobjectCapabilityOnlineStoreInput setDataInput(Input<MetaobjectCapabilityDefinitionDataOnlineStoreInput> data) {
        if (data == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.data = data;
        return this;
    }

    public void appendTo(StringBuilder _queryBuilder) {
        String separator = "";
        _queryBuilder.append('{');

        _queryBuilder.append(separator);
        separator = ",";
        _queryBuilder.append("enabled:");
        _queryBuilder.append(enabled);

        if (this.data.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("data:");
            if (data.getValue() != null) {
                data.getValue().appendTo(_queryBuilder);
            } else {
                _queryBuilder.append("null");
            }
        }

        _queryBuilder.append('}');
    }
}
