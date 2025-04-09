// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.ID;
import com.shopify.graphql.support.Query;
import java.io.Serializable;

public class MarketLocalizationRegisterInput implements Serializable {
    private ID marketId;

    private String key;

    private String value;

    private String marketLocalizableContentDigest;

    public MarketLocalizationRegisterInput(ID marketId, String key, String value, String marketLocalizableContentDigest) {
        this.marketId = marketId;

        this.key = key;

        this.value = value;

        this.marketLocalizableContentDigest = marketLocalizableContentDigest;
    }

    public ID getMarketId() {
        return marketId;
    }

    public MarketLocalizationRegisterInput setMarketId(ID marketId) {
        this.marketId = marketId;
        return this;
    }

    public String getKey() {
        return key;
    }

    public MarketLocalizationRegisterInput setKey(String key) {
        this.key = key;
        return this;
    }

    public String getValue() {
        return value;
    }

    public MarketLocalizationRegisterInput setValue(String value) {
        this.value = value;
        return this;
    }

    public String getMarketLocalizableContentDigest() {
        return marketLocalizableContentDigest;
    }

    public MarketLocalizationRegisterInput setMarketLocalizableContentDigest(String marketLocalizableContentDigest) {
        this.marketLocalizableContentDigest = marketLocalizableContentDigest;
        return this;
    }

    public void appendTo(StringBuilder _queryBuilder) {
        String separator = "";
        _queryBuilder.append('{');

        _queryBuilder.append(separator);
        separator = ",";
        _queryBuilder.append("marketId:");
        Query.appendQuotedString(_queryBuilder, marketId.toString());

        _queryBuilder.append(separator);
        separator = ",";
        _queryBuilder.append("key:");
        Query.appendQuotedString(_queryBuilder, key.toString());

        _queryBuilder.append(separator);
        separator = ",";
        _queryBuilder.append("value:");
        Query.appendQuotedString(_queryBuilder, value.toString());

        _queryBuilder.append(separator);
        separator = ",";
        _queryBuilder.append("marketLocalizableContentDigest:");
        Query.appendQuotedString(_queryBuilder, marketLocalizableContentDigest.toString());

        _queryBuilder.append('}');
    }
}
