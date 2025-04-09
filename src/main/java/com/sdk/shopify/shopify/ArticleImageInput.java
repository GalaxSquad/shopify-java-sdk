// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Input;
import com.shopify.graphql.support.Query;
import java.io.Serializable;

public class ArticleImageInput implements Serializable {
    private Input<String> altText = Input.undefined();

    private Input<String> url = Input.undefined();

    public String getAltText() {
        return altText.getValue();
    }

    public Input<String> getAltTextInput() {
        return altText;
    }

    public ArticleImageInput setAltText(String altText) {
        this.altText = Input.optional(altText);
        return this;
    }

    public ArticleImageInput setAltTextInput(Input<String> altText) {
        if (altText == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.altText = altText;
        return this;
    }

    public String getUrl() {
        return url.getValue();
    }

    public Input<String> getUrlInput() {
        return url;
    }

    public ArticleImageInput setUrl(String url) {
        this.url = Input.optional(url);
        return this;
    }

    public ArticleImageInput setUrlInput(Input<String> url) {
        if (url == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.url = url;
        return this;
    }

    public void appendTo(StringBuilder _queryBuilder) {
        String separator = "";
        _queryBuilder.append('{');

        if (this.altText.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("altText:");
            if (altText.getValue() != null) {
                Query.appendQuotedString(_queryBuilder, altText.getValue().toString());
            } else {
                _queryBuilder.append("null");
            }
        }

        if (this.url.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("url:");
            if (url.getValue() != null) {
                Query.appendQuotedString(_queryBuilder, url.getValue().toString());
            } else {
                _queryBuilder.append("null");
            }
        }

        _queryBuilder.append('}');
    }
}
