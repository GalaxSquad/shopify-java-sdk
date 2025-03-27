// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.ID;
import com.shopify.graphql.support.Input;
import com.shopify.graphql.support.Query;
import java.io.Serializable;

public class TranslationInput implements Serializable {
    private String locale;

    private String key;

    private String value;

    private String translatableContentDigest;

    private Input<ID> marketId = Input.undefined();

    public TranslationInput(String locale, String key, String value, String translatableContentDigest) {
        this.locale = locale;

        this.key = key;

        this.value = value;

        this.translatableContentDigest = translatableContentDigest;
    }

    public String getLocale() {
        return locale;
    }

    public TranslationInput setLocale(String locale) {
        this.locale = locale;
        return this;
    }

    public String getKey() {
        return key;
    }

    public TranslationInput setKey(String key) {
        this.key = key;
        return this;
    }

    public String getValue() {
        return value;
    }

    public TranslationInput setValue(String value) {
        this.value = value;
        return this;
    }

    public String getTranslatableContentDigest() {
        return translatableContentDigest;
    }

    public TranslationInput setTranslatableContentDigest(String translatableContentDigest) {
        this.translatableContentDigest = translatableContentDigest;
        return this;
    }

    public ID getMarketId() {
        return marketId.getValue();
    }

    public Input<ID> getMarketIdInput() {
        return marketId;
    }

    public TranslationInput setMarketId(ID marketId) {
        this.marketId = Input.optional(marketId);
        return this;
    }

    public TranslationInput setMarketIdInput(Input<ID> marketId) {
        if (marketId == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.marketId = marketId;
        return this;
    }

    public void appendTo(StringBuilder _queryBuilder) {
        String separator = "";
        _queryBuilder.append('{');

        _queryBuilder.append(separator);
        separator = ",";
        _queryBuilder.append("locale:");
        Query.appendQuotedString(_queryBuilder, locale.toString());

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
        _queryBuilder.append("translatableContentDigest:");
        Query.appendQuotedString(_queryBuilder, translatableContentDigest.toString());

        if (this.marketId.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("marketId:");
            if (marketId.getValue() != null) {
                Query.appendQuotedString(_queryBuilder, marketId.getValue().toString());
            } else {
                _queryBuilder.append("null");
            }
        }

        _queryBuilder.append('}');
    }
}
