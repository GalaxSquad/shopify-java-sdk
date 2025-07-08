// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.ID;
import com.shopify.graphql.support.Input;
import com.shopify.graphql.support.Query;
import java.io.Serializable;
import java.util.List;

public class MarketConditionsRegionsInput implements Serializable {
    private Input<List<ID>> regionIds = Input.undefined();

    private Input<List<MarketConditionsRegionInput>> regions = Input.undefined();

    private Input<MarketConditionApplicationType> applicationLevel = Input.undefined();

    public List<ID> getRegionIds() {
        return regionIds.getValue();
    }

    public Input<List<ID>> getRegionIdsInput() {
        return regionIds;
    }

    public MarketConditionsRegionsInput setRegionIds(List<ID> regionIds) {
        this.regionIds = Input.optional(regionIds);
        return this;
    }

    public MarketConditionsRegionsInput setRegionIdsInput(Input<List<ID>> regionIds) {
        if (regionIds == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.regionIds = regionIds;
        return this;
    }

    public List<MarketConditionsRegionInput> getRegions() {
        return regions.getValue();
    }

    public Input<List<MarketConditionsRegionInput>> getRegionsInput() {
        return regions;
    }

    public MarketConditionsRegionsInput setRegions(List<MarketConditionsRegionInput> regions) {
        this.regions = Input.optional(regions);
        return this;
    }

    public MarketConditionsRegionsInput setRegionsInput(Input<List<MarketConditionsRegionInput>> regions) {
        if (regions == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.regions = regions;
        return this;
    }

    public MarketConditionApplicationType getApplicationLevel() {
        return applicationLevel.getValue();
    }

    public Input<MarketConditionApplicationType> getApplicationLevelInput() {
        return applicationLevel;
    }

    public MarketConditionsRegionsInput setApplicationLevel(MarketConditionApplicationType applicationLevel) {
        this.applicationLevel = Input.optional(applicationLevel);
        return this;
    }

    public MarketConditionsRegionsInput setApplicationLevelInput(Input<MarketConditionApplicationType> applicationLevel) {
        if (applicationLevel == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.applicationLevel = applicationLevel;
        return this;
    }

    public void appendTo(StringBuilder _queryBuilder) {
        String separator = "";
        _queryBuilder.append('{');

        if (this.regionIds.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("regionIds:");
            if (regionIds.getValue() != null) {
                _queryBuilder.append('[');
                {
                    String listSeperator1 = "";
                    for (ID item1 : regionIds.getValue()) {
                        _queryBuilder.append(listSeperator1);
                        listSeperator1 = ",";
                        Query.appendQuotedString(_queryBuilder, item1.toString());
                    }
                }
                _queryBuilder.append(']');
            } else {
                _queryBuilder.append("null");
            }
        }

        if (this.regions.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("regions:");
            if (regions.getValue() != null) {
                _queryBuilder.append('[');
                {
                    String listSeperator1 = "";
                    for (MarketConditionsRegionInput item1 : regions.getValue()) {
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

        if (this.applicationLevel.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("applicationLevel:");
            if (applicationLevel.getValue() != null) {
                _queryBuilder.append(applicationLevel.getValue().toString());
            } else {
                _queryBuilder.append("null");
            }
        }

        _queryBuilder.append('}');
    }
}
