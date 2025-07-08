// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.ID;
import com.shopify.graphql.support.Input;
import com.shopify.graphql.support.Query;
import java.io.Serializable;
import java.util.List;

public class CatalogContextInput implements Serializable {
    private Input<List<ID>> marketIds = Input.undefined();

    private Input<List<ID>> companyLocationIds = Input.undefined();

    public List<ID> getMarketIds() {
        return marketIds.getValue();
    }

    public Input<List<ID>> getMarketIdsInput() {
        return marketIds;
    }

    public CatalogContextInput setMarketIds(List<ID> marketIds) {
        this.marketIds = Input.optional(marketIds);
        return this;
    }

    public CatalogContextInput setMarketIdsInput(Input<List<ID>> marketIds) {
        if (marketIds == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.marketIds = marketIds;
        return this;
    }

    public List<ID> getCompanyLocationIds() {
        return companyLocationIds.getValue();
    }

    public Input<List<ID>> getCompanyLocationIdsInput() {
        return companyLocationIds;
    }

    public CatalogContextInput setCompanyLocationIds(List<ID> companyLocationIds) {
        this.companyLocationIds = Input.optional(companyLocationIds);
        return this;
    }

    public CatalogContextInput setCompanyLocationIdsInput(Input<List<ID>> companyLocationIds) {
        if (companyLocationIds == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.companyLocationIds = companyLocationIds;
        return this;
    }

    public void appendTo(StringBuilder _queryBuilder) {
        String separator = "";
        _queryBuilder.append('{');

        if (this.marketIds.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("marketIds:");
            if (marketIds.getValue() != null) {
                _queryBuilder.append('[');
                {
                    String listSeperator1 = "";
                    for (ID item1 : marketIds.getValue()) {
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

        if (this.companyLocationIds.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("companyLocationIds:");
            if (companyLocationIds.getValue() != null) {
                _queryBuilder.append('[');
                {
                    String listSeperator1 = "";
                    for (ID item1 : companyLocationIds.getValue()) {
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

        _queryBuilder.append('}');
    }
}
