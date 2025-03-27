// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.ID;
import com.shopify.graphql.support.Input;
import com.shopify.graphql.support.Query;
import java.io.Serializable;
import java.util.List;

public class ShopLocaleInput implements Serializable {
    private Input<Boolean> published = Input.undefined();

    private Input<List<ID>> marketWebPresenceIds = Input.undefined();

    public Boolean getPublished() {
        return published.getValue();
    }

    public Input<Boolean> getPublishedInput() {
        return published;
    }

    public ShopLocaleInput setPublished(Boolean published) {
        this.published = Input.optional(published);
        return this;
    }

    public ShopLocaleInput setPublishedInput(Input<Boolean> published) {
        if (published == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.published = published;
        return this;
    }

    public List<ID> getMarketWebPresenceIds() {
        return marketWebPresenceIds.getValue();
    }

    public Input<List<ID>> getMarketWebPresenceIdsInput() {
        return marketWebPresenceIds;
    }

    public ShopLocaleInput setMarketWebPresenceIds(List<ID> marketWebPresenceIds) {
        this.marketWebPresenceIds = Input.optional(marketWebPresenceIds);
        return this;
    }

    public ShopLocaleInput setMarketWebPresenceIdsInput(Input<List<ID>> marketWebPresenceIds) {
        if (marketWebPresenceIds == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.marketWebPresenceIds = marketWebPresenceIds;
        return this;
    }

    public void appendTo(StringBuilder _queryBuilder) {
        String separator = "";
        _queryBuilder.append('{');

        if (this.published.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("published:");
            if (published.getValue() != null) {
                _queryBuilder.append(published.getValue());
            } else {
                _queryBuilder.append("null");
            }
        }

        if (this.marketWebPresenceIds.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("marketWebPresenceIds:");
            if (marketWebPresenceIds.getValue() != null) {
                _queryBuilder.append('[');
                {
                    String listSeperator1 = "";
                    for (ID item1 : marketWebPresenceIds.getValue()) {
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
