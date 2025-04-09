// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.ID;
import com.shopify.graphql.support.Input;
import com.shopify.graphql.support.Query;
import java.io.Serializable;

public class ProductPublicationInput implements Serializable {
    private Input<ID> publicationId = Input.undefined();

    private Input<String> publishDate = Input.undefined();

    public ID getPublicationId() {
        return publicationId.getValue();
    }

    public Input<ID> getPublicationIdInput() {
        return publicationId;
    }

    public ProductPublicationInput setPublicationId(ID publicationId) {
        this.publicationId = Input.optional(publicationId);
        return this;
    }

    public ProductPublicationInput setPublicationIdInput(Input<ID> publicationId) {
        if (publicationId == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.publicationId = publicationId;
        return this;
    }

    public String getPublishDate() {
        return publishDate.getValue();
    }

    public Input<String> getPublishDateInput() {
        return publishDate;
    }

    public ProductPublicationInput setPublishDate(String publishDate) {
        this.publishDate = Input.optional(publishDate);
        return this;
    }

    public ProductPublicationInput setPublishDateInput(Input<String> publishDate) {
        if (publishDate == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.publishDate = publishDate;
        return this;
    }

    public void appendTo(StringBuilder _queryBuilder) {
        String separator = "";
        _queryBuilder.append('{');

        if (this.publicationId.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("publicationId:");
            if (publicationId.getValue() != null) {
                Query.appendQuotedString(_queryBuilder, publicationId.getValue().toString());
            } else {
                _queryBuilder.append("null");
            }
        }

        if (this.publishDate.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("publishDate:");
            if (publishDate.getValue() != null) {
                Query.appendQuotedString(_queryBuilder, publishDate.getValue().toString());
            } else {
                _queryBuilder.append("null");
            }
        }

        _queryBuilder.append('}');
    }
}
