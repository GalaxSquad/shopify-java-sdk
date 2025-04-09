// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Input;
import com.shopify.graphql.support.Query;
import java.io.Serializable;
import java.util.List;

public class MarketCreateInput implements Serializable {
    private String name;

    private List<MarketRegionCreateInput> regions;

    private Input<String> handle = Input.undefined();

    private Input<Boolean> enabled = Input.undefined();

    public MarketCreateInput(String name, List<MarketRegionCreateInput> regions) {
        this.name = name;

        this.regions = regions;
    }

    public String getName() {
        return name;
    }

    public MarketCreateInput setName(String name) {
        this.name = name;
        return this;
    }

    public List<MarketRegionCreateInput> getRegions() {
        return regions;
    }

    public MarketCreateInput setRegions(List<MarketRegionCreateInput> regions) {
        this.regions = regions;
        return this;
    }

    public String getHandle() {
        return handle.getValue();
    }

    public Input<String> getHandleInput() {
        return handle;
    }

    public MarketCreateInput setHandle(String handle) {
        this.handle = Input.optional(handle);
        return this;
    }

    public MarketCreateInput setHandleInput(Input<String> handle) {
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

    public MarketCreateInput setEnabled(Boolean enabled) {
        this.enabled = Input.optional(enabled);
        return this;
    }

    public MarketCreateInput setEnabledInput(Input<Boolean> enabled) {
        if (enabled == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.enabled = enabled;
        return this;
    }

    public void appendTo(StringBuilder _queryBuilder) {
        String separator = "";
        _queryBuilder.append('{');

        _queryBuilder.append(separator);
        separator = ",";
        _queryBuilder.append("name:");
        Query.appendQuotedString(_queryBuilder, name.toString());

        _queryBuilder.append(separator);
        separator = ",";
        _queryBuilder.append("regions:");
        _queryBuilder.append('[');
        {
            String listSeperator1 = "";
            for (MarketRegionCreateInput item1 : regions) {
                _queryBuilder.append(listSeperator1);
                listSeperator1 = ",";
                item1.appendTo(_queryBuilder);
            }
        }
        _queryBuilder.append(']');

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
