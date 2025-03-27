// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Input;
import com.shopify.graphql.support.Query;
import java.io.Serializable;

public class CreateMediaInput implements Serializable {
    private String originalSource;

    private MediaContentType mediaContentType;

    private Input<String> alt = Input.undefined();

    public CreateMediaInput(String originalSource, MediaContentType mediaContentType) {
        this.originalSource = originalSource;

        this.mediaContentType = mediaContentType;
    }

    public String getOriginalSource() {
        return originalSource;
    }

    public CreateMediaInput setOriginalSource(String originalSource) {
        this.originalSource = originalSource;
        return this;
    }

    public MediaContentType getMediaContentType() {
        return mediaContentType;
    }

    public CreateMediaInput setMediaContentType(MediaContentType mediaContentType) {
        this.mediaContentType = mediaContentType;
        return this;
    }

    public String getAlt() {
        return alt.getValue();
    }

    public Input<String> getAltInput() {
        return alt;
    }

    public CreateMediaInput setAlt(String alt) {
        this.alt = Input.optional(alt);
        return this;
    }

    public CreateMediaInput setAltInput(Input<String> alt) {
        if (alt == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.alt = alt;
        return this;
    }

    public void appendTo(StringBuilder _queryBuilder) {
        String separator = "";
        _queryBuilder.append('{');

        _queryBuilder.append(separator);
        separator = ",";
        _queryBuilder.append("originalSource:");
        Query.appendQuotedString(_queryBuilder, originalSource.toString());

        _queryBuilder.append(separator);
        separator = ",";
        _queryBuilder.append("mediaContentType:");
        _queryBuilder.append(mediaContentType.toString());

        if (this.alt.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("alt:");
            if (alt.getValue() != null) {
                Query.appendQuotedString(_queryBuilder, alt.getValue().toString());
            } else {
                _queryBuilder.append("null");
            }
        }

        _queryBuilder.append('}');
    }
}
