// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.ID;
import com.shopify.graphql.support.Input;
import com.shopify.graphql.support.Query;
import java.io.Serializable;
import java.util.List;

public class MarketConditionsLocationsInput implements Serializable {
    private Input<List<ID>> locationIds = Input.undefined();

    private Input<MarketConditionApplicationType> applicationLevel = Input.undefined();

    public List<ID> getLocationIds() {
        return locationIds.getValue();
    }

    public Input<List<ID>> getLocationIdsInput() {
        return locationIds;
    }

    public MarketConditionsLocationsInput setLocationIds(List<ID> locationIds) {
        this.locationIds = Input.optional(locationIds);
        return this;
    }

    public MarketConditionsLocationsInput setLocationIdsInput(Input<List<ID>> locationIds) {
        if (locationIds == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.locationIds = locationIds;
        return this;
    }

    public MarketConditionApplicationType getApplicationLevel() {
        return applicationLevel.getValue();
    }

    public Input<MarketConditionApplicationType> getApplicationLevelInput() {
        return applicationLevel;
    }

    public MarketConditionsLocationsInput setApplicationLevel(MarketConditionApplicationType applicationLevel) {
        this.applicationLevel = Input.optional(applicationLevel);
        return this;
    }

    public MarketConditionsLocationsInput setApplicationLevelInput(Input<MarketConditionApplicationType> applicationLevel) {
        if (applicationLevel == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.applicationLevel = applicationLevel;
        return this;
    }

    public void appendTo(StringBuilder _queryBuilder) {
        String separator = "";
        _queryBuilder.append('{');

        if (this.locationIds.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("locationIds:");
            if (locationIds.getValue() != null) {
                _queryBuilder.append('[');
                {
                    String listSeperator1 = "";
                    for (ID item1 : locationIds.getValue()) {
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
