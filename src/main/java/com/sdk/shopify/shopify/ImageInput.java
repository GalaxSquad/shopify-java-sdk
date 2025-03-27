// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.ID;
import com.shopify.graphql.support.Input;
import com.shopify.graphql.support.Query;
import java.io.Serializable;

public class ImageInput implements Serializable {
    private Input<ID> id = Input.undefined();

    private Input<String> altText = Input.undefined();

    private Input<String> src = Input.undefined();

    public ID getId() {
        return id.getValue();
    }

    public Input<ID> getIdInput() {
        return id;
    }

    public ImageInput setId(ID id) {
        this.id = Input.optional(id);
        return this;
    }

    public ImageInput setIdInput(Input<ID> id) {
        if (id == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.id = id;
        return this;
    }

    public String getAltText() {
        return altText.getValue();
    }

    public Input<String> getAltTextInput() {
        return altText;
    }

    public ImageInput setAltText(String altText) {
        this.altText = Input.optional(altText);
        return this;
    }

    public ImageInput setAltTextInput(Input<String> altText) {
        if (altText == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.altText = altText;
        return this;
    }

    public String getSrc() {
        return src.getValue();
    }

    public Input<String> getSrcInput() {
        return src;
    }

    public ImageInput setSrc(String src) {
        this.src = Input.optional(src);
        return this;
    }

    public ImageInput setSrcInput(Input<String> src) {
        if (src == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.src = src;
        return this;
    }

    public void appendTo(StringBuilder _queryBuilder) {
        String separator = "";
        _queryBuilder.append('{');

        if (this.id.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("id:");
            if (id.getValue() != null) {
                Query.appendQuotedString(_queryBuilder, id.getValue().toString());
            } else {
                _queryBuilder.append("null");
            }
        }

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

        if (this.src.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("src:");
            if (src.getValue() != null) {
                Query.appendQuotedString(_queryBuilder, src.getValue().toString());
            } else {
                _queryBuilder.append("null");
            }
        }

        _queryBuilder.append('}');
    }
}
