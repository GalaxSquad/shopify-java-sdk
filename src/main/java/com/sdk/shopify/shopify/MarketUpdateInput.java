// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Input;
import com.shopify.graphql.support.Query;
import java.io.Serializable;

public class MarketUpdateInput implements Serializable {
    private Input<String> name = Input.undefined();

    private Input<String> handle = Input.undefined();

    private Input<Boolean> enabled = Input.undefined();

    public String getName() {
        return name.getValue();
    }

    public Input<String> getNameInput() {
        return name;
    }

    public MarketUpdateInput setName(String name) {
        this.name = Input.optional(name);
        return this;
    }

    public MarketUpdateInput setNameInput(Input<String> name) {
        if (name == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.name = name;
        return this;
    }

    public String getHandle() {
        return handle.getValue();
    }

    public Input<String> getHandleInput() {
        return handle;
    }

    public MarketUpdateInput setHandle(String handle) {
        this.handle = Input.optional(handle);
        return this;
    }

    public MarketUpdateInput setHandleInput(Input<String> handle) {
        if (handle == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.handle = handle;
        return this;
    }

    public Boolean getEnabled() {
        return enabled.getValue();
    }

    public Input<Boolean> getEnabledInput() {
        return enabled;
    }

    public MarketUpdateInput setEnabled(Boolean enabled) {
        this.enabled = Input.optional(enabled);
        return this;
    }

    public MarketUpdateInput setEnabledInput(Input<Boolean> enabled) {
        if (enabled == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.enabled = enabled;
        return this;
    }

    public void appendTo(StringBuilder _queryBuilder) {
        String separator = "";
        _queryBuilder.append('{');

        if (this.name.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("name:");
            if (name.getValue() != null) {
                Query.appendQuotedString(_queryBuilder, name.getValue().toString());
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

        if (this.enabled.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("enabled:");
            if (enabled.getValue() != null) {
                _queryBuilder.append(enabled.getValue());
            } else {
                _queryBuilder.append("null");
            }
        }

        _queryBuilder.append('}');
    }
}
